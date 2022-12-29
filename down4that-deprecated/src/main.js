function onSignIn() {
  $("#HomePage").css("display", "none");
  $(".data").css("display", "block");
}

function signOut() {
  var auth2 = gapi.auth2.getAuthInstance();
  auth2.signOut().then(function () {
    alert("You have been successfully signed out");
    $(".data").css("display", "none")
    $("#HomePage").css("display", "flex");
  });
}

