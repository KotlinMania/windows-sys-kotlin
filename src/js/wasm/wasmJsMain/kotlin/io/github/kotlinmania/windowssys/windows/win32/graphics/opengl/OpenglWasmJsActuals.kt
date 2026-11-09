@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.PROC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HENHMETAFILE

public actual fun ChoosePixelFormat(hdc: HDC, ppfd: Long): Int =
    0

public actual fun DescribePixelFormat(hdc: HDC, ipixelformat: Int, nbytes: UInt, ppfd: Long): Int =
    0

public actual fun GetEnhMetaFilePixelFormat(hemf: HENHMETAFILE, cbbuffer: UInt, ppfd: Long): UInt =
    0u

public actual fun GetPixelFormat(hdc: HDC): Int =
    0

public actual fun SetPixelFormat(hdc: HDC, format: Int, ppfd: Long): BOOL =
    0

public actual fun SwapBuffers(param0: HDC): BOOL =
    0

public actual fun glAccum(op: UInt, value: Float) {
}

public actual fun glAlphaFunc(func: UInt, ref: Float) {
}

public actual fun glAreTexturesResident(n: Int, textures: Long, residences: Long): UByte =
    0u

public actual fun glArrayElement(i: Int) {
}

public actual fun glBegin(mode: UInt) {
}

public actual fun glBindTexture(target: UInt, texture: UInt) {
}

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: Long) {
}

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
}

public actual fun glCallList(list: UInt) {
}

public actual fun glCallLists(n: Int, type: UInt, lists: Long) {
}

public actual fun glClear(mask: UInt) {
}

public actual fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float) {
}

public actual fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float) {
}

public actual fun glClearDepth(depth: Double) {
}

public actual fun glClearIndex(c: Float) {
}

public actual fun glClearStencil(s: Int) {
}

public actual fun glClipPlane(plane: UInt, equation: Long) {
}

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte) {
}

public actual fun glColor3bv(v: Long) {
}

public actual fun glColor3d(red: Double, green: Double, blue: Double) {
}

public actual fun glColor3dv(v: Long) {
}

public actual fun glColor3f(red: Float, green: Float, blue: Float) {
}

public actual fun glColor3fv(v: Long) {
}

public actual fun glColor3i(red: Int, green: Int, blue: Int) {
}

public actual fun glColor3iv(v: Long) {
}

public actual fun glColor3s(red: Short, green: Short, blue: Short) {
}

public actual fun glColor3sv(v: Long) {
}

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
}

public actual fun glColor3ubv(v: Long) {
}

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
}

public actual fun glColor3uiv(v: Long) {
}

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort) {
}

public actual fun glColor3usv(v: Long) {
}

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
}

public actual fun glColor4bv(v: Long) {
}

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
}

public actual fun glColor4dv(v: Long) {
}

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
}

public actual fun glColor4fv(v: Long) {
}

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
}

public actual fun glColor4iv(v: Long) {
}

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
}

public actual fun glColor4sv(v: Long) {
}

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
}

public actual fun glColor4ubv(v: Long) {
}

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
}

public actual fun glColor4uiv(v: Long) {
}

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
}

public actual fun glColor4usv(v: Long) {
}

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
}

public actual fun glColorMaterial(face: UInt, mode: UInt) {
}

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
}

public actual fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt) {
}

public actual fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int) {
}

public actual fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int) {
}

public actual fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int) {
}

public actual fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int) {
}

public actual fun glCullFace(mode: UInt) {
}

public actual fun glDeleteLists(list: UInt, range: Int) {
}

public actual fun glDeleteTextures(n: Int, textures: Long) {
}

public actual fun glDepthFunc(func: UInt) {
}

public actual fun glDepthMask(flag: UByte) {
}

public actual fun glDepthRange(znear: Double, zfar: Double) {
}

public actual fun glDisable(cap: UInt) {
}

public actual fun glDisableClientState(array: UInt) {
}

public actual fun glDrawArrays(mode: UInt, first: Int, count: Int) {
}

