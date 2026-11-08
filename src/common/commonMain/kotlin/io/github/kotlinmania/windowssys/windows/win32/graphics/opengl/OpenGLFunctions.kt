package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.PROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.PROCFn
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HENHMETAFILE

public fun ChoosePixelFormat(hdc: HDC, ppfd: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "ChoosePixelFormat", longArrayOf(hdc, ppfd)).toInt()
}

public fun DescribePixelFormat(hdc: HDC, ipixelformat: Int, nbytes: UInt, ppfd: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "DescribePixelFormat", longArrayOf(hdc, ipixelformat.toLong(), nbytes.toLong(), ppfd)).toInt()
}

public fun GetEnhMetaFilePixelFormat(hemf: HENHMETAFILE, cbbuffer: UInt, ppfd: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetEnhMetaFilePixelFormat", longArrayOf(hemf, cbbuffer.toLong(), ppfd)).toUInt()
}

public fun GetPixelFormat(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetPixelFormat", longArrayOf(hdc)).toInt()
}

public fun SetPixelFormat(hdc: HDC, format: Int, ppfd: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetPixelFormat", longArrayOf(hdc, format.toLong(), ppfd)).toInt()
}

public fun SwapBuffers(param0: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SwapBuffers", longArrayOf(param0)).toInt()
}

public fun glAccum(op: UInt, value: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glAccum", 4, false, longArrayOf(op.toLong(), (value.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glAlphaFunc(func: UInt, ref: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glAlphaFunc", 4, false, longArrayOf(func.toLong(), (ref.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glAreTexturesResident(n: Int, textures: Long, residences: Long): UByte {
    return Win32DynamicFfi.invoke("opengl32.dll", "glAreTexturesResident", longArrayOf(n.toLong(), textures, residences)).toUByte()
}

public fun glArrayElement(i: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glArrayElement", longArrayOf(i.toLong()))
}

public fun glBegin(mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glBegin", longArrayOf(mode.toLong()))
}

public fun glBindTexture(target: UInt, texture: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glBindTexture", longArrayOf(target.toLong(), texture.toLong()))
}

public fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: Long) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glBitmap", 1360, false, longArrayOf(width.toLong(), height.toLong(), (xorig.toRawBits().toLong() and 0xFFFF_FFFFL), (yorig.toRawBits().toLong() and 0xFFFF_FFFFL), (xmove.toRawBits().toLong() and 0xFFFF_FFFFL), (ymove.toRawBits().toLong() and 0xFFFF_FFFFL), bitmap))
}

public fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glBlendFunc", longArrayOf(sfactor.toLong(), dfactor.toLong()))
}

public fun glCallList(list: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glCallList", longArrayOf(list.toLong()))
}

public fun glCallLists(n: Int, type: UInt, lists: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glCallLists", longArrayOf(n.toLong(), type.toLong(), lists))
}

public fun glClear(mask: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glClear", longArrayOf(mask.toLong()))
}

public fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glClearAccum", 85, false, longArrayOf((red.toRawBits().toLong() and 0xFFFF_FFFFL), (green.toRawBits().toLong() and 0xFFFF_FFFFL), (blue.toRawBits().toLong() and 0xFFFF_FFFFL), (alpha.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glClearColor", 85, false, longArrayOf((red.toRawBits().toLong() and 0xFFFF_FFFFL), (green.toRawBits().toLong() and 0xFFFF_FFFFL), (blue.toRawBits().toLong() and 0xFFFF_FFFFL), (alpha.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glClearDepth(depth: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glClearDepth", 2, false, longArrayOf(depth.toRawBits()))
}

public fun glClearIndex(c: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glClearIndex", 1, false, longArrayOf((c.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glClearStencil(s: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glClearStencil", longArrayOf(s.toLong()))
}

public fun glClipPlane(plane: UInt, equation: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glClipPlane", longArrayOf(plane.toLong(), equation))
}

public fun glColor3b(red: Byte, green: Byte, blue: Byte) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3b", longArrayOf(red.toLong(), green.toLong(), blue.toLong()))
}

public fun glColor3bv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3bv", longArrayOf(v))
}

public fun glColor3d(red: Double, green: Double, blue: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glColor3d", 42, false, longArrayOf(red.toRawBits(), green.toRawBits(), blue.toRawBits()))
}

public fun glColor3dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3dv", longArrayOf(v))
}

public fun glColor3f(red: Float, green: Float, blue: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glColor3f", 21, false, longArrayOf((red.toRawBits().toLong() and 0xFFFF_FFFFL), (green.toRawBits().toLong() and 0xFFFF_FFFFL), (blue.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glColor3fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3fv", longArrayOf(v))
}

public fun glColor3i(red: Int, green: Int, blue: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3i", longArrayOf(red.toLong(), green.toLong(), blue.toLong()))
}

public fun glColor3iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3iv", longArrayOf(v))
}

public fun glColor3s(red: Short, green: Short, blue: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3s", longArrayOf(red.toLong(), green.toLong(), blue.toLong()))
}

public fun glColor3sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3sv", longArrayOf(v))
}

public fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3ub", longArrayOf(red.toLong(), green.toLong(), blue.toLong()))
}

public fun glColor3ubv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3ubv", longArrayOf(v))
}

public fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3ui", longArrayOf(red.toLong(), green.toLong(), blue.toLong()))
}

public fun glColor3uiv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3uiv", longArrayOf(v))
}

public fun glColor3us(red: UShort, green: UShort, blue: UShort) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3us", longArrayOf(red.toLong(), green.toLong(), blue.toLong()))
}

public fun glColor3usv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor3usv", longArrayOf(v))
}

public fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4b", longArrayOf(red.toLong(), green.toLong(), blue.toLong(), alpha.toLong()))
}

public fun glColor4bv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4bv", longArrayOf(v))
}

public fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glColor4d", 170, false, longArrayOf(red.toRawBits(), green.toRawBits(), blue.toRawBits(), alpha.toRawBits()))
}

public fun glColor4dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4dv", longArrayOf(v))
}

public fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glColor4f", 85, false, longArrayOf((red.toRawBits().toLong() and 0xFFFF_FFFFL), (green.toRawBits().toLong() and 0xFFFF_FFFFL), (blue.toRawBits().toLong() and 0xFFFF_FFFFL), (alpha.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glColor4fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4fv", longArrayOf(v))
}

public fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4i", longArrayOf(red.toLong(), green.toLong(), blue.toLong(), alpha.toLong()))
}

public fun glColor4iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4iv", longArrayOf(v))
}

public fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4s", longArrayOf(red.toLong(), green.toLong(), blue.toLong(), alpha.toLong()))
}

public fun glColor4sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4sv", longArrayOf(v))
}

public fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4ub", longArrayOf(red.toLong(), green.toLong(), blue.toLong(), alpha.toLong()))
}

public fun glColor4ubv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4ubv", longArrayOf(v))
}

public fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4ui", longArrayOf(red.toLong(), green.toLong(), blue.toLong(), alpha.toLong()))
}

public fun glColor4uiv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4uiv", longArrayOf(v))
}

public fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4us", longArrayOf(red.toLong(), green.toLong(), blue.toLong(), alpha.toLong()))
}

