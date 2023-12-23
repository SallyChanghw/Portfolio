/**
* A Node represents an HTML Element. A node can have a tag name,
* a list of CSS classes and a list of children nodes.
*/
class Node {

    /**
     *
     * @param {String} tag the tag name
     * @param {Array} children the children nodes
     * @param {Array} classes the css classes
     * @param {String} id the node id
     */
    constructor(tag, children, classes,id) {
      // Tag name of the node.
      this.tag = tag;
      // Array of CSS class names (string) on this element.
      this.classes = classes;
      // Array of child nodes.
      this.children = children; // All children are of type Node
      this.id = id;
    }

    /**
    * Returns all nodes matching the tag name selector.
    *
    * For example:
    *
    * <div>
    *   <span id="span-1"></span>
    *   <span id="span-2"></span>
    *   <div>
    *     <span id="span-3"></span>
    *   </div>
    * </div>
    * Selector `span` should return 3 span nodes in this order
    * span-1 -> span-2 -> span-3.
    *
    * @param {string} the selector string.
    * @returns {Array} Array of selected nodes.
    * @public
    */

    search(selector) {
      // condition error
      if (!selector) {
        return [];
      }
  
      let ans = [];
  
      const checkSelector = (node, selector) => {
        if (selector.startsWith("#")) {
          return node.id === selector.slice(1);
        } else if (selector.startsWith(".")) {
          return node.classes.includes(selector.slice(1));
        } else {
          return node.tag === selector;
        }
      };
  
      const searchRecursively = (node) => {
        if (checkSelector(node, selector)) {
          ans.push(node.id);
          // ans.push(node);
          
        }
  
        for (const child of node.children) {
          searchRecursively(child);
        }
      };
      searchRecursively(this);
  
      return ans;
    }
}


// node

// let divNode1, p1, divNode2;
// const body = new Node("body", [
//     divNode1 = new Node("div", [
//         new Node("span", [], ["note"], "span-1"),
//         new Node("span", [], [], "span-2"),
//         divNode2 = new Node("div", [
//             p1 = new Node("p", [], ["sub1-p1", "note"], "para-1"),
//             new Node("span", [], ["sub1-span3"], "span-3")
//         ],["subContainer1"],"div-2"),
//         new Node("div", [
//             new Node("section", [
//                 new Node("label", [], [], "lbl-1")
//             ], [], "sec-1")
//         ], ["subContainer2"],"div-3"),
//         new Node("div", [
//             new Node("span", [], ["mania"], "span-4"),
//             new Node("span", [], ["note", "mania"], "span-5")
//         ],[], "div-4")
//     ], ["mainContainer"], "div-1"),
//     new Node("span", [], ["randomSpan"], "span-6")
// ], "content");


// Test case 1
// console.log("Started...");
// console.log("Test1");
// console.log(divNode1.search("span"));
// console.log("----------");

// // Test case 2
// console.log("Test2");
// console.log(divNode1.search(".note"));
// console.log("----------");

// // Test case 3
// console.log("Test3");
// console.log(divNode1.search("label"));
// console.log("----------");

// // Test case 4
// console.log("Test4");
// console.log(p1.search(".note")); 
// console.log("----------");

// // Test case 5
// console.log("Test5");
// console.log(divNode1.search("div"));
// console.log("----------");

// // // Test case 6
// // console.log("Test6");
// // console.log(randomNode.search("div"));
// // console.log("----------");

//  // Test case 7
// console.log("Test7");
// console.log(divNode2.search("section"));
// console.log("----------");

// // Test case 8
// console.log("Test8");
// console.log(body.search()); // Error conditions need to be handled
// console.log("----------");

// // Test case 9
// console.log("Test9");
// console.log(body.search("section"));
// console.log("----------");

// // Test case 10
// console.log("Test10");
// console.log(divNode1.search(".randomSpan")); // randomSpan is some Span outside your divNode1