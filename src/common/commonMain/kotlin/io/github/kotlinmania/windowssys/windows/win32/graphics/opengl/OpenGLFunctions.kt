package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Proc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile

public expect fun choosePixelFormat(hdc: Hdc, ppfd: COpaquePointer?): Int

public expect fun describePixelFormat(hdc: Hdc, ipixelformat: Int, nbytes: UInt, ppfd: COpaquePointer?): Int

public expect fun getEnhMetaFilePixelFormat(hemf: Henhmetafile, cbbuffer: UInt, ppfd: COpaquePointer?): UInt

public expect fun getPixelFormat(hdc: Hdc): Int

public expect fun setPixelFormat(hdc: Hdc, format: Int, ppfd: COpaquePointer?): Bool

public expect fun swapBuffers(param0: Hdc): Bool

public expect fun glAccum(op: UInt, value: Float)

public expect fun glAlphaFunc(func: UInt, ref: Float)

public expect fun glAreTexturesResident(n: Int, textures: COpaquePointer?, residences: COpaquePointer?): UByte

public expect fun glArrayElement(i: Int)

public expect fun glBegin(mode: UInt)

public expect fun glBindTexture(target: UInt, texture: UInt)

public expect fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: COpaquePointer?)

public expect fun glBlendFunc(sfactor: UInt, dfactor: UInt)

public expect fun glCallList(list: UInt)

public expect fun glCallLists(n: Int, type: UInt, lists: COpaquePointer?)

public expect fun glClear(mask: UInt)

public expect fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float)

public expect fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float)

public expect fun glClearDepth(depth: Double)

public expect fun glClearIndex(c: Float)

public expect fun glClearStencil(s: Int)

public expect fun glClipPlane(plane: UInt, equation: COpaquePointer?)

public expect fun glColor3b(red: Byte, green: Byte, blue: Byte)

public expect fun glColor3bv(v: COpaquePointer?)

public expect fun glColor3d(red: Double, green: Double, blue: Double)

public expect fun glColor3dv(v: COpaquePointer?)

public expect fun glColor3f(red: Float, green: Float, blue: Float)

public expect fun glColor3fv(v: COpaquePointer?)

public expect fun glColor3i(red: Int, green: Int, blue: Int)

public expect fun glColor3iv(v: COpaquePointer?)

public expect fun glColor3s(red: Short, green: Short, blue: Short)

public expect fun glColor3sv(v: COpaquePointer?)

public expect fun glColor3ub(red: UByte, green: UByte, blue: UByte)

public expect fun glColor3ubv(v: COpaquePointer?)

public expect fun glColor3ui(red: UInt, green: UInt, blue: UInt)

public expect fun glColor3uiv(v: COpaquePointer?)

public expect fun glColor3us(red: UShort, green: UShort, blue: UShort)

public expect fun glColor3usv(v: COpaquePointer?)

public expect fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte)

public expect fun glColor4bv(v: COpaquePointer?)

public expect fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double)

public expect fun glColor4dv(v: COpaquePointer?)

public expect fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float)

public expect fun glColor4fv(v: COpaquePointer?)

public expect fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int)

public expect fun glColor4iv(v: COpaquePointer?)

public expect fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short)

public expect fun glColor4sv(v: COpaquePointer?)

public expect fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte)

public expect fun glColor4ubv(v: COpaquePointer?)

public expect fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt)

public expect fun glColor4uiv(v: COpaquePointer?)

public expect fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort)

public expect fun glColor4usv(v: COpaquePointer?)

public expect fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte)

public expect fun glColorMaterial(face: UInt, mode: UInt)

public expect fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?)

public expect fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt)

public expect fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int)

public expect fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int)

public expect fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int)

public expect fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int)

public expect fun glCullFace(mode: UInt)

public expect fun glDeleteLists(list: UInt, range: Int)

public expect fun glDeleteTextures(n: Int, textures: COpaquePointer?)

public expect fun glDepthFunc(func: UInt)

public expect fun glDepthMask(flag: UByte)

public expect fun glDepthRange(znear: Double, zfar: Double)

public expect fun glDisable(cap: UInt)

public expect fun glDisableClientState(array: UInt)

public expect fun glDrawArrays(mode: UInt, first: Int, count: Int)

public expect fun glDrawBuffer(mode: UInt)

public expect fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: COpaquePointer?)

public expect fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?)

public expect fun glEdgeFlag(flag: UByte)