public fun glColor4usv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColor4usv", longArrayOf(v))
}

public fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColorMask", longArrayOf(red.toLong(), green.toLong(), blue.toLong(), alpha.toLong()))
}

public fun glColorMaterial(face: UInt, mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColorMaterial", longArrayOf(face.toLong(), mode.toLong()))
}

public fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glColorPointer", longArrayOf(size.toLong(), type.toLong(), stride.toLong(), pointer))
}

public fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glCopyPixels", longArrayOf(x.toLong(), y.toLong(), width.toLong(), height.toLong(), type.toLong()))
}

public fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glCopyTexImage1D", longArrayOf(target.toLong(), level.toLong(), internalformat.toLong(), x.toLong(), y.toLong(), width.toLong(), border.toLong()))
}

public fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glCopyTexImage2D", longArrayOf(target.toLong(), level.toLong(), internalformat.toLong(), x.toLong(), y.toLong(), width.toLong(), height.toLong(), border.toLong()))
}

public fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glCopyTexSubImage1D", longArrayOf(target.toLong(), level.toLong(), xoffset.toLong(), x.toLong(), y.toLong(), width.toLong()))
}

public fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glCopyTexSubImage2D", longArrayOf(target.toLong(), level.toLong(), xoffset.toLong(), yoffset.toLong(), x.toLong(), y.toLong(), width.toLong(), height.toLong()))
}

public fun glCullFace(mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glCullFace", longArrayOf(mode.toLong()))
}

public fun glDeleteLists(list: UInt, range: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glDeleteLists", longArrayOf(list.toLong(), range.toLong()))
}

public fun glDeleteTextures(n: Int, textures: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glDeleteTextures", longArrayOf(n.toLong(), textures))
}

public fun glDepthFunc(func: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glDepthFunc", longArrayOf(func.toLong()))
}

public fun glDepthMask(flag: UByte) {
    Win32DynamicFfi.invoke("opengl32.dll", "glDepthMask", longArrayOf(flag.toLong()))
}

public fun glDepthRange(znear: Double, zfar: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glDepthRange", 10, false, longArrayOf(znear.toRawBits(), zfar.toRawBits()))
}

public fun glDisable(cap: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glDisable", longArrayOf(cap.toLong()))
}

public fun glDisableClientState(array: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glDisableClientState", longArrayOf(array.toLong()))
}

public fun glDrawArrays(mode: UInt, first: Int, count: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glDrawArrays", longArrayOf(mode.toLong(), first.toLong(), count.toLong()))
}

public fun glDrawBuffer(mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glDrawBuffer", longArrayOf(mode.toLong()))
}

public fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glDrawElements", longArrayOf(mode.toLong(), count.toLong(), type.toLong(), indices))
}

public fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glDrawPixels", longArrayOf(width.toLong(), height.toLong(), format.toLong(), type.toLong(), pixels))
}

public fun glEdgeFlag(flag: UByte) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEdgeFlag", longArrayOf(flag.toLong()))
}

public fun glEdgeFlagPointer(stride: Int, pointer: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEdgeFlagPointer", longArrayOf(stride.toLong(), pointer))
}

public fun glEdgeFlagv(flag: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEdgeFlagv", longArrayOf(flag))
}

public fun glEnable(cap: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEnable", longArrayOf(cap.toLong()))
}

public fun glEnableClientState(array: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEnableClientState", longArrayOf(array.toLong()))
}

public fun glEnd() {
    Win32DynamicFfi.invoke("opengl32.dll", "glEnd", longArrayOf())
}

public fun glEndList() {
    Win32DynamicFfi.invoke("opengl32.dll", "glEndList", longArrayOf())
}

public fun glEvalCoord1d(u: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glEvalCoord1d", 2, false, longArrayOf(u.toRawBits()))
}

public fun glEvalCoord1dv(u: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEvalCoord1dv", longArrayOf(u))
}

public fun glEvalCoord1f(u: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glEvalCoord1f", 1, false, longArrayOf((u.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glEvalCoord1fv(u: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEvalCoord1fv", longArrayOf(u))
}

public fun glEvalCoord2d(u: Double, v: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glEvalCoord2d", 10, false, longArrayOf(u.toRawBits(), v.toRawBits()))
}

public fun glEvalCoord2dv(u: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEvalCoord2dv", longArrayOf(u))
}

public fun glEvalCoord2f(u: Float, v: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glEvalCoord2f", 5, false, longArrayOf((u.toRawBits().toLong() and 0xFFFF_FFFFL), (v.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glEvalCoord2fv(u: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEvalCoord2fv", longArrayOf(u))
}

public fun glEvalMesh1(mode: UInt, i1: Int, i2: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEvalMesh1", longArrayOf(mode.toLong(), i1.toLong(), i2.toLong()))
}

public fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEvalMesh2", longArrayOf(mode.toLong(), i1.toLong(), i2.toLong(), j1.toLong(), j2.toLong()))
}

public fun glEvalPoint1(i: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEvalPoint1", longArrayOf(i.toLong()))
}

public fun glEvalPoint2(i: Int, j: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glEvalPoint2", longArrayOf(i.toLong(), j.toLong()))
}

public fun glFeedbackBuffer(size: Int, type: UInt, buffer: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glFeedbackBuffer", longArrayOf(size.toLong(), type.toLong(), buffer))
}

public fun glFinish() {
    Win32DynamicFfi.invoke("opengl32.dll", "glFinish", longArrayOf())
}

public fun glFlush() {
    Win32DynamicFfi.invoke("opengl32.dll", "glFlush", longArrayOf())
}

public fun glFogf(pname: UInt, param1: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glFogf", 4, false, longArrayOf(pname.toLong(), (param1.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glFogfv(pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glFogfv", longArrayOf(pname.toLong(), params))
}

public fun glFogi(pname: UInt, param1: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glFogi", longArrayOf(pname.toLong(), param1.toLong()))
}

public fun glFogiv(pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glFogiv", longArrayOf(pname.toLong(), params))
}

public fun glFrontFace(mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glFrontFace", longArrayOf(mode.toLong()))
}

public fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glFrustum", 2730, false, longArrayOf(left.toRawBits(), right.toRawBits(), bottom.toRawBits(), top.toRawBits(), znear.toRawBits(), zfar.toRawBits()))
}

public fun glGenLists(range: Int): UInt {
    return Win32DynamicFfi.invoke("opengl32.dll", "glGenLists", longArrayOf(range.toLong())).toUInt()
}

public fun glGenTextures(n: Int, textures: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGenTextures", longArrayOf(n.toLong(), textures))
}

public fun glGetBooleanv(pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetBooleanv", longArrayOf(pname.toLong(), params))
}

public fun glGetClipPlane(plane: UInt, equation: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetClipPlane", longArrayOf(plane.toLong(), equation))
}

public fun glGetDoublev(pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetDoublev", longArrayOf(pname.toLong(), params))
}

public fun glGetError(): UInt {
    return Win32DynamicFfi.invoke("opengl32.dll", "glGetError", longArrayOf()).toUInt()
}

public fun glGetFloatv(pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetFloatv", longArrayOf(pname.toLong(), params))
}

public fun glGetIntegerv(pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetIntegerv", longArrayOf(pname.toLong(), params))
}

