@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Proc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun choosePixelFormat(hdc: Hdc, ppfd: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_choosePixelFormat(hdc?.value?.toCPointer<ByteVar>(), ppfd?.value?.toCPointer<ByteVar>())

public actual fun describePixelFormat(hdc: Hdc, ipixelformat: Int, nbytes: UInt, ppfd: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_describePixelFormat(hdc?.value?.toCPointer<ByteVar>(), ipixelformat, nbytes, ppfd?.value?.toCPointer<ByteVar>())

public actual fun getEnhMetaFilePixelFormat(hemf: Henhmetafile, cbbuffer: UInt, ppfd: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_getEnhMetaFilePixelFormat(hemf?.value?.toCPointer<ByteVar>(), cbbuffer, ppfd?.value?.toCPointer<ByteVar>())

public actual fun getPixelFormat(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_getPixelFormat(hdc?.value?.toCPointer<ByteVar>())

public actual fun setPixelFormat(hdc: Hdc, format: Int, ppfd: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_setPixelFormat(hdc?.value?.toCPointer<ByteVar>(), format, ppfd?.value?.toCPointer<ByteVar>())

public actual fun swapBuffers(param0: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_swapBuffers(param0?.value?.toCPointer<ByteVar>())

public actual fun glAccum(op: UInt, value: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glAccum(op, value)
}

public actual fun glAlphaFunc(func: UInt, ref: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glAlphaFunc(func, ref)
}

public actual fun glAreTexturesResident(n: Int, textures: COpaquePointer?, residences: COpaquePointer?): UByte =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glAreTexturesResident(n, textures?.value?.toCPointer<ByteVar>(), residences?.value?.toCPointer<ByteVar>())

public actual fun glArrayElement(i: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glArrayElement(i)
}

public actual fun glBegin(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glBegin(mode)
}

public actual fun glBindTexture(target: UInt, texture: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glBindTexture(target, texture)
}

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glBitmap(width, height, xorig, yorig, xmove, ymove, bitmap?.value?.toCPointer<ByteVar>())
}

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glBlendFunc(sfactor, dfactor)
}

public actual fun glCallList(list: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glCallList(list)
}

public actual fun glCallLists(n: Int, type: UInt, lists: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glCallLists(n, type, lists?.value?.toCPointer<ByteVar>())
}

public actual fun glClear(mask: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glClear(mask)
}

public actual fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glClearAccum(red, green, blue, alpha)
}

public actual fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glClearColor(red, green, blue, alpha)
}

public actual fun glClearDepth(depth: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glClearDepth(depth)
}

public actual fun glClearIndex(c: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glClearIndex(c)
}

public actual fun glClearStencil(s: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glClearStencil(s)
}

public actual fun glClipPlane(plane: UInt, equation: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glClipPlane(plane, equation?.value?.toCPointer<ByteVar>())
}

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3b(red, green, blue)
}

public actual fun glColor3bv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3bv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor3d(red: Double, green: Double, blue: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3d(red, green, blue)
}

public actual fun glColor3dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor3f(red: Float, green: Float, blue: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3f(red, green, blue)
}

public actual fun glColor3fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor3i(red: Int, green: Int, blue: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3i(red, green, blue)
}

public actual fun glColor3iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor3s(red: Short, green: Short, blue: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3s(red, green, blue)
}

public actual fun glColor3sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3ub(red, green, blue)
}

public actual fun glColor3ubv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3ubv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3ui(red, green, blue)
}

public actual fun glColor3uiv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3uiv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3us(red, green, blue)
}

public actual fun glColor3usv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3usv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4b(red, green, blue, alpha)
}

public actual fun glColor4bv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4bv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4d(red, green, blue, alpha)
}

public actual fun glColor4dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4f(red, green, blue, alpha)
}

public actual fun glColor4fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4i(red, green, blue, alpha)
}

public actual fun glColor4iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4s(red, green, blue, alpha)
}

public actual fun glColor4sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4ub(red, green, blue, alpha)
}

public actual fun glColor4ubv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4ubv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4ui(red, green, blue, alpha)
}

public actual fun glColor4uiv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4uiv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4us(red, green, blue, alpha)
}

public actual fun glColor4usv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4usv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColorMask(red, green, blue, alpha)
}

public actual fun glColorMaterial(face: UInt, mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColorMaterial(face, mode)
}

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColorPointer(size, type, stride, pointer?.value?.toCPointer<ByteVar>())
}

