/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

$(document).ready(function () {

    $("#btn01").click(function () {
        $("#text01").text("资产信息")
        $("#btn01").attr("value")
    })
    $("#btn02").click(function () {
        alert("资产变动表")
    })
    $("#testfor02").click(function () {
      $.ajax({
          type:"post",
          dataType:"json",
          url:"Untitled-1.json",
          success:function (result) {
              var str="";
              $.each(result,function (index,obj) {
                  str +="姓名："+obj["name"]+" "+"id："+obj["id"]+" "+"密码："+obj["pwd"]+"\n";
              })
              $("#ptotest01").append(str)
          }
      })

    })

})




