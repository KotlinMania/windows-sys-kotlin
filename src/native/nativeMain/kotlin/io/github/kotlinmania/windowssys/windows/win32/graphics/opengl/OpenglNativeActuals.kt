@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.PROC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HENHMETAFILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ChoosePixelFormat(hdc: HDC, ppfd: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_ChoosePixelFormat(hdc.toCPointer<ByteVar>(), ppfd.toCPointer<ByteVar>())

public actual fun DescribePixelFormat(hdc: HDC, ipixelformat: Int, nbytes: UInt, ppfd: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_DescribePixelFormat(hdc.toCPointer<ByteVar>(), ipixelformat, nbytes, ppfd.toCPointer<ByteVar>())

public actual fun GetEnhMetaFilePixelFormat(hemf: HENHMETAFILE, cbbuffer: UInt, ppfd: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_GetEnhMetaFilePixelFormat(hemf.toCPointer<ByteVar>(), cbbuffer, ppfd.toCPointer<ByteVar>())

public actual fun GetPixelFormat(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_GetPixelFormat(hdc.toCPointer<ByteVar>())

public actual fun SetPixelFormat(hdc: HDC, format: Int, ppfd: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_SetPixelFormat(hdc.toCPointer<ByteVar>(), format, ppfd.toCPointer<ByteVar>())

public actual fun SwapBuffers(param0: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_SwapBuffers(param0.toCPointer<ByteVar>())

public actual fun glAccum(op: UInt, value: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glAccum(op, value)
}

public actual fun glAlphaFunc(func: UInt, ref: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glAlphaFunc(func, ref)
}

public actual fun glAreTexturesResident(n: Int, textures: Long, residences: Long): UByte =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glAreTexturesResident(n, textures.toCPointer<ByteVar>(), residences.toCPointer<ByteVar>())

public actual fun glArrayElement(i: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glArrayElement(i)
}

public actual fun glBegin(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glBegin(mode)
}

public actual fun glBindTexture(target: UInt, texture: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glBindTexture(target, texture)
}

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glBitmap(width, height, xorig, yorig, xmove, ymove, bitmap.toCPointer<ByteVar>())
}

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glBlendFunc(sfactor, dfactor)
}

public actual fun glCallList(list: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glCallList(list)
}

public actual fun glCallLists(n: Int, type: UInt, lists: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glCallLists(n, type, lists.toCPointer<ByteVar>())
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

public actual fun glClipPlane(plane: UInt, equation: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glClipPlane(plane, equation.toCPointer<ByteVar>())
}

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3b(red, green, blue)
}

public actual fun glColor3bv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3bv(v.toCPointer<ByteVar>())
}

public actual fun glColor3d(red: Double, green: Double, blue: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3d(red, green, blue)
}

public actual fun glColor3dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3dv(v.toCPointer<ByteVar>())
}

public actual fun glColor3f(red: Float, green: Float, blue: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3f(red, green, blue)
}

public actual fun glColor3fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3fv(v.toCPointer<ByteVar>())
}

public actual fun glColor3i(red: Int, green: Int, blue: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3i(red, green, blue)
}

public actual fun glColor3iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3iv(v.toCPointer<ByteVar>())
}

public actual fun glColor3s(red: Short, green: Short, blue: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3s(red, green, blue)
}

public actual fun glColor3sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3sv(v.toCPointer<ByteVar>())
}

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3ub(red, green, blue)
}

public actual fun glColor3ubv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3ubv(v.toCPointer<ByteVar>())
}

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3ui(red, green, blue)
}

public actual fun glColor3uiv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3uiv(v.toCPointer<ByteVar>())
}

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3us(red, green, blue)
}

public actual fun glColor3usv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor3usv(v.toCPointer<ByteVar>())
}

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4b(red, green, blue, alpha)
}

public actual fun glColor4bv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4bv(v.toCPointer<ByteVar>())
}

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4d(red, green, blue, alpha)
}

public actual fun glColor4dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4dv(v.toCPointer<ByteVar>())
}

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4f(red, green, blue, alpha)
}