public actual fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glCopyPixels(x, y, width, height, type)
}

public actual fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glCopyTexImage1D(target, level, internalformat, x, y, width, border)
}

public actual fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glCopyTexImage2D(target, level, internalformat, x, y, width, height, border)
}

public actual fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D(target, level, xoffset, x, y, width)
}

public actual fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height)
}

public actual fun glCullFace(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glCullFace(mode)
}

public actual fun glDeleteLists(list: UInt, range: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDeleteLists(list, range)
}

public actual fun glDeleteTextures(n: Int, textures: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDeleteTextures(n, textures?.value?.toCPointer<ByteVar>())
}

public actual fun glDepthFunc(func: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDepthFunc(func)
}

public actual fun glDepthMask(flag: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDepthMask(flag)
}

public actual fun glDepthRange(znear: Double, zfar: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDepthRange(znear, zfar)
}

public actual fun glDisable(cap: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDisable(cap)
}

public actual fun glDisableClientState(array: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDisableClientState(array)
}

public actual fun glDrawArrays(mode: UInt, first: Int, count: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDrawArrays(mode, first, count)
}

public actual fun glDrawBuffer(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDrawBuffer(mode)
}

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDrawElements(mode, count, type, indices?.value?.toCPointer<ByteVar>())
}

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDrawPixels(width, height, format, type, pixels?.value?.toCPointer<ByteVar>())
}

public actual fun glEdgeFlag(flag: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEdgeFlag(flag)
}

public actual fun glEdgeFlagPointer(stride: Int, pointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer(stride, pointer?.value?.toCPointer<ByteVar>())
}

public actual fun glEdgeFlagv(flag: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEdgeFlagv(flag?.value?.toCPointer<ByteVar>())
}

public actual fun glEnable(cap: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEnable(cap)
}

public actual fun glEnableClientState(array: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEnableClientState(array)
}

public actual fun glEnd() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEnd()
}

public actual fun glEndList() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEndList()
}

public actual fun glEvalCoord1d(u: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord1d(u)
}

public actual fun glEvalCoord1dv(u: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord1dv(u?.value?.toCPointer<ByteVar>())
}

public actual fun glEvalCoord1f(u: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord1f(u)
}

public actual fun glEvalCoord1fv(u: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord1fv(u?.value?.toCPointer<ByteVar>())
}

public actual fun glEvalCoord2d(u: Double, v: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord2d(u, v)
}

public actual fun glEvalCoord2dv(u: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord2dv(u?.value?.toCPointer<ByteVar>())
}

public actual fun glEvalCoord2f(u: Float, v: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord2f(u, v)
}

public actual fun glEvalCoord2fv(u: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord2fv(u?.value?.toCPointer<ByteVar>())
}

public actual fun glEvalMesh1(mode: UInt, i1: Int, i2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalMesh1(mode, i1, i2)
}

public actual fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalMesh2(mode, i1, i2, j1, j2)
}

public actual fun glEvalPoint1(i: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalPoint1(i)
}

public actual fun glEvalPoint2(i: Int, j: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalPoint2(i, j)
}

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFeedbackBuffer(size, type, buffer?.value?.toCPointer<ByteVar>())
}

public actual fun glFinish() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFinish()
}

public actual fun glFlush() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFlush()
}

public actual fun glFogf(pname: UInt, param1: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFogf(pname, param1)
}