public actual fun glDrawBuffer(mode: UInt) {
}

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: Long) {
}

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
}

public actual fun glEdgeFlag(flag: UByte) {
}

public actual fun glEdgeFlagPointer(stride: Int, pointer: Long) {
}

public actual fun glEdgeFlagv(flag: Long) {
}

public actual fun glEnable(cap: UInt) {
}

public actual fun glEnableClientState(array: UInt) {
}

public actual fun glEnd() {
}

public actual fun glEndList() {
}

public actual fun glEvalCoord1d(u: Double) {
}

public actual fun glEvalCoord1dv(u: Long) {
}

public actual fun glEvalCoord1f(u: Float) {
}

public actual fun glEvalCoord1fv(u: Long) {
}

public actual fun glEvalCoord2d(u: Double, v: Double) {
}

public actual fun glEvalCoord2dv(u: Long) {
}

public actual fun glEvalCoord2f(u: Float, v: Float) {
}

public actual fun glEvalCoord2fv(u: Long) {
}

public actual fun glEvalMesh1(mode: UInt, i1: Int, i2: Int) {
}

public actual fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int) {
}

public actual fun glEvalPoint1(i: Int) {
}

public actual fun glEvalPoint2(i: Int, j: Int) {
}

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: Long) {
}

public actual fun glFinish() {
}

public actual fun glFlush() {
}

public actual fun glFogf(pname: UInt, param1: Float) {
}

public actual fun glFogfv(pname: UInt, params: Long) {
}

public actual fun glFogi(pname: UInt, param1: Int) {
}

public actual fun glFogiv(pname: UInt, params: Long) {
}

public actual fun glFrontFace(mode: UInt) {
}

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
}

public actual fun glGenLists(range: Int): UInt =
    0u

public actual fun glGenTextures(n: Int, textures: Long) {
}

public actual fun glGetBooleanv(pname: UInt, params: Long) {
}

public actual fun glGetClipPlane(plane: UInt, equation: Long) {
}

public actual fun glGetDoublev(pname: UInt, params: Long) {
}

public actual fun glGetError(): UInt =
    0u

public actual fun glGetFloatv(pname: UInt, params: Long) {
}

public actual fun glGetIntegerv(pname: UInt, params: Long) {
}

public actual fun glGetLightfv(light: UInt, pname: UInt, params: Long) {
}

public actual fun glGetLightiv(light: UInt, pname: UInt, params: Long) {
}

public actual fun glGetMapdv(target: UInt, query: UInt, v: Long) {
}

public actual fun glGetMapfv(target: UInt, query: UInt, v: Long) {
}

public actual fun glGetMapiv(target: UInt, query: UInt, v: Long) {
}

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: Long) {
}

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: Long) {
}

public actual fun glGetPixelMapfv(map: UInt, values: Long) {
}

public actual fun glGetPixelMapuiv(map: UInt, values: Long) {
}

public actual fun glGetPixelMapusv(map: UInt, values: Long) {
}

public actual fun glGetPointerv(pname: UInt, params: Long) {
}

public actual fun glGetPolygonStipple(mask: Long) {
}

public actual fun glGetString(name: UInt): Long =
    0L

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: Long) {
}

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: Long) {
}

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: Long) {
}

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: Long) {
}

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: Long) {
}

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: Long) {
}

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: Long) {
}

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: Long) {
}

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: Long) {
}

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: Long) {
}

public actual fun glHint(target: UInt, mode: UInt) {
}

public actual fun glIndexMask(mask: UInt) {
}

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: Long) {
}

public actual fun glIndexd(c: Double) {
}

public actual fun glIndexdv(c: Long) {
}

public actual fun glIndexf(c: Float) {
}

public actual fun glIndexfv(c: Long) {
}

public actual fun glIndexi(c: Int) {
}

public actual fun glIndexiv(c: Long) {
}

public actual fun glIndexs(c: Short) {
}

public actual fun glIndexsv(c: Long) {
}

public actual fun glIndexub(c: UByte) {
}