public actual fun glColor4fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4fv(v.toCPointer<ByteVar>())
}

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4i(red, green, blue, alpha)
}

public actual fun glColor4iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4iv(v.toCPointer<ByteVar>())
}

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4s(red, green, blue, alpha)
}

public actual fun glColor4sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4sv(v.toCPointer<ByteVar>())
}

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4ub(red, green, blue, alpha)
}

public actual fun glColor4ubv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4ubv(v.toCPointer<ByteVar>())
}

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4ui(red, green, blue, alpha)
}

public actual fun glColor4uiv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4uiv(v.toCPointer<ByteVar>())
}

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4us(red, green, blue, alpha)
}

public actual fun glColor4usv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColor4usv(v.toCPointer<ByteVar>())
}

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColorMask(red, green, blue, alpha)
}

public actual fun glColorMaterial(face: UInt, mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColorMaterial(face, mode)
}

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glColorPointer(size, type, stride, pointer.toCPointer<ByteVar>())
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

public actual fun glDeleteTextures(n: Int, textures: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDeleteTextures(n, textures.toCPointer<ByteVar>())
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

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDrawElements(mode, count, type, indices.toCPointer<ByteVar>())
}

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glDrawPixels(width, height, format, type, pixels.toCPointer<ByteVar>())
}

public actual fun glEdgeFlag(flag: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEdgeFlag(flag)
}

public actual fun glEdgeFlagPointer(stride: Int, pointer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer(stride, pointer.toCPointer<ByteVar>())
}