public actual fun glFogfv(pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFogfv(pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glFogi(pname: UInt, param1: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFogi(pname, param1)
}

public actual fun glFogiv(pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFogiv(pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glFrontFace(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFrontFace(mode)
}

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFrustum(left, right, bottom, top, znear, zfar)
}

public actual fun glGenLists(range: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGenLists(range)

public actual fun glGenTextures(n: Int, textures: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGenTextures(n, textures?.value?.toCPointer<ByteVar>())
}

public actual fun glGetBooleanv(pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetBooleanv(pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetClipPlane(plane: UInt, equation: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetClipPlane(plane, equation?.value?.toCPointer<ByteVar>())
}

public actual fun glGetDoublev(pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetDoublev(pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetError(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetError()

public actual fun glGetFloatv(pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetFloatv(pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetIntegerv(pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetIntegerv(pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetLightfv(light: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetLightfv(light, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetLightiv(light: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetLightiv(light, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetMapdv(target: UInt, query: UInt, v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetMapdv(target, query, v?.value?.toCPointer<ByteVar>())
}

public actual fun glGetMapfv(target: UInt, query: UInt, v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetMapfv(target, query, v?.value?.toCPointer<ByteVar>())
}

public actual fun glGetMapiv(target: UInt, query: UInt, v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetMapiv(target, query, v?.value?.toCPointer<ByteVar>())
}

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetMaterialfv(face, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetMaterialiv(face, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetPixelMapfv(map: UInt, values: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetPixelMapfv(map, values?.value?.toCPointer<ByteVar>())
}

public actual fun glGetPixelMapuiv(map: UInt, values: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv(map, values?.value?.toCPointer<ByteVar>())
}

public actual fun glGetPixelMapusv(map: UInt, values: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetPixelMapusv(map, values?.value?.toCPointer<ByteVar>())
}

public actual fun glGetPointerv(pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetPointerv(pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetPolygonStipple(mask: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetPolygonStipple(mask?.value?.toCPointer<ByteVar>())
}

public actual fun glGetString(name: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetString(name)?.let { COpaquePointer(it.toLong()) }

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexEnvfv(target, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexEnviv(target, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexGendv(coord, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexGenfv(coord, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexGeniv(coord, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexImage(target, level, format, type, pixels?.value?.toCPointer<ByteVar>())
}

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv(target, level, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv(target, level, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexParameterfv(target, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexParameteriv(target, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glHint(target: UInt, mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glHint(target, mode)
}

public actual fun glIndexMask(mask: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexMask(mask)
}

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexPointer(type, stride, pointer?.value?.toCPointer<ByteVar>())
}

public actual fun glIndexd(c: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexd(c)
}

public actual fun glIndexdv(c: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexdv(c?.value?.toCPointer<ByteVar>())
}

public actual fun glIndexf(c: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexf(c)
}

public actual fun glIndexfv(c: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexfv(c?.value?.toCPointer<ByteVar>())
}

public actual fun glIndexi(c: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexi(c)
}

public actual fun glIndexiv(c: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexiv(c?.value?.toCPointer<ByteVar>())
}

public actual fun glIndexs(c: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexs(c)
}

public actual fun glIndexsv(c: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexsv(c?.value?.toCPointer<ByteVar>())
}

public actual fun glIndexub(c: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexub(c)
}

public actual fun glIndexubv(c: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexubv(c?.value?.toCPointer<ByteVar>())
}

public actual fun glInitNames() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glInitNames()
}

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glInterleavedArrays(format, stride, pointer?.value?.toCPointer<ByteVar>())
}

public actual fun glIsEnabled(cap: UInt): UByte =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIsEnabled(cap)

public actual fun glIsList(list: UInt): UByte =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIsList(list)

public actual fun glIsTexture(texture: UInt): UByte =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIsTexture(texture)

public actual fun glLightModelf(pname: UInt, param1: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightModelf(pname, param1)
}

public actual fun glLightModelfv(pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightModelfv(pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glLightModeli(pname: UInt, param1: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightModeli(pname, param1)
}

public actual fun glLightModeliv(pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightModeliv(pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glLightf(light: UInt, pname: UInt, param2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightf(light, pname, param2)
}

public actual fun glLightfv(light: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightfv(light, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glLighti(light: UInt, pname: UInt, param2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLighti(light, pname, param2)
}

public actual fun glLightiv(light: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightiv(light, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glLineStipple(factor: Int, pattern: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLineStipple(factor, pattern)
}

public actual fun glLineWidth(width: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLineWidth(width)
}

public actual fun glListBase(base: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glListBase(base)
}

public actual fun glLoadIdentity() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLoadIdentity()
}

public actual fun glLoadMatrixd(m: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLoadMatrixd(m?.value?.toCPointer<ByteVar>())
}

public actual fun glLoadMatrixf(m: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLoadMatrixf(m?.value?.toCPointer<ByteVar>())
}

public actual fun glLoadName(name: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLoadName(name)
}

public actual fun glLogicOp(opcode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLogicOp(opcode)
}

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMap1d(target, u1, u2, stride, order, points?.value?.toCPointer<ByteVar>())
}

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMap1f(target, u1, u2, stride, order, points?.value?.toCPointer<ByteVar>())
}

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points?.value?.toCPointer<ByteVar>())
}

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points?.value?.toCPointer<ByteVar>())
}

public actual fun glMapGrid1d(un: Int, u1: Double, u2: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMapGrid1d(un, u1, u2)
}

public actual fun glMapGrid1f(un: Int, u1: Float, u2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMapGrid1f(un, u1, u2)
}

public actual fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMapGrid2d(un, u1, u2, vn, v1, v2)
}

public actual fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMapGrid2f(un, u1, u2, vn, v1, v2)
}

public actual fun glMaterialf(face: UInt, pname: UInt, param2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMaterialf(face, pname, param2)
}

public actual fun glMaterialfv(face: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMaterialfv(face, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMateriali(face, pname, param2)
}

public actual fun glMaterialiv(face: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMaterialiv(face, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glMatrixMode(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMatrixMode(mode)
}

public actual fun glMultMatrixd(m: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMultMatrixd(m?.value?.toCPointer<ByteVar>())
}

public actual fun glMultMatrixf(m: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMultMatrixf(m?.value?.toCPointer<ByteVar>())
}

public actual fun glNewList(list: UInt, mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNewList(list, mode)
}

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3b(nx, ny, nz)
}

public actual fun glNormal3bv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3bv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3d(nx, ny, nz)
}

public actual fun glNormal3dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3f(nx, ny, nz)
}

public actual fun glNormal3fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3i(nx, ny, nz)
}

public actual fun glNormal3iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3s(nx, ny, nz)
}

public actual fun glNormal3sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormalPointer(type, stride, pointer?.value?.toCPointer<ByteVar>())
}

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glOrtho(left, right, bottom, top, znear, zfar)
}

public actual fun glPassThrough(token: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPassThrough(token)
}

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelMapfv(map, mapsize, values?.value?.toCPointer<ByteVar>())
}

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelMapuiv(map, mapsize, values?.value?.toCPointer<ByteVar>())
}

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelMapusv(map, mapsize, values?.value?.toCPointer<ByteVar>())
}

public actual fun glPixelStoref(pname: UInt, param1: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelStoref(pname, param1)
}

public actual fun glPixelStorei(pname: UInt, param1: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelStorei(pname, param1)
}

public actual fun glPixelTransferf(pname: UInt, param1: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelTransferf(pname, param1)
}

public actual fun glPixelTransferi(pname: UInt, param1: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelTransferi(pname, param1)
}

public actual fun glPixelZoom(xfactor: Float, yfactor: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelZoom(xfactor, yfactor)
}

public actual fun glPointSize(size: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPointSize(size)
}

public actual fun glPolygonMode(face: UInt, mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPolygonMode(face, mode)
}

public actual fun glPolygonOffset(factor: Float, units: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPolygonOffset(factor, units)
}

public actual fun glPolygonStipple(mask: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPolygonStipple(mask?.value?.toCPointer<ByteVar>())
}

public actual fun glPopAttrib() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPopAttrib()
}

public actual fun glPopClientAttrib() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPopClientAttrib()
}

public actual fun glPopMatrix() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPopMatrix()
}

public actual fun glPopName() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPopName()
}

public actual fun glPrioritizeTextures(n: Int, textures: COpaquePointer?, priorities: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPrioritizeTextures(n, textures?.value?.toCPointer<ByteVar>(), priorities?.value?.toCPointer<ByteVar>())
}

public actual fun glPushAttrib(mask: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPushAttrib(mask)
}

public actual fun glPushClientAttrib(mask: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPushClientAttrib(mask)
}

public actual fun glPushMatrix() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPushMatrix()
}

public actual fun glPushName(name: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPushName(name)
}

public actual fun glRasterPos2d(x: Double, y: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2d(x, y)
}

public actual fun glRasterPos2dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos2f(x: Float, y: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2f(x, y)
}

public actual fun glRasterPos2fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos2i(x: Int, y: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2i(x, y)
}

public actual fun glRasterPos2iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos2s(x: Short, y: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2s(x, y)
}

public actual fun glRasterPos2sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos3d(x: Double, y: Double, z: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3d(x, y, z)
}

public actual fun glRasterPos3dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos3f(x: Float, y: Float, z: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3f(x, y, z)
}

public actual fun glRasterPos3fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos3i(x: Int, y: Int, z: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3i(x, y, z)
}

public actual fun glRasterPos3iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos3s(x: Short, y: Short, z: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3s(x, y, z)
}

public actual fun glRasterPos3sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4d(x, y, z, w)
}

public actual fun glRasterPos4dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4f(x, y, z, w)
}

public actual fun glRasterPos4fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4i(x, y, z, w)
}

public actual fun glRasterPos4iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4s(x, y, z, w)
}

public actual fun glRasterPos4sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glReadBuffer(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glReadBuffer(mode)
}

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glReadPixels(x, y, width, height, format, type, pixels?.value?.toCPointer<ByteVar>())
}

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectd(x1, y1, x2, y2)
}

public actual fun glRectdv(v1: COpaquePointer?, v2: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectdv(v1?.value?.toCPointer<ByteVar>(), v2?.value?.toCPointer<ByteVar>())
}

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectf(x1, y1, x2, y2)
}

public actual fun glRectfv(v1: COpaquePointer?, v2: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectfv(v1?.value?.toCPointer<ByteVar>(), v2?.value?.toCPointer<ByteVar>())
}

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRecti(x1, y1, x2, y2)
}

public actual fun glRectiv(v1: COpaquePointer?, v2: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectiv(v1?.value?.toCPointer<ByteVar>(), v2?.value?.toCPointer<ByteVar>())
}

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRects(x1, y1, x2, y2)
}

public actual fun glRectsv(v1: COpaquePointer?, v2: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectsv(v1?.value?.toCPointer<ByteVar>(), v2?.value?.toCPointer<ByteVar>())
}

public actual fun glRenderMode(mode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRenderMode(mode)

public actual fun glRotated(angle: Double, x: Double, y: Double, z: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRotated(angle, x, y, z)
}

public actual fun glRotatef(angle: Float, x: Float, y: Float, z: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRotatef(angle, x, y, z)
}

public actual fun glScaled(x: Double, y: Double, z: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glScaled(x, y, z)
}

public actual fun glScalef(x: Float, y: Float, z: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glScalef(x, y, z)
}

public actual fun glScissor(x: Int, y: Int, width: Int, height: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glScissor(x, y, width, height)
}

public actual fun glSelectBuffer(size: Int, buffer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glSelectBuffer(size, buffer?.value?.toCPointer<ByteVar>())
}

public actual fun glShadeModel(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glShadeModel(mode)
}

public actual fun glStencilFunc(func: UInt, ref: Int, mask: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glStencilFunc(func, ref, mask)
}

public actual fun glStencilMask(mask: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glStencilMask(mask)
}

public actual fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glStencilOp(fail, zfail, zpass)
}

public actual fun glTexCoord1d(s: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1d(s)
}

public actual fun glTexCoord1dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord1f(s: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1f(s)
}

public actual fun glTexCoord1fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord1i(s: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1i(s)
}

public actual fun glTexCoord1iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord1s(s: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1s(s)
}

public actual fun glTexCoord1sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord2d(s: Double, t: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2d(s, t)
}

public actual fun glTexCoord2dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord2f(s: Float, t: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2f(s, t)
}

public actual fun glTexCoord2fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord2i(s: Int, t: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2i(s, t)
}

public actual fun glTexCoord2iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord2s(s: Short, t: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2s(s, t)
}

public actual fun glTexCoord2sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord3d(s: Double, t: Double, r: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3d(s, t, r)
}

public actual fun glTexCoord3dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord3f(s: Float, t: Float, r: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3f(s, t, r)
}

public actual fun glTexCoord3fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord3i(s: Int, t: Int, r: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3i(s, t, r)
}

public actual fun glTexCoord3iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord3s(s: Short, t: Short, r: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3s(s, t, r)
}

public actual fun glTexCoord3sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4d(s, t, r, q)
}

public actual fun glTexCoord4dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4f(s, t, r, q)
}

public actual fun glTexCoord4fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4i(s, t, r, q)
}

public actual fun glTexCoord4iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4s(s, t, r, q)
}

public actual fun glTexCoord4sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoordPointer(size, type, stride, pointer?.value?.toCPointer<ByteVar>())
}

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexEnvf(target, pname, param2)
}

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexEnvfv(target, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexEnvi(target, pname, param2)
}