public actual fun glIndexubv(c: Long) {
}

public actual fun glInitNames() {
}

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: Long) {
}

public actual fun glIsEnabled(cap: UInt): UByte =
    0u

public actual fun glIsList(list: UInt): UByte =
    0u

public actual fun glIsTexture(texture: UInt): UByte =
    0u

public actual fun glLightModelf(pname: UInt, param1: Float) {
}

public actual fun glLightModelfv(pname: UInt, params: Long) {
}

public actual fun glLightModeli(pname: UInt, param1: Int) {
}

public actual fun glLightModeliv(pname: UInt, params: Long) {
}

public actual fun glLightf(light: UInt, pname: UInt, param2: Float) {
}

public actual fun glLightfv(light: UInt, pname: UInt, params: Long) {
}

public actual fun glLighti(light: UInt, pname: UInt, param2: Int) {
}

public actual fun glLightiv(light: UInt, pname: UInt, params: Long) {
}

public actual fun glLineStipple(factor: Int, pattern: UShort) {
}

public actual fun glLineWidth(width: Float) {
}

public actual fun glListBase(base: UInt) {
}

public actual fun glLoadIdentity() {
}

public actual fun glLoadMatrixd(m: Long) {
}

public actual fun glLoadMatrixf(m: Long) {
}

public actual fun glLoadName(name: UInt) {
}

public actual fun glLogicOp(opcode: UInt) {
}

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: Long) {
}

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: Long) {
}

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: Long) {
}

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: Long) {
}

public actual fun glMapGrid1d(un: Int, u1: Double, u2: Double) {
}

public actual fun glMapGrid1f(un: Int, u1: Float, u2: Float) {
}

public actual fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double) {
}

public actual fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float) {
}

public actual fun glMaterialf(face: UInt, pname: UInt, param2: Float) {
}

public actual fun glMaterialfv(face: UInt, pname: UInt, params: Long) {
}

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int) {
}

public actual fun glMaterialiv(face: UInt, pname: UInt, params: Long) {
}

public actual fun glMatrixMode(mode: UInt) {
}

public actual fun glMultMatrixd(m: Long) {
}

public actual fun glMultMatrixf(m: Long) {
}

public actual fun glNewList(list: UInt, mode: UInt) {
}

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
}

public actual fun glNormal3bv(v: Long) {
}

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double) {
}

public actual fun glNormal3dv(v: Long) {
}

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float) {
}

public actual fun glNormal3fv(v: Long) {
}

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int) {
}

public actual fun glNormal3iv(v: Long) {
}

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short) {
}

public actual fun glNormal3sv(v: Long) {
}

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: Long) {
}

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
}

public actual fun glPassThrough(token: Float) {
}

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: Long) {
}

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: Long) {
}

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: Long) {
}

public actual fun glPixelStoref(pname: UInt, param1: Float) {
}

public actual fun glPixelStorei(pname: UInt, param1: Int) {
}

public actual fun glPixelTransferf(pname: UInt, param1: Float) {
}

public actual fun glPixelTransferi(pname: UInt, param1: Int) {
}

public actual fun glPixelZoom(xfactor: Float, yfactor: Float) {
}

public actual fun glPointSize(size: Float) {
}

public actual fun glPolygonMode(face: UInt, mode: UInt) {
}

public actual fun glPolygonOffset(factor: Float, units: Float) {
}

public actual fun glPolygonStipple(mask: Long) {
}

public actual fun glPopAttrib() {
}

public actual fun glPopClientAttrib() {
}

public actual fun glPopMatrix() {
}

public actual fun glPopName() {
}

public actual fun glPrioritizeTextures(n: Int, textures: Long, priorities: Long) {
}

public actual fun glPushAttrib(mask: UInt) {
}

public actual fun glPushClientAttrib(mask: UInt) {
}

public actual fun glPushMatrix() {
}

public actual fun glPushName(name: UInt) {
}

public actual fun glRasterPos2d(x: Double, y: Double) {
}