public actual fun glEdgeFlagv(flag: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEdgeFlagv(flag.toCPointer<ByteVar>())
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

public actual fun glEvalCoord1dv(u: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord1dv(u.toCPointer<ByteVar>())
}

public actual fun glEvalCoord1f(u: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord1f(u)
}

public actual fun glEvalCoord1fv(u: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord1fv(u.toCPointer<ByteVar>())
}

public actual fun glEvalCoord2d(u: Double, v: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord2d(u, v)
}

public actual fun glEvalCoord2dv(u: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord2dv(u.toCPointer<ByteVar>())
}

public actual fun glEvalCoord2f(u: Float, v: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord2f(u, v)
}

public actual fun glEvalCoord2fv(u: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glEvalCoord2fv(u.toCPointer<ByteVar>())
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

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFeedbackBuffer(size, type, buffer.toCPointer<ByteVar>())
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

public actual fun glFogfv(pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFogfv(pname, params.toCPointer<ByteVar>())
}

public actual fun glFogi(pname: UInt, param1: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFogi(pname, param1)
}

public actual fun glFogiv(pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFogiv(pname, params.toCPointer<ByteVar>())
}

public actual fun glFrontFace(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFrontFace(mode)
}

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glFrustum(left, right, bottom, top, znear, zfar)
}

public actual fun glGenLists(range: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGenLists(range)

public actual fun glGenTextures(n: Int, textures: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGenTextures(n, textures.toCPointer<ByteVar>())
}

public actual fun glGetBooleanv(pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetBooleanv(pname, params.toCPointer<ByteVar>())
}

public actual fun glGetClipPlane(plane: UInt, equation: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetClipPlane(plane, equation.toCPointer<ByteVar>())
}

public actual fun glGetDoublev(pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetDoublev(pname, params.toCPointer<ByteVar>())
}

public actual fun glGetError(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetError()

public actual fun glGetFloatv(pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetFloatv(pname, params.toCPointer<ByteVar>())
}

public actual fun glGetIntegerv(pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetIntegerv(pname, params.toCPointer<ByteVar>())
}

public actual fun glGetLightfv(light: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetLightfv(light, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetLightiv(light: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetLightiv(light, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetMapdv(target: UInt, query: UInt, v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetMapdv(target, query, v.toCPointer<ByteVar>())
}

public actual fun glGetMapfv(target: UInt, query: UInt, v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetMapfv(target, query, v.toCPointer<ByteVar>())
}

public actual fun glGetMapiv(target: UInt, query: UInt, v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetMapiv(target, query, v.toCPointer<ByteVar>())
}

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetMaterialfv(face, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetMaterialiv(face, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetPixelMapfv(map: UInt, values: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetPixelMapfv(map, values.toCPointer<ByteVar>())
}

public actual fun glGetPixelMapuiv(map: UInt, values: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv(map, values.toCPointer<ByteVar>())
}

public actual fun glGetPixelMapusv(map: UInt, values: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetPixelMapusv(map, values.toCPointer<ByteVar>())
}

public actual fun glGetPointerv(pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetPointerv(pname, params.toCPointer<ByteVar>())
}

public actual fun glGetPolygonStipple(mask: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetPolygonStipple(mask.toCPointer<ByteVar>())
}

public actual fun glGetString(name: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetString(name)?.toLong() ?: 0L

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexEnvfv(target, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexEnviv(target, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexGendv(coord, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexGenfv(coord, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexGeniv(coord, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexImage(target, level, format, type, pixels.toCPointer<ByteVar>())
}

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv(target, level, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv(target, level, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexParameterfv(target, pname, params.toCPointer<ByteVar>())
}

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glGetTexParameteriv(target, pname, params.toCPointer<ByteVar>())
}

public actual fun glHint(target: UInt, mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glHint(target, mode)
}

public actual fun glIndexMask(mask: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexMask(mask)
}

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexPointer(type, stride, pointer.toCPointer<ByteVar>())
}

public actual fun glIndexd(c: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexd(c)
}

public actual fun glIndexdv(c: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexdv(c.toCPointer<ByteVar>())
}

public actual fun glIndexf(c: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexf(c)
}

public actual fun glIndexfv(c: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexfv(c.toCPointer<ByteVar>())
}

public actual fun glIndexi(c: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexi(c)
}

public actual fun glIndexiv(c: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexiv(c.toCPointer<ByteVar>())
}

public actual fun glIndexs(c: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexs(c)
}

public actual fun glIndexsv(c: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexsv(c.toCPointer<ByteVar>())
}

public actual fun glIndexub(c: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexub(c)
}

public actual fun glIndexubv(c: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glIndexubv(c.toCPointer<ByteVar>())
}

public actual fun glInitNames() {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glInitNames()
}

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glInterleavedArrays(format, stride, pointer.toCPointer<ByteVar>())
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

public actual fun glLightModelfv(pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightModelfv(pname, params.toCPointer<ByteVar>())
}

public actual fun glLightModeli(pname: UInt, param1: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightModeli(pname, param1)
}

public actual fun glLightModeliv(pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightModeliv(pname, params.toCPointer<ByteVar>())
}

public actual fun glLightf(light: UInt, pname: UInt, param2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightf(light, pname, param2)
}

public actual fun glLightfv(light: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightfv(light, pname, params.toCPointer<ByteVar>())
}

public actual fun glLighti(light: UInt, pname: UInt, param2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLighti(light, pname, param2)
}

public actual fun glLightiv(light: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLightiv(light, pname, params.toCPointer<ByteVar>())
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

public actual fun glLoadMatrixd(m: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLoadMatrixd(m.toCPointer<ByteVar>())
}

public actual fun glLoadMatrixf(m: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLoadMatrixf(m.toCPointer<ByteVar>())
}

public actual fun glLoadName(name: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLoadName(name)
}

public actual fun glLogicOp(opcode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glLogicOp(opcode)
}

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMap1d(target, u1, u2, stride, order, points.toCPointer<ByteVar>())
}

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMap1f(target, u1, u2, stride, order, points.toCPointer<ByteVar>())
}

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points.toCPointer<ByteVar>())
}

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points.toCPointer<ByteVar>())
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

public actual fun glMaterialfv(face: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMaterialfv(face, pname, params.toCPointer<ByteVar>())
}

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMateriali(face, pname, param2)
}

public actual fun glMaterialiv(face: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMaterialiv(face, pname, params.toCPointer<ByteVar>())
}

public actual fun glMatrixMode(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMatrixMode(mode)
}

public actual fun glMultMatrixd(m: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMultMatrixd(m.toCPointer<ByteVar>())
}

public actual fun glMultMatrixf(m: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glMultMatrixf(m.toCPointer<ByteVar>())
}

public actual fun glNewList(list: UInt, mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNewList(list, mode)
}

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3b(nx, ny, nz)
}

public actual fun glNormal3bv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3bv(v.toCPointer<ByteVar>())
}

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3d(nx, ny, nz)
}

public actual fun glNormal3dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3dv(v.toCPointer<ByteVar>())
}

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3f(nx, ny, nz)
}

public actual fun glNormal3fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3fv(v.toCPointer<ByteVar>())
}

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3i(nx, ny, nz)
}

public actual fun glNormal3iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3iv(v.toCPointer<ByteVar>())
}

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3s(nx, ny, nz)
}

