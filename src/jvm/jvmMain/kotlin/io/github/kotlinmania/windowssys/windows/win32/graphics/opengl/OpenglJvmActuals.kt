@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Proc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile

private object WindowsWin32GraphicsOpenglJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32GraphicsOpenglJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglChoosePixelFormat(hdc: Long, ppfd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglDescribePixelFormat(hdc: Long, ipixelformat: Int, nbytes: Int, ppfd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGetEnhMetaFilePixelFormat(hemf: Long, cbbuffer: Int, ppfd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGetPixelFormat(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglSetPixelFormat(hdc: Long, format: Int, ppfd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglSwapBuffers(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlAccum(op: Int, value: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlAlphaFunc(func: Int, ref: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlAreTexturesResident(n: Int, textures: Long, residences: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlArrayElement(i: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlBegin(mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlBindTexture(target: Int, texture: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlBlendFunc(sfactor: Int, dfactor: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlCallList(list: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlCallLists(n: Int, type: Int, lists: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlClear(mask: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlClearAccum(red: Float, green: Float, blue: Float, alpha: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlClearColor(red: Float, green: Float, blue: Float, alpha: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlClearDepth(depth: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlClearIndex(c: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlClearStencil(s: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlClipPlane(plane: Int, equation: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3b(red: Byte, green: Byte, blue: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3bv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3d(red: Double, green: Double, blue: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3f(red: Float, green: Float, blue: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3i(red: Int, green: Int, blue: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3s(red: Short, green: Short, blue: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3ub(red: Byte, green: Byte, blue: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3ubv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3ui(red: Int, green: Int, blue: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3uiv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3us(red: Short, green: Short, blue: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor3usv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4bv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4d(red: Double, green: Double, blue: Double, alpha: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4f(red: Float, green: Float, blue: Float, alpha: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4i(red: Int, green: Int, blue: Int, alpha: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4s(red: Short, green: Short, blue: Short, alpha: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4ub(red: Byte, green: Byte, blue: Byte, alpha: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4ubv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4ui(red: Int, green: Int, blue: Int, alpha: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4uiv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4us(red: Short, green: Short, blue: Short, alpha: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColor4usv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColorMask(red: Byte, green: Byte, blue: Byte, alpha: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColorMaterial(face: Int, mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlColorPointer(size: Int, type: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlCopyPixels(x: Int, y: Int, width: Int, height: Int, type: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, border: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D(target: Int, level: Int, xoffset: Int, x: Int, y: Int, width: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlCullFace(mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDeleteLists(list: Int, range: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDeleteTextures(n: Int, textures: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDepthFunc(func: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDepthMask(flag: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDepthRange(znear: Double, zfar: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDisable(cap: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDisableClientState(array: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDrawArrays(mode: Int, first: Int, count: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDrawBuffer(mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDrawElements(mode: Int, count: Int, type: Int, indices: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlDrawPixels(width: Int, height: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEdgeFlag(flag: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEdgeFlagPointer(stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEdgeFlagv(flag: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEnable(cap: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEnableClientState(array: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEnd()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEndList()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalCoord1d(u: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalCoord1dv(u: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalCoord1f(u: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalCoord1fv(u: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalCoord2d(u: Double, v: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalCoord2dv(u: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalCoord2f(u: Float, v: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalCoord2fv(u: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalMesh1(mode: Int, i1: Int, i2: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalMesh2(mode: Int, i1: Int, i2: Int, j1: Int, j2: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalPoint1(i: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlEvalPoint2(i: Int, j: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlFeedbackBuffer(size: Int, type: Int, buffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlFinish()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlFlush()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlFogf(pname: Int, param1: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlFogfv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlFogi(pname: Int, param1: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlFogiv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlFrontFace(mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGenLists(range: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGenTextures(n: Int, textures: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetBooleanv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetClipPlane(plane: Int, equation: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetDoublev(pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetError(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetFloatv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetIntegerv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetLightfv(light: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetLightiv(light: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetMapdv(target: Int, query: Int, v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetMapfv(target: Int, query: Int, v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetMapiv(target: Int, query: Int, v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetMaterialfv(face: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetMaterialiv(face: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetPixelMapfv(map: Int, values: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetPixelMapuiv(map: Int, values: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetPixelMapusv(map: Int, values: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetPointerv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetPolygonStipple(mask: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetString(name: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetTexEnvfv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetTexEnviv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetTexGendv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetTexGenfv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetTexGeniv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetTexImage(target: Int, level: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameterfv(target: Int, level: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameteriv(target: Int, level: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetTexParameterfv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlGetTexParameteriv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlHint(target: Int, mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexMask(mask: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexPointer(type: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexd(c: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexdv(c: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexf(c: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexfv(c: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexi(c: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexiv(c: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexs(c: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexsv(c: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexub(c: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIndexubv(c: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlInitNames()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlInterleavedArrays(format: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIsEnabled(cap: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIsList(list: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlIsTexture(texture: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLightModelf(pname: Int, param1: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLightModelfv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLightModeli(pname: Int, param1: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLightModeliv(pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLightf(light: Int, pname: Int, param2: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLightfv(light: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLighti(light: Int, pname: Int, param2: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLightiv(light: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLineStipple(factor: Int, pattern: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLineWidth(width: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlListBase(base: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLoadIdentity()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLoadMatrixd(m: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLoadMatrixf(m: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLoadName(name: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlLogicOp(opcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMap1d(target: Int, u1: Double, u2: Double, stride: Int, order: Int, points: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMap1f(target: Int, u1: Float, u2: Float, stride: Int, order: Int, points: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMap2d(target: Int, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMap2f(target: Int, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMapGrid1d(un: Int, u1: Double, u2: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMapGrid1f(un: Int, u1: Float, u2: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMaterialf(face: Int, pname: Int, param2: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMaterialfv(face: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMateriali(face: Int, pname: Int, param2: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMaterialiv(face: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMatrixMode(mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMultMatrixd(m: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlMultMatrixf(m: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNewList(list: Int, mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormal3b(nx: Byte, ny: Byte, nz: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormal3bv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormal3d(nx: Double, ny: Double, nz: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormal3dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormal3f(nx: Float, ny: Float, nz: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormal3fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormal3i(nx: Int, ny: Int, nz: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormal3iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormal3s(nx: Short, ny: Short, nz: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormal3sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlNormalPointer(type: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPassThrough(token: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPixelMapfv(map: Int, mapsize: Int, values: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPixelMapuiv(map: Int, mapsize: Int, values: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPixelMapusv(map: Int, mapsize: Int, values: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPixelStoref(pname: Int, param1: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPixelStorei(pname: Int, param1: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPixelTransferf(pname: Int, param1: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPixelTransferi(pname: Int, param1: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPixelZoom(xfactor: Float, yfactor: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPointSize(size: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPolygonMode(face: Int, mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPolygonOffset(factor: Float, units: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPolygonStipple(mask: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPopAttrib()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPopClientAttrib()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPopMatrix()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPopName()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPrioritizeTextures(n: Int, textures: Long, priorities: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPushAttrib(mask: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPushClientAttrib(mask: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPushMatrix()

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlPushName(name: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos2d(x: Double, y: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos2dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos2f(x: Float, y: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos2fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos2i(x: Int, y: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos2iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos2s(x: Short, y: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos2sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos3d(x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos3dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos3f(x: Float, y: Float, z: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos3fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos3i(x: Int, y: Int, z: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos3iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos3s(x: Short, y: Short, z: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos3sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos4d(x: Double, y: Double, z: Double, w: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos4dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos4f(x: Float, y: Float, z: Float, w: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos4fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos4i(x: Int, y: Int, z: Int, w: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos4iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos4s(x: Short, y: Short, z: Short, w: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRasterPos4sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlReadBuffer(mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlReadPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRectd(x1: Double, y1: Double, x2: Double, y2: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRectdv(v1: Long, v2: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRectf(x1: Float, y1: Float, x2: Float, y2: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRectfv(v1: Long, v2: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRecti(x1: Int, y1: Int, x2: Int, y2: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRectiv(v1: Long, v2: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRects(x1: Short, y1: Short, x2: Short, y2: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRectsv(v1: Long, v2: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRenderMode(mode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRotated(angle: Double, x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlRotatef(angle: Float, x: Float, y: Float, z: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlScaled(x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlScalef(x: Float, y: Float, z: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlScissor(x: Int, y: Int, width: Int, height: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlSelectBuffer(size: Int, buffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlShadeModel(mode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlStencilFunc(func: Int, ref: Int, mask: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlStencilMask(mask: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlStencilOp(fail: Int, zfail: Int, zpass: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord1d(s: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord1dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord1f(s: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord1fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord1i(s: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord1iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord1s(s: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord1sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord2d(s: Double, t: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord2dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord2f(s: Float, t: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord2fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord2i(s: Int, t: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord2iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord2s(s: Short, t: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord2sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord3d(s: Double, t: Double, r: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord3dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord3f(s: Float, t: Float, r: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord3fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord3i(s: Int, t: Int, r: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord3iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord3s(s: Short, t: Short, r: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord3sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord4d(s: Double, t: Double, r: Double, q: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord4dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord4f(s: Float, t: Float, r: Float, q: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord4fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord4i(s: Int, t: Int, r: Int, q: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord4iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord4s(s: Short, t: Short, r: Short, q: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoord4sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexCoordPointer(size: Int, type: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexEnvf(target: Int, pname: Int, param2: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexEnvfv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexEnvi(target: Int, pname: Int, param2: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexEnviv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexGend(coord: Int, pname: Int, param2: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexGendv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexGenf(coord: Int, pname: Int, param2: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexGenfv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexGeni(coord: Int, pname: Int, param2: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexGeniv(coord: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexImage1D(target: Int, level: Int, internalformat: Int, width: Int, border: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexParameterf(target: Int, pname: Int, param2: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexParameterfv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexParameteri(target: Int, pname: Int, param2: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexParameteriv(target: Int, pname: Int, params: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexSubImage1D(target: Int, level: Int, xoffset: Int, width: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTranslated(x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlTranslatef(x: Float, y: Float, z: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex2d(x: Double, y: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex2dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex2f(x: Float, y: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex2fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex2i(x: Int, y: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex2iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex2s(x: Short, y: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex2sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex3d(x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex3dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex3f(x: Float, y: Float, z: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex3fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex3i(x: Int, y: Int, z: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex3iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex3s(x: Short, y: Short, z: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex3sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex4d(x: Double, y: Double, z: Double, w: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex4dv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex4f(x: Float, y: Float, z: Float, w: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex4fv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex4i(x: Int, y: Int, z: Int, w: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex4iv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex4s(x: Short, y: Short, z: Short, w: Short)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertex4sv(v: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlVertexPointer(size: Int, type: Int, stride: Int, pointer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGlViewport(x: Int, y: Int, width: Int, height: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluBeginCurve(nobj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluBeginPolygon(tess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluBeginSurface(nobj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluBeginTrim(nobj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluBuild1DMipmaps(target: Int, components: Int, width: Int, format: Int, type: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluBuild2DMipmaps(target: Int, components: Int, width: Int, height: Int, format: Int, type: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluCylinder(qobj: Long, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluDeleteNurbsRenderer(nobj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluDeleteQuadric(state: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluDeleteTess(tess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluEndCurve(nobj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluEndPolygon(tess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluEndSurface(nobj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluEndTrim(nobj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluErrorString(errcode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluErrorUnicodeStringEXT(errcode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluGetNurbsProperty(nobj: Long, property: Int, value: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluGetString(name: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluGetTessProperty(tess: Long, which: Int, value: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluLoadSamplingMatrices(nobj: Long, modelmatrix: Long, projmatrix: Long, viewport: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluNewNurbsRenderer(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluNewQuadric(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluNewTess(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluNextContour(tess: Long, type: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluNurbsCallback(nobj: Long, which: Int, fn: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluNurbsCurve(nobj: Long, nknots: Int, knot: Long, stride: Int, ctlarray: Long, order: Int, type: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluNurbsProperty(nobj: Long, property: Int, value: Float)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluNurbsSurface(nobj: Long, sknotCount: Int, sknot: Long, tknotCount: Int, tknot: Long, sStride: Int, tStride: Int, ctlarray: Long, sorder: Int, torder: Int, type: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluOrtho2D(left: Double, right: Double, bottom: Double, top: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluPartialDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluProject(objx: Double, objy: Double, objz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, winx: Long, winy: Long, winz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluPwlCurve(nobj: Long, count: Int, array: Long, stride: Int, type: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluQuadricCallback(qobj: Long, which: Int, fn: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluQuadricDrawStyle(quadobject: Long, drawstyle: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluQuadricNormals(quadobject: Long, normals: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluQuadricOrientation(quadobject: Long, orientation: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluQuadricTexture(quadobject: Long, texturecoords: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluScaleImage(format: Int, widthin: Int, heightin: Int, typein: Int, datain: Long, widthout: Int, heightout: Int, typeout: Int, dataout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluSphere(qobj: Long, radius: Double, slices: Int, stacks: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluTessBeginContour(tess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluTessBeginPolygon(tess: Long, polygonData: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluTessCallback(tess: Long, which: Int, fn: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluTessEndContour(tess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluTessEndPolygon(tess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluTessNormal(tess: Long, x: Double, y: Double, z: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluTessProperty(tess: Long, which: Int, value: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluTessVertex(tess: Long, coords: Long, data: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglGluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, objx: Long, objy: Long, objz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglCopyContext(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglCreateContext(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglCreateLayerContext(param0: Long, param1: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglDeleteContext(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglDescribeLayerPlane(param0: Long, param1: Int, param2: Int, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglGetCurrentContext(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglGetCurrentDC(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglGetLayerPaletteEntries(param0: Long, param1: Int, param2: Int, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglGetProcAddress(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglMakeCurrent(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglRealizeLayerPalette(param0: Long, param1: Int, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglSetLayerPaletteEntries(param0: Long, param1: Int, param2: Int, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglShareLists(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglSwapLayerBuffers(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsA(param0: Long, param1: Int, param2: Int, param3: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsW(param0: Long, param1: Int, param2: Int, param3: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesA(param0: Long, param1: Int, param2: Int, param3: Int, param4: Float, param5: Float, param6: Int, param7: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesW(param0: Long, param1: Int, param2: Int, param3: Int, param4: Float, param5: Float, param6: Int, param7: Long): Int
}

public actual fun choosePixelFormat(hdc: Hdc, ppfd: ConstPtr<Pixelformatdescriptor>): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglChoosePixelFormat(hdc.rawAddress, ppfd.rawAddress)

public actual fun describePixelFormat(hdc: Hdc, ipixelformat: Int, nbytes: UInt, ppfd: MutPtr<Pixelformatdescriptor>): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglDescribePixelFormat(hdc.rawAddress, ipixelformat, nbytes.toInt(), ppfd.rawAddress)

public actual fun getEnhMetaFilePixelFormat(hemf: Henhmetafile, cbbuffer: UInt, ppfd: MutPtr<Pixelformatdescriptor>): UInt =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGetEnhMetaFilePixelFormat(hemf.rawAddress, cbbuffer.toInt(), ppfd.rawAddress).toUInt()

public actual fun getPixelFormat(hdc: Hdc): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGetPixelFormat(hdc.rawAddress)

public actual fun setPixelFormat(hdc: Hdc, format: Int, ppfd: ConstPtr<Pixelformatdescriptor>): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglSetPixelFormat(hdc.rawAddress, format, ppfd.rawAddress)

public actual fun swapBuffers(param0: Hdc): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglSwapBuffers(param0.rawAddress)

public actual fun glAccum(op: UInt, value: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlAccum(op.toInt(), value)
}

public actual fun glAlphaFunc(func: UInt, ref: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlAlphaFunc(func.toInt(), ref)
}

public actual fun glAreTexturesResident(n: Int, textures: ConstPtr<UInt>, residences: MutPtr<UByte>): UByte =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlAreTexturesResident(n, textures.rawAddress, residences.rawAddress).toUByte()

public actual fun glArrayElement(i: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlArrayElement(i)
}

public actual fun glBegin(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlBegin(mode.toInt())
}

public actual fun glBindTexture(target: UInt, texture: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlBindTexture(target.toInt(), texture.toInt())
}

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: ConstPtr<UByte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlBitmap(width, height, xorig, yorig, xmove, ymove, bitmap.rawAddress)
}

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlBlendFunc(sfactor.toInt(), dfactor.toInt())
}

public actual fun glCallList(list: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlCallList(list.toInt())
}

public actual fun glCallLists(n: Int, type: UInt, lists: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlCallLists(n, type.toInt(), lists.rawAddress)
}

public actual fun glClear(mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlClear(mask.toInt())
}

public actual fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlClearAccum(red, green, blue, alpha)
}

public actual fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlClearColor(red, green, blue, alpha)
}

public actual fun glClearDepth(depth: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlClearDepth(depth)
}

public actual fun glClearIndex(c: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlClearIndex(c)
}

public actual fun glClearStencil(s: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlClearStencil(s)
}

public actual fun glClipPlane(plane: UInt, equation: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlClipPlane(plane.toInt(), equation.rawAddress)
}

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3b(red, green, blue)
}

public actual fun glColor3bv(v: ConstPtr<Byte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3bv(v.rawAddress)
}

public actual fun glColor3d(red: Double, green: Double, blue: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3d(red, green, blue)
}

public actual fun glColor3dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3dv(v.rawAddress)
}

public actual fun glColor3f(red: Float, green: Float, blue: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3f(red, green, blue)
}

public actual fun glColor3fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3fv(v.rawAddress)
}

public actual fun glColor3i(red: Int, green: Int, blue: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3i(red, green, blue)
}

public actual fun glColor3iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3iv(v.rawAddress)
}

public actual fun glColor3s(red: Short, green: Short, blue: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3s(red, green, blue)
}

public actual fun glColor3sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3sv(v.rawAddress)
}

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3ub(red.toByte(), green.toByte(), blue.toByte())
}

public actual fun glColor3ubv(v: ConstPtr<UByte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3ubv(v.rawAddress)
}

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3ui(red.toInt(), green.toInt(), blue.toInt())
}

public actual fun glColor3uiv(v: ConstPtr<UInt>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3uiv(v.rawAddress)
}

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3us(red.toShort(), green.toShort(), blue.toShort())
}

public actual fun glColor3usv(v: ConstPtr<UShort>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor3usv(v.rawAddress)
}

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4b(red, green, blue, alpha)
}

public actual fun glColor4bv(v: ConstPtr<Byte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4bv(v.rawAddress)
}

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4d(red, green, blue, alpha)
}

public actual fun glColor4dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4dv(v.rawAddress)
}

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4f(red, green, blue, alpha)
}

public actual fun glColor4fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4fv(v.rawAddress)
}

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4i(red, green, blue, alpha)
}

public actual fun glColor4iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4iv(v.rawAddress)
}

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4s(red, green, blue, alpha)
}

public actual fun glColor4sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4sv(v.rawAddress)
}

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4ub(red.toByte(), green.toByte(), blue.toByte(), alpha.toByte())
}

public actual fun glColor4ubv(v: ConstPtr<UByte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4ubv(v.rawAddress)
}

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4ui(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
}

public actual fun glColor4uiv(v: ConstPtr<UInt>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4uiv(v.rawAddress)
}

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4us(red.toShort(), green.toShort(), blue.toShort(), alpha.toShort())
}

public actual fun glColor4usv(v: ConstPtr<UShort>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColor4usv(v.rawAddress)
}

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColorMask(red.toByte(), green.toByte(), blue.toByte(), alpha.toByte())
}

public actual fun glColorMaterial(face: UInt, mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColorMaterial(face.toInt(), mode.toInt())
}

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlColorPointer(size, type.toInt(), stride, pointer.rawAddress)
}

public actual fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlCopyPixels(x, y, width, height, type.toInt())
}

public actual fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D(target.toInt(), level, internalformat.toInt(), x, y, width, border)
}

public actual fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D(target.toInt(), level, internalformat.toInt(), x, y, width, height, border)
}

public actual fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D(target.toInt(), level, xoffset, x, y, width)
}

public actual fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D(target.toInt(), level, xoffset, yoffset, x, y, width, height)
}

public actual fun glCullFace(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlCullFace(mode.toInt())
}

public actual fun glDeleteLists(list: UInt, range: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDeleteLists(list.toInt(), range)
}

public actual fun glDeleteTextures(n: Int, textures: ConstPtr<UInt>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDeleteTextures(n, textures.rawAddress)
}

public actual fun glDepthFunc(func: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDepthFunc(func.toInt())
}

public actual fun glDepthMask(flag: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDepthMask(flag.toByte())
}

public actual fun glDepthRange(znear: Double, zfar: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDepthRange(znear, zfar)
}

public actual fun glDisable(cap: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDisable(cap.toInt())
}

public actual fun glDisableClientState(array: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDisableClientState(array.toInt())
}

public actual fun glDrawArrays(mode: UInt, first: Int, count: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDrawArrays(mode.toInt(), first, count)
}

public actual fun glDrawBuffer(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDrawBuffer(mode.toInt())
}

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDrawElements(mode.toInt(), count, type.toInt(), indices.rawAddress)
}

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlDrawPixels(width, height, format.toInt(), type.toInt(), pixels.rawAddress)
}

public actual fun glEdgeFlag(flag: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEdgeFlag(flag.toByte())
}

public actual fun glEdgeFlagPointer(stride: Int, pointer: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEdgeFlagPointer(stride, pointer.rawAddress)
}

public actual fun glEdgeFlagv(flag: ConstPtr<UByte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEdgeFlagv(flag.rawAddress)
}

public actual fun glEnable(cap: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEnable(cap.toInt())
}

public actual fun glEnableClientState(array: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEnableClientState(array.toInt())
}

public actual fun glEnd() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEnd()
}

public actual fun glEndList() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEndList()
}

public actual fun glEvalCoord1d(u: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1d(u)
}

public actual fun glEvalCoord1dv(u: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1dv(u.rawAddress)
}

public actual fun glEvalCoord1f(u: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1f(u)
}

public actual fun glEvalCoord1fv(u: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1fv(u.rawAddress)
}

public actual fun glEvalCoord2d(u: Double, v: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2d(u, v)
}

public actual fun glEvalCoord2dv(u: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2dv(u.rawAddress)
}

public actual fun glEvalCoord2f(u: Float, v: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2f(u, v)
}

public actual fun glEvalCoord2fv(u: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2fv(u.rawAddress)
}

public actual fun glEvalMesh1(mode: UInt, i1: Int, i2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalMesh1(mode.toInt(), i1, i2)
}

public actual fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalMesh2(mode.toInt(), i1, i2, j1, j2)
}

public actual fun glEvalPoint1(i: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalPoint1(i)
}

public actual fun glEvalPoint2(i: Int, j: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlEvalPoint2(i, j)
}

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlFeedbackBuffer(size, type.toInt(), buffer.rawAddress)
}

public actual fun glFinish() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlFinish()
}

public actual fun glFlush() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlFlush()
}

public actual fun glFogf(pname: UInt, param1: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlFogf(pname.toInt(), param1)
}

public actual fun glFogfv(pname: UInt, params: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlFogfv(pname.toInt(), params.rawAddress)
}

public actual fun glFogi(pname: UInt, param1: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlFogi(pname.toInt(), param1)
}

public actual fun glFogiv(pname: UInt, params: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlFogiv(pname.toInt(), params.rawAddress)
}

public actual fun glFrontFace(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlFrontFace(mode.toInt())
}

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlFrustum(left, right, bottom, top, znear, zfar)
}

public actual fun glGenLists(range: Int): UInt =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGenLists(range).toUInt()

public actual fun glGenTextures(n: Int, textures: MutPtr<UInt>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGenTextures(n, textures.rawAddress)
}

public actual fun glGetBooleanv(pname: UInt, params: MutPtr<UByte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetBooleanv(pname.toInt(), params.rawAddress)
}

public actual fun glGetClipPlane(plane: UInt, equation: MutPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetClipPlane(plane.toInt(), equation.rawAddress)
}

public actual fun glGetDoublev(pname: UInt, params: MutPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetDoublev(pname.toInt(), params.rawAddress)
}

public actual fun glGetError(): UInt =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetError().toUInt()

public actual fun glGetFloatv(pname: UInt, params: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetFloatv(pname.toInt(), params.rawAddress)
}

public actual fun glGetIntegerv(pname: UInt, params: MutPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetIntegerv(pname.toInt(), params.rawAddress)
}

public actual fun glGetLightfv(light: UInt, pname: UInt, params: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetLightfv(light.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glGetLightiv(light: UInt, pname: UInt, params: MutPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetLightiv(light.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glGetMapdv(target: UInt, query: UInt, v: MutPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetMapdv(target.toInt(), query.toInt(), v.rawAddress)
}

public actual fun glGetMapfv(target: UInt, query: UInt, v: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetMapfv(target.toInt(), query.toInt(), v.rawAddress)
}

public actual fun glGetMapiv(target: UInt, query: UInt, v: MutPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetMapiv(target.toInt(), query.toInt(), v.rawAddress)
}

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetMaterialfv(face.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: MutPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetMaterialiv(face.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glGetPixelMapfv(map: UInt, values: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetPixelMapfv(map.toInt(), values.rawAddress)
}

public actual fun glGetPixelMapuiv(map: UInt, values: MutPtr<UInt>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetPixelMapuiv(map.toInt(), values.rawAddress)
}

public actual fun glGetPixelMapusv(map: UInt, values: MutPtr<UShort>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetPixelMapusv(map.toInt(), values.rawAddress)
}

public actual fun glGetPointerv(pname: UInt, params: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetPointerv(pname.toInt(), params.rawAddress)
}

public actual fun glGetPolygonStipple(mask: MutPtr<UByte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetPolygonStipple(mask.rawAddress)
}

public actual fun glGetString(name: UInt): MutPtr<UByte> =
    MutPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetString(name.toInt()))

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetTexEnvfv(target.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: MutPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetTexEnviv(target.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: MutPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetTexGendv(coord.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetTexGenfv(coord.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: MutPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetTexGeniv(coord.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: MutPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetTexImage(target.toInt(), level, format.toInt(), type.toInt(), pixels.rawAddress)
}

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameterfv(target.toInt(), level, pname.toInt(), params.rawAddress)
}

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: MutPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameteriv(target.toInt(), level, pname.toInt(), params.rawAddress)
}

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetTexParameterfv(target.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: MutPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlGetTexParameteriv(target.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glHint(target: UInt, mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlHint(target.toInt(), mode.toInt())
}

public actual fun glIndexMask(mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexMask(mask.toInt())
}

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexPointer(type.toInt(), stride, pointer.rawAddress)
}

public actual fun glIndexd(c: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexd(c)
}

public actual fun glIndexdv(c: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexdv(c.rawAddress)
}

public actual fun glIndexf(c: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexf(c)
}

public actual fun glIndexfv(c: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexfv(c.rawAddress)
}

public actual fun glIndexi(c: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexi(c)
}

public actual fun glIndexiv(c: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexiv(c.rawAddress)
}

public actual fun glIndexs(c: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexs(c)
}

public actual fun glIndexsv(c: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexsv(c.rawAddress)
}

public actual fun glIndexub(c: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexub(c.toByte())
}

public actual fun glIndexubv(c: ConstPtr<UByte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIndexubv(c.rawAddress)
}

public actual fun glInitNames() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlInitNames()
}

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlInterleavedArrays(format.toInt(), stride, pointer.rawAddress)
}

public actual fun glIsEnabled(cap: UInt): UByte =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIsEnabled(cap.toInt()).toUByte()

public actual fun glIsList(list: UInt): UByte =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIsList(list.toInt()).toUByte()

public actual fun glIsTexture(texture: UInt): UByte =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlIsTexture(texture.toInt()).toUByte()

public actual fun glLightModelf(pname: UInt, param1: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLightModelf(pname.toInt(), param1)
}

public actual fun glLightModelfv(pname: UInt, params: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLightModelfv(pname.toInt(), params.rawAddress)
}

public actual fun glLightModeli(pname: UInt, param1: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLightModeli(pname.toInt(), param1)
}

public actual fun glLightModeliv(pname: UInt, params: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLightModeliv(pname.toInt(), params.rawAddress)
}

public actual fun glLightf(light: UInt, pname: UInt, param2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLightf(light.toInt(), pname.toInt(), param2)
}

public actual fun glLightfv(light: UInt, pname: UInt, params: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLightfv(light.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glLighti(light: UInt, pname: UInt, param2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLighti(light.toInt(), pname.toInt(), param2)
}

public actual fun glLightiv(light: UInt, pname: UInt, params: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLightiv(light.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glLineStipple(factor: Int, pattern: UShort) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLineStipple(factor, pattern.toShort())
}

public actual fun glLineWidth(width: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLineWidth(width)
}

public actual fun glListBase(base: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlListBase(base.toInt())
}

public actual fun glLoadIdentity() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLoadIdentity()
}

public actual fun glLoadMatrixd(m: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLoadMatrixd(m.rawAddress)
}

public actual fun glLoadMatrixf(m: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLoadMatrixf(m.rawAddress)
}

public actual fun glLoadName(name: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLoadName(name.toInt())
}

public actual fun glLogicOp(opcode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlLogicOp(opcode.toInt())
}

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMap1d(target.toInt(), u1, u2, stride, order, points.rawAddress)
}

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMap1f(target.toInt(), u1, u2, stride, order, points.rawAddress)
}

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMap2d(target.toInt(), u1, u2, ustride, uorder, v1, v2, vstride, vorder, points.rawAddress)
}

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMap2f(target.toInt(), u1, u2, ustride, uorder, v1, v2, vstride, vorder, points.rawAddress)
}

public actual fun glMapGrid1d(un: Int, u1: Double, u2: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMapGrid1d(un, u1, u2)
}

public actual fun glMapGrid1f(un: Int, u1: Float, u2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMapGrid1f(un, u1, u2)
}

public actual fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMapGrid2d(un, u1, u2, vn, v1, v2)
}

public actual fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMapGrid2f(un, u1, u2, vn, v1, v2)
}

public actual fun glMaterialf(face: UInt, pname: UInt, param2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMaterialf(face.toInt(), pname.toInt(), param2)
}

public actual fun glMaterialfv(face: UInt, pname: UInt, params: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMaterialfv(face.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMateriali(face.toInt(), pname.toInt(), param2)
}

public actual fun glMaterialiv(face: UInt, pname: UInt, params: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMaterialiv(face.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glMatrixMode(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMatrixMode(mode.toInt())
}

public actual fun glMultMatrixd(m: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMultMatrixd(m.rawAddress)
}

public actual fun glMultMatrixf(m: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlMultMatrixf(m.rawAddress)
}

public actual fun glNewList(list: UInt, mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNewList(list.toInt(), mode.toInt())
}

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormal3b(nx, ny, nz)
}

public actual fun glNormal3bv(v: ConstPtr<Byte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormal3bv(v.rawAddress)
}

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormal3d(nx, ny, nz)
}

public actual fun glNormal3dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormal3dv(v.rawAddress)
}

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormal3f(nx, ny, nz)
}

public actual fun glNormal3fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormal3fv(v.rawAddress)
}

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormal3i(nx, ny, nz)
}

public actual fun glNormal3iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormal3iv(v.rawAddress)
}

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormal3s(nx, ny, nz)
}

public actual fun glNormal3sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormal3sv(v.rawAddress)
}

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlNormalPointer(type.toInt(), stride, pointer.rawAddress)
}

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlOrtho(left, right, bottom, top, znear, zfar)
}

public actual fun glPassThrough(token: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPassThrough(token)
}

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPixelMapfv(map.toInt(), mapsize, values.rawAddress)
}

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: ConstPtr<UInt>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPixelMapuiv(map.toInt(), mapsize, values.rawAddress)
}

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: ConstPtr<UShort>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPixelMapusv(map.toInt(), mapsize, values.rawAddress)
}

public actual fun glPixelStoref(pname: UInt, param1: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPixelStoref(pname.toInt(), param1)
}

public actual fun glPixelStorei(pname: UInt, param1: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPixelStorei(pname.toInt(), param1)
}

public actual fun glPixelTransferf(pname: UInt, param1: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPixelTransferf(pname.toInt(), param1)
}

public actual fun glPixelTransferi(pname: UInt, param1: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPixelTransferi(pname.toInt(), param1)
}

public actual fun glPixelZoom(xfactor: Float, yfactor: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPixelZoom(xfactor, yfactor)
}

public actual fun glPointSize(size: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPointSize(size)
}

public actual fun glPolygonMode(face: UInt, mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPolygonMode(face.toInt(), mode.toInt())
}

public actual fun glPolygonOffset(factor: Float, units: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPolygonOffset(factor, units)
}

public actual fun glPolygonStipple(mask: ConstPtr<UByte>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPolygonStipple(mask.rawAddress)
}

public actual fun glPopAttrib() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPopAttrib()
}

public actual fun glPopClientAttrib() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPopClientAttrib()
}

public actual fun glPopMatrix() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPopMatrix()
}

public actual fun glPopName() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPopName()
}

public actual fun glPrioritizeTextures(n: Int, textures: ConstPtr<UInt>, priorities: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPrioritizeTextures(n, textures.rawAddress, priorities.rawAddress)
}

public actual fun glPushAttrib(mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPushAttrib(mask.toInt())
}

public actual fun glPushClientAttrib(mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPushClientAttrib(mask.toInt())
}

public actual fun glPushMatrix() {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPushMatrix()
}

public actual fun glPushName(name: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlPushName(name.toInt())
}

public actual fun glRasterPos2d(x: Double, y: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos2d(x, y)
}

public actual fun glRasterPos2dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos2dv(v.rawAddress)
}

public actual fun glRasterPos2f(x: Float, y: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos2f(x, y)
}

public actual fun glRasterPos2fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos2fv(v.rawAddress)
}

public actual fun glRasterPos2i(x: Int, y: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos2i(x, y)
}

public actual fun glRasterPos2iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos2iv(v.rawAddress)
}

public actual fun glRasterPos2s(x: Short, y: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos2s(x, y)
}

public actual fun glRasterPos2sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos2sv(v.rawAddress)
}

public actual fun glRasterPos3d(x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos3d(x, y, z)
}

public actual fun glRasterPos3dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos3dv(v.rawAddress)
}

public actual fun glRasterPos3f(x: Float, y: Float, z: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos3f(x, y, z)
}

public actual fun glRasterPos3fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos3fv(v.rawAddress)
}

public actual fun glRasterPos3i(x: Int, y: Int, z: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos3i(x, y, z)
}

public actual fun glRasterPos3iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos3iv(v.rawAddress)
}

public actual fun glRasterPos3s(x: Short, y: Short, z: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos3s(x, y, z)
}

public actual fun glRasterPos3sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos3sv(v.rawAddress)
}

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos4d(x, y, z, w)
}

public actual fun glRasterPos4dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos4dv(v.rawAddress)
}

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos4f(x, y, z, w)
}

public actual fun glRasterPos4fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos4fv(v.rawAddress)
}

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos4i(x, y, z, w)
}

public actual fun glRasterPos4iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos4iv(v.rawAddress)
}

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos4s(x, y, z, w)
}

public actual fun glRasterPos4sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRasterPos4sv(v.rawAddress)
}

public actual fun glReadBuffer(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlReadBuffer(mode.toInt())
}

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: MutPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlReadPixels(x, y, width, height, format.toInt(), type.toInt(), pixels.rawAddress)
}

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRectd(x1, y1, x2, y2)
}

public actual fun glRectdv(v1: ConstPtr<Double>, v2: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRectdv(v1.rawAddress, v2.rawAddress)
}

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRectf(x1, y1, x2, y2)
}

public actual fun glRectfv(v1: ConstPtr<Float>, v2: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRectfv(v1.rawAddress, v2.rawAddress)
}

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRecti(x1, y1, x2, y2)
}

public actual fun glRectiv(v1: ConstPtr<Int>, v2: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRectiv(v1.rawAddress, v2.rawAddress)
}

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRects(x1, y1, x2, y2)
}

public actual fun glRectsv(v1: ConstPtr<Short>, v2: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRectsv(v1.rawAddress, v2.rawAddress)
}

public actual fun glRenderMode(mode: UInt): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRenderMode(mode.toInt())

public actual fun glRotated(angle: Double, x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRotated(angle, x, y, z)
}

public actual fun glRotatef(angle: Float, x: Float, y: Float, z: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlRotatef(angle, x, y, z)
}

public actual fun glScaled(x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlScaled(x, y, z)
}

public actual fun glScalef(x: Float, y: Float, z: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlScalef(x, y, z)
}

public actual fun glScissor(x: Int, y: Int, width: Int, height: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlScissor(x, y, width, height)
}

public actual fun glSelectBuffer(size: Int, buffer: MutPtr<UInt>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlSelectBuffer(size, buffer.rawAddress)
}

public actual fun glShadeModel(mode: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlShadeModel(mode.toInt())
}

public actual fun glStencilFunc(func: UInt, ref: Int, mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlStencilFunc(func.toInt(), ref, mask.toInt())
}

public actual fun glStencilMask(mask: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlStencilMask(mask.toInt())
}

public actual fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlStencilOp(fail.toInt(), zfail.toInt(), zpass.toInt())
}

public actual fun glTexCoord1d(s: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord1d(s)
}

public actual fun glTexCoord1dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord1dv(v.rawAddress)
}

public actual fun glTexCoord1f(s: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord1f(s)
}

public actual fun glTexCoord1fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord1fv(v.rawAddress)
}

public actual fun glTexCoord1i(s: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord1i(s)
}

public actual fun glTexCoord1iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord1iv(v.rawAddress)
}

public actual fun glTexCoord1s(s: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord1s(s)
}

public actual fun glTexCoord1sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord1sv(v.rawAddress)
}

public actual fun glTexCoord2d(s: Double, t: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord2d(s, t)
}

public actual fun glTexCoord2dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord2dv(v.rawAddress)
}

public actual fun glTexCoord2f(s: Float, t: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord2f(s, t)
}

public actual fun glTexCoord2fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord2fv(v.rawAddress)
}

public actual fun glTexCoord2i(s: Int, t: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord2i(s, t)
}

public actual fun glTexCoord2iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord2iv(v.rawAddress)
}

public actual fun glTexCoord2s(s: Short, t: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord2s(s, t)
}

public actual fun glTexCoord2sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord2sv(v.rawAddress)
}

public actual fun glTexCoord3d(s: Double, t: Double, r: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord3d(s, t, r)
}

public actual fun glTexCoord3dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord3dv(v.rawAddress)
}

public actual fun glTexCoord3f(s: Float, t: Float, r: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord3f(s, t, r)
}

public actual fun glTexCoord3fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord3fv(v.rawAddress)
}

public actual fun glTexCoord3i(s: Int, t: Int, r: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord3i(s, t, r)
}

public actual fun glTexCoord3iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord3iv(v.rawAddress)
}

public actual fun glTexCoord3s(s: Short, t: Short, r: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord3s(s, t, r)
}

public actual fun glTexCoord3sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord3sv(v.rawAddress)
}

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord4d(s, t, r, q)
}

public actual fun glTexCoord4dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord4dv(v.rawAddress)
}

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord4f(s, t, r, q)
}

public actual fun glTexCoord4fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord4fv(v.rawAddress)
}

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord4i(s, t, r, q)
}

public actual fun glTexCoord4iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord4iv(v.rawAddress)
}

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord4s(s, t, r, q)
}

public actual fun glTexCoord4sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoord4sv(v.rawAddress)
}

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexCoordPointer(size, type.toInt(), stride, pointer.rawAddress)
}

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexEnvf(target.toInt(), pname.toInt(), param2)
}

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexEnvfv(target.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexEnvi(target.toInt(), pname.toInt(), param2)
}

public actual fun glTexEnviv(target: UInt, pname: UInt, params: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexEnviv(target.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexGend(coord.toInt(), pname.toInt(), param2)
}

public actual fun glTexGendv(coord: UInt, pname: UInt, params: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexGendv(coord.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexGenf(coord.toInt(), pname.toInt(), param2)
}

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexGenfv(coord.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexGeni(coord.toInt(), pname.toInt(), param2)
}

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexGeniv(coord.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexImage1D(target.toInt(), level, internalformat, width, border, format.toInt(), type.toInt(), pixels.rawAddress)
}

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexImage2D(target.toInt(), level, internalformat, width, height, border, format.toInt(), type.toInt(), pixels.rawAddress)
}

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexParameterf(target.toInt(), pname.toInt(), param2)
}

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexParameterfv(target.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexParameteri(target.toInt(), pname.toInt(), param2)
}

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexParameteriv(target.toInt(), pname.toInt(), params.rawAddress)
}

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexSubImage1D(target.toInt(), level, xoffset, width, format.toInt(), type.toInt(), pixels.rawAddress)
}

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTexSubImage2D(target.toInt(), level, xoffset, yoffset, width, height, format.toInt(), type.toInt(), pixels.rawAddress)
}

public actual fun glTranslated(x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTranslated(x, y, z)
}

public actual fun glTranslatef(x: Float, y: Float, z: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlTranslatef(x, y, z)
}

public actual fun glVertex2d(x: Double, y: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex2d(x, y)
}

public actual fun glVertex2dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex2dv(v.rawAddress)
}

public actual fun glVertex2f(x: Float, y: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex2f(x, y)
}

public actual fun glVertex2fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex2fv(v.rawAddress)
}

public actual fun glVertex2i(x: Int, y: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex2i(x, y)
}

public actual fun glVertex2iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex2iv(v.rawAddress)
}

public actual fun glVertex2s(x: Short, y: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex2s(x, y)
}

public actual fun glVertex2sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex2sv(v.rawAddress)
}

public actual fun glVertex3d(x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex3d(x, y, z)
}

public actual fun glVertex3dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex3dv(v.rawAddress)
}

public actual fun glVertex3f(x: Float, y: Float, z: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex3f(x, y, z)
}

public actual fun glVertex3fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex3fv(v.rawAddress)
}

public actual fun glVertex3i(x: Int, y: Int, z: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex3i(x, y, z)
}

public actual fun glVertex3iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex3iv(v.rawAddress)
}

public actual fun glVertex3s(x: Short, y: Short, z: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex3s(x, y, z)
}

public actual fun glVertex3sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex3sv(v.rawAddress)
}

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex4d(x, y, z, w)
}

public actual fun glVertex4dv(v: ConstPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex4dv(v.rawAddress)
}

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex4f(x, y, z, w)
}

public actual fun glVertex4fv(v: ConstPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex4fv(v.rawAddress)
}

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex4i(x, y, z, w)
}

public actual fun glVertex4iv(v: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex4iv(v.rawAddress)
}

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex4s(x, y, z, w)
}

public actual fun glVertex4sv(v: ConstPtr<Short>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertex4sv(v.rawAddress)
}

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlVertexPointer(size, type.toInt(), stride, pointer.rawAddress)
}

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGlViewport(x, y, width, height)
}

public actual fun gluBeginCurve(nobj: MutPtr<GLUnurbs>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluBeginCurve(nobj.rawAddress)
}

public actual fun gluBeginPolygon(tess: MutPtr<GLUtesselator>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluBeginPolygon(tess.rawAddress)
}

public actual fun gluBeginSurface(nobj: MutPtr<GLUnurbs>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluBeginSurface(nobj.rawAddress)
}

public actual fun gluBeginTrim(nobj: MutPtr<GLUnurbs>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluBeginTrim(nobj.rawAddress)
}

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: ConstPtr<CVoid>): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluBuild1DMipmaps(target.toInt(), components, width, format.toInt(), type.toInt(), data.rawAddress)

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: ConstPtr<CVoid>): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluBuild2DMipmaps(target.toInt(), components, width, height, format.toInt(), type.toInt(), data.rawAddress)

public actual fun gluCylinder(qobj: MutPtr<GLUquadric>, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluCylinder(qobj.rawAddress, baseradius, topradius, height, slices, stacks)
}

public actual fun gluDeleteNurbsRenderer(nobj: MutPtr<GLUnurbs>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluDeleteNurbsRenderer(nobj.rawAddress)
}

public actual fun gluDeleteQuadric(state: MutPtr<GLUquadric>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluDeleteQuadric(state.rawAddress)
}

public actual fun gluDeleteTess(tess: MutPtr<GLUtesselator>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluDeleteTess(tess.rawAddress)
}

public actual fun gluDisk(qobj: MutPtr<GLUquadric>, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluDisk(qobj.rawAddress, innerradius, outerradius, slices, loops)
}

public actual fun gluEndCurve(nobj: MutPtr<GLUnurbs>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluEndCurve(nobj.rawAddress)
}

public actual fun gluEndPolygon(tess: MutPtr<GLUtesselator>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluEndPolygon(tess.rawAddress)
}

public actual fun gluEndSurface(nobj: MutPtr<GLUnurbs>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluEndSurface(nobj.rawAddress)
}

public actual fun gluEndTrim(nobj: MutPtr<GLUnurbs>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluEndTrim(nobj.rawAddress)
}

public actual fun gluErrorString(errcode: UInt): MutPtr<UByte> =
    MutPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluErrorString(errcode.toInt()))

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): Pcwstr =
    ConstPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluErrorUnicodeStringEXT(errcode.toInt()))

public actual fun gluGetNurbsProperty(nobj: MutPtr<GLUnurbs>, property: UInt, value: MutPtr<Float>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluGetNurbsProperty(nobj.rawAddress, property.toInt(), value.rawAddress)
}

public actual fun gluGetString(name: UInt): MutPtr<UByte> =
    MutPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluGetString(name.toInt()))

public actual fun gluGetTessProperty(tess: MutPtr<GLUtesselator>, which: UInt, value: MutPtr<Double>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluGetTessProperty(tess.rawAddress, which.toInt(), value.rawAddress)
}

public actual fun gluLoadSamplingMatrices(nobj: MutPtr<GLUnurbs>, modelmatrix: ConstPtr<Float>, projmatrix: ConstPtr<Float>, viewport: ConstPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluLoadSamplingMatrices(nobj.rawAddress, modelmatrix.rawAddress, projmatrix.rawAddress, viewport.rawAddress)
}

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluLookAt(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz)
}

public actual fun gluNewNurbsRenderer(): MutPtr<GLUnurbs> =
    MutPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluNewNurbsRenderer())

public actual fun gluNewQuadric(): MutPtr<GLUquadric> =
    MutPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluNewQuadric())

public actual fun gluNewTess(): MutPtr<GLUtesselator> =
    MutPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluNewTess())

public actual fun gluNextContour(tess: MutPtr<GLUtesselator>, type: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluNextContour(tess.rawAddress, type.toInt())
}

public actual fun gluNurbsCallback(nobj: MutPtr<GLUnurbs>, which: UInt, fn: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluNurbsCallback(nobj.rawAddress, which.toInt(), fn)
}

public actual fun gluNurbsCurve(nobj: MutPtr<GLUnurbs>, nknots: Int, knot: MutPtr<Float>, stride: Int, ctlarray: MutPtr<Float>, order: Int, type: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluNurbsCurve(nobj.rawAddress, nknots, knot.rawAddress, stride, ctlarray.rawAddress, order, type.toInt())
}

public actual fun gluNurbsProperty(nobj: MutPtr<GLUnurbs>, property: UInt, value: Float) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluNurbsProperty(nobj.rawAddress, property.toInt(), value)
}

public actual fun gluNurbsSurface(nobj: MutPtr<GLUnurbs>, sknotCount: Int, sknot: MutPtr<Float>, tknotCount: Int, tknot: MutPtr<Float>, sStride: Int, tStride: Int, ctlarray: MutPtr<Float>, sorder: Int, torder: Int, type: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluNurbsSurface(nobj.rawAddress, sknotCount, sknot.rawAddress, tknotCount, tknot.rawAddress, sStride, tStride, ctlarray.rawAddress, sorder, torder, type.toInt())
}

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluOrtho2D(left, right, bottom, top)
}

public actual fun gluPartialDisk(qobj: MutPtr<GLUquadric>, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluPartialDisk(qobj.rawAddress, innerradius, outerradius, slices, loops, startangle, sweepangle)
}

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluPerspective(fovy, aspect, znear, zfar)
}

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: MutPtr<Int>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluPickMatrix(x, y, width, height, viewport.rawAddress)
}

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: ConstPtr<Double>, projmatrix: ConstPtr<Double>, viewport: ConstPtr<Int>, winx: MutPtr<Double>, winy: MutPtr<Double>, winz: MutPtr<Double>): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluProject(objx, objy, objz, modelmatrix.rawAddress, projmatrix.rawAddress, viewport.rawAddress, winx.rawAddress, winy.rawAddress, winz.rawAddress)

public actual fun gluPwlCurve(nobj: MutPtr<GLUnurbs>, count: Int, array: MutPtr<Float>, stride: Int, type: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluPwlCurve(nobj.rawAddress, count, array.rawAddress, stride, type.toInt())
}

public actual fun gluQuadricCallback(qobj: MutPtr<GLUquadric>, which: UInt, fn: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluQuadricCallback(qobj.rawAddress, which.toInt(), fn)
}

public actual fun gluQuadricDrawStyle(quadobject: MutPtr<GLUquadric>, drawstyle: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluQuadricDrawStyle(quadobject.rawAddress, drawstyle.toInt())
}

public actual fun gluQuadricNormals(quadobject: MutPtr<GLUquadric>, normals: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluQuadricNormals(quadobject.rawAddress, normals.toInt())
}

public actual fun gluQuadricOrientation(quadobject: MutPtr<GLUquadric>, orientation: UInt) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluQuadricOrientation(quadobject.rawAddress, orientation.toInt())
}

public actual fun gluQuadricTexture(quadobject: MutPtr<GLUquadric>, texturecoords: UByte) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluQuadricTexture(quadobject.rawAddress, texturecoords.toByte())
}

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: ConstPtr<CVoid>, widthout: Int, heightout: Int, typeout: UInt, dataout: MutPtr<CVoid>): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluScaleImage(format.toInt(), widthin, heightin, typein.toInt(), datain.rawAddress, widthout, heightout, typeout.toInt(), dataout.rawAddress)

public actual fun gluSphere(qobj: MutPtr<GLUquadric>, radius: Double, slices: Int, stacks: Int) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluSphere(qobj.rawAddress, radius, slices, stacks)
}

public actual fun gluTessBeginContour(tess: MutPtr<GLUtesselator>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluTessBeginContour(tess.rawAddress)
}

public actual fun gluTessBeginPolygon(tess: MutPtr<GLUtesselator>, polygonData: MutPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluTessBeginPolygon(tess.rawAddress, polygonData.rawAddress)
}

public actual fun gluTessCallback(tess: MutPtr<GLUtesselator>, which: UInt, fn: Long) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluTessCallback(tess.rawAddress, which.toInt(), fn)
}

public actual fun gluTessEndContour(tess: MutPtr<GLUtesselator>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluTessEndContour(tess.rawAddress)
}

public actual fun gluTessEndPolygon(tess: MutPtr<GLUtesselator>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluTessEndPolygon(tess.rawAddress)
}

public actual fun gluTessNormal(tess: MutPtr<GLUtesselator>, x: Double, y: Double, z: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluTessNormal(tess.rawAddress, x, y, z)
}

public actual fun gluTessProperty(tess: MutPtr<GLUtesselator>, which: UInt, value: Double) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluTessProperty(tess.rawAddress, which.toInt(), value)
}

public actual fun gluTessVertex(tess: MutPtr<GLUtesselator>, coords: MutPtr<Double>, data: MutPtr<CVoid>) {
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluTessVertex(tess.rawAddress, coords.rawAddress, data.rawAddress)
}

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: ConstPtr<Double>, projmatrix: ConstPtr<Double>, viewport: ConstPtr<Int>, objx: MutPtr<Double>, objy: MutPtr<Double>, objz: MutPtr<Double>): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglGluUnProject(winx, winy, winz, modelmatrix.rawAddress, projmatrix.rawAddress, viewport.rawAddress, objx.rawAddress, objy.rawAddress, objz.rawAddress)

public actual fun wglCopyContext(param0: Hglrc, param1: Hglrc, param2: UInt): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglCopyContext(param0.rawAddress, param1.rawAddress, param2.toInt())

public actual fun wglCreateContext(param0: Hdc): Hglrc =
    MutPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglCreateContext(param0.rawAddress))

public actual fun wglCreateLayerContext(param0: Hdc, param1: Int): Hglrc =
    MutPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglCreateLayerContext(param0.rawAddress, param1))

public actual fun wglDeleteContext(param0: Hglrc): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglDeleteContext(param0.rawAddress)

public actual fun wglDescribeLayerPlane(param0: Hdc, param1: Int, param2: Int, param3: UInt, param4: MutPtr<Layerplanedescriptor>): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglDescribeLayerPlane(param0.rawAddress, param1, param2, param3.toInt(), param4.rawAddress)

public actual fun wglGetCurrentContext(): Hglrc =
    MutPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglGetCurrentContext())

public actual fun wglGetCurrentDC(): Hdc =
    MutPtr(WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglGetCurrentDC())

public actual fun wglGetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: MutPtr<Colorref>): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglGetLayerPaletteEntries(param0.rawAddress, param1, param2, param3, param4.rawAddress)

public actual fun wglGetProcAddress(param0: Pcstr): Proc =
    null

public actual fun wglMakeCurrent(param0: Hdc, param1: Hglrc): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglMakeCurrent(param0.rawAddress, param1.rawAddress)

public actual fun wglRealizeLayerPalette(param0: Hdc, param1: Int, param2: Bool): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglRealizeLayerPalette(param0.rawAddress, param1, param2)

public actual fun wglSetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: ConstPtr<Colorref>): Int =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglSetLayerPaletteEntries(param0.rawAddress, param1, param2, param3, param4.rawAddress)

public actual fun wglShareLists(param0: Hglrc, param1: Hglrc): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglShareLists(param0.rawAddress, param1.rawAddress)

public actual fun wglSwapLayerBuffers(param0: Hdc, param1: UInt): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglSwapLayerBuffers(param0.rawAddress, param1.toInt())

public actual fun wglUseFontBitmapsA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsA(param0.rawAddress, param1.toInt(), param2.toInt(), param3.toInt())

public actual fun wglUseFontBitmapsW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsW(param0.rawAddress, param1.toInt(), param2.toInt(), param3.toInt())

public actual fun wglUseFontOutlinesA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: MutPtr<Glyphmetricsfloat>): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesA(param0.rawAddress, param1.toInt(), param2.toInt(), param3.toInt(), param4, param5, param6, param7.rawAddress)

public actual fun wglUseFontOutlinesW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: MutPtr<Glyphmetricsfloat>): Bool =
    WindowsWin32GraphicsOpenglJniBridge.windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesW(param0.rawAddress, param1.toInt(), param2.toInt(), param3.toInt(), param4, param5, param6, param7.rawAddress)