public actual fun glRasterPos2dv(v: Long) {
}

public actual fun glRasterPos2f(x: Float, y: Float) {
}

public actual fun glRasterPos2fv(v: Long) {
}

public actual fun glRasterPos2i(x: Int, y: Int) {
}

public actual fun glRasterPos2iv(v: Long) {
}

public actual fun glRasterPos2s(x: Short, y: Short) {
}

public actual fun glRasterPos2sv(v: Long) {
}

public actual fun glRasterPos3d(x: Double, y: Double, z: Double) {
}

public actual fun glRasterPos3dv(v: Long) {
}

public actual fun glRasterPos3f(x: Float, y: Float, z: Float) {
}

public actual fun glRasterPos3fv(v: Long) {
}

public actual fun glRasterPos3i(x: Int, y: Int, z: Int) {
}

public actual fun glRasterPos3iv(v: Long) {
}

public actual fun glRasterPos3s(x: Short, y: Short, z: Short) {
}

public actual fun glRasterPos3sv(v: Long) {
}

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
}

public actual fun glRasterPos4dv(v: Long) {
}

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
}

public actual fun glRasterPos4fv(v: Long) {
}

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
}

public actual fun glRasterPos4iv(v: Long) {
}

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
}

public actual fun glRasterPos4sv(v: Long) {
}

public actual fun glReadBuffer(mode: UInt) {
}

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
}

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
}

public actual fun glRectdv(v1: Long, v2: Long) {
}

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
}

public actual fun glRectfv(v1: Long, v2: Long) {
}

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
}

public actual fun glRectiv(v1: Long, v2: Long) {
}

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
}

public actual fun glRectsv(v1: Long, v2: Long) {
}

public actual fun glRenderMode(mode: UInt): Int =
    0

public actual fun glRotated(angle: Double, x: Double, y: Double, z: Double) {
}

public actual fun glRotatef(angle: Float, x: Float, y: Float, z: Float) {
}

public actual fun glScaled(x: Double, y: Double, z: Double) {
}

public actual fun glScalef(x: Float, y: Float, z: Float) {
}

public actual fun glScissor(x: Int, y: Int, width: Int, height: Int) {
}

public actual fun glSelectBuffer(size: Int, buffer: Long) {
}

public actual fun glShadeModel(mode: UInt) {
}

public actual fun glStencilFunc(func: UInt, ref: Int, mask: UInt) {
}

public actual fun glStencilMask(mask: UInt) {
}

public actual fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt) {
}

public actual fun glTexCoord1d(s: Double) {
}

public actual fun glTexCoord1dv(v: Long) {
}

public actual fun glTexCoord1f(s: Float) {
}

public actual fun glTexCoord1fv(v: Long) {
}

public actual fun glTexCoord1i(s: Int) {
}

public actual fun glTexCoord1iv(v: Long) {
}

public actual fun glTexCoord1s(s: Short) {
}

public actual fun glTexCoord1sv(v: Long) {
}

public actual fun glTexCoord2d(s: Double, t: Double) {
}

public actual fun glTexCoord2dv(v: Long) {
}

public actual fun glTexCoord2f(s: Float, t: Float) {
}

public actual fun glTexCoord2fv(v: Long) {
}

public actual fun glTexCoord2i(s: Int, t: Int) {
}

public actual fun glTexCoord2iv(v: Long) {
}

public actual fun glTexCoord2s(s: Short, t: Short) {
}

public actual fun glTexCoord2sv(v: Long) {
}

public actual fun glTexCoord3d(s: Double, t: Double, r: Double) {
}

public actual fun glTexCoord3dv(v: Long) {
}

public actual fun glTexCoord3f(s: Float, t: Float, r: Float) {
}

public actual fun glTexCoord3fv(v: Long) {
}

public actual fun glTexCoord3i(s: Int, t: Int, r: Int) {
}

public actual fun glTexCoord3iv(v: Long) {
}

public actual fun glTexCoord3s(s: Short, t: Short, r: Short) {
}

public actual fun glTexCoord3sv(v: Long) {
}

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
}