public actual fun glNormal3sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormal3sv(v.toCPointer<ByteVar>())
}

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glNormalPointer(type, stride, pointer.toCPointer<ByteVar>())
}

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glOrtho(left, right, bottom, top, znear, zfar)
}

public actual fun glPassThrough(token: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPassThrough(token)
}

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelMapfv(map, mapsize, values.toCPointer<ByteVar>())
}

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelMapuiv(map, mapsize, values.toCPointer<ByteVar>())
}

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPixelMapusv(map, mapsize, values.toCPointer<ByteVar>())
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

public actual fun glPolygonStipple(mask: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPolygonStipple(mask.toCPointer<ByteVar>())
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

public actual fun glPrioritizeTextures(n: Int, textures: Long, priorities: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glPrioritizeTextures(n, textures.toCPointer<ByteVar>(), priorities.toCPointer<ByteVar>())
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

public actual fun glRasterPos2dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2dv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos2f(x: Float, y: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2f(x, y)
}

public actual fun glRasterPos2fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2fv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos2i(x: Int, y: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2i(x, y)
}

public actual fun glRasterPos2iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2iv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos2s(x: Short, y: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2s(x, y)
}

public actual fun glRasterPos2sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos2sv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos3d(x: Double, y: Double, z: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3d(x, y, z)
}

public actual fun glRasterPos3dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3dv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos3f(x: Float, y: Float, z: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3f(x, y, z)
}

public actual fun glRasterPos3fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3fv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos3i(x: Int, y: Int, z: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3i(x, y, z)
}

public actual fun glRasterPos3iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3iv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos3s(x: Short, y: Short, z: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3s(x, y, z)
}

public actual fun glRasterPos3sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos3sv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4d(x, y, z, w)
}

public actual fun glRasterPos4dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4dv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4f(x, y, z, w)
}

public actual fun glRasterPos4fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4fv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4i(x, y, z, w)
}

public actual fun glRasterPos4iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4iv(v.toCPointer<ByteVar>())
}

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4s(x, y, z, w)
}

public actual fun glRasterPos4sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRasterPos4sv(v.toCPointer<ByteVar>())
}

public actual fun glReadBuffer(mode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glReadBuffer(mode)
}

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glReadPixels(x, y, width, height, format, type, pixels.toCPointer<ByteVar>())
}

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectd(x1, y1, x2, y2)
}

public actual fun glRectdv(v1: Long, v2: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectdv(v1.toCPointer<ByteVar>(), v2.toCPointer<ByteVar>())
}

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectf(x1, y1, x2, y2)
}

public actual fun glRectfv(v1: Long, v2: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectfv(v1.toCPointer<ByteVar>(), v2.toCPointer<ByteVar>())
}

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRecti(x1, y1, x2, y2)
}

public actual fun glRectiv(v1: Long, v2: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectiv(v1.toCPointer<ByteVar>(), v2.toCPointer<ByteVar>())
}

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRects(x1, y1, x2, y2)
}

