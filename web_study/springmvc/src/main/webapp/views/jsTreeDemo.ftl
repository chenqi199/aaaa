<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
    <meta charset="utf-8"/>
    <title>人寿角色管理</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>
    <link rel="stylesheet" href="/js/plugin/jstree/dist/themes/default/style.css">
</head>
<!-- END HEAD -->

<body>
<!-- BEGIN PAGE CONTENT-->
<div >
    <div id="orgTree" class="tree-demo scroller" style="height:330px" data-always-visible="1" data-rail-visible="1" data-rail-color="red" data-handle-color="green">
    </div>


</div>

</body>
<script type="text/javascript" src="/js/jquery/dist/jquery.js"></script>
<script type="text/javascript" src="/js/plugin/jstree/dist/jstree.js"></script>
<script>

    var ajaxTreeSample = function () {
        var tree = $("#orgTree");
//        tree.jstree("uncheck_all");
        tree.jstree({
//            'plugins' : [ "checkbox" ], //出现选择框
//            'checkbox': { cascade: "", three_state: false }, //级联
            "core": {
//                "multiple": treeMultiple, // 允许多选
                'expand_selected_onload': true, //选中项蓝色底显示
//                'tie_selection':false,
//                "themes": {
//                    "responsive": false
//                },
                "click_ callback": true,
                'data': {
                    'url': '../rest/baseData',
                    'data': function (node) {
                        return {
                            'pid': node.id === '#' ? '' : node.id
                        };
                    }
                },
            }
        }).bind("select_node.jstree", function (event) {
            var eventNodeName = event.target.nodeName;
             pid = event.target.parentNode.id;
            console.log(eventNodeName);
            console.log('nodeId===='+pid);




        })

        //禁止滚动条
//        top.document.getElementById('orgParentTree').onmousewheel = function(event) {
//            if (!event) event = window.event;
//            this.scrollTop = this.scrollTop - (event.wheelDelta ? event.wheelDelta : -event.detail * 10);
//            return false;
//        }
    }();

</script>
</html>