public expect fun glEdgeFlagPointer(stride: Int, pointer: COpaquePointer?)

public expect fun glEdgeFlagv(flag: COpaquePointer?)

public expect fun glEnable(cap: UInt)

public expect fun glEnableClientState(array: UInt)

public expect fun glEnd()

public expect fun glEndList()

public expect fun glEvalCoord1d(u: Double)

public expect fun glEvalCoord1dv(u: COpaquePointer?)

public expect fun glEvalCoord1f(u: Float)

public expect fun glEvalCoord1fv(u: COpaquePointer?)

public expect fun glEvalCoord2d(u: Double, v: Double)

public expect fun glEvalCoord2dv(u: COpaquePointer?)

public expect fun glEvalCoord2f(u: Float, v: Float)

public expect fun glEvalCoord2fv(u: COpaquePointer?)

public expect fun glEvalMesh1(mode: UInt, i1: Int, i2: Int)

public expect fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int)

public expect fun glEvalPoint1(i: Int)

public expect fun glEvalPoint2(i: Int, j: Int)

public expect fun glFeedbackBuffer(size: Int, type: UInt, buffer: COpaquePointer?)

public expect fun glFinish()

public expect fun glFlush()

public expect fun glFogf(pname: UInt, param1: Float)

public expect fun glFogfv(pname: UInt, params: COpaquePointer?)

public expect fun glFogi(pname: UInt, param1: Int)

public expect fun glFogiv(pname: UInt, params: COpaquePointer?)

public expect fun glFrontFace(mode: UInt)

public expect fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double)

public expect fun glGenLists(range: Int): UInt

public expect fun glGenTextures(n: Int, textures: COpaquePointer?)

public expect fun glGetBooleanv(pname: UInt, params: COpaquePointer?)

public expect fun glGetClipPlane(plane: UInt, equation: COpaquePointer?)

public expect fun glGetDoublev(pname: UInt, params: COpaquePointer?)

public expect fun glGetError(): UInt

public expect fun glGetFloatv(pname: UInt, params: COpaquePointer?)

public expect fun glGetIntegerv(pname: UInt, params: COpaquePointer?)

