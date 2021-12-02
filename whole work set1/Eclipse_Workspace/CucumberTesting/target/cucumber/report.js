$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('dataTable\dataTable.feature');
formatter.feature({
  "line": 1,
  "name": "Data table",
  "description": "Verify that the new user registration is successful after passing correct inputs.",
  "id": "data-table",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "data-table;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user on the user registration page.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter invalid data on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 6
    },
    {
      "cells": [
        "First Name",
        "Preeti"
      ],
      "line": 7
    },
    {
      "cells": [
        "Last Name",
        "Sharma"
      ],
      "line": 8
    },
    {
      "cells": [
        "Email Address",
        "someone@gmail.com"
      ],
      "line": 9
    },
    {
      "cells": [
        "Re-enter Email Address",
        "someone@gmail.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "Password",
        "PASSWORD"
      ],
      "line": 11
    },
    {
      "cells": [
        "Birthdate",
        "02"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the user registration should be successful.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});