public actual fun glRectsv(v1: Long, v2: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glRectsv(v1.toCPointer<ByteVar>(), v2.toCPointer<ByteVar>())
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

public actual fun glSelectBuffer(size: Int, buffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glSelectBuffer(size, buffer.toCPointer<ByteVar>())
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

public actual fun glTexCoord1dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1dv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord1f(s: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1f(s)
}

public actual fun glTexCoord1fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1fv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord1i(s: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1i(s)
}

public actual fun glTexCoord1iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1iv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord1s(s: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1s(s)
}

public actual fun glTexCoord1sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord1sv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord2d(s: Double, t: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2d(s, t)
}

public actual fun glTexCoord2dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2dv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord2f(s: Float, t: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2f(s, t)
}

public actual fun glTexCoord2fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2fv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord2i(s: Int, t: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2i(s, t)
}

public actual fun glTexCoord2iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2iv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord2s(s: Short, t: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2s(s, t)
}

public actual fun glTexCoord2sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord2sv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord3d(s: Double, t: Double, r: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3d(s, t, r)
}

public actual fun glTexCoord3dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3dv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord3f(s: Float, t: Float, r: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3f(s, t, r)
}

public actual fun glTexCoord3fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3fv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord3i(s: Int, t: Int, r: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3i(s, t, r)
}

public actual fun glTexCoord3iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3iv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord3s(s: Short, t: Short, r: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3s(s, t, r)
}

public actual fun glTexCoord3sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord3sv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4d(s, t, r, q)
}

public actual fun glTexCoord4dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4dv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4f(s, t, r, q)
}

public actual fun glTexCoord4fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4fv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4i(s, t, r, q)
}

public actual fun glTexCoord4iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4iv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4s(s, t, r, q)
}

public actual fun glTexCoord4sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoord4sv(v.toCPointer<ByteVar>())
}

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexCoordPointer(size, type, stride, pointer.toCPointer<ByteVar>())
}

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexEnvf(target, pname, param2)
}

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexEnvfv(target, pname, params.toCPointer<ByteVar>())
}

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexEnvi(target, pname, param2)
}

public actual fun glTexEnviv(target: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexEnviv(target, pname, params.toCPointer<ByteVar>())
}

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGend(coord, pname, param2)
}

public actual fun glTexGendv(coord: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGendv(coord, pname, params.toCPointer<ByteVar>())
}

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGenf(coord, pname, param2)
}

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGenfv(coord, pname, params.toCPointer<ByteVar>())
}

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGeni(coord, pname, param2)
}

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexGeniv(coord, pname, params.toCPointer<ByteVar>())
}

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexImage1D(target, level, internalformat, width, border, format, type, pixels.toCPointer<ByteVar>())
}

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels.toCPointer<ByteVar>())
}

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexParameterf(target, pname, param2)
}

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexParameterfv(target, pname, params.toCPointer<ByteVar>())
}

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexParameteri(target, pname, param2)
}

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexParameteriv(target, pname, params.toCPointer<ByteVar>())
}

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexSubImage1D(target, level, xoffset, width, format, type, pixels.toCPointer<ByteVar>())
}

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels.toCPointer<ByteVar>())
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

public actual fun glVertex2dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2dv(v.toCPointer<ByteVar>())
}

public actual fun glVertex2f(x: Float, y: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2f(x, y)
}

public actual fun glVertex2fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2fv(v.toCPointer<ByteVar>())
}

public actual fun glVertex2i(x: Int, y: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2i(x, y)
}

public actual fun glVertex2iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2iv(v.toCPointer<ByteVar>())
}

public actual fun glVertex2s(x: Short, y: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2s(x, y)
}

public actual fun glVertex2sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex2sv(v.toCPointer<ByteVar>())
}

public actual fun glVertex3d(x: Double, y: Double, z: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3d(x, y, z)
}

public actual fun glVertex3dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3dv(v.toCPointer<ByteVar>())
}

public actual fun glVertex3f(x: Float, y: Float, z: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3f(x, y, z)
}