public expect fun glGetLightfv(light: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glGetLightiv(light: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glGetMapdv(target: UInt, query: UInt, v: COpaquePointer?)

public expect fun glGetMapfv(target: UInt, query: UInt, v: COpaquePointer?)

public expect fun glGetMapiv(target: UInt, query: UInt, v: COpaquePointer?)

public expect fun glGetMaterialfv(face: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glGetMaterialiv(face: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glGetPixelMapfv(map: UInt, values: COpaquePointer?)

public expect fun glGetPixelMapuiv(map: UInt, values: COpaquePointer?)

public expect fun glGetPixelMapusv(map: UInt, values: COpaquePointer?)

public expect fun glGetPointerv(pname: UInt, params: COpaquePointer?)

public expect fun glGetPolygonStipple(mask: COpaquePointer?)

public expect fun glGetString(name: UInt): COpaquePointer?

public expect fun glGetTexEnvfv(target: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glGetTexEnviv(target: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glGetTexGendv(coord: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glGetTexGenfv(coord: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glGetTexGeniv(coord: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: COpaquePointer?)

public expect fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: COpaquePointer?)

public expect fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: COpaquePointer?)

public expect fun glGetTexParameterfv(target: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glGetTexParameteriv(target: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glHint(target: UInt, mode: UInt)

public expect fun glIndexMask(mask: UInt)

public expect fun glIndexPointer(type: UInt, stride: Int, pointer: COpaquePointer?)

public expect fun glIndexd(c: Double)

public expect fun glIndexdv(c: COpaquePointer?)

public expect fun glIndexf(c: Float)

public expect fun glIndexfv(c: COpaquePointer?)

public expect fun glIndexi(c: Int)

public expect fun glIndexiv(c: COpaquePointer?)

public expect fun glIndexs(c: Short)

public expect fun glIndexsv(c: COpaquePointer?)

public expect fun glIndexub(c: UByte)

public expect fun glIndexubv(c: COpaquePointer?)

public expect fun glInitNames()

public expect fun glInterleavedArrays(format: UInt, stride: Int, pointer: COpaquePointer?)

public expect fun glIsEnabled(cap: UInt): UByte

public expect fun glIsList(list: UInt): UByte

public expect fun glIsTexture(texture: UInt): UByte

public expect fun glLightModelf(pname: UInt, param1: Float)

public expect fun glLightModelfv(pname: UInt, params: COpaquePointer?)

public expect fun glLightModeli(pname: UInt, param1: Int)

public expect fun glLightModeliv(pname: UInt, params: COpaquePointer?)

public expect fun glLightf(light: UInt, pname: UInt, param2: Float)

public expect fun glLightfv(light: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glLighti(light: UInt, pname: UInt, param2: Int)

public expect fun glLightiv(light: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glLineStipple(factor: Int, pattern: UShort)

public expect fun glLineWidth(width: Float)

public expect fun glListBase(base: UInt)

public expect fun glLoadIdentity()

public expect fun glLoadMatrixd(m: COpaquePointer?)

public expect fun glLoadMatrixf(m: COpaquePointer?)

public expect fun glLoadName(name: UInt)

public expect fun glLogicOp(opcode: UInt)

public expect fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: COpaquePointer?)

public expect fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: COpaquePointer?)

public expect fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: COpaquePointer?)

public expect fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: COpaquePointer?)

public expect fun glMapGrid1d(un: Int, u1: Double, u2: Double)

public expect fun glMapGrid1f(un: Int, u1: Float, u2: Float)

public expect fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double)

public expect fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float)

public expect fun glMaterialf(face: UInt, pname: UInt, param2: Float)

public expect fun glMaterialfv(face: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glMateriali(face: UInt, pname: UInt, param2: Int)

public expect fun glMaterialiv(face: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glMatrixMode(mode: UInt)

public expect fun glMultMatrixd(m: COpaquePointer?)

public expect fun glMultMatrixf(m: COpaquePointer?)

public expect fun glNewList(list: UInt, mode: UInt)

public expect fun glNormal3b(nx: Byte, ny: Byte, nz: Byte)

public expect fun glNormal3bv(v: COpaquePointer?)

public expect fun glNormal3d(nx: Double, ny: Double, nz: Double)

public expect fun glNormal3dv(v: COpaquePointer?)

public expect fun glNormal3f(nx: Float, ny: Float, nz: Float)

public expect fun glNormal3fv(v: COpaquePointer?)

public expect fun glNormal3i(nx: Int, ny: Int, nz: Int)

public expect fun glNormal3iv(v: COpaquePointer?)

public expect fun glNormal3s(nx: Short, ny: Short, nz: Short)

public expect fun glNormal3sv(v: COpaquePointer?)

public expect fun glNormalPointer(type: UInt, stride: Int, pointer: COpaquePointer?)

public expect fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double)

public expect fun glPassThrough(token: Float)

public expect fun glPixelMapfv(map: UInt, mapsize: Int, values: COpaquePointer?)

public expect fun glPixelMapuiv(map: UInt, mapsize: Int, values: COpaquePointer?)

public expect fun glPixelMapusv(map: UInt, mapsize: Int, values: COpaquePointer?)

public expect fun glPixelStoref(pname: UInt, param1: Float)

public expect fun glPixelStorei(pname: UInt, param1: Int)

public expect fun glPixelTransferf(pname: UInt, param1: Float)

public expect fun glPixelTransferi(pname: UInt, param1: Int)

public expect fun glPixelZoom(xfactor: Float, yfactor: Float)

public expect fun glPointSize(size: Float)

public expect fun glPolygonMode(face: UInt, mode: UInt)

public expect fun glPolygonOffset(factor: Float, units: Float)

public expect fun glPolygonStipple(mask: COpaquePointer?)

public expect fun glPopAttrib()

public expect fun glPopClientAttrib()

public expect fun glPopMatrix()

public expect fun glPopName()

public expect fun glPrioritizeTextures(n: Int, textures: COpaquePointer?, priorities: COpaquePointer?)

public expect fun glPushAttrib(mask: UInt)

public expect fun glPushClientAttrib(mask: UInt)

public expect fun glPushMatrix()

public expect fun glPushName(name: UInt)

public expect fun glRasterPos2d(x: Double, y: Double)

public expect fun glRasterPos2dv(v: COpaquePointer?)

public expect fun glRasterPos2f(x: Float, y: Float)

public expect fun glRasterPos2fv(v: COpaquePointer?)

public expect fun glRasterPos2i(x: Int, y: Int)

public expect fun glRasterPos2iv(v: COpaquePointer?)

public expect fun glRasterPos2s(x: Short, y: Short)

public expect fun glRasterPos2sv(v: COpaquePointer?)

public expect fun glRasterPos3d(x: Double, y: Double, z: Double)

public expect fun glRasterPos3dv(v: COpaquePointer?)

public expect fun glRasterPos3f(x: Float, y: Float, z: Float)

public expect fun glRasterPos3fv(v: COpaquePointer?)

public expect fun glRasterPos3i(x: Int, y: Int, z: Int)

public expect fun glRasterPos3iv(v: COpaquePointer?)

public expect fun glRasterPos3s(x: Short, y: Short, z: Short)

public expect fun glRasterPos3sv(v: COpaquePointer?)

public expect fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double)

public expect fun glRasterPos4dv(v: COpaquePointer?)

public expect fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float)

public expect fun glRasterPos4fv(v: COpaquePointer?)

public expect fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int)

public expect fun glRasterPos4iv(v: COpaquePointer?)

public expect fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short)

public expect fun glRasterPos4sv(v: COpaquePointer?)

public expect fun glReadBuffer(mode: UInt)

public expect fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?)