public fun glGetLightfv(light: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetLightfv", longArrayOf(light.toLong(), pname.toLong(), params))
}

public fun glGetLightiv(light: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetLightiv", longArrayOf(light.toLong(), pname.toLong(), params))
}

public fun glGetMapdv(target: UInt, query: UInt, v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetMapdv", longArrayOf(target.toLong(), query.toLong(), v))
}

public fun glGetMapfv(target: UInt, query: UInt, v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetMapfv", longArrayOf(target.toLong(), query.toLong(), v))
}

public fun glGetMapiv(target: UInt, query: UInt, v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetMapiv", longArrayOf(target.toLong(), query.toLong(), v))
}

public fun glGetMaterialfv(face: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetMaterialfv", longArrayOf(face.toLong(), pname.toLong(), params))
}

public fun glGetMaterialiv(face: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetMaterialiv", longArrayOf(face.toLong(), pname.toLong(), params))
}

public fun glGetPixelMapfv(map: UInt, values: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetPixelMapfv", longArrayOf(map.toLong(), values))
}

public fun glGetPixelMapuiv(map: UInt, values: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetPixelMapuiv", longArrayOf(map.toLong(), values))
}

public fun glGetPixelMapusv(map: UInt, values: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetPixelMapusv", longArrayOf(map.toLong(), values))
}

public fun glGetPointerv(pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetPointerv", longArrayOf(pname.toLong(), params))
}

public fun glGetPolygonStipple(mask: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetPolygonStipple", longArrayOf(mask))
}

public fun glGetString(name: UInt): Long {
    return Win32DynamicFfi.invoke("opengl32.dll", "glGetString", longArrayOf(name.toLong()))
}

public fun glGetTexEnvfv(target: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetTexEnvfv", longArrayOf(target.toLong(), pname.toLong(), params))
}

public fun glGetTexEnviv(target: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetTexEnviv", longArrayOf(target.toLong(), pname.toLong(), params))
}

public fun glGetTexGendv(coord: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetTexGendv", longArrayOf(coord.toLong(), pname.toLong(), params))
}

public fun glGetTexGenfv(coord: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetTexGenfv", longArrayOf(coord.toLong(), pname.toLong(), params))
}

public fun glGetTexGeniv(coord: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetTexGeniv", longArrayOf(coord.toLong(), pname.toLong(), params))
}

public fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetTexImage", longArrayOf(target.toLong(), level.toLong(), format.toLong(), type.toLong(), pixels))
}

public fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetTexLevelParameterfv", longArrayOf(target.toLong(), level.toLong(), pname.toLong(), params))
}

public fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetTexLevelParameteriv", longArrayOf(target.toLong(), level.toLong(), pname.toLong(), params))
}

public fun glGetTexParameterfv(target: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetTexParameterfv", longArrayOf(target.toLong(), pname.toLong(), params))
}

public fun glGetTexParameteriv(target: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glGetTexParameteriv", longArrayOf(target.toLong(), pname.toLong(), params))
}

public fun glHint(target: UInt, mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glHint", longArrayOf(target.toLong(), mode.toLong()))
}

public fun glIndexMask(mask: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glIndexMask", longArrayOf(mask.toLong()))
}

public fun glIndexPointer(type: UInt, stride: Int, pointer: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glIndexPointer", longArrayOf(type.toLong(), stride.toLong(), pointer))
}

public fun glIndexd(c: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glIndexd", 2, false, longArrayOf(c.toRawBits()))
}

public fun glIndexdv(c: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glIndexdv", longArrayOf(c))
}

public fun glIndexf(c: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glIndexf", 1, false, longArrayOf((c.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glIndexfv(c: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glIndexfv", longArrayOf(c))
}

public fun glIndexi(c: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glIndexi", longArrayOf(c.toLong()))
}

public fun glIndexiv(c: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glIndexiv", longArrayOf(c))
}

public fun glIndexs(c: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glIndexs", longArrayOf(c.toLong()))
}

public fun glIndexsv(c: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glIndexsv", longArrayOf(c))
}

public fun glIndexub(c: UByte) {
    Win32DynamicFfi.invoke("opengl32.dll", "glIndexub", longArrayOf(c.toLong()))
}

public fun glIndexubv(c: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glIndexubv", longArrayOf(c))
}

public fun glInitNames() {
    Win32DynamicFfi.invoke("opengl32.dll", "glInitNames", longArrayOf())
}

public fun glInterleavedArrays(format: UInt, stride: Int, pointer: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glInterleavedArrays", longArrayOf(format.toLong(), stride.toLong(), pointer))
}

public fun glIsEnabled(cap: UInt): UByte {
    return Win32DynamicFfi.invoke("opengl32.dll", "glIsEnabled", longArrayOf(cap.toLong())).toUByte()
}

public fun glIsList(list: UInt): UByte {
    return Win32DynamicFfi.invoke("opengl32.dll", "glIsList", longArrayOf(list.toLong())).toUByte()
}

public fun glIsTexture(texture: UInt): UByte {
    return Win32DynamicFfi.invoke("opengl32.dll", "glIsTexture", longArrayOf(texture.toLong())).toUByte()
}

public fun glLightModelf(pname: UInt, param1: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glLightModelf", 4, false, longArrayOf(pname.toLong(), (param1.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glLightModelfv(pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLightModelfv", longArrayOf(pname.toLong(), params))
}

public fun glLightModeli(pname: UInt, param1: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLightModeli", longArrayOf(pname.toLong(), param1.toLong()))
}

public fun glLightModeliv(pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLightModeliv", longArrayOf(pname.toLong(), params))
}

public fun glLightf(light: UInt, pname: UInt, param2: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glLightf", 16, false, longArrayOf(light.toLong(), pname.toLong(), (param2.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glLightfv(light: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLightfv", longArrayOf(light.toLong(), pname.toLong(), params))
}

public fun glLighti(light: UInt, pname: UInt, param2: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLighti", longArrayOf(light.toLong(), pname.toLong(), param2.toLong()))
}

public fun glLightiv(light: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLightiv", longArrayOf(light.toLong(), pname.toLong(), params))
}

public fun glLineStipple(factor: Int, pattern: UShort) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLineStipple", longArrayOf(factor.toLong(), pattern.toLong()))
}

public fun glLineWidth(width: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glLineWidth", 1, false, longArrayOf((width.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glListBase(base: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glListBase", longArrayOf(base.toLong()))
}

public fun glLoadIdentity() {
    Win32DynamicFfi.invoke("opengl32.dll", "glLoadIdentity", longArrayOf())
}

public fun glLoadMatrixd(m: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLoadMatrixd", longArrayOf(m))
}

public fun glLoadMatrixf(m: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLoadMatrixf", longArrayOf(m))
}

public fun glLoadName(name: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLoadName", longArrayOf(name.toLong()))
}

public fun glLogicOp(opcode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glLogicOp", longArrayOf(opcode.toLong()))
}

public fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: Long) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glMap1d", 40, false, longArrayOf(target.toLong(), u1.toRawBits(), u2.toRawBits(), stride.toLong(), order.toLong(), points))
}

public fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: Long) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glMap1f", 20, false, longArrayOf(target.toLong(), (u1.toRawBits().toLong() and 0xFFFF_FFFFL), (u2.toRawBits().toLong() and 0xFFFF_FFFFL), stride.toLong(), order.toLong(), points))
}

public fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: Long) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glMap2d", 10280, false, longArrayOf(target.toLong(), u1.toRawBits(), u2.toRawBits(), ustride.toLong(), uorder.toLong(), v1.toRawBits(), v2.toRawBits(), vstride.toLong(), vorder.toLong(), points))
}

public fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: Long) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glMap2f", 5140, false, longArrayOf(target.toLong(), (u1.toRawBits().toLong() and 0xFFFF_FFFFL), (u2.toRawBits().toLong() and 0xFFFF_FFFFL), ustride.toLong(), uorder.toLong(), (v1.toRawBits().toLong() and 0xFFFF_FFFFL), (v2.toRawBits().toLong() and 0xFFFF_FFFFL), vstride.toLong(), vorder.toLong(), points))
}

public fun glMapGrid1d(un: Int, u1: Double, u2: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glMapGrid1d", 40, false, longArrayOf(un.toLong(), u1.toRawBits(), u2.toRawBits()))
}

public fun glMapGrid1f(un: Int, u1: Float, u2: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glMapGrid1f", 20, false, longArrayOf(un.toLong(), (u1.toRawBits().toLong() and 0xFFFF_FFFFL), (u2.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glMapGrid2d", 2600, false, longArrayOf(un.toLong(), u1.toRawBits(), u2.toRawBits(), vn.toLong(), v1.toRawBits(), v2.toRawBits()))
}

public fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glMapGrid2f", 1300, false, longArrayOf(un.toLong(), (u1.toRawBits().toLong() and 0xFFFF_FFFFL), (u2.toRawBits().toLong() and 0xFFFF_FFFFL), vn.toLong(), (v1.toRawBits().toLong() and 0xFFFF_FFFFL), (v2.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glMaterialf(face: UInt, pname: UInt, param2: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glMaterialf", 16, false, longArrayOf(face.toLong(), pname.toLong(), (param2.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glMaterialfv(face: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glMaterialfv", longArrayOf(face.toLong(), pname.toLong(), params))
}

public fun glMateriali(face: UInt, pname: UInt, param2: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glMateriali", longArrayOf(face.toLong(), pname.toLong(), param2.toLong()))
}

public fun glMaterialiv(face: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glMaterialiv", longArrayOf(face.toLong(), pname.toLong(), params))
}

public fun glMatrixMode(mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glMatrixMode", longArrayOf(mode.toLong()))
}

public fun glMultMatrixd(m: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glMultMatrixd", longArrayOf(m))
}

public fun glMultMatrixf(m: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glMultMatrixf", longArrayOf(m))
}

public fun glNewList(list: UInt, mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glNewList", longArrayOf(list.toLong(), mode.toLong()))
}

public fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
    Win32DynamicFfi.invoke("opengl32.dll", "glNormal3b", longArrayOf(nx.toLong(), ny.toLong(), nz.toLong()))
}

public fun glNormal3bv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glNormal3bv", longArrayOf(v))
}

public fun glNormal3d(nx: Double, ny: Double, nz: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glNormal3d", 42, false, longArrayOf(nx.toRawBits(), ny.toRawBits(), nz.toRawBits()))
}

public fun glNormal3dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glNormal3dv", longArrayOf(v))
}

public fun glNormal3f(nx: Float, ny: Float, nz: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glNormal3f", 21, false, longArrayOf((nx.toRawBits().toLong() and 0xFFFF_FFFFL), (ny.toRawBits().toLong() and 0xFFFF_FFFFL), (nz.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glNormal3fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glNormal3fv", longArrayOf(v))
}

public fun glNormal3i(nx: Int, ny: Int, nz: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glNormal3i", longArrayOf(nx.toLong(), ny.toLong(), nz.toLong()))
}

public fun glNormal3iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glNormal3iv", longArrayOf(v))
}

public fun glNormal3s(nx: Short, ny: Short, nz: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glNormal3s", longArrayOf(nx.toLong(), ny.toLong(), nz.toLong()))
}

public fun glNormal3sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glNormal3sv", longArrayOf(v))
}

public fun glNormalPointer(type: UInt, stride: Int, pointer: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glNormalPointer", longArrayOf(type.toLong(), stride.toLong(), pointer))
}

public fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glOrtho", 2730, false, longArrayOf(left.toRawBits(), right.toRawBits(), bottom.toRawBits(), top.toRawBits(), znear.toRawBits(), zfar.toRawBits()))
}

public fun glPassThrough(token: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glPassThrough", 1, false, longArrayOf((token.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glPixelMapfv(map: UInt, mapsize: Int, values: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPixelMapfv", longArrayOf(map.toLong(), mapsize.toLong(), values))
}

public fun glPixelMapuiv(map: UInt, mapsize: Int, values: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPixelMapuiv", longArrayOf(map.toLong(), mapsize.toLong(), values))
}

public fun glPixelMapusv(map: UInt, mapsize: Int, values: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPixelMapusv", longArrayOf(map.toLong(), mapsize.toLong(), values))
}

public fun glPixelStoref(pname: UInt, param1: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glPixelStoref", 4, false, longArrayOf(pname.toLong(), (param1.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glPixelStorei(pname: UInt, param1: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPixelStorei", longArrayOf(pname.toLong(), param1.toLong()))
}

public fun glPixelTransferf(pname: UInt, param1: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glPixelTransferf", 4, false, longArrayOf(pname.toLong(), (param1.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glPixelTransferi(pname: UInt, param1: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPixelTransferi", longArrayOf(pname.toLong(), param1.toLong()))
}

public fun glPixelZoom(xfactor: Float, yfactor: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glPixelZoom", 5, false, longArrayOf((xfactor.toRawBits().toLong() and 0xFFFF_FFFFL), (yfactor.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glPointSize(size: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glPointSize", 1, false, longArrayOf((size.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glPolygonMode(face: UInt, mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPolygonMode", longArrayOf(face.toLong(), mode.toLong()))
}

public fun glPolygonOffset(factor: Float, units: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glPolygonOffset", 5, false, longArrayOf((factor.toRawBits().toLong() and 0xFFFF_FFFFL), (units.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glPolygonStipple(mask: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPolygonStipple", longArrayOf(mask))
}

public fun glPopAttrib() {
    Win32DynamicFfi.invoke("opengl32.dll", "glPopAttrib", longArrayOf())
}

public fun glPopClientAttrib() {
    Win32DynamicFfi.invoke("opengl32.dll", "glPopClientAttrib", longArrayOf())
}

public fun glPopMatrix() {
    Win32DynamicFfi.invoke("opengl32.dll", "glPopMatrix", longArrayOf())
}

public fun glPopName() {
    Win32DynamicFfi.invoke("opengl32.dll", "glPopName", longArrayOf())
}

public fun glPrioritizeTextures(n: Int, textures: Long, priorities: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPrioritizeTextures", longArrayOf(n.toLong(), textures, priorities))
}

public fun glPushAttrib(mask: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPushAttrib", longArrayOf(mask.toLong()))
}

public fun glPushClientAttrib(mask: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPushClientAttrib", longArrayOf(mask.toLong()))
}

public fun glPushMatrix() {
    Win32DynamicFfi.invoke("opengl32.dll", "glPushMatrix", longArrayOf())
}

public fun glPushName(name: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glPushName", longArrayOf(name.toLong()))
}

public fun glRasterPos2d(x: Double, y: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glRasterPos2d", 10, false, longArrayOf(x.toRawBits(), y.toRawBits()))
}

public fun glRasterPos2dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos2dv", longArrayOf(v))
}

public fun glRasterPos2f(x: Float, y: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glRasterPos2f", 5, false, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glRasterPos2fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos2fv", longArrayOf(v))
}