public actual fun glVertex3fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3fv(v.toCPointer<ByteVar>())
}

public actual fun glVertex3i(x: Int, y: Int, z: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3i(x, y, z)
}

public actual fun glVertex3iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3iv(v.toCPointer<ByteVar>())
}

public actual fun glVertex3s(x: Short, y: Short, z: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3s(x, y, z)
}

public actual fun glVertex3sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex3sv(v.toCPointer<ByteVar>())
}

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4d(x, y, z, w)
}

public actual fun glVertex4dv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4dv(v.toCPointer<ByteVar>())
}

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4f(x, y, z, w)
}

public actual fun glVertex4fv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4fv(v.toCPointer<ByteVar>())
}

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4i(x, y, z, w)
}

public actual fun glVertex4iv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4iv(v.toCPointer<ByteVar>())
}

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4s(x, y, z, w)
}

public actual fun glVertex4sv(v: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertex4sv(v.toCPointer<ByteVar>())
}

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glVertexPointer(size, type, stride, pointer.toCPointer<ByteVar>())
}

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_glViewport(x, y, width, height)
}

public actual fun gluBeginCurve(nobj: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBeginCurve(nobj.toCPointer<ByteVar>())
}

public actual fun gluBeginPolygon(tess: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBeginPolygon(tess.toCPointer<ByteVar>())
}

public actual fun gluBeginSurface(nobj: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBeginSurface(nobj.toCPointer<ByteVar>())
}

public actual fun gluBeginTrim(nobj: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBeginTrim(nobj.toCPointer<ByteVar>())
}

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps(target, components, width, format, type, data.toCPointer<ByteVar>())

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps(target, components, width, height, format, type, data.toCPointer<ByteVar>())

public actual fun gluCylinder(qobj: Long, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluCylinder(qobj.toCPointer<ByteVar>(), baseradius, topradius, height, slices, stacks)
}

public actual fun gluDeleteNurbsRenderer(nobj: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer(nobj.toCPointer<ByteVar>())
}

public actual fun gluDeleteQuadric(state: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluDeleteQuadric(state.toCPointer<ByteVar>())
}

public actual fun gluDeleteTess(tess: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluDeleteTess(tess.toCPointer<ByteVar>())
}

public actual fun gluDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluDisk(qobj.toCPointer<ByteVar>(), innerradius, outerradius, slices, loops)
}

public actual fun gluEndCurve(nobj: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluEndCurve(nobj.toCPointer<ByteVar>())
}

public actual fun gluEndPolygon(tess: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluEndPolygon(tess.toCPointer<ByteVar>())
}

public actual fun gluEndSurface(nobj: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluEndSurface(nobj.toCPointer<ByteVar>())
}

public actual fun gluEndTrim(nobj: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluEndTrim(nobj.toCPointer<ByteVar>())
}

public actual fun gluErrorString(errcode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluErrorString(errcode)?.toLong() ?: 0L

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT(errcode)?.toLong() ?: 0L

public actual fun gluGetNurbsProperty(nobj: Long, property: UInt, value: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty(nobj.toCPointer<ByteVar>(), property, value.toCPointer<ByteVar>())
}

public actual fun gluGetString(name: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluGetString(name)?.toLong() ?: 0L

public actual fun gluGetTessProperty(tess: Long, which: UInt, value: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluGetTessProperty(tess.toCPointer<ByteVar>(), which, value.toCPointer<ByteVar>())
}

public actual fun gluLoadSamplingMatrices(nobj: Long, modelmatrix: Long, projmatrix: Long, viewport: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices(nobj.toCPointer<ByteVar>(), modelmatrix.toCPointer<ByteVar>(), projmatrix.toCPointer<ByteVar>(), viewport.toCPointer<ByteVar>())
}

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluLookAt(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz)
}

public actual fun gluNewNurbsRenderer(): Long =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer()?.toLong() ?: 0L

public actual fun gluNewQuadric(): Long =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNewQuadric()?.toLong() ?: 0L

public actual fun gluNewTess(): Long =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNewTess()?.toLong() ?: 0L

public actual fun gluNextContour(tess: Long, type: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNextContour(tess.toCPointer<ByteVar>(), type)
}

public actual fun gluNurbsCallback(nobj: Long, which: UInt, fn: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNurbsCallback(nobj.toCPointer<ByteVar>(), which, fn)
}

public actual fun gluNurbsCurve(nobj: Long, nknots: Int, knot: Long, stride: Int, ctlarray: Long, order: Int, type: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNurbsCurve(nobj.toCPointer<ByteVar>(), nknots, knot.toCPointer<ByteVar>(), stride, ctlarray.toCPointer<ByteVar>(), order, type)
}

public actual fun gluNurbsProperty(nobj: Long, property: UInt, value: Float) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNurbsProperty(nobj.toCPointer<ByteVar>(), property, value)
}

