<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
  <!-- Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
  <link rel="stylesheet" href="/resources/css/custom.css">
</head>
<body>
  <!-- Navbar -->
  <nav>
    <div class="nav-wrapper  light-blue accent-1">
      <a href="#" class="brand-logo center">
        <img src="/resources/images/caixa-economica-federal-1.png" alt="" width="100px">
      </a>
    </div>
  </nav>
  <div class="container">
    <!-- Login form -->
    <div class="row">
        <form action="login" method="POST" class="col s12 m8 l6 offset-m2 offset-l3">
          <div class="row">
            <div class="input-field col s12">
              <input id="email" type="email" class="validate">
              <label for="email">Email</label>
            </div>
          </div>

          <div class="row">
            <div class="input-field col s12">
              <input id="password" type="password" class="validate">
              <label for="password">Password</label>
            </div>
          </div>

          <center>
            <input type="submit" class="waves-effect waves-light btn" value="Login" />
          </center>
        </form>
      </div>
    </div>

  <!-- Compiled and minified JavaScript -->
  <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
</body>
</html>