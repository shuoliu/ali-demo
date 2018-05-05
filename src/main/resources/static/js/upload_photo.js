$(document).ready(function (e) {
	$("#upload").submit(function(e) {
    $("#submit").prop('disabled', true);
    e.preventDefault();
    var formData = $(this).serialize();
    $.ajax({
      url: "/photos",
			type: "POST",
      contentType: false,
      processData: false,
			data: new FormData(this),
			success: function(data) {
			  $("#submit").prop('disabled', false);
			  $("#file").val("");
        $('#image-preview img').removeAttr('src');
			  alert("Upload success！");
			},
		  error: function() {
		    $("#submit").prop('disabled', false);
		    alert("Upload failed.");
	    },
	    timeout: 15000,
	   });
	});

  $("#file").change(function(e) {
    if (this.files && this.files[0]) {
      var reader = new FileReader();
      reader.onload = function(e) {
        $('#image-preview img').attr('src', e.target.result);
      }
      reader.readAsDataURL(this.files[0]);
    }
  });
});