public actual fun gluNurbsSurface(nobj: Long, sknot_count: Int, sknot: Long, tknot_count: Int, tknot: Long, s_stride: Int, t_stride: Int, ctlarray: Long, sorder: Int, torder: Int, type: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluNurbsSurface(nobj.toCPointer<ByteVar>(), sknot_count, sknot.toCPointer<ByteVar>(), tknot_count, tknot.toCPointer<ByteVar>(), s_stride, t_stride, ctlarray.toCPointer<ByteVar>(), sorder, torder, type)
}

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluOrtho2D(left, right, bottom, top)
}

public actual fun gluPartialDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluPartialDisk(qobj.toCPointer<ByteVar>(), innerradius, outerradius, slices, loops, startangle, sweepangle)
}

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluPerspective(fovy, aspect, znear, zfar)
}

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluPickMatrix(x, y, width, height, viewport.toCPointer<ByteVar>())
}

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, winx: Long, winy: Long, winz: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluProject(objx, objy, objz, modelmatrix.toCPointer<ByteVar>(), projmatrix.toCPointer<ByteVar>(), viewport.toCPointer<ByteVar>(), winx.toCPointer<ByteVar>(), winy.toCPointer<ByteVar>(), winz.toCPointer<ByteVar>())

public actual fun gluPwlCurve(nobj: Long, count: Int, array: Long, stride: Int, type: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluPwlCurve(nobj.toCPointer<ByteVar>(), count, array.toCPointer<ByteVar>(), stride, type)
}

public actual fun gluQuadricCallback(qobj: Long, which: UInt, fn: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluQuadricCallback(qobj.toCPointer<ByteVar>(), which, fn)
}

public actual fun gluQuadricDrawStyle(quadobject: Long, drawstyle: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle(quadobject.toCPointer<ByteVar>(), drawstyle)
}

public actual fun gluQuadricNormals(quadobject: Long, normals: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluQuadricNormals(quadobject.toCPointer<ByteVar>(), normals)
}

public actual fun gluQuadricOrientation(quadobject: Long, orientation: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluQuadricOrientation(quadobject.toCPointer<ByteVar>(), orientation)
}

public actual fun gluQuadricTexture(quadobject: Long, texturecoords: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluQuadricTexture(quadobject.toCPointer<ByteVar>(), texturecoords)
}

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: Long, widthout: Int, heightout: Int, typeout: UInt, dataout: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluScaleImage(format, widthin, heightin, typein, datain.toCPointer<ByteVar>(), widthout, heightout, typeout, dataout.toCPointer<ByteVar>())

public actual fun gluSphere(qobj: Long, radius: Double, slices: Int, stacks: Int) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluSphere(qobj.toCPointer<ByteVar>(), radius, slices, stacks)
}

public actual fun gluTessBeginContour(tess: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessBeginContour(tess.toCPointer<ByteVar>())
}

public actual fun gluTessBeginPolygon(tess: Long, polygon_data: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon(tess.toCPointer<ByteVar>(), polygon_data.toCPointer<ByteVar>())
}