public actual fun glTexCoord4dv(v: Long) {
}

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
}

public actual fun glTexCoord4fv(v: Long) {
}

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
}

public actual fun glTexCoord4iv(v: Long) {
}

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
}

public actual fun glTexCoord4sv(v: Long) {
}

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
}

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
}

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: Long) {
}

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
}

public actual fun glTexEnviv(target: UInt, pname: UInt, params: Long) {
}

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
}

public actual fun glTexGendv(coord: UInt, pname: UInt, params: Long) {
}

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
}

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: Long) {
}

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
}

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: Long) {
}

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: Long) {
}

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: Long) {
}

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
}

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: Long) {
}

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
}

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: Long) {
}

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: Long) {
}

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
}

public actual fun glTranslated(x: Double, y: Double, z: Double) {
}

public actual fun glTranslatef(x: Float, y: Float, z: Float) {
}

public actual fun glVertex2d(x: Double, y: Double) {
}

public actual fun glVertex2dv(v: Long) {
}

public actual fun glVertex2f(x: Float, y: Float) {
}

public actual fun glVertex2fv(v: Long) {
}

public actual fun glVertex2i(x: Int, y: Int) {
}

public actual fun glVertex2iv(v: Long) {
}

public actual fun glVertex2s(x: Short, y: Short) {
}

public actual fun glVertex2sv(v: Long) {
}

public actual fun glVertex3d(x: Double, y: Double, z: Double) {
}

public actual fun glVertex3dv(v: Long) {
}

public actual fun glVertex3f(x: Float, y: Float, z: Float) {
}

public actual fun glVertex3fv(v: Long) {
}

public actual fun glVertex3i(x: Int, y: Int, z: Int) {
}

public actual fun glVertex3iv(v: Long) {
}

public actual fun glVertex3s(x: Short, y: Short, z: Short) {
}

public actual fun glVertex3sv(v: Long) {
}

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
}

public actual fun glVertex4dv(v: Long) {
}

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
}

public actual fun glVertex4fv(v: Long) {
}

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
}

public actual fun glVertex4iv(v: Long) {
}

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
}

public actual fun glVertex4sv(v: Long) {
}

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
}

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int) {
}

public actual fun gluBeginCurve(nobj: Long) {
}

public actual fun gluBeginPolygon(tess: Long) {
}

public actual fun gluBeginSurface(nobj: Long) {
}

public actual fun gluBeginTrim(nobj: Long) {
}

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: Long): Int =
    0

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: Long): Int =
    0

public actual fun gluCylinder(qobj: Long, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
}

public actual fun gluDeleteNurbsRenderer(nobj: Long) {
}

public actual fun gluDeleteQuadric(state: Long) {
}

public actual fun gluDeleteTess(tess: Long) {
}

public actual fun gluDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
}

public actual fun gluEndCurve(nobj: Long) {
}

public actual fun gluEndPolygon(tess: Long) {
}

public actual fun gluEndSurface(nobj: Long) {
}

public actual fun gluEndTrim(nobj: Long) {
}

public actual fun gluErrorString(errcode: UInt): Long =
    0L

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): PCWSTR =
    0L

public actual fun gluGetNurbsProperty(nobj: Long, property: UInt, value: Long) {
}

public actual fun gluGetString(name: UInt): Long =
    0L

public actual fun gluGetTessProperty(tess: Long, which: UInt, value: Long) {
}

public actual fun gluLoadSamplingMatrices(nobj: Long, modelmatrix: Long, projmatrix: Long, viewport: Long) {
}

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
}

public actual fun gluNewNurbsRenderer(): Long =
    0L

public actual fun gluNewQuadric(): Long =
    0L

public actual fun gluNewTess(): Long =
    0L

public actual fun gluNextContour(tess: Long, type: UInt) {
}

public actual fun gluNurbsCallback(nobj: Long, which: UInt, fn: Long) {
}

public actual fun gluNurbsCurve(nobj: Long, nknots: Int, knot: Long, stride: Int, ctlarray: Long, order: Int, type: UInt) {
}

