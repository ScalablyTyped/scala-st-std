package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.ANGLE_instanced_arrays
import org.scalablytyped.std.stdStrings.EXT_blend_minmax
import org.scalablytyped.std.stdStrings.EXT_frag_depth
import org.scalablytyped.std.stdStrings.EXT_sRGB
import org.scalablytyped.std.stdStrings.EXT_shader_texture_lod
import org.scalablytyped.std.stdStrings.EXT_texture_filter_anisotropic
import org.scalablytyped.std.stdStrings.OES_element_index_uint
import org.scalablytyped.std.stdStrings.OES_standard_derivatives
import org.scalablytyped.std.stdStrings.OES_texture_float
import org.scalablytyped.std.stdStrings.OES_texture_float_linear
import org.scalablytyped.std.stdStrings.OES_texture_half_float
import org.scalablytyped.std.stdStrings.OES_texture_half_float_linear
import org.scalablytyped.std.stdStrings.OES_vertex_array_object
import org.scalablytyped.std.stdStrings.WEBGL_color_buffer_float
import org.scalablytyped.std.stdStrings.WEBGL_compressed_texture_astc
import org.scalablytyped.std.stdStrings.WEBGL_compressed_texture_s3tc
import org.scalablytyped.std.stdStrings.WEBGL_compressed_texture_s3tc_srgb
import org.scalablytyped.std.stdStrings.WEBGL_debug_renderer_info
import org.scalablytyped.std.stdStrings.WEBGL_debug_shaders
import org.scalablytyped.std.stdStrings.WEBGL_depth_texture
import org.scalablytyped.std.stdStrings.WEBGL_draw_buffers
import org.scalablytyped.std.stdStrings.WEBGL_lose_context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLRenderingContext extends js.Object {
  val ACTIVE_ATTRIBUTES: Double = js.native
  val ACTIVE_TEXTURE: Double = js.native
  val ACTIVE_UNIFORMS: Double = js.native
  val ALIASED_LINE_WIDTH_RANGE: Double = js.native
  val ALIASED_POINT_SIZE_RANGE: Double = js.native
  val ALPHA: Double = js.native
  val ALPHA_BITS: Double = js.native
  val ALWAYS: Double = js.native
  val ARRAY_BUFFER: Double = js.native
  val ARRAY_BUFFER_BINDING: Double = js.native
  val ATTACHED_SHADERS: Double = js.native
  val BACK: Double = js.native
  val BLEND: Double = js.native
  val BLEND_COLOR: Double = js.native
  val BLEND_DST_ALPHA: Double = js.native
  val BLEND_DST_RGB: Double = js.native
  val BLEND_EQUATION: Double = js.native
  val BLEND_EQUATION_ALPHA: Double = js.native
  val BLEND_EQUATION_RGB: Double = js.native
  val BLEND_SRC_ALPHA: Double = js.native
  val BLEND_SRC_RGB: Double = js.native
  val BLUE_BITS: Double = js.native
  val BOOL: Double = js.native
  val BOOL_VEC2: Double = js.native
  val BOOL_VEC3: Double = js.native
  val BOOL_VEC4: Double = js.native
  val BROWSER_DEFAULT_WEBGL: Double = js.native
  val BUFFER_SIZE: Double = js.native
  val BUFFER_USAGE: Double = js.native
  val BYTE: Double = js.native
  val CCW: Double = js.native
  val CLAMP_TO_EDGE: Double = js.native
  val COLOR_ATTACHMENT0: Double = js.native
  val COLOR_BUFFER_BIT: Double = js.native
  val COLOR_CLEAR_VALUE: Double = js.native
  val COLOR_WRITEMASK: Double = js.native
  val COMPILE_STATUS: Double = js.native
  val COMPRESSED_TEXTURE_FORMATS: Double = js.native
  val CONSTANT_ALPHA: Double = js.native
  val CONSTANT_COLOR: Double = js.native
  val CONTEXT_LOST_WEBGL: Double = js.native
  val CULL_FACE: Double = js.native
  val CULL_FACE_MODE: Double = js.native
  val CURRENT_PROGRAM: Double = js.native
  val CURRENT_VERTEX_ATTRIB: Double = js.native
  val CW: Double = js.native
  val DECR: Double = js.native
  val DECR_WRAP: Double = js.native
  val DELETE_STATUS: Double = js.native
  val DEPTH_ATTACHMENT: Double = js.native
  val DEPTH_BITS: Double = js.native
  val DEPTH_BUFFER_BIT: Double = js.native
  val DEPTH_CLEAR_VALUE: Double = js.native
  val DEPTH_COMPONENT: Double = js.native
  val DEPTH_COMPONENT16: Double = js.native
  val DEPTH_FUNC: Double = js.native
  val DEPTH_RANGE: Double = js.native
  val DEPTH_STENCIL: Double = js.native
  val DEPTH_STENCIL_ATTACHMENT: Double = js.native
  val DEPTH_TEST: Double = js.native
  val DEPTH_WRITEMASK: Double = js.native
  val DITHER: Double = js.native
  val DONT_CARE: Double = js.native
  val DST_ALPHA: Double = js.native
  val DST_COLOR: Double = js.native
  val DYNAMIC_DRAW: Double = js.native
  val ELEMENT_ARRAY_BUFFER: Double = js.native
  val ELEMENT_ARRAY_BUFFER_BINDING: Double = js.native
  val EQUAL: Double = js.native
  val FASTEST: Double = js.native
  val FLOAT: Double = js.native
  val FLOAT_MAT2: Double = js.native
  val FLOAT_MAT3: Double = js.native
  val FLOAT_MAT4: Double = js.native
  val FLOAT_VEC2: Double = js.native
  val FLOAT_VEC3: Double = js.native
  val FLOAT_VEC4: Double = js.native
  val FRAGMENT_SHADER: Double = js.native
  val FRAMEBUFFER: Double = js.native
  val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Double = js.native
  val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Double = js.native
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Double = js.native
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Double = js.native
  val FRAMEBUFFER_BINDING: Double = js.native
  val FRAMEBUFFER_COMPLETE: Double = js.native
  val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Double = js.native
  val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Double = js.native
  val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Double = js.native
  val FRAMEBUFFER_UNSUPPORTED: Double = js.native
  val FRONT: Double = js.native
  val FRONT_AND_BACK: Double = js.native
  val FRONT_FACE: Double = js.native
  val FUNC_ADD: Double = js.native
  val FUNC_REVERSE_SUBTRACT: Double = js.native
  val FUNC_SUBTRACT: Double = js.native
  val GENERATE_MIPMAP_HINT: Double = js.native
  val GEQUAL: Double = js.native
  val GREATER: Double = js.native
  val GREEN_BITS: Double = js.native
  val HIGH_FLOAT: Double = js.native
  val HIGH_INT: Double = js.native
  val IMPLEMENTATION_COLOR_READ_FORMAT: Double = js.native
  val IMPLEMENTATION_COLOR_READ_TYPE: Double = js.native
  val INCR: Double = js.native
  val INCR_WRAP: Double = js.native
  val INT: Double = js.native
  val INT_VEC2: Double = js.native
  val INT_VEC3: Double = js.native
  val INT_VEC4: Double = js.native
  val INVALID_ENUM: Double = js.native
  val INVALID_FRAMEBUFFER_OPERATION: Double = js.native
  val INVALID_OPERATION: Double = js.native
  val INVALID_VALUE: Double = js.native
  val INVERT: Double = js.native
  val KEEP: Double = js.native
  val LEQUAL: Double = js.native
  val LESS: Double = js.native
  val LINEAR: Double = js.native
  val LINEAR_MIPMAP_LINEAR: Double = js.native
  val LINEAR_MIPMAP_NEAREST: Double = js.native
  val LINES: Double = js.native
  val LINE_LOOP: Double = js.native
  val LINE_STRIP: Double = js.native
  val LINE_WIDTH: Double = js.native
  val LINK_STATUS: Double = js.native
  val LOW_FLOAT: Double = js.native
  val LOW_INT: Double = js.native
  val LUMINANCE: Double = js.native
  val LUMINANCE_ALPHA: Double = js.native
  val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Double = js.native
  val MAX_CUBE_MAP_TEXTURE_SIZE: Double = js.native
  val MAX_FRAGMENT_UNIFORM_VECTORS: Double = js.native
  val MAX_RENDERBUFFER_SIZE: Double = js.native
  val MAX_TEXTURE_IMAGE_UNITS: Double = js.native
  val MAX_TEXTURE_SIZE: Double = js.native
  val MAX_VARYING_VECTORS: Double = js.native
  val MAX_VERTEX_ATTRIBS: Double = js.native
  val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Double = js.native
  val MAX_VERTEX_UNIFORM_VECTORS: Double = js.native
  val MAX_VIEWPORT_DIMS: Double = js.native
  val MEDIUM_FLOAT: Double = js.native
  val MEDIUM_INT: Double = js.native
  val MIRRORED_REPEAT: Double = js.native
  val NEAREST: Double = js.native
  val NEAREST_MIPMAP_LINEAR: Double = js.native
  val NEAREST_MIPMAP_NEAREST: Double = js.native
  val NEVER: Double = js.native
  val NICEST: Double = js.native
  val NONE: Double = js.native
  val NOTEQUAL: Double = js.native
  val NO_ERROR: Double = js.native
  val ONE: Double = js.native
  val ONE_MINUS_CONSTANT_ALPHA: Double = js.native
  val ONE_MINUS_CONSTANT_COLOR: Double = js.native
  val ONE_MINUS_DST_ALPHA: Double = js.native
  val ONE_MINUS_DST_COLOR: Double = js.native
  val ONE_MINUS_SRC_ALPHA: Double = js.native
  val ONE_MINUS_SRC_COLOR: Double = js.native
  val OUT_OF_MEMORY: Double = js.native
  val PACK_ALIGNMENT: Double = js.native
  val POINTS: Double = js.native
  val POLYGON_OFFSET_FACTOR: Double = js.native
  val POLYGON_OFFSET_FILL: Double = js.native
  val POLYGON_OFFSET_UNITS: Double = js.native
  val RED_BITS: Double = js.native
  val RENDERBUFFER: Double = js.native
  val RENDERBUFFER_ALPHA_SIZE: Double = js.native
  val RENDERBUFFER_BINDING: Double = js.native
  val RENDERBUFFER_BLUE_SIZE: Double = js.native
  val RENDERBUFFER_DEPTH_SIZE: Double = js.native
  val RENDERBUFFER_GREEN_SIZE: Double = js.native
  val RENDERBUFFER_HEIGHT: Double = js.native
  val RENDERBUFFER_INTERNAL_FORMAT: Double = js.native
  val RENDERBUFFER_RED_SIZE: Double = js.native
  val RENDERBUFFER_STENCIL_SIZE: Double = js.native
  val RENDERBUFFER_WIDTH: Double = js.native
  val RENDERER: Double = js.native
  val REPEAT: Double = js.native
  val REPLACE: Double = js.native
  val RGB: Double = js.native
  val RGB565: Double = js.native
  val RGB5_A1: Double = js.native
  val RGBA: Double = js.native
  val RGBA4: Double = js.native
  val SAMPLER_2D: Double = js.native
  val SAMPLER_CUBE: Double = js.native
  val SAMPLES: Double = js.native
  val SAMPLE_ALPHA_TO_COVERAGE: Double = js.native
  val SAMPLE_BUFFERS: Double = js.native
  val SAMPLE_COVERAGE: Double = js.native
  val SAMPLE_COVERAGE_INVERT: Double = js.native
  val SAMPLE_COVERAGE_VALUE: Double = js.native
  val SCISSOR_BOX: Double = js.native
  val SCISSOR_TEST: Double = js.native
  val SHADER_TYPE: Double = js.native
  val SHADING_LANGUAGE_VERSION: Double = js.native
  val SHORT: Double = js.native
  val SRC_ALPHA: Double = js.native
  val SRC_ALPHA_SATURATE: Double = js.native
  val SRC_COLOR: Double = js.native
  val STATIC_DRAW: Double = js.native
  val STENCIL_ATTACHMENT: Double = js.native
  val STENCIL_BACK_FAIL: Double = js.native
  val STENCIL_BACK_FUNC: Double = js.native
  val STENCIL_BACK_PASS_DEPTH_FAIL: Double = js.native
  val STENCIL_BACK_PASS_DEPTH_PASS: Double = js.native
  val STENCIL_BACK_REF: Double = js.native
  val STENCIL_BACK_VALUE_MASK: Double = js.native
  val STENCIL_BACK_WRITEMASK: Double = js.native
  val STENCIL_BITS: Double = js.native
  val STENCIL_BUFFER_BIT: Double = js.native
  val STENCIL_CLEAR_VALUE: Double = js.native
  val STENCIL_FAIL: Double = js.native
  val STENCIL_FUNC: Double = js.native
  val STENCIL_INDEX: Double = js.native
  val STENCIL_INDEX8: Double = js.native
  val STENCIL_PASS_DEPTH_FAIL: Double = js.native
  val STENCIL_PASS_DEPTH_PASS: Double = js.native
  val STENCIL_REF: Double = js.native
  val STENCIL_TEST: Double = js.native
  val STENCIL_VALUE_MASK: Double = js.native
  val STENCIL_WRITEMASK: Double = js.native
  val STREAM_DRAW: Double = js.native
  val SUBPIXEL_BITS: Double = js.native
  val TEXTURE: Double = js.native
  val TEXTURE0: Double = js.native
  val TEXTURE1: Double = js.native
  val TEXTURE10: Double = js.native
  val TEXTURE11: Double = js.native
  val TEXTURE12: Double = js.native
  val TEXTURE13: Double = js.native
  val TEXTURE14: Double = js.native
  val TEXTURE15: Double = js.native
  val TEXTURE16: Double = js.native
  val TEXTURE17: Double = js.native
  val TEXTURE18: Double = js.native
  val TEXTURE19: Double = js.native
  val TEXTURE2: Double = js.native
  val TEXTURE20: Double = js.native
  val TEXTURE21: Double = js.native
  val TEXTURE22: Double = js.native
  val TEXTURE23: Double = js.native
  val TEXTURE24: Double = js.native
  val TEXTURE25: Double = js.native
  val TEXTURE26: Double = js.native
  val TEXTURE27: Double = js.native
  val TEXTURE28: Double = js.native
  val TEXTURE29: Double = js.native
  val TEXTURE3: Double = js.native
  val TEXTURE30: Double = js.native
  val TEXTURE31: Double = js.native
  val TEXTURE4: Double = js.native
  val TEXTURE5: Double = js.native
  val TEXTURE6: Double = js.native
  val TEXTURE7: Double = js.native
  val TEXTURE8: Double = js.native
  val TEXTURE9: Double = js.native
  val TEXTURE_2D: Double = js.native
  val TEXTURE_BINDING_2D: Double = js.native
  val TEXTURE_BINDING_CUBE_MAP: Double = js.native
  val TEXTURE_CUBE_MAP: Double = js.native
  val TEXTURE_CUBE_MAP_NEGATIVE_X: Double = js.native
  val TEXTURE_CUBE_MAP_NEGATIVE_Y: Double = js.native
  val TEXTURE_CUBE_MAP_NEGATIVE_Z: Double = js.native
  val TEXTURE_CUBE_MAP_POSITIVE_X: Double = js.native
  val TEXTURE_CUBE_MAP_POSITIVE_Y: Double = js.native
  val TEXTURE_CUBE_MAP_POSITIVE_Z: Double = js.native
  val TEXTURE_MAG_FILTER: Double = js.native
  val TEXTURE_MIN_FILTER: Double = js.native
  val TEXTURE_WRAP_S: Double = js.native
  val TEXTURE_WRAP_T: Double = js.native
  val TRIANGLES: Double = js.native
  val TRIANGLE_FAN: Double = js.native
  val TRIANGLE_STRIP: Double = js.native
  val UNPACK_ALIGNMENT: Double = js.native
  val UNPACK_COLORSPACE_CONVERSION_WEBGL: Double = js.native
  val UNPACK_FLIP_Y_WEBGL: Double = js.native
  val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Double = js.native
  val UNSIGNED_BYTE: Double = js.native
  val UNSIGNED_INT: Double = js.native
  val UNSIGNED_SHORT: Double = js.native
  val UNSIGNED_SHORT_4_4_4_4: Double = js.native
  val UNSIGNED_SHORT_5_5_5_1: Double = js.native
  val UNSIGNED_SHORT_5_6_5: Double = js.native
  val VALIDATE_STATUS: Double = js.native
  val VENDOR: Double = js.native
  val VERSION: Double = js.native
  val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Double = js.native
  val VERTEX_ATTRIB_ARRAY_ENABLED: Double = js.native
  val VERTEX_ATTRIB_ARRAY_NORMALIZED: Double = js.native
  val VERTEX_ATTRIB_ARRAY_POINTER: Double = js.native
  val VERTEX_ATTRIB_ARRAY_SIZE: Double = js.native
  val VERTEX_ATTRIB_ARRAY_STRIDE: Double = js.native
  val VERTEX_ATTRIB_ARRAY_TYPE: Double = js.native
  val VERTEX_SHADER: Double = js.native
  val VIEWPORT: Double = js.native
  val ZERO: Double = js.native
  val canvas: HTMLCanvasElement = js.native
  val drawingBufferHeight: Double = js.native
  val drawingBufferWidth: Double = js.native
  def activeTexture(texture: Double): Unit = js.native
  def attachShader(): Unit = js.native
  def attachShader(program: WebGLProgram): Unit = js.native
  def attachShader(program: WebGLProgram, shader: WebGLShader): Unit = js.native
  def attachShader(program: Null, shader: WebGLShader): Unit = js.native
  def bindAttribLocation(program: WebGLProgram, index: Double, name: java.lang.String): Unit = js.native
  def bindAttribLocation(program: Null, index: Double, name: java.lang.String): Unit = js.native
  def bindBuffer(target: Double): Unit = js.native
  def bindBuffer(target: Double, buffer: WebGLBuffer): Unit = js.native
  def bindFramebuffer(target: Double): Unit = js.native
  def bindFramebuffer(target: Double, framebuffer: WebGLFramebuffer): Unit = js.native
  def bindRenderbuffer(target: Double): Unit = js.native
  def bindRenderbuffer(target: Double, renderbuffer: WebGLRenderbuffer): Unit = js.native
  def bindTexture(target: Double): Unit = js.native
  def bindTexture(target: Double, texture: WebGLTexture): Unit = js.native
  def blendColor(red: Double, green: Double, blue: Double, alpha: Double): Unit = js.native
  def blendEquation(mode: Double): Unit = js.native
  def blendEquationSeparate(modeRGB: Double, modeAlpha: Double): Unit = js.native
  def blendFunc(sfactor: Double, dfactor: Double): Unit = js.native
  def blendFuncSeparate(srcRGB: Double, dstRGB: Double, srcAlpha: Double, dstAlpha: Double): Unit = js.native
  def bufferData(target: Double, size: ArrayBuffer, usage: Double): Unit = js.native
  def bufferData(target: Double, size: DataView, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Float32Array, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Float64Array, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Int16Array, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Int32Array, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Int8Array, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Uint16Array, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Uint32Array, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Uint8Array, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Uint8ClampedArray, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Double, usage: Double): Unit = js.native
  def bufferData(target: Double, size: Null, usage: Double): Unit = js.native
  def bufferSubData(target: Double, offset: Double): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: ArrayBuffer): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: DataView): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: Float32Array): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: Float64Array): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: Int16Array): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: Int32Array): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: Int8Array): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: Uint16Array): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: Uint32Array): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: Uint8Array): Unit = js.native
  def bufferSubData(target: Double, offset: Double, data: Uint8ClampedArray): Unit = js.native
  def checkFramebufferStatus(target: Double): Double = js.native
  def clear(mask: Double): Unit = js.native
  def clearColor(red: Double, green: Double, blue: Double, alpha: Double): Unit = js.native
  def clearDepth(depth: Double): Unit = js.native
  def clearStencil(s: Double): Unit = js.native
  def colorMask(red: scala.Boolean, green: scala.Boolean, blue: scala.Boolean, alpha: scala.Boolean): Unit = js.native
  def compileShader(): Unit = js.native
  def compileShader(shader: WebGLShader): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: DataView
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: Float32Array
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: Float64Array
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: Int16Array
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: Int32Array
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: Int8Array
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: Uint16Array
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: Uint32Array
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: Uint8Array
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: Uint8ClampedArray
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    data: DataView
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    data: Float32Array
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    data: Float64Array
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    data: Int16Array
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    data: Int32Array
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    data: Int8Array
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    data: Uint16Array
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    data: Uint32Array
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    data: Uint8Array
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    data: Uint8ClampedArray
  ): Unit = js.native
  def copyTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    border: Double
  ): Unit = js.native
  def copyTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    x: Double,
    y: Double,
    width: Double,
    height: Double
  ): Unit = js.native
  def createBuffer(): WebGLBuffer | Null = js.native
  def createFramebuffer(): WebGLFramebuffer | Null = js.native
  def createProgram(): WebGLProgram | Null = js.native
  def createRenderbuffer(): WebGLRenderbuffer | Null = js.native
  def createShader(`type`: Double): WebGLShader | Null = js.native
  def createTexture(): WebGLTexture | Null = js.native
  def cullFace(mode: Double): Unit = js.native
  def deleteBuffer(): Unit = js.native
  def deleteBuffer(buffer: WebGLBuffer): Unit = js.native
  def deleteFramebuffer(): Unit = js.native
  def deleteFramebuffer(framebuffer: WebGLFramebuffer): Unit = js.native
  def deleteProgram(): Unit = js.native
  def deleteProgram(program: WebGLProgram): Unit = js.native
  def deleteRenderbuffer(): Unit = js.native
  def deleteRenderbuffer(renderbuffer: WebGLRenderbuffer): Unit = js.native
  def deleteShader(): Unit = js.native
  def deleteShader(shader: WebGLShader): Unit = js.native
  def deleteTexture(): Unit = js.native
  def deleteTexture(texture: WebGLTexture): Unit = js.native
  def depthFunc(func: Double): Unit = js.native
  def depthMask(flag: scala.Boolean): Unit = js.native
  def depthRange(zNear: Double, zFar: Double): Unit = js.native
  def detachShader(): Unit = js.native
  def detachShader(program: WebGLProgram): Unit = js.native
  def detachShader(program: WebGLProgram, shader: WebGLShader): Unit = js.native
  def detachShader(program: Null, shader: WebGLShader): Unit = js.native
  def disable(cap: Double): Unit = js.native
  def disableVertexAttribArray(index: Double): Unit = js.native
  def drawArrays(mode: Double, first: Double, count: Double): Unit = js.native
  def drawElements(mode: Double, count: Double, `type`: Double, offset: Double): Unit = js.native
  def enable(cap: Double): Unit = js.native
  def enableVertexAttribArray(index: Double): Unit = js.native
  def finish(): Unit = js.native
  def flush(): Unit = js.native
  def framebufferRenderbuffer(target: Double, attachment: Double, renderbuffertarget: Double): Unit = js.native
  def framebufferRenderbuffer(target: Double, attachment: Double, renderbuffertarget: Double, renderbuffer: WebGLRenderbuffer): Unit = js.native
  def framebufferTexture2D(target: Double, attachment: Double, textarget: Double, texture: WebGLTexture, level: Double): Unit = js.native
  def framebufferTexture2D(target: Double, attachment: Double, textarget: Double, texture: Null, level: Double): Unit = js.native
  def frontFace(mode: Double): Unit = js.native
  def generateMipmap(target: Double): Unit = js.native
  def getActiveAttrib(program: WebGLProgram, index: Double): WebGLActiveInfo | Null = js.native
  def getActiveAttrib(program: Null, index: Double): WebGLActiveInfo | Null = js.native
  def getActiveUniform(program: WebGLProgram, index: Double): WebGLActiveInfo | Null = js.native
  def getActiveUniform(program: Null, index: Double): WebGLActiveInfo | Null = js.native
  def getAttachedShaders(): js.Array[WebGLShader] | Null = js.native
  def getAttachedShaders(program: WebGLProgram): js.Array[WebGLShader] | Null = js.native
  def getAttribLocation(program: WebGLProgram, name: java.lang.String): Double = js.native
  def getAttribLocation(program: Null, name: java.lang.String): Double = js.native
  def getBufferParameter(target: Double, pname: Double): js.Any = js.native
  def getContextAttributes(): WebGLContextAttributes = js.native
  def getError(): Double = js.native
  def getExtension(extensionName: java.lang.String): js.Any = js.native
  @JSName("getExtension")
  def getExtension_ANGLEinstancedarrays(extensionName: ANGLE_instanced_arrays): ANGLEInstancedArrays | Null = js.native
  @JSName("getExtension")
  def getExtension_EXTblendminmax(extensionName: EXT_blend_minmax): EXTBlendMinmax | Null = js.native
  @JSName("getExtension")
  def getExtension_EXTfragdepth(extensionName: EXT_frag_depth): EXTFragDepth | Null = js.native
  @JSName("getExtension")
  def getExtension_EXTsRGB(extensionName: EXT_sRGB): EXTSRGB | Null = js.native
  @JSName("getExtension")
  def getExtension_EXTshadertexturelod(extensionName: EXT_shader_texture_lod): EXTShaderTextureLod | Null = js.native
  @JSName("getExtension")
  def getExtension_EXTtexturefilteranisotropic(extensionName: EXT_texture_filter_anisotropic): EXTTextureFilterAnisotropic | Null = js.native
  @JSName("getExtension")
  def getExtension_OESelementindexuint(extensionName: OES_element_index_uint): OESElementIndexUint | Null = js.native
  @JSName("getExtension")
  def getExtension_OESstandardderivatives(extensionName: OES_standard_derivatives): OESStandardDerivatives | Null = js.native
  @JSName("getExtension")
  def getExtension_OEStexturefloat(extensionName: OES_texture_float): OESTextureFloat | Null = js.native
  @JSName("getExtension")
  def getExtension_OEStexturefloatlinear(extensionName: OES_texture_float_linear): OESTextureFloatLinear | Null = js.native
  @JSName("getExtension")
  def getExtension_OEStexturehalffloat(extensionName: OES_texture_half_float): OESTextureHalfFloat | Null = js.native
  @JSName("getExtension")
  def getExtension_OEStexturehalffloatlinear(extensionName: OES_texture_half_float_linear): OESTextureHalfFloatLinear | Null = js.native
  @JSName("getExtension")
  def getExtension_OESvertexarrayobject(extensionName: OES_vertex_array_object): OESVertexArrayObject | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcolorbufferfloat(extensionName: WEBGL_color_buffer_float): WEBGLColorBufferFloat | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureastc(extensionName: WEBGL_compressed_texture_astc): WEBGLCompressedTextureAstc | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextures3tc(extensionName: WEBGL_compressed_texture_s3tc): WEBGLCompressedTextureS3tc | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextures3tcsrgb(extensionName: WEBGL_compressed_texture_s3tc_srgb): WEBGLCompressedTextureS3tcSrgb | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLdebugrendererinfo(extensionName: WEBGL_debug_renderer_info): WEBGLDebugRendererInfo | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLdebugshaders(extensionName: WEBGL_debug_shaders): WEBGLDebugShaders | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLdepthtexture(extensionName: WEBGL_depth_texture): WEBGLDepthTexture | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLdrawbuffers(extensionName: WEBGL_draw_buffers): WEBGLDrawBuffers | Null = js.native
  @JSName("getExtension")
  def getExtension_WEBGLlosecontext(extensionName: WEBGL_lose_context): WEBGLLoseContext | Null = js.native
  def getFramebufferAttachmentParameter(target: Double, attachment: Double, pname: Double): js.Any = js.native
  def getParameter(pname: Double): js.Any = js.native
  def getProgramInfoLog(): java.lang.String | Null = js.native
  def getProgramInfoLog(program: WebGLProgram): java.lang.String | Null = js.native
  def getProgramParameter(program: WebGLProgram, pname: Double): js.Any = js.native
  def getProgramParameter(program: Null, pname: Double): js.Any = js.native
  def getRenderbufferParameter(target: Double, pname: Double): js.Any = js.native
  def getShaderInfoLog(): java.lang.String | Null = js.native
  def getShaderInfoLog(shader: WebGLShader): java.lang.String | Null = js.native
  def getShaderParameter(shader: WebGLShader, pname: Double): js.Any = js.native
  def getShaderParameter(shader: Null, pname: Double): js.Any = js.native
  def getShaderPrecisionFormat(shadertype: Double, precisiontype: Double): WebGLShaderPrecisionFormat | Null = js.native
  def getShaderSource(): java.lang.String | Null = js.native
  def getShaderSource(shader: WebGLShader): java.lang.String | Null = js.native
  def getSupportedExtensions(): js.Array[java.lang.String] | Null = js.native
  def getTexParameter(target: Double, pname: Double): js.Any = js.native
  def getUniform(): js.Any = js.native
  def getUniform(program: WebGLProgram): js.Any = js.native
  def getUniform(program: WebGLProgram, location: WebGLUniformLocation): js.Any = js.native
  def getUniform(program: Null, location: WebGLUniformLocation): js.Any = js.native
  def getUniformLocation(program: WebGLProgram, name: java.lang.String): WebGLUniformLocation | Null = js.native
  def getUniformLocation(program: Null, name: java.lang.String): WebGLUniformLocation | Null = js.native
  def getVertexAttrib(index: Double, pname: Double): js.Any = js.native
  def getVertexAttribOffset(index: Double, pname: Double): Double = js.native
  def hint(target: Double, mode: Double): Unit = js.native
  def isBuffer(): scala.Boolean = js.native
  def isBuffer(buffer: WebGLBuffer): scala.Boolean = js.native
  def isContextLost(): scala.Boolean = js.native
  def isEnabled(cap: Double): scala.Boolean = js.native
  def isFramebuffer(): scala.Boolean = js.native
  def isFramebuffer(framebuffer: WebGLFramebuffer): scala.Boolean = js.native
  def isProgram(): scala.Boolean = js.native
  def isProgram(program: WebGLProgram): scala.Boolean = js.native
  def isRenderbuffer(): scala.Boolean = js.native
  def isRenderbuffer(renderbuffer: WebGLRenderbuffer): scala.Boolean = js.native
  def isShader(): scala.Boolean = js.native
  def isShader(shader: WebGLShader): scala.Boolean = js.native
  def isTexture(): scala.Boolean = js.native
  def isTexture(texture: WebGLTexture): scala.Boolean = js.native
  def lineWidth(width: Double): Unit = js.native
  def linkProgram(): Unit = js.native
  def linkProgram(program: WebGLProgram): Unit = js.native
  def pixelStorei(pname: Double, param: scala.Boolean): Unit = js.native
  def pixelStorei(pname: Double, param: Double): Unit = js.native
  def polygonOffset(factor: Double, units: Double): Unit = js.native
  def readPixels(x: Double, y: Double, width: Double, height: Double, format: Double, `type`: Double): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: DataView
  ): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: Float32Array
  ): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: Float64Array
  ): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: Int16Array
  ): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: Int32Array
  ): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: Int8Array
  ): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: Uint16Array
  ): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: Uint32Array
  ): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: Uint8Array
  ): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: Uint8ClampedArray
  ): Unit = js.native
  def renderbufferStorage(target: Double, internalformat: Double, width: Double, height: Double): Unit = js.native
  def sampleCoverage(value: Double, invert: scala.Boolean): Unit = js.native
  def scissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def shaderSource(shader: WebGLShader, source: java.lang.String): Unit = js.native
  def shaderSource(shader: Null, source: java.lang.String): Unit = js.native
  def stencilFunc(func: Double, ref: Double, mask: Double): Unit = js.native
  def stencilFuncSeparate(face: Double, func: Double, ref: Double, mask: Double): Unit = js.native
  def stencilMask(mask: Double): Unit = js.native
  def stencilMaskSeparate(face: Double, mask: Double): Unit = js.native
  def stencilOp(fail: Double, zfail: Double, zpass: Double): Unit = js.native
  def stencilOpSeparate(face: Double, fail: Double, zfail: Double, zpass: Double): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    pixels: HTMLCanvasElement
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    pixels: HTMLImageElement
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    pixels: HTMLVideoElement
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    pixels: ImageBitmap
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    pixels: ImageData
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pixels: ArrayBufferView
  ): Unit = js.native
  def texParameterf(target: Double, pname: Double, param: Double): Unit = js.native
  def texParameteri(target: Double, pname: Double, param: Double): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    format: Double,
    `type`: Double,
    pixels: HTMLCanvasElement
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    format: Double,
    `type`: Double,
    pixels: HTMLImageElement
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    format: Double,
    `type`: Double,
    pixels: HTMLVideoElement
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    format: Double,
    `type`: Double,
    pixels: ImageBitmap
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    format: Double,
    `type`: Double,
    pixels: ImageData
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pixels: ArrayBufferView
  ): Unit = js.native
  def uniform1f(location: WebGLUniformLocation, x: Double): Unit = js.native
  def uniform1f(location: Null, x: Double): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, v: ArrayLike[Double]): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, v: Float32Array): Unit = js.native
  def uniform1i(location: WebGLUniformLocation, x: Double): Unit = js.native
  def uniform1i(location: Null, x: Double): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, v: ArrayLike[Double]): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, v: Int32Array): Unit = js.native
  def uniform2f(location: WebGLUniformLocation, x: Double, y: Double): Unit = js.native
  def uniform2f(location: Null, x: Double, y: Double): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, v: ArrayLike[Double]): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, v: Float32Array): Unit = js.native
  def uniform2i(location: WebGLUniformLocation, x: Double, y: Double): Unit = js.native
  def uniform2i(location: Null, x: Double, y: Double): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, v: ArrayLike[Double]): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, v: Int32Array): Unit = js.native
  def uniform3f(location: WebGLUniformLocation, x: Double, y: Double, z: Double): Unit = js.native
  def uniform3f(location: Null, x: Double, y: Double, z: Double): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, v: ArrayLike[Double]): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, v: Float32Array): Unit = js.native
  def uniform3i(location: WebGLUniformLocation, x: Double, y: Double, z: Double): Unit = js.native
  def uniform3i(location: Null, x: Double, y: Double, z: Double): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, v: ArrayLike[Double]): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, v: Int32Array): Unit = js.native
  def uniform4f(location: WebGLUniformLocation, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def uniform4f(location: Null, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, v: ArrayLike[Double]): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, v: Float32Array): Unit = js.native
  def uniform4i(location: WebGLUniformLocation, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def uniform4i(location: Null, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, v: ArrayLike[Double]): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, v: Int32Array): Unit = js.native
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: scala.Boolean, value: ArrayLike[Double]): Unit = js.native
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: scala.Boolean, value: Float32Array): Unit = js.native
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: scala.Boolean, value: ArrayLike[Double]): Unit = js.native
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: scala.Boolean, value: Float32Array): Unit = js.native
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: scala.Boolean, value: ArrayLike[Double]): Unit = js.native
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: scala.Boolean, value: Float32Array): Unit = js.native
  def useProgram(): Unit = js.native
  def useProgram(program: WebGLProgram): Unit = js.native
  def validateProgram(): Unit = js.native
  def validateProgram(program: WebGLProgram): Unit = js.native
  def vertexAttrib1f(indx: Double, x: Double): Unit = js.native
  def vertexAttrib1fv(indx: Double, values: Float32Array): Unit = js.native
  def vertexAttrib1fv(indx: Double, values: js.Array[Double]): Unit = js.native
  def vertexAttrib2f(indx: Double, x: Double, y: Double): Unit = js.native
  def vertexAttrib2fv(indx: Double, values: Float32Array): Unit = js.native
  def vertexAttrib2fv(indx: Double, values: js.Array[Double]): Unit = js.native
  def vertexAttrib3f(indx: Double, x: Double, y: Double, z: Double): Unit = js.native
  def vertexAttrib3fv(indx: Double, values: Float32Array): Unit = js.native
  def vertexAttrib3fv(indx: Double, values: js.Array[Double]): Unit = js.native
  def vertexAttrib4f(indx: Double, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def vertexAttrib4fv(indx: Double, values: Float32Array): Unit = js.native
  def vertexAttrib4fv(indx: Double, values: js.Array[Double]): Unit = js.native
  def vertexAttribPointer(
    indx: Double,
    size: Double,
    `type`: Double,
    normalized: scala.Boolean,
    stride: Double,
    offset: Double
  ): Unit = js.native
  def viewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
}

