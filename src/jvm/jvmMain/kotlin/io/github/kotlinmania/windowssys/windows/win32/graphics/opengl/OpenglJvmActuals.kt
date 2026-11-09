@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.PROC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HENHMETAFILE

private object WindowsWin32GraphicsOpenglJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_ChoosePixelFormat(hdc: Long, ppfd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_DescribePixelFormat(hdc: Long, ipixelformat: Int, nbytes: Int, ppfd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_GetEnhMetaFilePixelFormat(hemf: Long, cbbuffer: Int, ppfd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_GetPixelFormat(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_SetPixelFormat(hdc: Long, format: Int, ppfd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_SwapBuffers(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glAccum(op: Int, value: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glAlphaFunc(func: Int, ref: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glAreTexturesResident(n: Int, textures: Long, residences: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glArrayElement(i: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glBegin(mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glBindTexture(target: Int, texture: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glBlendFunc(sfactor: Int, dfactor: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glCallList(list: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glCallLists(n: Int, type: Int, lists: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glClear(mask: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glClearAccum(red: Float, green: Float, blue: Float, alpha: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glClearColor(red: Float, green: Float, blue: Float, alpha: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glClearDepth(depth: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glClearIndex(c: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glClearStencil(s: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glClipPlane(plane: Int, equation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3b(red: Byte, green: Byte, blue: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3bv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3d(red: Double, green: Double, blue: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3f(red: Float, green: Float, blue: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3i(red: Int, green: Int, blue: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3s(red: Short, green: Short, blue: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3ub(red: Byte, green: Byte, blue: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3ubv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3ui(red: Int, green: Int, blue: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3uiv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3us(red: Short, green: Short, blue: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor3usv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4bv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4d(red: Double, green: Double, blue: Double, alpha: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4f(red: Float, green: Float, blue: Float, alpha: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4i(red: Int, green: Int, blue: Int, alpha: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4s(red: Short, green: Short, blue: Short, alpha: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4ub(red: Byte, green: Byte, blue: Byte, alpha: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4ubv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4ui(red: Int, green: Int, blue: Int, alpha: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4uiv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4us(red: Short, green: Short, blue: Short, alpha: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColor4usv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColorMask(red: Byte, green: Byte, blue: Byte, alpha: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColorMaterial(face: Int, mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glColorPointer(size: Int, type: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glCopyTexImage1D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, border: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glCopyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D(target: Int, level: Int, xoffset: Int, x: Int, y: Int, width: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glCullFace(mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDeleteLists(list: Int, range: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDeleteTextures(n: Int, textures: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDepthFunc(func: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDepthMask(flag: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDepthRange(znear: Double, zfar: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDisable(cap: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDisableClientState(array: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDrawArrays(mode: Int, first: Int, count: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDrawBuffer(mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDrawElements(mode: Int, count: Int, type: Int, indices: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glDrawPixels(width: Int, height: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEdgeFlag(flag: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer(stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEdgeFlagv(flag: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEnable(cap: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEnableClientState(array: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEnd()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEndList()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalCoord1d(u: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalCoord1dv(u: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalCoord1f(u: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalCoord1fv(u: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalCoord2d(u: Double, v: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalCoord2dv(u: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalCoord2f(u: Float, v: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalCoord2fv(u: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalMesh1(mode: Int, i1: Int, i2: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalMesh2(mode: Int, i1: Int, i2: Int, j1: Int, j2: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalPoint1(i: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glEvalPoint2(i: Int, j: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glFeedbackBuffer(size: Int, type: Int, buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glFinish()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glFlush()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glFogf(pname: Int, param1: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glFogfv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glFogi(pname: Int, param1: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glFogiv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glFrontFace(mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGenLists(range: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGenTextures(n: Int, textures: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetBooleanv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetClipPlane(plane: Int, equation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetDoublev(pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetFloatv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetIntegerv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetLightfv(light: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetLightiv(light: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetMapdv(target: Int, query: Int, v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetMapfv(target: Int, query: Int, v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetMapiv(target: Int, query: Int, v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetMaterialfv(face: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetMaterialiv(face: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetPixelMapfv(map: Int, values: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv(map: Int, values: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetPixelMapusv(map: Int, values: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetPointerv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetPolygonStipple(mask: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetString(name: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetTexEnvfv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetTexEnviv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetTexGendv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetTexGenfv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetTexGeniv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetTexImage(target: Int, level: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv(target: Int, level: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv(target: Int, level: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetTexParameterfv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glGetTexParameteriv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glHint(target: Int, mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexMask(mask: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexPointer(type: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexd(c: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexdv(c: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexf(c: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexfv(c: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexi(c: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexiv(c: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexs(c: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexsv(c: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexub(c: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIndexubv(c: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glInitNames()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glInterleavedArrays(format: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIsEnabled(cap: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIsList(list: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glIsTexture(texture: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLightModelf(pname: Int, param1: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLightModelfv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLightModeli(pname: Int, param1: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLightModeliv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLightf(light: Int, pname: Int, param2: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLightfv(light: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLighti(light: Int, pname: Int, param2: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLightiv(light: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLineStipple(factor: Int, pattern: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLineWidth(width: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glListBase(base: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLoadIdentity()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLoadMatrixd(m: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLoadMatrixf(m: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLoadName(name: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glLogicOp(opcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMap1d(target: Int, u1: Double, u2: Double, stride: Int, order: Int, points: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMap1f(target: Int, u1: Float, u2: Float, stride: Int, order: Int, points: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMap2d(target: Int, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMap2f(target: Int, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMapGrid1d(un: Int, u1: Double, u2: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMapGrid1f(un: Int, u1: Float, u2: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMaterialf(face: Int, pname: Int, param2: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMaterialfv(face: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMateriali(face: Int, pname: Int, param2: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMaterialiv(face: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMatrixMode(mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMultMatrixd(m: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glMultMatrixf(m: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNewList(list: Int, mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormal3b(nx: Byte, ny: Byte, nz: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormal3bv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormal3d(nx: Double, ny: Double, nz: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormal3dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormal3f(nx: Float, ny: Float, nz: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormal3fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormal3i(nx: Int, ny: Int, nz: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormal3iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormal3s(nx: Short, ny: Short, nz: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormal3sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glNormalPointer(type: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPassThrough(token: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPixelMapfv(map: Int, mapsize: Int, values: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPixelMapuiv(map: Int, mapsize: Int, values: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPixelMapusv(map: Int, mapsize: Int, values: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPixelStoref(pname: Int, param1: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPixelStorei(pname: Int, param1: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPixelTransferf(pname: Int, param1: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPixelTransferi(pname: Int, param1: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPixelZoom(xfactor: Float, yfactor: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPointSize(size: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPolygonMode(face: Int, mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPolygonOffset(factor: Float, units: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPolygonStipple(mask: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPopAttrib()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPopClientAttrib()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPopMatrix()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPopName()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPrioritizeTextures(n: Int, textures: Long, priorities: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPushAttrib(mask: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPushClientAttrib(mask: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPushMatrix()

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glPushName(name: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos2d(x: Double, y: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos2dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos2f(x: Float, y: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos2fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos2i(x: Int, y: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos2iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos2s(x: Short, y: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos2sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos3d(x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos3dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos3f(x: Float, y: Float, z: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos3fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos3i(x: Int, y: Int, z: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos3iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos3s(x: Short, y: Short, z: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos3sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos4d(x: Double, y: Double, z: Double, w: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos4dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos4f(x: Float, y: Float, z: Float, w: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos4fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos4i(x: Int, y: Int, z: Int, w: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos4iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos4s(x: Short, y: Short, z: Short, w: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRasterPos4sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glReadBuffer(mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glReadPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRectd(x1: Double, y1: Double, x2: Double, y2: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRectdv(v1: Long, v2: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRectf(x1: Float, y1: Float, x2: Float, y2: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRectfv(v1: Long, v2: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRecti(x1: Int, y1: Int, x2: Int, y2: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRectiv(v1: Long, v2: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRects(x1: Short, y1: Short, x2: Short, y2: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRectsv(v1: Long, v2: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRenderMode(mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRotated(angle: Double, x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glRotatef(angle: Float, x: Float, y: Float, z: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glScaled(x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glScalef(x: Float, y: Float, z: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glScissor(x: Int, y: Int, width: Int, height: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glSelectBuffer(size: Int, buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glShadeModel(mode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glStencilFunc(func: Int, ref: Int, mask: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glStencilMask(mask: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glStencilOp(fail: Int, zfail: Int, zpass: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord1d(s: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord1dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord1f(s: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord1fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord1i(s: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord1iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord1s(s: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord1sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord2d(s: Double, t: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord2dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord2f(s: Float, t: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord2fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord2i(s: Int, t: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord2iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord2s(s: Short, t: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord2sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord3d(s: Double, t: Double, r: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord3dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord3f(s: Float, t: Float, r: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord3fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord3i(s: Int, t: Int, r: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord3iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord3s(s: Short, t: Short, r: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord3sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord4d(s: Double, t: Double, r: Double, q: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord4dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord4f(s: Float, t: Float, r: Float, q: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord4fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord4i(s: Int, t: Int, r: Int, q: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord4iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord4s(s: Short, t: Short, r: Short, q: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoord4sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexCoordPointer(size: Int, type: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexEnvf(target: Int, pname: Int, param2: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexEnvfv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexEnvi(target: Int, pname: Int, param2: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexEnviv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexGend(coord: Int, pname: Int, param2: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexGendv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexGenf(coord: Int, pname: Int, param2: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexGenfv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexGeni(coord: Int, pname: Int, param2: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexGeniv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexImage1D(target: Int, level: Int, internalformat: Int, width: Int, border: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexParameterf(target: Int, pname: Int, param2: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexParameterfv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexParameteri(target: Int, pname: Int, param2: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexParameteriv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexSubImage1D(target: Int, level: Int, xoffset: Int, width: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTranslated(x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glTranslatef(x: Float, y: Float, z: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex2d(x: Double, y: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex2dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex2f(x: Float, y: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex2fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex2i(x: Int, y: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex2iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex2s(x: Short, y: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex2sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex3d(x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex3dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex3f(x: Float, y: Float, z: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex3fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex3i(x: Int, y: Int, z: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex3iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex3s(x: Short, y: Short, z: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex3sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex4d(x: Double, y: Double, z: Double, w: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex4dv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex4f(x: Float, y: Float, z: Float, w: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex4fv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex4i(x: Int, y: Int, z: Int, w: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex4iv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex4s(x: Short, y: Short, z: Short, w: Short)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertex4sv(v: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glVertexPointer(size: Int, type: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_glViewport(x: Int, y: Int, width: Int, height: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluBeginCurve(nobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluBeginPolygon(tess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluBeginSurface(nobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluBeginTrim(nobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps(target: Int, components: Int, width: Int, format: Int, type: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps(target: Int, components: Int, width: Int, height: Int, format: Int, type: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluCylinder(qobj: Long, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer(nobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluDeleteQuadric(state: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluDeleteTess(tess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluEndCurve(nobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluEndPolygon(tess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluEndSurface(nobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluEndTrim(nobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluErrorString(errcode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT(errcode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty(nobj: Long, property: Int, value: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluGetString(name: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluGetTessProperty(tess: Long, which: Int, value: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices(nobj: Long, modelmatrix: Long, projmatrix: Long, viewport: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer(): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluNewQuadric(): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluNewTess(): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluNextContour(tess: Long, type: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluNurbsCallback(nobj: Long, which: Int, fn: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluNurbsCurve(nobj: Long, nknots: Int, knot: Long, stride: Int, ctlarray: Long, order: Int, type: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluNurbsProperty(nobj: Long, property: Int, value: Float)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluNurbsSurface(nobj: Long, sknot_count: Int, sknot: Long, tknot_count: Int, tknot: Long, s_stride: Int, t_stride: Int, ctlarray: Long, sorder: Int, torder: Int, type: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluPartialDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, winx: Long, winy: Long, winz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluPwlCurve(nobj: Long, count: Int, array: Long, stride: Int, type: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluQuadricCallback(qobj: Long, which: Int, fn: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle(quadobject: Long, drawstyle: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluQuadricNormals(quadobject: Long, normals: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluQuadricOrientation(quadobject: Long, orientation: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluQuadricTexture(quadobject: Long, texturecoords: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluScaleImage(format: Int, widthin: Int, heightin: Int, typein: Int, datain: Long, widthout: Int, heightout: Int, typeout: Int, dataout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluSphere(qobj: Long, radius: Double, slices: Int, stacks: Int)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluTessBeginContour(tess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon(tess: Long, polygon_data: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluTessCallback(tess: Long, which: Int, fn: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluTessEndContour(tess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluTessEndPolygon(tess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluTessNormal(tess: Long, x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluTessProperty(tess: Long, which: Int, value: Double)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluTessVertex(tess: Long, coords: Long, data: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, objx: Long, objy: Long, objz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglCopyContext(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglCreateContext(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglCreateLayerContext(param0: Long, param1: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglDeleteContext(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane(param0: Long, param1: Int, param2: Int, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglGetCurrentContext(): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglGetCurrentDC(): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries(param0: Long, param1: Int, param2: Int, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglMakeCurrent(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette(param0: Long, param1: Int, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries(param0: Long, param1: Int, param2: Int, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglShareLists(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA(param0: Long, param1: Int, param2: Int, param3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW(param0: Long, param1: Int, param2: Int, param3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA(param0: Long, param1: Int, param2: Int, param3: Int, param4: Float, param5: Float, param6: Int, param7: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW(param0: Long, param1: Int, param2: Int, param3: Int, param4: Float, param5: Float, param6: Int, param7: Long): Int
}

public actual fun ChoosePixelFormat(hdc: HDC, ppfd: Long): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_ChoosePixelFormat(hdc, ppfd)

public actual fun DescribePixelFormat(hdc: HDC, ipixelformat: Int, nbytes: UInt, ppfd: Long): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_DescribePixelFormat(hdc, ipixelformat, nbytes.toInt(), ppfd)

public actual fun GetEnhMetaFilePixelFormat(hemf: HENHMETAFILE, cbbuffer: UInt, ppfd: Long): UInt =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_GetEnhMetaFilePixelFormat(hemf, cbbuffer.toInt(), ppfd).toUInt()

public actual fun GetPixelFormat(hdc: HDC): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_GetPixelFormat(hdc)

public actual fun SetPixelFormat(hdc: HDC, format: Int, ppfd: Long): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_SetPixelFormat(hdc, format, ppfd)

public actual fun SwapBuffers(param0: HDC): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_SwapBuffers(param0)

public actual fun glAccum(op: UInt, value: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glAccum(op.toInt(), value)
}

public actual fun glAlphaFunc(func: UInt, ref: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glAlphaFunc(func.toInt(), ref)
}

public actual fun glAreTexturesResident(n: Int, textures: Long, residences: Long): UByte =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glAreTexturesResident(n, textures, residences).toUByte()

public actual fun glArrayElement(i: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glArrayElement(i)
}

public actual fun glBegin(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glBegin(mode.toInt())
}

public actual fun glBindTexture(target: UInt, texture: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glBindTexture(target.toInt(), texture.toInt())
}

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glBitmap(width, height, xorig, yorig, xmove, ymove, bitmap)
}

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glBlendFunc(sfactor.toInt(), dfactor.toInt())
}

public actual fun glCallList(list: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glCallList(list.toInt())
}

public actual fun glCallLists(n: Int, type: UInt, lists: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glCallLists(n, type.toInt(), lists)
}

public actual fun glClear(mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glClear(mask.toInt())
}

public actual fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glClearAccum(red, green, blue, alpha)
}

public actual fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glClearColor(red, green, blue, alpha)
}

public actual fun glClearDepth(depth: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glClearDepth(depth)
}

public actual fun glClearIndex(c: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glClearIndex(c)
}

public actual fun glClearStencil(s: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glClearStencil(s)
}

public actual fun glClipPlane(plane: UInt, equation: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glClipPlane(plane.toInt(), equation)
}

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3b(red, green, blue)
}

public actual fun glColor3bv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3bv(v)
}

public actual fun glColor3d(red: Double, green: Double, blue: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3d(red, green, blue)
}

public actual fun glColor3dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3dv(v)
}

public actual fun glColor3f(red: Float, green: Float, blue: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3f(red, green, blue)
}

public actual fun glColor3fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3fv(v)
}

public actual fun glColor3i(red: Int, green: Int, blue: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3i(red, green, blue)
}

public actual fun glColor3iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3iv(v)
}

public actual fun glColor3s(red: Short, green: Short, blue: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3s(red, green, blue)
}

public actual fun glColor3sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3sv(v)
}

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3ub(red.toByte(), green.toByte(), blue.toByte())
}

public actual fun glColor3ubv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3ubv(v)
}

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3ui(red.toInt(), green.toInt(), blue.toInt())
}

public actual fun glColor3uiv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3uiv(v)
}

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3us(red.toShort(), green.toShort(), blue.toShort())
}

public actual fun glColor3usv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor3usv(v)
}

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4b(red, green, blue, alpha)
}

public actual fun glColor4bv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4bv(v)
}

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4d(red, green, blue, alpha)
}

public actual fun glColor4dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4dv(v)
}

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4f(red, green, blue, alpha)
}

public actual fun glColor4fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4fv(v)
}

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4i(red, green, blue, alpha)
}

public actual fun glColor4iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4iv(v)
}

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4s(red, green, blue, alpha)
}

public actual fun glColor4sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4sv(v)
}

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4ub(red.toByte(), green.toByte(), blue.toByte(), alpha.toByte())
}

public actual fun glColor4ubv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4ubv(v)
}

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4ui(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
}

public actual fun glColor4uiv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4uiv(v)
}

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4us(red.toShort(), green.toShort(), blue.toShort(), alpha.toShort())
}

public actual fun glColor4usv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColor4usv(v)
}

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColorMask(red.toByte(), green.toByte(), blue.toByte(), alpha.toByte())
}

public actual fun glColorMaterial(face: UInt, mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColorMaterial(face.toInt(), mode.toInt())
}

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glColorPointer(size, type.toInt(), stride, pointer)
}

public actual fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glCopyPixels(x, y, width, height, type.toInt())
}

public actual fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glCopyTexImage1D(target.toInt(), level, internalformat.toInt(), x, y, width, border)
}

public actual fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glCopyTexImage2D(target.toInt(), level, internalformat.toInt(), x, y, width, height, border)
}

public actual fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D(target.toInt(), level, xoffset, x, y, width)
}

public actual fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D(target.toInt(), level, xoffset, yoffset, x, y, width, height)
}

public actual fun glCullFace(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glCullFace(mode.toInt())
}

public actual fun glDeleteLists(list: UInt, range: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDeleteLists(list.toInt(), range)
}

public actual fun glDeleteTextures(n: Int, textures: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDeleteTextures(n, textures)
}

public actual fun glDepthFunc(func: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDepthFunc(func.toInt())
}

public actual fun glDepthMask(flag: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDepthMask(flag.toByte())
}

public actual fun glDepthRange(znear: Double, zfar: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDepthRange(znear, zfar)
}

public actual fun glDisable(cap: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDisable(cap.toInt())
}

public actual fun glDisableClientState(array: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDisableClientState(array.toInt())
}

public actual fun glDrawArrays(mode: UInt, first: Int, count: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDrawArrays(mode.toInt(), first, count)
}

public actual fun glDrawBuffer(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDrawBuffer(mode.toInt())
}

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDrawElements(mode.toInt(), count, type.toInt(), indices)
}

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glDrawPixels(width, height, format.toInt(), type.toInt(), pixels)
}

public actual fun glEdgeFlag(flag: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEdgeFlag(flag.toByte())
}

public actual fun glEdgeFlagPointer(stride: Int, pointer: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer(stride, pointer)
}

public actual fun glEdgeFlagv(flag: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEdgeFlagv(flag)
}

public actual fun glEnable(cap: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEnable(cap.toInt())
}

public actual fun glEnableClientState(array: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEnableClientState(array.toInt())
}

public actual fun glEnd() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEnd()
}

public actual fun glEndList() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEndList()
}

public actual fun glEvalCoord1d(u: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalCoord1d(u)
}

public actual fun glEvalCoord1dv(u: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalCoord1dv(u)
}

public actual fun glEvalCoord1f(u: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalCoord1f(u)
}

public actual fun glEvalCoord1fv(u: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalCoord1fv(u)
}

public actual fun glEvalCoord2d(u: Double, v: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalCoord2d(u, v)
}

public actual fun glEvalCoord2dv(u: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalCoord2dv(u)
}

public actual fun glEvalCoord2f(u: Float, v: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalCoord2f(u, v)
}

public actual fun glEvalCoord2fv(u: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalCoord2fv(u)
}

public actual fun glEvalMesh1(mode: UInt, i1: Int, i2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalMesh1(mode.toInt(), i1, i2)
}

public actual fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalMesh2(mode.toInt(), i1, i2, j1, j2)
}

public actual fun glEvalPoint1(i: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalPoint1(i)
}

public actual fun glEvalPoint2(i: Int, j: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glEvalPoint2(i, j)
}

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glFeedbackBuffer(size, type.toInt(), buffer)
}

public actual fun glFinish() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glFinish()
}

public actual fun glFlush() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glFlush()
}

public actual fun glFogf(pname: UInt, param1: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glFogf(pname.toInt(), param1)
}

public actual fun glFogfv(pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glFogfv(pname.toInt(), params)
}

public actual fun glFogi(pname: UInt, param1: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glFogi(pname.toInt(), param1)
}

public actual fun glFogiv(pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glFogiv(pname.toInt(), params)
}

public actual fun glFrontFace(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glFrontFace(mode.toInt())
}

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glFrustum(left, right, bottom, top, znear, zfar)
}

public actual fun glGenLists(range: Int): UInt =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGenLists(range).toUInt()

public actual fun glGenTextures(n: Int, textures: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGenTextures(n, textures)
}

public actual fun glGetBooleanv(pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetBooleanv(pname.toInt(), params)
}

public actual fun glGetClipPlane(plane: UInt, equation: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetClipPlane(plane.toInt(), equation)
}

public actual fun glGetDoublev(pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetDoublev(pname.toInt(), params)
}

public actual fun glGetError(): UInt =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetError().toUInt()

public actual fun glGetFloatv(pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetFloatv(pname.toInt(), params)
}

public actual fun glGetIntegerv(pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetIntegerv(pname.toInt(), params)
}

public actual fun glGetLightfv(light: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetLightfv(light.toInt(), pname.toInt(), params)
}

public actual fun glGetLightiv(light: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetLightiv(light.toInt(), pname.toInt(), params)
}

public actual fun glGetMapdv(target: UInt, query: UInt, v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetMapdv(target.toInt(), query.toInt(), v)
}

public actual fun glGetMapfv(target: UInt, query: UInt, v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetMapfv(target.toInt(), query.toInt(), v)
}

public actual fun glGetMapiv(target: UInt, query: UInt, v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetMapiv(target.toInt(), query.toInt(), v)
}

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetMaterialfv(face.toInt(), pname.toInt(), params)
}

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetMaterialiv(face.toInt(), pname.toInt(), params)
}

public actual fun glGetPixelMapfv(map: UInt, values: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetPixelMapfv(map.toInt(), values)
}

public actual fun glGetPixelMapuiv(map: UInt, values: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv(map.toInt(), values)
}

public actual fun glGetPixelMapusv(map: UInt, values: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetPixelMapusv(map.toInt(), values)
}

public actual fun glGetPointerv(pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetPointerv(pname.toInt(), params)
}

public actual fun glGetPolygonStipple(mask: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetPolygonStipple(mask)
}

public actual fun glGetString(name: UInt): Long =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetString(name.toInt())

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetTexEnvfv(target.toInt(), pname.toInt(), params)
}

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetTexEnviv(target.toInt(), pname.toInt(), params)
}

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetTexGendv(coord.toInt(), pname.toInt(), params)
}

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetTexGenfv(coord.toInt(), pname.toInt(), params)
}

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetTexGeniv(coord.toInt(), pname.toInt(), params)
}

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetTexImage(target.toInt(), level, format.toInt(), type.toInt(), pixels)
}

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv(target.toInt(), level, pname.toInt(), params)
}

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv(target.toInt(), level, pname.toInt(), params)
}

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetTexParameterfv(target.toInt(), pname.toInt(), params)
}

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glGetTexParameteriv(target.toInt(), pname.toInt(), params)
}

public actual fun glHint(target: UInt, mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glHint(target.toInt(), mode.toInt())
}

public actual fun glIndexMask(mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexMask(mask.toInt())
}

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexPointer(type.toInt(), stride, pointer)
}

public actual fun glIndexd(c: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexd(c)
}

public actual fun glIndexdv(c: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexdv(c)
}

public actual fun glIndexf(c: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexf(c)
}

public actual fun glIndexfv(c: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexfv(c)
}

public actual fun glIndexi(c: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexi(c)
}

public actual fun glIndexiv(c: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexiv(c)
}

public actual fun glIndexs(c: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexs(c)
}

public actual fun glIndexsv(c: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexsv(c)
}

public actual fun glIndexub(c: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexub(c.toByte())
}

public actual fun glIndexubv(c: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIndexubv(c)
}

public actual fun glInitNames() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glInitNames()
}

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glInterleavedArrays(format.toInt(), stride, pointer)
}

public actual fun glIsEnabled(cap: UInt): UByte =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIsEnabled(cap.toInt()).toUByte()

public actual fun glIsList(list: UInt): UByte =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIsList(list.toInt()).toUByte()

public actual fun glIsTexture(texture: UInt): UByte =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glIsTexture(texture.toInt()).toUByte()

public actual fun glLightModelf(pname: UInt, param1: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLightModelf(pname.toInt(), param1)
}

public actual fun glLightModelfv(pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLightModelfv(pname.toInt(), params)
}

public actual fun glLightModeli(pname: UInt, param1: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLightModeli(pname.toInt(), param1)
}

public actual fun glLightModeliv(pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLightModeliv(pname.toInt(), params)
}

public actual fun glLightf(light: UInt, pname: UInt, param2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLightf(light.toInt(), pname.toInt(), param2)
}

public actual fun glLightfv(light: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLightfv(light.toInt(), pname.toInt(), params)
}

public actual fun glLighti(light: UInt, pname: UInt, param2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLighti(light.toInt(), pname.toInt(), param2)
}

public actual fun glLightiv(light: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLightiv(light.toInt(), pname.toInt(), params)
}

public actual fun glLineStipple(factor: Int, pattern: UShort) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLineStipple(factor, pattern.toShort())
}

public actual fun glLineWidth(width: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLineWidth(width)
}

public actual fun glListBase(base: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glListBase(base.toInt())
}

public actual fun glLoadIdentity() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLoadIdentity()
}

public actual fun glLoadMatrixd(m: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLoadMatrixd(m)
}

public actual fun glLoadMatrixf(m: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLoadMatrixf(m)
}

public actual fun glLoadName(name: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLoadName(name.toInt())
}

public actual fun glLogicOp(opcode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glLogicOp(opcode.toInt())
}

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMap1d(target.toInt(), u1, u2, stride, order, points)
}

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMap1f(target.toInt(), u1, u2, stride, order, points)
}

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMap2d(target.toInt(), u1, u2, ustride, uorder, v1, v2, vstride, vorder, points)
}

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMap2f(target.toInt(), u1, u2, ustride, uorder, v1, v2, vstride, vorder, points)
}

public actual fun glMapGrid1d(un: Int, u1: Double, u2: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMapGrid1d(un, u1, u2)
}

public actual fun glMapGrid1f(un: Int, u1: Float, u2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMapGrid1f(un, u1, u2)
}

public actual fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMapGrid2d(un, u1, u2, vn, v1, v2)
}

public actual fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMapGrid2f(un, u1, u2, vn, v1, v2)
}

public actual fun glMaterialf(face: UInt, pname: UInt, param2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMaterialf(face.toInt(), pname.toInt(), param2)
}

public actual fun glMaterialfv(face: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMaterialfv(face.toInt(), pname.toInt(), params)
}

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMateriali(face.toInt(), pname.toInt(), param2)
}

public actual fun glMaterialiv(face: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMaterialiv(face.toInt(), pname.toInt(), params)
}

public actual fun glMatrixMode(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMatrixMode(mode.toInt())
}

public actual fun glMultMatrixd(m: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMultMatrixd(m)
}

public actual fun glMultMatrixf(m: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glMultMatrixf(m)
}

public actual fun glNewList(list: UInt, mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNewList(list.toInt(), mode.toInt())
}

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormal3b(nx, ny, nz)
}

public actual fun glNormal3bv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormal3bv(v)
}

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormal3d(nx, ny, nz)
}

public actual fun glNormal3dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormal3dv(v)
}

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormal3f(nx, ny, nz)
}

public actual fun glNormal3fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormal3fv(v)
}

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormal3i(nx, ny, nz)
}

public actual fun glNormal3iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormal3iv(v)
}

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormal3s(nx, ny, nz)
}

public actual fun glNormal3sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormal3sv(v)
}

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glNormalPointer(type.toInt(), stride, pointer)
}

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glOrtho(left, right, bottom, top, znear, zfar)
}

public actual fun glPassThrough(token: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPassThrough(token)
}

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPixelMapfv(map.toInt(), mapsize, values)
}

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPixelMapuiv(map.toInt(), mapsize, values)
}

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPixelMapusv(map.toInt(), mapsize, values)
}

public actual fun glPixelStoref(pname: UInt, param1: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPixelStoref(pname.toInt(), param1)
}

public actual fun glPixelStorei(pname: UInt, param1: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPixelStorei(pname.toInt(), param1)
}

public actual fun glPixelTransferf(pname: UInt, param1: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPixelTransferf(pname.toInt(), param1)
}

public actual fun glPixelTransferi(pname: UInt, param1: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPixelTransferi(pname.toInt(), param1)
}

public actual fun glPixelZoom(xfactor: Float, yfactor: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPixelZoom(xfactor, yfactor)
}

public actual fun glPointSize(size: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPointSize(size)
}

public actual fun glPolygonMode(face: UInt, mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPolygonMode(face.toInt(), mode.toInt())
}

public actual fun glPolygonOffset(factor: Float, units: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPolygonOffset(factor, units)
}

public actual fun glPolygonStipple(mask: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPolygonStipple(mask)
}

public actual fun glPopAttrib() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPopAttrib()
}

public actual fun glPopClientAttrib() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPopClientAttrib()
}

public actual fun glPopMatrix() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPopMatrix()
}

public actual fun glPopName() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPopName()
}

public actual fun glPrioritizeTextures(n: Int, textures: Long, priorities: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPrioritizeTextures(n, textures, priorities)
}

public actual fun glPushAttrib(mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPushAttrib(mask.toInt())
}

public actual fun glPushClientAttrib(mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPushClientAttrib(mask.toInt())
}

public actual fun glPushMatrix() {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPushMatrix()
}

public actual fun glPushName(name: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glPushName(name.toInt())
}

public actual fun glRasterPos2d(x: Double, y: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos2d(x, y)
}

public actual fun glRasterPos2dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos2dv(v)
}

public actual fun glRasterPos2f(x: Float, y: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos2f(x, y)
}

public actual fun glRasterPos2fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos2fv(v)
}

public actual fun glRasterPos2i(x: Int, y: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos2i(x, y)
}

public actual fun glRasterPos2iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos2iv(v)
}

public actual fun glRasterPos2s(x: Short, y: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos2s(x, y)
}

public actual fun glRasterPos2sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos2sv(v)
}

public actual fun glRasterPos3d(x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos3d(x, y, z)
}

public actual fun glRasterPos3dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos3dv(v)
}

public actual fun glRasterPos3f(x: Float, y: Float, z: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos3f(x, y, z)
}

public actual fun glRasterPos3fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos3fv(v)
}

public actual fun glRasterPos3i(x: Int, y: Int, z: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos3i(x, y, z)
}

public actual fun glRasterPos3iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos3iv(v)
}

public actual fun glRasterPos3s(x: Short, y: Short, z: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos3s(x, y, z)
}

public actual fun glRasterPos3sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos3sv(v)
}

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos4d(x, y, z, w)
}

public actual fun glRasterPos4dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos4dv(v)
}

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos4f(x, y, z, w)
}

public actual fun glRasterPos4fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos4fv(v)
}

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos4i(x, y, z, w)
}

public actual fun glRasterPos4iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos4iv(v)
}

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos4s(x, y, z, w)
}

public actual fun glRasterPos4sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRasterPos4sv(v)
}

public actual fun glReadBuffer(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glReadBuffer(mode.toInt())
}

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glReadPixels(x, y, width, height, format.toInt(), type.toInt(), pixels)
}

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRectd(x1, y1, x2, y2)
}

public actual fun glRectdv(v1: Long, v2: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRectdv(v1, v2)
}

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRectf(x1, y1, x2, y2)
}

public actual fun glRectfv(v1: Long, v2: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRectfv(v1, v2)
}

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRecti(x1, y1, x2, y2)
}

public actual fun glRectiv(v1: Long, v2: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRectiv(v1, v2)
}

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRects(x1, y1, x2, y2)
}

public actual fun glRectsv(v1: Long, v2: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRectsv(v1, v2)
}

public actual fun glRenderMode(mode: UInt): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRenderMode(mode.toInt())

public actual fun glRotated(angle: Double, x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRotated(angle, x, y, z)
}

public actual fun glRotatef(angle: Float, x: Float, y: Float, z: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glRotatef(angle, x, y, z)
}

public actual fun glScaled(x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glScaled(x, y, z)
}

public actual fun glScalef(x: Float, y: Float, z: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glScalef(x, y, z)
}

public actual fun glScissor(x: Int, y: Int, width: Int, height: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glScissor(x, y, width, height)
}

public actual fun glSelectBuffer(size: Int, buffer: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glSelectBuffer(size, buffer)
}

public actual fun glShadeModel(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glShadeModel(mode.toInt())
}

public actual fun glStencilFunc(func: UInt, ref: Int, mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glStencilFunc(func.toInt(), ref, mask.toInt())
}

public actual fun glStencilMask(mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glStencilMask(mask.toInt())
}

public actual fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glStencilOp(fail.toInt(), zfail.toInt(), zpass.toInt())
}

public actual fun glTexCoord1d(s: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord1d(s)
}

public actual fun glTexCoord1dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord1dv(v)
}

public actual fun glTexCoord1f(s: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord1f(s)
}

public actual fun glTexCoord1fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord1fv(v)
}

public actual fun glTexCoord1i(s: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord1i(s)
}

public actual fun glTexCoord1iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord1iv(v)
}

public actual fun glTexCoord1s(s: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord1s(s)
}

public actual fun glTexCoord1sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord1sv(v)
}

public actual fun glTexCoord2d(s: Double, t: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord2d(s, t)
}

public actual fun glTexCoord2dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord2dv(v)
}

public actual fun glTexCoord2f(s: Float, t: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord2f(s, t)
}

public actual fun glTexCoord2fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord2fv(v)
}

public actual fun glTexCoord2i(s: Int, t: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord2i(s, t)
}

public actual fun glTexCoord2iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord2iv(v)
}

public actual fun glTexCoord2s(s: Short, t: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord2s(s, t)
}

public actual fun glTexCoord2sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord2sv(v)
}

public actual fun glTexCoord3d(s: Double, t: Double, r: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord3d(s, t, r)
}

public actual fun glTexCoord3dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord3dv(v)
}

public actual fun glTexCoord3f(s: Float, t: Float, r: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord3f(s, t, r)
}

public actual fun glTexCoord3fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord3fv(v)
}

public actual fun glTexCoord3i(s: Int, t: Int, r: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord3i(s, t, r)
}

public actual fun glTexCoord3iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord3iv(v)
}

public actual fun glTexCoord3s(s: Short, t: Short, r: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord3s(s, t, r)
}

public actual fun glTexCoord3sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord3sv(v)
}

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord4d(s, t, r, q)
}

public actual fun glTexCoord4dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord4dv(v)
}

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord4f(s, t, r, q)
}

public actual fun glTexCoord4fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord4fv(v)
}

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord4i(s, t, r, q)
}

public actual fun glTexCoord4iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord4iv(v)
}

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord4s(s, t, r, q)
}

public actual fun glTexCoord4sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoord4sv(v)
}

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexCoordPointer(size, type.toInt(), stride, pointer)
}

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexEnvf(target.toInt(), pname.toInt(), param2)
}

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexEnvfv(target.toInt(), pname.toInt(), params)
}

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexEnvi(target.toInt(), pname.toInt(), param2)
}

public actual fun glTexEnviv(target: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexEnviv(target.toInt(), pname.toInt(), params)
}

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexGend(coord.toInt(), pname.toInt(), param2)
}

public actual fun glTexGendv(coord: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexGendv(coord.toInt(), pname.toInt(), params)
}

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexGenf(coord.toInt(), pname.toInt(), param2)
}

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexGenfv(coord.toInt(), pname.toInt(), params)
}

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexGeni(coord.toInt(), pname.toInt(), param2)
}

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexGeniv(coord.toInt(), pname.toInt(), params)
}

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexImage1D(target.toInt(), level, internalformat, width, border, format.toInt(), type.toInt(), pixels)
}

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexImage2D(target.toInt(), level, internalformat, width, height, border, format.toInt(), type.toInt(), pixels)
}

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexParameterf(target.toInt(), pname.toInt(), param2)
}

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexParameterfv(target.toInt(), pname.toInt(), params)
}

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexParameteri(target.toInt(), pname.toInt(), param2)
}

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexParameteriv(target.toInt(), pname.toInt(), params)
}

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexSubImage1D(target.toInt(), level, xoffset, width, format.toInt(), type.toInt(), pixels)
}

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTexSubImage2D(target.toInt(), level, xoffset, yoffset, width, height, format.toInt(), type.toInt(), pixels)
}

public actual fun glTranslated(x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTranslated(x, y, z)
}

public actual fun glTranslatef(x: Float, y: Float, z: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glTranslatef(x, y, z)
}

public actual fun glVertex2d(x: Double, y: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex2d(x, y)
}

public actual fun glVertex2dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex2dv(v)
}

public actual fun glVertex2f(x: Float, y: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex2f(x, y)
}

public actual fun glVertex2fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex2fv(v)
}

public actual fun glVertex2i(x: Int, y: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex2i(x, y)
}

public actual fun glVertex2iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex2iv(v)
}

public actual fun glVertex2s(x: Short, y: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex2s(x, y)
}

public actual fun glVertex2sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex2sv(v)
}

public actual fun glVertex3d(x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex3d(x, y, z)
}

public actual fun glVertex3dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex3dv(v)
}

public actual fun glVertex3f(x: Float, y: Float, z: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex3f(x, y, z)
}

public actual fun glVertex3fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex3fv(v)
}

public actual fun glVertex3i(x: Int, y: Int, z: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex3i(x, y, z)
}

public actual fun glVertex3iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex3iv(v)
}

public actual fun glVertex3s(x: Short, y: Short, z: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex3s(x, y, z)
}

public actual fun glVertex3sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex3sv(v)
}

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex4d(x, y, z, w)
}

public actual fun glVertex4dv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex4dv(v)
}

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex4f(x, y, z, w)
}

public actual fun glVertex4fv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex4fv(v)
}

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex4i(x, y, z, w)
}

public actual fun glVertex4iv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex4iv(v)
}

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex4s(x, y, z, w)
}

public actual fun glVertex4sv(v: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertex4sv(v)
}

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glVertexPointer(size, type.toInt(), stride, pointer)
}

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_glViewport(x, y, width, height)
}

public actual fun gluBeginCurve(nobj: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluBeginCurve(nobj)
}

public actual fun gluBeginPolygon(tess: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluBeginPolygon(tess)
}

public actual fun gluBeginSurface(nobj: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluBeginSurface(nobj)
}

public actual fun gluBeginTrim(nobj: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluBeginTrim(nobj)
}

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: Long): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps(target.toInt(), components, width, format.toInt(), type.toInt(), data)

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: Long): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps(target.toInt(), components, width, height, format.toInt(), type.toInt(), data)

public actual fun gluCylinder(qobj: Long, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluCylinder(qobj, baseradius, topradius, height, slices, stacks)
}

public actual fun gluDeleteNurbsRenderer(nobj: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer(nobj)
}

public actual fun gluDeleteQuadric(state: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluDeleteQuadric(state)
}

public actual fun gluDeleteTess(tess: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluDeleteTess(tess)
}

public actual fun gluDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluDisk(qobj, innerradius, outerradius, slices, loops)
}

public actual fun gluEndCurve(nobj: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluEndCurve(nobj)
}

public actual fun gluEndPolygon(tess: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluEndPolygon(tess)
}

public actual fun gluEndSurface(nobj: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluEndSurface(nobj)
}

public actual fun gluEndTrim(nobj: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluEndTrim(nobj)
}

public actual fun gluErrorString(errcode: UInt): Long =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluErrorString(errcode.toInt())

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): PCWSTR =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT(errcode.toInt())

public actual fun gluGetNurbsProperty(nobj: Long, property: UInt, value: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty(nobj, property.toInt(), value)
}

public actual fun gluGetString(name: UInt): Long =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluGetString(name.toInt())

public actual fun gluGetTessProperty(tess: Long, which: UInt, value: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluGetTessProperty(tess, which.toInt(), value)
}

public actual fun gluLoadSamplingMatrices(nobj: Long, modelmatrix: Long, projmatrix: Long, viewport: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices(nobj, modelmatrix, projmatrix, viewport)
}

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluLookAt(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz)
}

public actual fun gluNewNurbsRenderer(): Long =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer()

public actual fun gluNewQuadric(): Long =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluNewQuadric()

public actual fun gluNewTess(): Long =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluNewTess()

public actual fun gluNextContour(tess: Long, type: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluNextContour(tess, type.toInt())
}

public actual fun gluNurbsCallback(nobj: Long, which: UInt, fn: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluNurbsCallback(nobj, which.toInt(), fn)
}

public actual fun gluNurbsCurve(nobj: Long, nknots: Int, knot: Long, stride: Int, ctlarray: Long, order: Int, type: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluNurbsCurve(nobj, nknots, knot, stride, ctlarray, order, type.toInt())
}

public actual fun gluNurbsProperty(nobj: Long, property: UInt, value: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluNurbsProperty(nobj, property.toInt(), value)
}

public actual fun gluNurbsSurface(nobj: Long, sknot_count: Int, sknot: Long, tknot_count: Int, tknot: Long, s_stride: Int, t_stride: Int, ctlarray: Long, sorder: Int, torder: Int, type: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluNurbsSurface(nobj, sknot_count, sknot, tknot_count, tknot, s_stride, t_stride, ctlarray, sorder, torder, type.toInt())
}

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluOrtho2D(left, right, bottom, top)
}

public actual fun gluPartialDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluPartialDisk(qobj, innerradius, outerradius, slices, loops, startangle, sweepangle)
}

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluPerspective(fovy, aspect, znear, zfar)
}

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluPickMatrix(x, y, width, height, viewport)
}

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, winx: Long, winy: Long, winz: Long): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluProject(objx, objy, objz, modelmatrix, projmatrix, viewport, winx, winy, winz)

public actual fun gluPwlCurve(nobj: Long, count: Int, array: Long, stride: Int, type: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluPwlCurve(nobj, count, array, stride, type.toInt())
}

public actual fun gluQuadricCallback(qobj: Long, which: UInt, fn: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluQuadricCallback(qobj, which.toInt(), fn)
}

public actual fun gluQuadricDrawStyle(quadobject: Long, drawstyle: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle(quadobject, drawstyle.toInt())
}

public actual fun gluQuadricNormals(quadobject: Long, normals: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluQuadricNormals(quadobject, normals.toInt())
}

public actual fun gluQuadricOrientation(quadobject: Long, orientation: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluQuadricOrientation(quadobject, orientation.toInt())
}

public actual fun gluQuadricTexture(quadobject: Long, texturecoords: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluQuadricTexture(quadobject, texturecoords.toByte())
}

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: Long, widthout: Int, heightout: Int, typeout: UInt, dataout: Long): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluScaleImage(format.toInt(), widthin, heightin, typein.toInt(), datain, widthout, heightout, typeout.toInt(), dataout)

public actual fun gluSphere(qobj: Long, radius: Double, slices: Int, stacks: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluSphere(qobj, radius, slices, stacks)
}

public actual fun gluTessBeginContour(tess: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluTessBeginContour(tess)
}

public actual fun gluTessBeginPolygon(tess: Long, polygon_data: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon(tess, polygon_data)
}

public actual fun gluTessCallback(tess: Long, which: UInt, fn: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluTessCallback(tess, which.toInt(), fn)
}

public actual fun gluTessEndContour(tess: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluTessEndContour(tess)
}

public actual fun gluTessEndPolygon(tess: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluTessEndPolygon(tess)
}

public actual fun gluTessNormal(tess: Long, x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluTessNormal(tess, x, y, z)
}

public actual fun gluTessProperty(tess: Long, which: UInt, value: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluTessProperty(tess, which.toInt(), value)
}

public actual fun gluTessVertex(tess: Long, coords: Long, data: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluTessVertex(tess, coords, data)
}

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, objx: Long, objy: Long, objz: Long): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_gluUnProject(winx, winy, winz, modelmatrix, projmatrix, viewport, objx, objy, objz)

public actual fun wglCopyContext(param0: HGLRC, param1: HGLRC, param2: UInt): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglCopyContext(param0, param1, param2.toInt())

public actual fun wglCreateContext(param0: HDC): HGLRC =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglCreateContext(param0)

public actual fun wglCreateLayerContext(param0: HDC, param1: Int): HGLRC =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglCreateLayerContext(param0, param1)

public actual fun wglDeleteContext(param0: HGLRC): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglDeleteContext(param0)

public actual fun wglDescribeLayerPlane(param0: HDC, param1: Int, param2: Int, param3: UInt, param4: Long): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane(param0, param1, param2, param3.toInt(), param4)

public actual fun wglGetCurrentContext(): HGLRC =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglGetCurrentContext()

public actual fun wglGetCurrentDC(): HDC =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglGetCurrentDC()

public actual fun wglGetLayerPaletteEntries(param0: HDC, param1: Int, param2: Int, param3: Int, param4: Long): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries(param0, param1, param2, param3, param4)

public actual fun wglGetProcAddress(param0: PCSTR): PROC =
    null

public actual fun wglMakeCurrent(param0: HDC, param1: HGLRC): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglMakeCurrent(param0, param1)

public actual fun wglRealizeLayerPalette(param0: HDC, param1: Int, param2: BOOL): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette(param0, param1, param2)

public actual fun wglSetLayerPaletteEntries(param0: HDC, param1: Int, param2: Int, param3: Int, param4: Long): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries(param0, param1, param2, param3, param4)

public actual fun wglShareLists(param0: HGLRC, param1: HGLRC): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglShareLists(param0, param1)

public actual fun wglSwapLayerBuffers(param0: HDC, param1: UInt): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers(param0, param1.toInt())

public actual fun wglUseFontBitmapsA(param0: HDC, param1: UInt, param2: UInt, param3: UInt): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA(param0, param1.toInt(), param2.toInt(), param3.toInt())

public actual fun wglUseFontBitmapsW(param0: HDC, param1: UInt, param2: UInt, param3: UInt): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW(param0, param1.toInt(), param2.toInt(), param3.toInt())

public actual fun wglUseFontOutlinesA(param0: HDC, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: Long): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA(param0, param1.toInt(), param2.toInt(), param3.toInt(), param4, param5, param6, param7)

public actual fun wglUseFontOutlinesW(param0: HDC, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: Long): BOOL =
    WindowsWin32GraphicsOpenglJniBridge.windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW(param0, param1.toInt(), param2.toInt(), param3.toInt(), param4, param5, param6, param7)