public fun glRasterPos2i(x: Int, y: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos2i", longArrayOf(x.toLong(), y.toLong()))
}

public fun glRasterPos2iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos2iv", longArrayOf(v))
}

public fun glRasterPos2s(x: Short, y: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos2s", longArrayOf(x.toLong(), y.toLong()))
}

public fun glRasterPos2sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos2sv", longArrayOf(v))
}

public fun glRasterPos3d(x: Double, y: Double, z: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glRasterPos3d", 42, false, longArrayOf(x.toRawBits(), y.toRawBits(), z.toRawBits()))
}

public fun glRasterPos3dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos3dv", longArrayOf(v))
}

public fun glRasterPos3f(x: Float, y: Float, z: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glRasterPos3f", 21, false, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (z.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glRasterPos3fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos3fv", longArrayOf(v))
}

public fun glRasterPos3i(x: Int, y: Int, z: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos3i", longArrayOf(x.toLong(), y.toLong(), z.toLong()))
}

public fun glRasterPos3iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos3iv", longArrayOf(v))
}

public fun glRasterPos3s(x: Short, y: Short, z: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos3s", longArrayOf(x.toLong(), y.toLong(), z.toLong()))
}

public fun glRasterPos3sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos3sv", longArrayOf(v))
}

public fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glRasterPos4d", 170, false, longArrayOf(x.toRawBits(), y.toRawBits(), z.toRawBits(), w.toRawBits()))
}

public fun glRasterPos4dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos4dv", longArrayOf(v))
}

public fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glRasterPos4f", 85, false, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (z.toRawBits().toLong() and 0xFFFF_FFFFL), (w.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glRasterPos4fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos4fv", longArrayOf(v))
}

public fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos4i", longArrayOf(x.toLong(), y.toLong(), z.toLong(), w.toLong()))
}

public fun glRasterPos4iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos4iv", longArrayOf(v))
}

public fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos4s", longArrayOf(x.toLong(), y.toLong(), z.toLong(), w.toLong()))
}

public fun glRasterPos4sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRasterPos4sv", longArrayOf(v))
}

public fun glReadBuffer(mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glReadBuffer", longArrayOf(mode.toLong()))
}

public fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glReadPixels", longArrayOf(x.toLong(), y.toLong(), width.toLong(), height.toLong(), format.toLong(), type.toLong(), pixels))
}

public fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glRectd", 170, false, longArrayOf(x1.toRawBits(), y1.toRawBits(), x2.toRawBits(), y2.toRawBits()))
}

public fun glRectdv(v1: Long, v2: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRectdv", longArrayOf(v1, v2))
}

public fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glRectf", 85, false, longArrayOf((x1.toRawBits().toLong() and 0xFFFF_FFFFL), (y1.toRawBits().toLong() and 0xFFFF_FFFFL), (x2.toRawBits().toLong() and 0xFFFF_FFFFL), (y2.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glRectfv(v1: Long, v2: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRectfv", longArrayOf(v1, v2))
}

public fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRecti", longArrayOf(x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong()))
}

public fun glRectiv(v1: Long, v2: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRectiv", longArrayOf(v1, v2))
}

public fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRects", longArrayOf(x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong()))
}

public fun glRectsv(v1: Long, v2: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glRectsv", longArrayOf(v1, v2))
}

public fun glRenderMode(mode: UInt): Int {
    return Win32DynamicFfi.invoke("opengl32.dll", "glRenderMode", longArrayOf(mode.toLong())).toInt()
}

public fun glRotated(angle: Double, x: Double, y: Double, z: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glRotated", 170, false, longArrayOf(angle.toRawBits(), x.toRawBits(), y.toRawBits(), z.toRawBits()))
}

public fun glRotatef(angle: Float, x: Float, y: Float, z: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glRotatef", 85, false, longArrayOf((angle.toRawBits().toLong() and 0xFFFF_FFFFL), (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (z.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glScaled(x: Double, y: Double, z: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glScaled", 42, false, longArrayOf(x.toRawBits(), y.toRawBits(), z.toRawBits()))
}

public fun glScalef(x: Float, y: Float, z: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glScalef", 21, false, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (z.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glScissor(x: Int, y: Int, width: Int, height: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glScissor", longArrayOf(x.toLong(), y.toLong(), width.toLong(), height.toLong()))
}

public fun glSelectBuffer(size: Int, buffer: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glSelectBuffer", longArrayOf(size.toLong(), buffer))
}

public fun glShadeModel(mode: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glShadeModel", longArrayOf(mode.toLong()))
}

public fun glStencilFunc(func: UInt, ref: Int, mask: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glStencilFunc", longArrayOf(func.toLong(), ref.toLong(), mask.toLong()))
}

public fun glStencilMask(mask: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glStencilMask", longArrayOf(mask.toLong()))
}

public fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt) {
    Win32DynamicFfi.invoke("opengl32.dll", "glStencilOp", longArrayOf(fail.toLong(), zfail.toLong(), zpass.toLong()))
}

public fun glTexCoord1d(s: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexCoord1d", 2, false, longArrayOf(s.toRawBits()))
}

public fun glTexCoord1dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord1dv", longArrayOf(v))
}

public fun glTexCoord1f(s: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexCoord1f", 1, false, longArrayOf((s.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glTexCoord1fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord1fv", longArrayOf(v))
}

public fun glTexCoord1i(s: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord1i", longArrayOf(s.toLong()))
}

public fun glTexCoord1iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord1iv", longArrayOf(v))
}

public fun glTexCoord1s(s: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord1s", longArrayOf(s.toLong()))
}

public fun glTexCoord1sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord1sv", longArrayOf(v))
}

public fun glTexCoord2d(s: Double, t: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexCoord2d", 10, false, longArrayOf(s.toRawBits(), t.toRawBits()))
}

public fun glTexCoord2dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord2dv", longArrayOf(v))
}

public fun glTexCoord2f(s: Float, t: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexCoord2f", 5, false, longArrayOf((s.toRawBits().toLong() and 0xFFFF_FFFFL), (t.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glTexCoord2fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord2fv", longArrayOf(v))
}

public fun glTexCoord2i(s: Int, t: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord2i", longArrayOf(s.toLong(), t.toLong()))
}

public fun glTexCoord2iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord2iv", longArrayOf(v))
}

public fun glTexCoord2s(s: Short, t: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord2s", longArrayOf(s.toLong(), t.toLong()))
}

public fun glTexCoord2sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord2sv", longArrayOf(v))
}

public fun glTexCoord3d(s: Double, t: Double, r: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexCoord3d", 42, false, longArrayOf(s.toRawBits(), t.toRawBits(), r.toRawBits()))
}

