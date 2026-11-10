@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Proc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile

public actual fun choosePixelFormat(hdc: Hdc, ppfd: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun describePixelFormat(hdc: Hdc, ipixelformat: Int, nbytes: UInt, ppfd: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnhMetaFilePixelFormat(hemf: Henhmetafile, cbbuffer: UInt, ppfd: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPixelFormat(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPixelFormat(hdc: Hdc, format: Int, ppfd: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun swapBuffers(param0: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glAccum(op: UInt, value: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glAlphaFunc(func: UInt, ref: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glAreTexturesResident(n: Int, textures: COpaquePointer?, residences: COpaquePointer?): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glArrayElement(i: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glBegin(mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glBindTexture(target: UInt, texture: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glCallList(list: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glCallLists(n: Int, type: UInt, lists: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glClear(mask: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glClearDepth(depth: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glClearIndex(c: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glClearStencil(s: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glClipPlane(plane: UInt, equation: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3bv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3d(red: Double, green: Double, blue: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3f(red: Float, green: Float, blue: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3i(red: Int, green: Int, blue: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3s(red: Short, green: Short, blue: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3ubv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3uiv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor3usv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4bv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4ubv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4uiv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColor4usv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColorMaterial(face: UInt, mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glCullFace(mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDeleteLists(list: UInt, range: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDeleteTextures(n: Int, textures: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDepthFunc(func: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDepthMask(flag: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDepthRange(znear: Double, zfar: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDisable(cap: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDisableClientState(array: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDrawArrays(mode: UInt, first: Int, count: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDrawBuffer(mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEdgeFlag(flag: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEdgeFlagPointer(stride: Int, pointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEdgeFlagv(flag: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEnable(cap: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEnableClientState(array: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEnd() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEndList() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalCoord1d(u: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalCoord1dv(u: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalCoord1f(u: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalCoord1fv(u: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalCoord2d(u: Double, v: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalCoord2dv(u: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalCoord2f(u: Float, v: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalCoord2fv(u: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalMesh1(mode: UInt, i1: Int, i2: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalPoint1(i: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glEvalPoint2(i: Int, j: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glFinish() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glFlush() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glFogf(pname: UInt, param1: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glFogfv(pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glFogi(pname: UInt, param1: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glFogiv(pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glFrontFace(mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGenLists(range: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glGenTextures(n: Int, textures: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetBooleanv(pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetClipPlane(plane: UInt, equation: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetDoublev(pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetError(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glGetFloatv(pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetIntegerv(pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetLightfv(light: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetLightiv(light: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetMapdv(target: UInt, query: UInt, v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetMapfv(target: UInt, query: UInt, v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetMapiv(target: UInt, query: UInt, v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetPixelMapfv(map: UInt, values: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetPixelMapuiv(map: UInt, values: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetPixelMapusv(map: UInt, values: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetPointerv(pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetPolygonStipple(mask: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetString(name: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glHint(target: UInt, mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexMask(mask: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexd(c: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexdv(c: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexf(c: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexfv(c: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexi(c: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexiv(c: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexs(c: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexsv(c: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexub(c: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIndexubv(c: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glInitNames() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glIsEnabled(cap: UInt): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glIsList(list: UInt): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glIsTexture(texture: UInt): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glLightModelf(pname: UInt, param1: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLightModelfv(pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLightModeli(pname: UInt, param1: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLightModeliv(pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLightf(light: UInt, pname: UInt, param2: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLightfv(light: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLighti(light: UInt, pname: UInt, param2: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLightiv(light: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLineStipple(factor: Int, pattern: UShort) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLineWidth(width: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glListBase(base: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLoadIdentity() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLoadMatrixd(m: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLoadMatrixf(m: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLoadName(name: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glLogicOp(opcode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMapGrid1d(un: Int, u1: Double, u2: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMapGrid1f(un: Int, u1: Float, u2: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMaterialf(face: UInt, pname: UInt, param2: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMaterialfv(face: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMaterialiv(face: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMatrixMode(mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMultMatrixd(m: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glMultMatrixf(m: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNewList(list: UInt, mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormal3bv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormal3dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormal3fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormal3iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormal3sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPassThrough(token: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPixelStoref(pname: UInt, param1: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPixelStorei(pname: UInt, param1: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPixelTransferf(pname: UInt, param1: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPixelTransferi(pname: UInt, param1: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPixelZoom(xfactor: Float, yfactor: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPointSize(size: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPolygonMode(face: UInt, mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPolygonOffset(factor: Float, units: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPolygonStipple(mask: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPopAttrib() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPopClientAttrib() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPopMatrix() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPopName() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPrioritizeTextures(n: Int, textures: COpaquePointer?, priorities: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPushAttrib(mask: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPushClientAttrib(mask: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPushMatrix() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glPushName(name: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos2d(x: Double, y: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos2dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos2f(x: Float, y: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos2fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos2i(x: Int, y: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos2iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos2s(x: Short, y: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos2sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos3d(x: Double, y: Double, z: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos3dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos3f(x: Float, y: Float, z: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos3fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos3i(x: Int, y: Int, z: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos3iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos3s(x: Short, y: Short, z: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos3sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos4dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos4fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos4iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRasterPos4sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glReadBuffer(mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRectdv(v1: COpaquePointer?, v2: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRectfv(v1: COpaquePointer?, v2: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRectiv(v1: COpaquePointer?, v2: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRectsv(v1: COpaquePointer?, v2: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRenderMode(mode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glRotated(angle: Double, x: Double, y: Double, z: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glRotatef(angle: Float, x: Float, y: Float, z: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glScaled(x: Double, y: Double, z: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glScalef(x: Float, y: Float, z: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glScissor(x: Int, y: Int, width: Int, height: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glSelectBuffer(size: Int, buffer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glShadeModel(mode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glStencilFunc(func: UInt, ref: Int, mask: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glStencilMask(mask: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord1d(s: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord1dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord1f(s: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord1fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord1i(s: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord1iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord1s(s: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord1sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord2d(s: Double, t: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord2dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord2f(s: Float, t: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord2fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord2i(s: Int, t: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord2iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord2s(s: Short, t: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord2sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord3d(s: Double, t: Double, r: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord3dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord3f(s: Float, t: Float, r: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord3fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord3i(s: Int, t: Int, r: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord3iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord3s(s: Short, t: Short, r: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord3sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord4dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord4fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord4iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoord4sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexEnviv(target: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexGendv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTranslated(x: Double, y: Double, z: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glTranslatef(x: Float, y: Float, z: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex2d(x: Double, y: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex2dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex2f(x: Float, y: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex2fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex2i(x: Int, y: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex2iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex2s(x: Short, y: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex2sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex3d(x: Double, y: Double, z: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex3dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex3f(x: Float, y: Float, z: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex3fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex3i(x: Int, y: Int, z: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex3iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex3s(x: Short, y: Short, z: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex3sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex4dv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex4fv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex4iv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertex4sv(v: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluBeginCurve(nobj: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluBeginPolygon(tess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluBeginSurface(nobj: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluBeginTrim(nobj: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gluCylinder(qobj: COpaquePointer?, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluDeleteNurbsRenderer(nobj: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluDeleteQuadric(state: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluDeleteTess(tess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluDisk(qobj: COpaquePointer?, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluEndCurve(nobj: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluEndPolygon(tess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluEndSurface(nobj: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluEndTrim(nobj: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluErrorString(errcode: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gluGetNurbsProperty(nobj: COpaquePointer?, property: UInt, value: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluGetString(name: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gluGetTessProperty(tess: COpaquePointer?, which: UInt, value: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluLoadSamplingMatrices(nobj: COpaquePointer?, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluNewNurbsRenderer(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gluNewQuadric(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gluNewTess(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gluNextContour(tess: COpaquePointer?, type: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluNurbsCallback(nobj: COpaquePointer?, which: UInt, fn: Long) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluNurbsCurve(nobj: COpaquePointer?, nknots: Int, knot: COpaquePointer?, stride: Int, ctlarray: COpaquePointer?, order: Int, type: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluNurbsProperty(nobj: COpaquePointer?, property: UInt, value: Float) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluNurbsSurface(nobj: COpaquePointer?, sknotCount: Int, sknot: COpaquePointer?, tknotCount: Int, tknot: COpaquePointer?, sStride: Int, tStride: Int, ctlarray: COpaquePointer?, sorder: Int, torder: Int, type: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluPartialDisk(qobj: COpaquePointer?, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?, winx: COpaquePointer?, winy: COpaquePointer?, winz: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gluPwlCurve(nobj: COpaquePointer?, count: Int, array: COpaquePointer?, stride: Int, type: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluQuadricCallback(qobj: COpaquePointer?, which: UInt, fn: Long) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluQuadricDrawStyle(quadobject: COpaquePointer?, drawstyle: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluQuadricNormals(quadobject: COpaquePointer?, normals: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluQuadricOrientation(quadobject: COpaquePointer?, orientation: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluQuadricTexture(quadobject: COpaquePointer?, texturecoords: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: COpaquePointer?, widthout: Int, heightout: Int, typeout: UInt, dataout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gluSphere(qobj: COpaquePointer?, radius: Double, slices: Int, stacks: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluTessBeginContour(tess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluTessBeginPolygon(tess: COpaquePointer?, polygonData: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluTessCallback(tess: COpaquePointer?, which: UInt, fn: Long) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluTessEndContour(tess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluTessEndPolygon(tess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluTessNormal(tess: COpaquePointer?, x: Double, y: Double, z: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluTessProperty(tess: COpaquePointer?, which: UInt, value: Double) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluTessVertex(tess: COpaquePointer?, coords: COpaquePointer?, data: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?, objx: COpaquePointer?, objy: COpaquePointer?, objz: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglCopyContext(param0: Hglrc, param1: Hglrc, param2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglCreateContext(param0: Hdc): Hglrc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglCreateLayerContext(param0: Hdc, param1: Int): Hglrc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglDeleteContext(param0: Hglrc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglDescribeLayerPlane(param0: Hdc, param1: Int, param2: Int, param3: UInt, param4: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglGetCurrentContext(): Hglrc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglGetCurrentDC(): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglGetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglGetProcAddress(param0: Pcstr): Proc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglMakeCurrent(param0: Hdc, param1: Hglrc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglRealizeLayerPalette(param0: Hdc, param1: Int, param2: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglSetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglShareLists(param0: Hglrc, param1: Hglrc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglSwapLayerBuffers(param0: Hdc, param1: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglUseFontBitmapsA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglUseFontBitmapsW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglUseFontOutlinesA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglUseFontOutlinesW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