public actual fun glTexEnviv(target: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexEnviv(target, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGend(coord, pname, param2)
}

public actual fun glTexGendv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGendv(coord, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGenf(coord, pname, param2)
}

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGenfv(coord, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGeni(coord, pname, param2)
}

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGeniv(coord, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexImage1D(target, level, internalformat, width, border, format, type, pixels?.value?.toCPointer<ByteVar>())
}

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels?.value?.toCPointer<ByteVar>())
}

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexParameterf(target, pname, param2)
}

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexParameterfv(target, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexParameteri(target, pname, param2)
}

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexParameteriv(target, pname, params?.value?.toCPointer<ByteVar>())
}

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexSubImage1D(target, level, xoffset, width, format, type, pixels?.value?.toCPointer<ByteVar>())
}

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels?.value?.toCPointer<ByteVar>())
}

public actual fun glTranslated(x: Double, y: Double, z: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTranslated(x, y, z)
}

public actual fun glTranslatef(x: Float, y: Float, z: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTranslatef(x, y, z)
}

public actual fun glVertex2d(x: Double, y: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2d(x, y)
}

public actual fun glVertex2dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex2f(x: Float, y: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2f(x, y)
}

public actual fun glVertex2fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex2i(x: Int, y: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2i(x, y)
}