public fun glTexCoord3dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord3dv", longArrayOf(v))
}

public fun glTexCoord3f(s: Float, t: Float, r: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexCoord3f", 21, false, longArrayOf((s.toRawBits().toLong() and 0xFFFF_FFFFL), (t.toRawBits().toLong() and 0xFFFF_FFFFL), (r.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glTexCoord3fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord3fv", longArrayOf(v))
}

public fun glTexCoord3i(s: Int, t: Int, r: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord3i", longArrayOf(s.toLong(), t.toLong(), r.toLong()))
}

public fun glTexCoord3iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord3iv", longArrayOf(v))
}

public fun glTexCoord3s(s: Short, t: Short, r: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord3s", longArrayOf(s.toLong(), t.toLong(), r.toLong()))
}

public fun glTexCoord3sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord3sv", longArrayOf(v))
}

public fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexCoord4d", 170, false, longArrayOf(s.toRawBits(), t.toRawBits(), r.toRawBits(), q.toRawBits()))
}

public fun glTexCoord4dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord4dv", longArrayOf(v))
}

public fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexCoord4f", 85, false, longArrayOf((s.toRawBits().toLong() and 0xFFFF_FFFFL), (t.toRawBits().toLong() and 0xFFFF_FFFFL), (r.toRawBits().toLong() and 0xFFFF_FFFFL), (q.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glTexCoord4fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord4fv", longArrayOf(v))
}

public fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord4i", longArrayOf(s.toLong(), t.toLong(), r.toLong(), q.toLong()))
}

public fun glTexCoord4iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord4iv", longArrayOf(v))
}

public fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord4s", longArrayOf(s.toLong(), t.toLong(), r.toLong(), q.toLong()))
}

public fun glTexCoord4sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoord4sv", longArrayOf(v))
}

public fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexCoordPointer", longArrayOf(size.toLong(), type.toLong(), stride.toLong(), pointer))
}

public fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexEnvf", 16, false, longArrayOf(target.toLong(), pname.toLong(), (param2.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glTexEnvfv(target: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexEnvfv", longArrayOf(target.toLong(), pname.toLong(), params))
}

public fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexEnvi", longArrayOf(target.toLong(), pname.toLong(), param2.toLong()))
}

public fun glTexEnviv(target: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexEnviv", longArrayOf(target.toLong(), pname.toLong(), params))
}

public fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexGend", 32, false, longArrayOf(coord.toLong(), pname.toLong(), param2.toRawBits()))
}

public fun glTexGendv(coord: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexGendv", longArrayOf(coord.toLong(), pname.toLong(), params))
}

public fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexGenf", 16, false, longArrayOf(coord.toLong(), pname.toLong(), (param2.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glTexGenfv(coord: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexGenfv", longArrayOf(coord.toLong(), pname.toLong(), params))
}

public fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexGeni", longArrayOf(coord.toLong(), pname.toLong(), param2.toLong()))
}

public fun glTexGeniv(coord: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexGeniv", longArrayOf(coord.toLong(), pname.toLong(), params))
}

public fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexImage1D", longArrayOf(target.toLong(), level.toLong(), internalformat.toLong(), width.toLong(), border.toLong(), format.toLong(), type.toLong(), pixels))
}

public fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexImage2D", longArrayOf(target.toLong(), level.toLong(), internalformat.toLong(), width.toLong(), height.toLong(), border.toLong(), format.toLong(), type.toLong(), pixels))
}

public fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTexParameterf", 16, false, longArrayOf(target.toLong(), pname.toLong(), (param2.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glTexParameterfv(target: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexParameterfv", longArrayOf(target.toLong(), pname.toLong(), params))
}

public fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexParameteri", longArrayOf(target.toLong(), pname.toLong(), param2.toLong()))
}

public fun glTexParameteriv(target: UInt, pname: UInt, params: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexParameteriv", longArrayOf(target.toLong(), pname.toLong(), params))
}

public fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexSubImage1D", longArrayOf(target.toLong(), level.toLong(), xoffset.toLong(), width.toLong(), format.toLong(), type.toLong(), pixels))
}

public fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glTexSubImage2D", longArrayOf(target.toLong(), level.toLong(), xoffset.toLong(), yoffset.toLong(), width.toLong(), height.toLong(), format.toLong(), type.toLong(), pixels))
}

public fun glTranslated(x: Double, y: Double, z: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTranslated", 42, false, longArrayOf(x.toRawBits(), y.toRawBits(), z.toRawBits()))
}

public fun glTranslatef(x: Float, y: Float, z: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glTranslatef", 21, false, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (z.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glVertex2d(x: Double, y: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glVertex2d", 10, false, longArrayOf(x.toRawBits(), y.toRawBits()))
}

public fun glVertex2dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex2dv", longArrayOf(v))
}

public fun glVertex2f(x: Float, y: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glVertex2f", 5, false, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glVertex2fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex2fv", longArrayOf(v))
}

public fun glVertex2i(x: Int, y: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex2i", longArrayOf(x.toLong(), y.toLong()))
}

public fun glVertex2iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex2iv", longArrayOf(v))
}

public fun glVertex2s(x: Short, y: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex2s", longArrayOf(x.toLong(), y.toLong()))
}

public fun glVertex2sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex2sv", longArrayOf(v))
}

public fun glVertex3d(x: Double, y: Double, z: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glVertex3d", 42, false, longArrayOf(x.toRawBits(), y.toRawBits(), z.toRawBits()))
}

public fun glVertex3dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex3dv", longArrayOf(v))
}

public fun glVertex3f(x: Float, y: Float, z: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glVertex3f", 21, false, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (z.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glVertex3fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex3fv", longArrayOf(v))
}

public fun glVertex3i(x: Int, y: Int, z: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex3i", longArrayOf(x.toLong(), y.toLong(), z.toLong()))
}

public fun glVertex3iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex3iv", longArrayOf(v))
}

public fun glVertex3s(x: Short, y: Short, z: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex3s", longArrayOf(x.toLong(), y.toLong(), z.toLong()))
}

public fun glVertex3sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex3sv", longArrayOf(v))
}

public fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glVertex4d", 170, false, longArrayOf(x.toRawBits(), y.toRawBits(), z.toRawBits(), w.toRawBits()))
}

public fun glVertex4dv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex4dv", longArrayOf(v))
}

public fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
    Win32DynamicFfi.invokeFp("opengl32.dll", "glVertex4f", 85, false, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (z.toRawBits().toLong() and 0xFFFF_FFFFL), (w.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun glVertex4fv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex4fv", longArrayOf(v))
}

public fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex4i", longArrayOf(x.toLong(), y.toLong(), z.toLong(), w.toLong()))
}

public fun glVertex4iv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex4iv", longArrayOf(v))
}

public fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex4s", longArrayOf(x.toLong(), y.toLong(), z.toLong(), w.toLong()))
}

public fun glVertex4sv(v: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertex4sv", longArrayOf(v))
}

public fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    Win32DynamicFfi.invoke("opengl32.dll", "glVertexPointer", longArrayOf(size.toLong(), type.toLong(), stride.toLong(), pointer))
}