public actual fun gluTessCallback(tess: Long, which: UInt, fn: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessCallback(tess.toCPointer<ByteVar>(), which, fn)
}

public actual fun gluTessEndContour(tess: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessEndContour(tess.toCPointer<ByteVar>())
}

public actual fun gluTessEndPolygon(tess: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessEndPolygon(tess.toCPointer<ByteVar>())
}

public actual fun gluTessNormal(tess: Long, x: Double, y: Double, z: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessNormal(tess.toCPointer<ByteVar>(), x, y, z)
}

public actual fun gluTessProperty(tess: Long, which: UInt, value: Double) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessProperty(tess.toCPointer<ByteVar>(), which, value)
}

public actual fun gluTessVertex(tess: Long, coords: Long, data: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluTessVertex(tess.toCPointer<ByteVar>(), coords.toCPointer<ByteVar>(), data.toCPointer<ByteVar>())
}

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, objx: Long, objy: Long, objz: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_gluUnProject(winx, winy, winz, modelmatrix.toCPointer<ByteVar>(), projmatrix.toCPointer<ByteVar>(), viewport.toCPointer<ByteVar>(), objx.toCPointer<ByteVar>(), objy.toCPointer<ByteVar>(), objz.toCPointer<ByteVar>())

public actual fun wglCopyContext(param0: HGLRC, param1: HGLRC, param2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglCopyContext(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2)

public actual fun wglCreateContext(param0: HDC): HGLRC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglCreateContext(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun wglCreateLayerContext(param0: HDC, param1: Int): HGLRC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglCreateLayerContext(param0.toCPointer<ByteVar>(), param1)?.toLong() ?: 0L

public actual fun wglDeleteContext(param0: HGLRC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglDeleteContext(param0.toCPointer<ByteVar>())

public actual fun wglDescribeLayerPlane(param0: HDC, param1: Int, param2: Int, param3: UInt, param4: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane(param0.toCPointer<ByteVar>(), param1, param2, param3, param4.toCPointer<ByteVar>())

public actual fun wglGetCurrentContext(): HGLRC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglGetCurrentContext()?.toLong() ?: 0L

public actual fun wglGetCurrentDC(): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglGetCurrentDC()?.toLong() ?: 0L

public actual fun wglGetLayerPaletteEntries(param0: HDC, param1: Int, param2: Int, param3: Int, param4: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries(param0.toCPointer<ByteVar>(), param1, param2, param3, param4.toCPointer<ByteVar>())

public actual fun wglGetProcAddress(param0: PCSTR): PROC =
    null

public actual fun wglMakeCurrent(param0: HDC, param1: HGLRC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglMakeCurrent(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun wglRealizeLayerPalette(param0: HDC, param1: Int, param2: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette(param0.toCPointer<ByteVar>(), param1, param2)

public actual fun wglSetLayerPaletteEntries(param0: HDC, param1: Int, param2: Int, param3: Int, param4: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries(param0.toCPointer<ByteVar>(), param1, param2, param3, param4.toCPointer<ByteVar>())

public actual fun wglShareLists(param0: HGLRC, param1: HGLRC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglShareLists(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun wglSwapLayerBuffers(param0: HDC, param1: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers(param0.toCPointer<ByteVar>(), param1)

public actual fun wglUseFontBitmapsA(param0: HDC, param1: UInt, param2: UInt, param3: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA(param0.toCPointer<ByteVar>(), param1, param2, param3)

public actual fun wglUseFontBitmapsW(param0: HDC, param1: UInt, param2: UInt, param3: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW(param0.toCPointer<ByteVar>(), param1, param2, param3)

public actual fun wglUseFontOutlinesA(param0: HDC, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA(param0.toCPointer<ByteVar>(), param1, param2, param3, param4, param5, param6, param7.toCPointer<ByteVar>())

public actual fun wglUseFontOutlinesW(param0: HDC, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.cinterop.windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW(param0.toCPointer<ByteVar>(), param1, param2, param3, param4, param5, param6, param7.toCPointer<ByteVar>())