public actual fun glVertex2iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex2s(x: Short, y: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2s(x, y)
}

public actual fun glVertex2sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex3d(x: Double, y: Double, z: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3d(x, y, z)
}

public actual fun glVertex3dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex3f(x: Float, y: Float, z: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3f(x, y, z)
}

public actual fun glVertex3fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex3i(x: Int, y: Int, z: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3i(x, y, z)
}

public actual fun glVertex3iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex3s(x: Short, y: Short, z: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3s(x, y, z)
}

public actual fun glVertex3sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4d(x, y, z, w)
}

public actual fun glVertex4dv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4dv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4f(x, y, z, w)
}

public actual fun glVertex4fv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4fv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4i(x, y, z, w)
}

public actual fun glVertex4iv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4iv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4s(x, y, z, w)
}

public actual fun glVertex4sv(v: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4sv(v?.value?.toCPointer<ByteVar>())
}

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertexPointer(size, type, stride, pointer?.value?.toCPointer<ByteVar>())
}

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glViewport(x, y, width, height)
}

public actual fun gluBeginCurve(nobj: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBeginCurve(nobj?.value?.toCPointer<ByteVar>())
}

public actual fun gluBeginPolygon(tess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBeginPolygon(tess?.value?.toCPointer<ByteVar>())
}