public fun glViewport(x: Int, y: Int, width: Int, height: Int) {
    Win32DynamicFfi.invoke("opengl32.dll", "glViewport", longArrayOf(x.toLong(), y.toLong(), width.toLong(), height.toLong()))
}

public fun gluBeginCurve(nobj: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluBeginCurve", longArrayOf(nobj))
}

public fun gluBeginPolygon(tess: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluBeginPolygon", longArrayOf(tess))
}

public fun gluBeginSurface(nobj: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluBeginSurface", longArrayOf(nobj))
}

public fun gluBeginTrim(nobj: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluBeginTrim", longArrayOf(nobj))
}

public fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: Long): Int {
    return Win32DynamicFfi.invoke("glu32.dll", "gluBuild1DMipmaps", longArrayOf(target.toLong(), components.toLong(), width.toLong(), format.toLong(), type.toLong(), data)).toInt()
}

public fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: Long): Int {
    return Win32DynamicFfi.invoke("glu32.dll", "gluBuild2DMipmaps", longArrayOf(target.toLong(), components.toLong(), width.toLong(), height.toLong(), format.toLong(), type.toLong(), data)).toInt()
}

public fun gluCylinder(qobj: Long, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluCylinder", 168, false, longArrayOf(qobj, baseradius.toRawBits(), topradius.toRawBits(), height.toRawBits(), slices.toLong(), stacks.toLong()))
}

public fun gluDeleteNurbsRenderer(nobj: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluDeleteNurbsRenderer", longArrayOf(nobj))
}

public fun gluDeleteQuadric(state: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluDeleteQuadric", longArrayOf(state))
}

public fun gluDeleteTess(tess: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluDeleteTess", longArrayOf(tess))
}

public fun gluDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluDisk", 40, false, longArrayOf(qobj, innerradius.toRawBits(), outerradius.toRawBits(), slices.toLong(), loops.toLong()))
}

public fun gluEndCurve(nobj: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluEndCurve", longArrayOf(nobj))
}

public fun gluEndPolygon(tess: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluEndPolygon", longArrayOf(tess))
}

public fun gluEndSurface(nobj: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluEndSurface", longArrayOf(nobj))
}

public fun gluEndTrim(nobj: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluEndTrim", longArrayOf(nobj))
}

public fun gluErrorString(errcode: UInt): Long {
    return Win32DynamicFfi.invoke("glu32.dll", "gluErrorString", longArrayOf(errcode.toLong()))
}

public fun gluErrorUnicodeStringEXT(errcode: UInt): PCWSTR {
    return Win32DynamicFfi.invoke("glu32.dll", "gluErrorUnicodeStringEXT", longArrayOf(errcode.toLong()))
}

public fun gluGetNurbsProperty(nobj: Long, property: UInt, value: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluGetNurbsProperty", longArrayOf(nobj, property.toLong(), value))
}

public fun gluGetString(name: UInt): Long {
    return Win32DynamicFfi.invoke("glu32.dll", "gluGetString", longArrayOf(name.toLong()))
}

public fun gluGetTessProperty(tess: Long, which: UInt, value: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluGetTessProperty", longArrayOf(tess, which.toLong(), value))
}

public fun gluLoadSamplingMatrices(nobj: Long, modelmatrix: Long, projmatrix: Long, viewport: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluLoadSamplingMatrices", longArrayOf(nobj, modelmatrix, projmatrix, viewport))
}

public fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluLookAt", 43690, false, longArrayOf(eyex.toRawBits(), eyey.toRawBits(), eyez.toRawBits(), centerx.toRawBits(), centery.toRawBits(), centerz.toRawBits(), upx.toRawBits(), upy.toRawBits(), upz.toRawBits()))
}

public fun gluNewNurbsRenderer(): Long {
    return Win32DynamicFfi.invoke("glu32.dll", "gluNewNurbsRenderer", longArrayOf())
}

public fun gluNewQuadric(): Long {
    return Win32DynamicFfi.invoke("glu32.dll", "gluNewQuadric", longArrayOf())
}

public fun gluNewTess(): Long {
    return Win32DynamicFfi.invoke("glu32.dll", "gluNewTess", longArrayOf())
}

public fun gluNextContour(tess: Long, type: UInt) {
    Win32DynamicFfi.invoke("glu32.dll", "gluNextContour", longArrayOf(tess, type.toLong()))
}

public fun gluNurbsCallback(nobj: Long, which: UInt, fn: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluNurbsCallback", longArrayOf(nobj, which.toLong(), fn))
}

public fun gluNurbsCurve(nobj: Long, nknots: Int, knot: Long, stride: Int, ctlarray: Long, order: Int, type: UInt) {
    Win32DynamicFfi.invoke("glu32.dll", "gluNurbsCurve", longArrayOf(nobj, nknots.toLong(), knot, stride.toLong(), ctlarray, order.toLong(), type.toLong()))
}

public fun gluNurbsProperty(nobj: Long, property: UInt, value: Float) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluNurbsProperty", 16, false, longArrayOf(nobj, property.toLong(), (value.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun gluNurbsSurface(nobj: Long, sknot_count: Int, sknot: Long, tknot_count: Int, tknot: Long, s_stride: Int, t_stride: Int, ctlarray: Long, sorder: Int, torder: Int, type: UInt) {
    Win32DynamicFfi.invoke("glu32.dll", "gluNurbsSurface", longArrayOf(nobj, sknot_count.toLong(), sknot, tknot_count.toLong(), tknot, s_stride.toLong(), t_stride.toLong(), ctlarray, sorder.toLong(), torder.toLong(), type.toLong()))
}

public fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluOrtho2D", 170, false, longArrayOf(left.toRawBits(), right.toRawBits(), bottom.toRawBits(), top.toRawBits()))
}

public fun gluPartialDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluPartialDisk", 10280, false, longArrayOf(qobj, innerradius.toRawBits(), outerradius.toRawBits(), slices.toLong(), loops.toLong(), startangle.toRawBits(), sweepangle.toRawBits()))
}

public fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluPerspective", 170, false, longArrayOf(fovy.toRawBits(), aspect.toRawBits(), znear.toRawBits(), zfar.toRawBits()))
}

public fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: Long) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluPickMatrix", 170, false, longArrayOf(x.toRawBits(), y.toRawBits(), width.toRawBits(), height.toRawBits(), viewport))
}

public fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, winx: Long, winy: Long, winz: Long): Int {
    return Win32DynamicFfi.invokeFp("glu32.dll", "gluProject", 42, false, longArrayOf(objx.toRawBits(), objy.toRawBits(), objz.toRawBits(), modelmatrix, projmatrix, viewport, winx, winy, winz)).toLong().toInt()
}

public fun gluPwlCurve(nobj: Long, count: Int, array: Long, stride: Int, type: UInt) {
    Win32DynamicFfi.invoke("glu32.dll", "gluPwlCurve", longArrayOf(nobj, count.toLong(), array, stride.toLong(), type.toLong()))
}

public fun gluQuadricCallback(qobj: Long, which: UInt, fn: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluQuadricCallback", longArrayOf(qobj, which.toLong(), fn))
}