public actual fun gluNurbsProperty(nobj: Long, property: UInt, value: Float) {
}

public actual fun gluNurbsSurface(nobj: Long, sknot_count: Int, sknot: Long, tknot_count: Int, tknot: Long, s_stride: Int, t_stride: Int, ctlarray: Long, sorder: Int, torder: Int, type: UInt) {
}

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
}

public actual fun gluPartialDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
}

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
}

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: Long) {
}

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, winx: Long, winy: Long, winz: Long): Int =
    0

public actual fun gluPwlCurve(nobj: Long, count: Int, array: Long, stride: Int, type: UInt) {
}

public actual fun gluQuadricCallback(qobj: Long, which: UInt, fn: Long) {
}

public actual fun gluQuadricDrawStyle(quadobject: Long, drawstyle: UInt) {
}

public actual fun gluQuadricNormals(quadobject: Long, normals: UInt) {
}

public actual fun gluQuadricOrientation(quadobject: Long, orientation: UInt) {
}

public actual fun gluQuadricTexture(quadobject: Long, texturecoords: UByte) {
}

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: Long, widthout: Int, heightout: Int, typeout: UInt, dataout: Long): Int =
    0

public actual fun gluSphere(qobj: Long, radius: Double, slices: Int, stacks: Int) {
}

public actual fun gluTessBeginContour(tess: Long) {
}

public actual fun gluTessBeginPolygon(tess: Long, polygon_data: Long) {
}

public actual fun gluTessCallback(tess: Long, which: UInt, fn: Long) {
}

public actual fun gluTessEndContour(tess: Long) {
}

public actual fun gluTessEndPolygon(tess: Long) {
}

public actual fun gluTessNormal(tess: Long, x: Double, y: Double, z: Double) {
}

public actual fun gluTessProperty(tess: Long, which: UInt, value: Double) {
}

public actual fun gluTessVertex(tess: Long, coords: Long, data: Long) {
}

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, objx: Long, objy: Long, objz: Long): Int =
    0

public actual fun wglCopyContext(param0: HGLRC, param1: HGLRC, param2: UInt): BOOL =
    0

public actual fun wglCreateContext(param0: HDC): HGLRC =
    0L

public actual fun wglCreateLayerContext(param0: HDC, param1: Int): HGLRC =
    0L

public actual fun wglDeleteContext(param0: HGLRC): BOOL =
    0

public actual fun wglDescribeLayerPlane(param0: HDC, param1: Int, param2: Int, param3: UInt, param4: Long): BOOL =
    0

public actual fun wglGetCurrentContext(): HGLRC =
    0L

public actual fun wglGetCurrentDC(): HDC =
    0L

public actual fun wglGetLayerPaletteEntries(param0: HDC, param1: Int, param2: Int, param3: Int, param4: Long): Int =
    0

public actual fun wglGetProcAddress(param0: PCSTR): PROC =
    null

public actual fun wglMakeCurrent(param0: HDC, param1: HGLRC): BOOL =
    0

public actual fun wglRealizeLayerPalette(param0: HDC, param1: Int, param2: BOOL): BOOL =
    0

public actual fun wglSetLayerPaletteEntries(param0: HDC, param1: Int, param2: Int, param3: Int, param4: Long): Int =
    0

public actual fun wglShareLists(param0: HGLRC, param1: HGLRC): BOOL =
    0

public actual fun wglSwapLayerBuffers(param0: HDC, param1: UInt): BOOL =
    0

public actual fun wglUseFontBitmapsA(param0: HDC, param1: UInt, param2: UInt, param3: UInt): BOOL =
    0

public actual fun wglUseFontBitmapsW(param0: HDC, param1: UInt, param2: UInt, param3: UInt): BOOL =
    0

public actual fun wglUseFontOutlinesA(param0: HDC, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: Long): BOOL =
    0

public actual fun wglUseFontOutlinesW(param0: HDC, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: Long): BOOL =
    0
