!function(){"use strict";function e(e,t,r){function n(e){return e.replace(/([.*+?^=!:()|\[\]\/\\])/g,"\\$1")}function a(e,t,r){return e.replace(new RegExp(n(t),"g"),r)}function o(e){function r(){if(p<n.length){var l=n[p++];$.get("plugins/cronapp-framework-js/components/reports/"+l.type+".parameter.html").done(function(e){o.push(a(e,"_field_",l.name)),r()})}else o.length>0&&t.open({templateUrl:"plugins/cronapp-framework-js/components/reports/reports.parameters.html",controller:"ParameterController",resolve:{report:function(){return JSON.parse(JSON.stringify(e))},htmlParameters:function(){return JSON.parse(JSON.stringify(o))}}})}var n=e.parameters,o=[],p=0;r()}e.getReport=function(e){r.getReport(e).then(function(e){e&&e.data&&(0==e.data.parameters.length||1==e.data.parameters.length&&"DATA_LIMIT"==e.data.parameters[0].name?r.getPDFAsFile(e.data.reportName).then(function(e){r.openURLContent(e.data)}):o(JSON.parse(JSON.stringify(e.data))))})}}angular.module("custom.controllers").controller("ReportController",e),e.$inject=["$scope","$modal","ReportService"]}();