public fun gluQuadricDrawStyle(quadobject: Long, drawstyle: UInt) {
    Win32DynamicFfi.invoke("glu32.dll", "gluQuadricDrawStyle", longArrayOf(quadobject, drawstyle.toLong()))
}

public fun gluQuadricNormals(quadobject: Long, normals: UInt) {
    Win32DynamicFfi.invoke("glu32.dll", "gluQuadricNormals", longArrayOf(quadobject, normals.toLong()))
}

public fun gluQuadricOrientation(quadobject: Long, orientation: UInt) {
    Win32DynamicFfi.invoke("glu32.dll", "gluQuadricOrientation", longArrayOf(quadobject, orientation.toLong()))
}

public fun gluQuadricTexture(quadobject: Long, texturecoords: UByte) {
    Win32DynamicFfi.invoke("glu32.dll", "gluQuadricTexture", longArrayOf(quadobject, texturecoords.toLong()))
}

public fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: Long, widthout: Int, heightout: Int, typeout: UInt, dataout: Long): Int {
    return Win32DynamicFfi.invoke("glu32.dll", "gluScaleImage", longArrayOf(format.toLong(), widthin.toLong(), heightin.toLong(), typein.toLong(), datain, widthout.toLong(), heightout.toLong(), typeout.toLong(), dataout)).toInt()
}

public fun gluSphere(qobj: Long, radius: Double, slices: Int, stacks: Int) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluSphere", 8, false, longArrayOf(qobj, radius.toRawBits(), slices.toLong(), stacks.toLong()))
}

public fun gluTessBeginContour(tess: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluTessBeginContour", longArrayOf(tess))
}

public fun gluTessBeginPolygon(tess: Long, polygon_data: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluTessBeginPolygon", longArrayOf(tess, polygon_data))
}

public fun gluTessCallback(tess: Long, which: UInt, fn: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluTessCallback", longArrayOf(tess, which.toLong(), fn))
}

public fun gluTessEndContour(tess: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluTessEndContour", longArrayOf(tess))
}

public fun gluTessEndPolygon(tess: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluTessEndPolygon", longArrayOf(tess))
}

public fun gluTessNormal(tess: Long, x: Double, y: Double, z: Double) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluTessNormal", 168, false, longArrayOf(tess, x.toRawBits(), y.toRawBits(), z.toRawBits()))
}

public fun gluTessProperty(tess: Long, which: UInt, value: Double) {
    Win32DynamicFfi.invokeFp("glu32.dll", "gluTessProperty", 32, false, longArrayOf(tess, which.toLong(), value.toRawBits()))
}

public fun gluTessVertex(tess: Long, coords: Long, data: Long) {
    Win32DynamicFfi.invoke("glu32.dll", "gluTessVertex", longArrayOf(tess, coords, data))
}

public fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, objx: Long, objy: Long, objz: Long): Int {
    return Win32DynamicFfi.invokeFp("glu32.dll", "gluUnProject", 42, false, longArrayOf(winx.toRawBits(), winy.toRawBits(), winz.toRawBits(), modelmatrix, projmatrix, viewport, objx, objy, objz)).toLong().toInt()
}

public fun wglCopyContext(param0: HGLRC, param1: HGLRC, param2: UInt): BOOL {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglCopyContext", longArrayOf(param0, param1, param2.toLong())).toInt()
}

public fun wglCreateContext(param0: HDC): HGLRC {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglCreateContext", longArrayOf(param0))
}

public fun wglCreateLayerContext(param0: HDC, param1: Int): HGLRC {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglCreateLayerContext", longArrayOf(param0, param1.toLong()))
}

public fun wglDeleteContext(param0: HGLRC): BOOL {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglDeleteContext", longArrayOf(param0)).toInt()
}

public fun wglDescribeLayerPlane(param0: HDC, param1: Int, param2: Int, param3: UInt, param4: Long): BOOL {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglDescribeLayerPlane", longArrayOf(param0, param1.toLong(), param2.toLong(), param3.toLong(), param4)).toInt()
}

public fun wglGetCurrentContext(): HGLRC {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglGetCurrentContext", longArrayOf())
}

public fun wglGetCurrentDC(): HDC {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglGetCurrentDC", longArrayOf())
}

public fun wglGetLayerPaletteEntries(param0: HDC, param1: Int, param2: Int, param3: Int, param4: Long): Int {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglGetLayerPaletteEntries", longArrayOf(param0, param1.toLong(), param2.toLong(), param3.toLong(), param4)).toInt()
}

public fun wglGetProcAddress(param0: PCSTR): PROC {
    val rawRet = Win32DynamicFfi.invoke("opengl32.dll", "wglGetProcAddress", longArrayOf(param0))
    return if (rawRet == 0L) null else PROCFn { Win32DynamicFfi.invokePtr(rawRet, longArrayOf()) }
}

public fun wglMakeCurrent(param0: HDC, param1: HGLRC): BOOL {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglMakeCurrent", longArrayOf(param0, param1)).toInt()
}

public fun wglRealizeLayerPalette(param0: HDC, param1: Int, param2: BOOL): BOOL {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglRealizeLayerPalette", longArrayOf(param0, param1.toLong(), param2.toLong())).toInt()
}

public fun wglSetLayerPaletteEntries(param0: HDC, param1: Int, param2: Int, param3: Int, param4: Long): Int {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglSetLayerPaletteEntries", longArrayOf(param0, param1.toLong(), param2.toLong(), param3.toLong(), param4)).toInt()
}

public fun wglShareLists(param0: HGLRC, param1: HGLRC): BOOL {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglShareLists", longArrayOf(param0, param1)).toInt()
}

public fun wglSwapLayerBuffers(param0: HDC, param1: UInt): BOOL {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglSwapLayerBuffers", longArrayOf(param0, param1.toLong())).toInt()
}

public fun wglUseFontBitmapsA(param0: HDC, param1: UInt, param2: UInt, param3: UInt): BOOL {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglUseFontBitmapsA", longArrayOf(param0, param1.toLong(), param2.toLong(), param3.toLong())).toInt()
}

public fun wglUseFontBitmapsW(param0: HDC, param1: UInt, param2: UInt, param3: UInt): BOOL {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglUseFontBitmapsW", longArrayOf(param0, param1.toLong(), param2.toLong(), param3.toLong())).toInt()
}

public fun wglUseFontOutlinesA(param0: HDC, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: Long): BOOL {
    return Win32DynamicFfi.invokeFp("opengl32.dll", "wglUseFontOutlinesA", 1280, false, longArrayOf(param0, param1.toLong(), param2.toLong(), param3.toLong(), (param4.toRawBits().toLong() and 0xFFFF_FFFFL), (param5.toRawBits().toLong() and 0xFFFF_FFFFL), param6.toLong(), param7)).toLong().toInt()
}

public fun wglUseFontOutlinesW(param0: HDC, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: Long): BOOL {
    return Win32DynamicFfi.invokeFp("opengl32.dll", "wglUseFontOutlinesW", 1280, false, longArrayOf(param0, param1.toLong(), param2.toLong(), param3.toLong(), (param4.toRawBits().toLong() and 0xFFFF_FFFFL), (param5.toRawBits().toLong() and 0xFFFF_FFFFL), param6.toLong(), param7)).toLong().toInt()
}