public expect fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double)

public expect fun glRectdv(v1: COpaquePointer?, v2: COpaquePointer?)

public expect fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float)

public expect fun glRectfv(v1: COpaquePointer?, v2: COpaquePointer?)

public expect fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int)

public expect fun glRectiv(v1: COpaquePointer?, v2: COpaquePointer?)

public expect fun glRects(x1: Short, y1: Short, x2: Short, y2: Short)

public expect fun glRectsv(v1: COpaquePointer?, v2: COpaquePointer?)

public expect fun glRenderMode(mode: UInt): Int

public expect fun glRotated(angle: Double, x: Double, y: Double, z: Double)

public expect fun glRotatef(angle: Float, x: Float, y: Float, z: Float)

public expect fun glScaled(x: Double, y: Double, z: Double)

public expect fun glScalef(x: Float, y: Float, z: Float)

public expect fun glScissor(x: Int, y: Int, width: Int, height: Int)

public expect fun glSelectBuffer(size: Int, buffer: COpaquePointer?)

public expect fun glShadeModel(mode: UInt)

public expect fun glStencilFunc(func: UInt, ref: Int, mask: UInt)

public expect fun glStencilMask(mask: UInt)

public expect fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt)

public expect fun glTexCoord1d(s: Double)

public expect fun glTexCoord1dv(v: COpaquePointer?)

public expect fun glTexCoord1f(s: Float)

public expect fun glTexCoord1fv(v: COpaquePointer?)

public expect fun glTexCoord1i(s: Int)

public expect fun glTexCoord1iv(v: COpaquePointer?)

public expect fun glTexCoord1s(s: Short)

public expect fun glTexCoord1sv(v: COpaquePointer?)

public expect fun glTexCoord2d(s: Double, t: Double)

public expect fun glTexCoord2dv(v: COpaquePointer?)

public expect fun glTexCoord2f(s: Float, t: Float)

public expect fun glTexCoord2fv(v: COpaquePointer?)

public expect fun glTexCoord2i(s: Int, t: Int)

public expect fun glTexCoord2iv(v: COpaquePointer?)

public expect fun glTexCoord2s(s: Short, t: Short)

public expect fun glTexCoord2sv(v: COpaquePointer?)

public expect fun glTexCoord3d(s: Double, t: Double, r: Double)

public expect fun glTexCoord3dv(v: COpaquePointer?)

public expect fun glTexCoord3f(s: Float, t: Float, r: Float)

public expect fun glTexCoord3fv(v: COpaquePointer?)

public expect fun glTexCoord3i(s: Int, t: Int, r: Int)

public expect fun glTexCoord3iv(v: COpaquePointer?)

public expect fun glTexCoord3s(s: Short, t: Short, r: Short)

public expect fun glTexCoord3sv(v: COpaquePointer?)

public expect fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double)

public expect fun glTexCoord4dv(v: COpaquePointer?)

public expect fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float)

public expect fun glTexCoord4fv(v: COpaquePointer?)

public expect fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int)

public expect fun glTexCoord4iv(v: COpaquePointer?)

public expect fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short)

public expect fun glTexCoord4sv(v: COpaquePointer?)

public expect fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?)

public expect fun glTexEnvf(target: UInt, pname: UInt, param2: Float)

