package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.`2d`
import org.scalablytyped.std.stdStrings.`experimental-webgl`
import org.scalablytyped.std.stdStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCanvasElement extends HTMLElement {
  /**
    * Gets or sets the height of a canvas element on a document.
    */
  var height: Double = js.native
  /**
    * Gets or sets the width of a canvas element on a document.
    */
  var width: Double = js.native
  def getContext(contextId: java.lang.String): CanvasRenderingContext2D | WebGLRenderingContext | Null = js.native
  def getContext(contextId: java.lang.String, contextAttributes: js.Object): CanvasRenderingContext2D | WebGLRenderingContext | Null = js.native
  /**
    * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
    * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
    */
  @JSName("getContext")
  def getContext_2d(contextId: `2d`): CanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def getContext_2d(contextId: `2d`, contextAttributes: Canvas2DContextAttributes): CanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def getContext_experimentalwebgl(contextId: `experimental-webgl`): WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_experimentalwebgl(contextId: `experimental-webgl`, contextAttributes: WebGLContextAttributes): WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl): WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl, contextAttributes: WebGLContextAttributes): WebGLRenderingContext | Null = js.native
  /**
    * Returns a blob object encoded as a Portable Network Graphics (PNG) format from a canvas image or drawing.
    */
  def msToBlob(): Blob = js.native
  def toBlob(callback: js.Function1[/* result */ Blob | Null, Unit], arguments: js.Any*): Unit = js.native
  def toDataURL(`type`: js.UndefOr[scala.Nothing], args: js.Any*): java.lang.String = js.native
  /**
    * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
    * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
    */
  def toDataURL(`type`: java.lang.String, args: js.Any*): java.lang.String = js.native
}