public actual fun gluBeginSurface(nobj: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBeginSurface(nobj?.value?.toCPointer<ByteVar>())
}

public actual fun gluBeginTrim(nobj: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBeginTrim(nobj?.value?.toCPointer<ByteVar>())
}

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps(target, components, width, format, type, data?.value?.toCPointer<ByteVar>())

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps(target, components, width, height, format, type, data?.value?.toCPointer<ByteVar>())

public actual fun gluCylinder(qobj: COpaquePointer?, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluCylinder(qobj?.value?.toCPointer<ByteVar>(), baseradius, topradius, height, slices, stacks)
}

public actual fun gluDeleteNurbsRenderer(nobj: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer(nobj?.value?.toCPointer<ByteVar>())
}

public actual fun gluDeleteQuadric(state: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluDeleteQuadric(state?.value?.toCPointer<ByteVar>())
}

public actual fun gluDeleteTess(tess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluDeleteTess(tess?.value?.toCPointer<ByteVar>())
}

public actual fun gluDisk(qobj: COpaquePointer?, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluDisk(qobj?.value?.toCPointer<ByteVar>(), innerradius, outerradius, slices, loops)
}

public actual fun gluEndCurve(nobj: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluEndCurve(nobj?.value?.toCPointer<ByteVar>())
}

public actual fun gluEndPolygon(tess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluEndPolygon(tess?.value?.toCPointer<ByteVar>())
}

public actual fun gluEndSurface(nobj: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluEndSurface(nobj?.value?.toCPointer<ByteVar>())
}

public actual fun gluEndTrim(nobj: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluEndTrim(nobj?.value?.toCPointer<ByteVar>())
}

public actual fun gluErrorString(errcode: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluErrorString(errcode)?.let { COpaquePointer(it.toLong()) }

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): Pcwstr =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT(errcode)?.let { COpaquePointer(it.toLong()) }

public actual fun gluGetNurbsProperty(nobj: COpaquePointer?, property: UInt, value: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty(nobj?.value?.toCPointer<ByteVar>(), property, value?.value?.toCPointer<ByteVar>())
}

