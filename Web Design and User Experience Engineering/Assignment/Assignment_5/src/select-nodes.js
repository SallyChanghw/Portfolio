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
      return null;
    }
}