public expect fun glTexEnvfv(target: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glTexEnvi(target: UInt, pname: UInt, param2: Int)

public expect fun glTexEnviv(target: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glTexGend(coord: UInt, pname: UInt, param2: Double)

public expect fun glTexGendv(coord: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glTexGenf(coord: UInt, pname: UInt, param2: Float)

public expect fun glTexGenfv(coord: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glTexGeni(coord: UInt, pname: UInt, param2: Int)

public expect fun glTexGeniv(coord: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: COpaquePointer?)

public expect fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: COpaquePointer?)

public expect fun glTexParameterf(target: UInt, pname: UInt, param2: Float)

public expect fun glTexParameterfv(target: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glTexParameteri(target: UInt, pname: UInt, param2: Int)

public expect fun glTexParameteriv(target: UInt, pname: UInt, params: COpaquePointer?)

public expect fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: COpaquePointer?)

public expect fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?)

public expect fun glTranslated(x: Double, y: Double, z: Double)

public expect fun glTranslatef(x: Float, y: Float, z: Float)

public expect fun glVertex2d(x: Double, y: Double)

public expect fun glVertex2dv(v: COpaquePointer?)

public expect fun glVertex2f(x: Float, y: Float)

public expect fun glVertex2fv(v: COpaquePointer?)

public expect fun glVertex2i(x: Int, y: Int)

public expect fun glVertex2iv(v: COpaquePointer?)

public expect fun glVertex2s(x: Short, y: Short)

public expect fun glVertex2sv(v: COpaquePointer?)

public expect fun glVertex3d(x: Double, y: Double, z: Double)

public expect fun glVertex3dv(v: COpaquePointer?)

public expect fun glVertex3f(x: Float, y: Float, z: Float)

public expect fun glVertex3fv(v: COpaquePointer?)

public expect fun glVertex3i(x: Int, y: Int, z: Int)

public expect fun glVertex3iv(v: COpaquePointer?)

public expect fun glVertex3s(x: Short, y: Short, z: Short)

public expect fun glVertex3sv(v: COpaquePointer?)

public expect fun glVertex4d(x: Double, y: Double, z: Double, w: Double)

public expect fun glVertex4dv(v: COpaquePointer?)

public expect fun glVertex4f(x: Float, y: Float, z: Float, w: Float)

public expect fun glVertex4fv(v: COpaquePointer?)

public expect fun glVertex4i(x: Int, y: Int, z: Int, w: Int)

public expect fun glVertex4iv(v: COpaquePointer?)

public expect fun glVertex4s(x: Short, y: Short, z: Short, w: Short)

public expect fun glVertex4sv(v: COpaquePointer?)

public expect fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?)

public expect fun glViewport(x: Int, y: Int, width: Int, height: Int)

public expect fun gluBeginCurve(nobj: COpaquePointer?)

public expect fun gluBeginPolygon(tess: COpaquePointer?)

public expect fun gluBeginSurface(nobj: COpaquePointer?)

public expect fun gluBeginTrim(nobj: COpaquePointer?)

public expect fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: COpaquePointer?): Int

public expect fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: COpaquePointer?): Int

public expect fun gluCylinder(qobj: COpaquePointer?, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int)

public expect fun gluDeleteNurbsRenderer(nobj: COpaquePointer?)

public expect fun gluDeleteQuadric(state: COpaquePointer?)

public expect fun gluDeleteTess(tess: COpaquePointer?)

public expect fun gluDisk(qobj: COpaquePointer?, innerradius: Double, outerradius: Double, slices: Int, loops: Int)

public expect fun gluEndCurve(nobj: COpaquePointer?)

public expect fun gluEndPolygon(tess: COpaquePointer?)

public expect fun gluEndSurface(nobj: COpaquePointer?)

public expect fun gluEndTrim(nobj: COpaquePointer?)

public expect fun gluErrorString(errcode: UInt): COpaquePointer?

public expect fun gluErrorUnicodeStringEXT(errcode: UInt): Pcwstr

public expect fun gluGetNurbsProperty(nobj: COpaquePointer?, property: UInt, value: COpaquePointer?)

public expect fun gluGetString(name: UInt): COpaquePointer?

public expect fun gluGetTessProperty(tess: COpaquePointer?, which: UInt, value: COpaquePointer?)

public expect fun gluLoadSamplingMatrices(nobj: COpaquePointer?, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?)

public expect fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double)