public actual fun gluGetString(name: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluGetString(name)?.let { COpaquePointer(it.toLong()) }

public actual fun gluGetTessProperty(tess: COpaquePointer?, which: UInt, value: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluGetTessProperty(tess?.value?.toCPointer<ByteVar>(), which, value?.value?.toCPointer<ByteVar>())
}

public actual fun gluLoadSamplingMatrices(nobj: COpaquePointer?, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices(nobj?.value?.toCPointer<ByteVar>(), modelmatrix?.value?.toCPointer<ByteVar>(), projmatrix?.value?.toCPointer<ByteVar>(), viewport?.value?.toCPointer<ByteVar>())
}

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluLookAt(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz)
}

public actual fun gluNewNurbsRenderer(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer()?.let { COpaquePointer(it.toLong()) }

public actual fun gluNewQuadric(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNewQuadric()?.let { COpaquePointer(it.toLong()) }

public actual fun gluNewTess(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNewTess()?.let { COpaquePointer(it.toLong()) }

public actual fun gluNextContour(tess: COpaquePointer?, type: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNextContour(tess?.value?.toCPointer<ByteVar>(), type)
}

public actual fun gluNurbsCallback(nobj: COpaquePointer?, which: UInt, fn: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNurbsCallback(nobj?.value?.toCPointer<ByteVar>(), which, fn)
}

public actual fun gluNurbsCurve(nobj: COpaquePointer?, nknots: Int, knot: COpaquePointer?, stride: Int, ctlarray: COpaquePointer?, order: Int, type: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNurbsCurve(nobj?.value?.toCPointer<ByteVar>(), nknots, knot?.value?.toCPointer<ByteVar>(), stride, ctlarray?.value?.toCPointer<ByteVar>(), order, type)
}

public actual fun gluNurbsProperty(nobj: COpaquePointer?, property: UInt, value: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNurbsProperty(nobj?.value?.toCPointer<ByteVar>(), property, value)
}

public actual fun gluNurbsSurface(nobj: COpaquePointer?, sknotCount: Int, sknot: COpaquePointer?, tknotCount: Int, tknot: COpaquePointer?, sStride: Int, tStride: Int, ctlarray: COpaquePointer?, sorder: Int, torder: Int, type: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNurbsSurface(nobj?.value?.toCPointer<ByteVar>(), sknotCount, sknot?.value?.toCPointer<ByteVar>(), tknotCount, tknot?.value?.toCPointer<ByteVar>(), sStride, tStride, ctlarray?.value?.toCPointer<ByteVar>(), sorder, torder, type)
}

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluOrtho2D(left, right, bottom, top)
}

public actual fun gluPartialDisk(qobj: COpaquePointer?, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluPartialDisk(qobj?.value?.toCPointer<ByteVar>(), innerradius, outerradius, slices, loops, startangle, sweepangle)
}

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluPerspective(fovy, aspect, znear, zfar)
}

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluPickMatrix(x, y, width, height, viewport?.value?.toCPointer<ByteVar>())
}

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?, winx: COpaquePointer?, winy: COpaquePointer?, winz: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluProject(objx, objy, objz, modelmatrix?.value?.toCPointer<ByteVar>(), projmatrix?.value?.toCPointer<ByteVar>(), viewport?.value?.toCPointer<ByteVar>(), winx?.value?.toCPointer<ByteVar>(), winy?.value?.toCPointer<ByteVar>(), winz?.value?.toCPointer<ByteVar>())

public actual fun gluPwlCurve(nobj: COpaquePointer?, count: Int, array: COpaquePointer?, stride: Int, type: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluPwlCurve(nobj?.value?.toCPointer<ByteVar>(), count, array?.value?.toCPointer<ByteVar>(), stride, type)
}

public actual fun gluQuadricCallback(qobj: COpaquePointer?, which: UInt, fn: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluQuadricCallback(qobj?.value?.toCPointer<ByteVar>(), which, fn)
}

public actual fun gluQuadricDrawStyle(quadobject: COpaquePointer?, drawstyle: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle(quadobject?.value?.toCPointer<ByteVar>(), drawstyle)
}

public actual fun gluQuadricNormals(quadobject: COpaquePointer?, normals: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluQuadricNormals(quadobject?.value?.toCPointer<ByteVar>(), normals)
}

public actual fun gluQuadricOrientation(quadobject: COpaquePointer?, orientation: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluQuadricOrientation(quadobject?.value?.toCPointer<ByteVar>(), orientation)
}

public actual fun gluQuadricTexture(quadobject: COpaquePointer?, texturecoords: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluQuadricTexture(quadobject?.value?.toCPointer<ByteVar>(), texturecoords)
}

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: COpaquePointer?, widthout: Int, heightout: Int, typeout: UInt, dataout: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluScaleImage(format, widthin, heightin, typein, datain?.value?.toCPointer<ByteVar>(), widthout, heightout, typeout, dataout?.value?.toCPointer<ByteVar>())

public actual fun gluSphere(qobj: COpaquePointer?, radius: Double, slices: Int, stacks: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluSphere(qobj?.value?.toCPointer<ByteVar>(), radius, slices, stacks)
}

public actual fun gluTessBeginContour(tess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessBeginContour(tess?.value?.toCPointer<ByteVar>())
}

public actual fun gluTessBeginPolygon(tess: COpaquePointer?, polygonData: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon(tess?.value?.toCPointer<ByteVar>(), polygonData?.value?.toCPointer<ByteVar>())
}

public actual fun gluTessCallback(tess: COpaquePointer?, which: UInt, fn: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessCallback(tess?.value?.toCPointer<ByteVar>(), which, fn)
}

public actual fun gluTessEndContour(tess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessEndContour(tess?.value?.toCPointer<ByteVar>())
}

public actual fun gluTessEndPolygon(tess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessEndPolygon(tess?.value?.toCPointer<ByteVar>())
}

public actual fun gluTessNormal(tess: COpaquePointer?, x: Double, y: Double, z: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessNormal(tess?.value?.toCPointer<ByteVar>(), x, y, z)
}

public actual fun gluTessProperty(tess: COpaquePointer?, which: UInt, value: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessProperty(tess?.value?.toCPointer<ByteVar>(), which, value)
}

public actual fun gluTessVertex(tess: COpaquePointer?, coords: COpaquePointer?, data: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessVertex(tess?.value?.toCPointer<ByteVar>(), coords?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())
}

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?, objx: COpaquePointer?, objy: COpaquePointer?, objz: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluUnProject(winx, winy, winz, modelmatrix?.value?.toCPointer<ByteVar>(), projmatrix?.value?.toCPointer<ByteVar>(), viewport?.value?.toCPointer<ByteVar>(), objx?.value?.toCPointer<ByteVar>(), objy?.value?.toCPointer<ByteVar>(), objz?.value?.toCPointer<ByteVar>())

public actual fun wglCopyContext(param0: Hglrc, param1: Hglrc, param2: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglCopyContext(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun wglCreateContext(param0: Hdc): Hglrc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglCreateContext(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wglCreateLayerContext(param0: Hdc, param1: Int): Hglrc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglCreateLayerContext(param0?.value?.toCPointer<ByteVar>(), param1)?.let { COpaquePointer(it.toLong()) }

public actual fun wglDeleteContext(param0: Hglrc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglDeleteContext(param0?.value?.toCPointer<ByteVar>())

public actual fun wglDescribeLayerPlane(param0: Hdc, param1: Int, param2: Int, param3: UInt, param4: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3, param4?.value?.toCPointer<ByteVar>())

public actual fun wglGetCurrentContext(): Hglrc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglGetCurrentContext()?.let { COpaquePointer(it.toLong()) }

public actual fun wglGetCurrentDC(): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglGetCurrentDC()?.let { COpaquePointer(it.toLong()) }

public actual fun wglGetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3, param4?.value?.toCPointer<ByteVar>())

public actual fun wglGetProcAddress(param0: Pcstr): Proc =
    null

public actual fun wglMakeCurrent(param0: Hdc, param1: Hglrc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglMakeCurrent(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun wglRealizeLayerPalette(param0: Hdc, param1: Int, param2: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette(param0?.value?.toCPointer<ByteVar>(), param1, param2)

public actual fun wglSetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3, param4?.value?.toCPointer<ByteVar>())

public actual fun wglShareLists(param0: Hglrc, param1: Hglrc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglShareLists(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun wglSwapLayerBuffers(param0: Hdc, param1: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers(param0?.value?.toCPointer<ByteVar>(), param1)

public actual fun wglUseFontBitmapsA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3)

public actual fun wglUseFontBitmapsW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3)

public actual fun wglUseFontOutlinesA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3, param4, param5, param6, param7?.value?.toCPointer<ByteVar>())

public actual fun wglUseFontOutlinesW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3, param4, param5, param6, param7?.value?.toCPointer<ByteVar>())