public expect fun gluNewNurbsRenderer(): COpaquePointer?

public expect fun gluNewQuadric(): COpaquePointer?

public expect fun gluNewTess(): COpaquePointer?

public expect fun gluNextContour(tess: COpaquePointer?, type: UInt)

public expect fun gluNurbsCallback(nobj: COpaquePointer?, which: UInt, fn: Long)

public expect fun gluNurbsCurve(nobj: COpaquePointer?, nknots: Int, knot: COpaquePointer?, stride: Int, ctlarray: COpaquePointer?, order: Int, type: UInt)

public expect fun gluNurbsProperty(nobj: COpaquePointer?, property: UInt, value: Float)

public expect fun gluNurbsSurface(nobj: COpaquePointer?, sknotCount: Int, sknot: COpaquePointer?, tknotCount: Int, tknot: COpaquePointer?, sStride: Int, tStride: Int, ctlarray: COpaquePointer?, sorder: Int, torder: Int, type: UInt)

public expect fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double)

public expect fun gluPartialDisk(qobj: COpaquePointer?, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double)

public expect fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double)

public expect fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: COpaquePointer?)

public expect fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?, winx: COpaquePointer?, winy: COpaquePointer?, winz: COpaquePointer?): Int

public expect fun gluPwlCurve(nobj: COpaquePointer?, count: Int, array: COpaquePointer?, stride: Int, type: UInt)

public expect fun gluQuadricCallback(qobj: COpaquePointer?, which: UInt, fn: Long)

public expect fun gluQuadricDrawStyle(quadobject: COpaquePointer?, drawstyle: UInt)

public expect fun gluQuadricNormals(quadobject: COpaquePointer?, normals: UInt)

public expect fun gluQuadricOrientation(quadobject: COpaquePointer?, orientation: UInt)

public expect fun gluQuadricTexture(quadobject: COpaquePointer?, texturecoords: UByte)

public expect fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: COpaquePointer?, widthout: Int, heightout: Int, typeout: UInt, dataout: COpaquePointer?): Int

public expect fun gluSphere(qobj: COpaquePointer?, radius: Double, slices: Int, stacks: Int)

public expect fun gluTessBeginContour(tess: COpaquePointer?)

public expect fun gluTessBeginPolygon(tess: COpaquePointer?, polygonData: COpaquePointer?)

public expect fun gluTessCallback(tess: COpaquePointer?, which: UInt, fn: Long)

public expect fun gluTessEndContour(tess: COpaquePointer?)

public expect fun gluTessEndPolygon(tess: COpaquePointer?)

public expect fun gluTessNormal(tess: COpaquePointer?, x: Double, y: Double, z: Double)

public expect fun gluTessProperty(tess: COpaquePointer?, which: UInt, value: Double)

public expect fun gluTessVertex(tess: COpaquePointer?, coords: COpaquePointer?, data: COpaquePointer?)

public expect fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?, objx: COpaquePointer?, objy: COpaquePointer?, objz: COpaquePointer?): Int

public expect fun wglCopyContext(param0: Hglrc, param1: Hglrc, param2: UInt): Bool

public expect fun wglCreateContext(param0: Hdc): Hglrc

public expect fun wglCreateLayerContext(param0: Hdc, param1: Int): Hglrc

public expect fun wglDeleteContext(param0: Hglrc): Bool

public expect fun wglDescribeLayerPlane(param0: Hdc, param1: Int, param2: Int, param3: UInt, param4: COpaquePointer?): Bool

public expect fun wglGetCurrentContext(): Hglrc

public expect fun wglGetCurrentDC(): Hdc

public expect fun wglGetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: COpaquePointer?): Int

public expect fun wglGetProcAddress(param0: Pcstr): Proc

public expect fun wglMakeCurrent(param0: Hdc, param1: Hglrc): Bool

public expect fun wglRealizeLayerPalette(param0: Hdc, param1: Int, param2: Bool): Bool

public expect fun wglSetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: COpaquePointer?): Int

public expect fun wglShareLists(param0: Hglrc, param1: Hglrc): Bool

public expect fun wglSwapLayerBuffers(param0: Hdc, param1: UInt): Bool

public expect fun wglUseFontBitmapsA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool

public expect fun wglUseFontBitmapsW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool

public expect fun wglUseFontOutlinesA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: COpaquePointer?): Bool

public expect fun wglUseFontOutlinesW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: COpaquePointer?): Bool
