@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.PROC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HENHMETAFILE

private val _windowsWin32GraphicsOpenglNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ChoosePixelFormat(hdc: HDC, ppfd: Long): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_ChoosePixelFormat(hdc.toString(), ppfd.toString()) as Int) else 0

public actual fun DescribePixelFormat(hdc: HDC, ipixelformat: Int, nbytes: UInt, ppfd: Long): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_DescribePixelFormat(hdc.toString(), ipixelformat, nbytes.toInt(), ppfd.toString()) as Int) else 0

public actual fun GetEnhMetaFilePixelFormat(hemf: HENHMETAFILE, cbbuffer: UInt, ppfd: Long): UInt =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_GetEnhMetaFilePixelFormat(hemf.toString(), cbbuffer.toInt(), ppfd.toString()) as Int).toUInt() else 0u

public actual fun GetPixelFormat(hdc: HDC): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_GetPixelFormat(hdc.toString()) as Int) else 0

public actual fun SetPixelFormat(hdc: HDC, format: Int, ppfd: Long): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_SetPixelFormat(hdc.toString(), format, ppfd.toString()) as Int) else 0

public actual fun SwapBuffers(param0: HDC): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_SwapBuffers(param0.toString()) as Int) else 0

public actual fun glAccum(op: UInt, value: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glAccum(op.toInt(), value.toDouble())
    }
}

public actual fun glAlphaFunc(func: UInt, ref: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glAlphaFunc(func.toInt(), ref.toDouble())
    }
}

public actual fun glAreTexturesResident(n: Int, textures: Long, residences: Long): UByte =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glAreTexturesResident(n, textures.toString(), residences.toString()) as Int).toUByte() else 0u

public actual fun glArrayElement(i: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glArrayElement(i)
    }
}

public actual fun glBegin(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glBegin(mode.toInt())
    }
}

public actual fun glBindTexture(target: UInt, texture: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glBindTexture(target.toInt(), texture.toInt())
    }
}

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glBitmap(width, height, xorig.toDouble(), yorig.toDouble(), xmove.toDouble(), ymove.toDouble(), bitmap.toString())
    }
}

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glBlendFunc(sfactor.toInt(), dfactor.toInt())
    }
}

public actual fun glCallList(list: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glCallList(list.toInt())
    }
}

public actual fun glCallLists(n: Int, type: UInt, lists: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glCallLists(n, type.toInt(), lists.toString())
    }
}

public actual fun glClear(mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glClear(mask.toInt())
    }
}

public actual fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glClearAccum(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    }
}

public actual fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glClearColor(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    }
}

public actual fun glClearDepth(depth: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glClearDepth(depth)
    }
}

public actual fun glClearIndex(c: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glClearIndex(c.toDouble())
    }
}

public actual fun glClearStencil(s: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glClearStencil(s)
    }
}

public actual fun glClipPlane(plane: UInt, equation: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glClipPlane(plane.toInt(), equation.toString())
    }
}

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3b(red.toInt(), green.toInt(), blue.toInt())
    }
}

public actual fun glColor3bv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3bv(v.toString())
    }
}

public actual fun glColor3d(red: Double, green: Double, blue: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3d(red, green, blue)
    }
}

public actual fun glColor3dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3dv(v.toString())
    }
}

public actual fun glColor3f(red: Float, green: Float, blue: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3f(red.toDouble(), green.toDouble(), blue.toDouble())
    }
}

public actual fun glColor3fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3fv(v.toString())
    }
}

public actual fun glColor3i(red: Int, green: Int, blue: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3i(red, green, blue)
    }
}

public actual fun glColor3iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3iv(v.toString())
    }
}

public actual fun glColor3s(red: Short, green: Short, blue: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3s(red.toInt(), green.toInt(), blue.toInt())
    }
}

public actual fun glColor3sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3sv(v.toString())
    }
}

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3ub(red.toInt(), green.toInt(), blue.toInt())
    }
}

public actual fun glColor3ubv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3ubv(v.toString())
    }
}

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3ui(red.toInt(), green.toInt(), blue.toInt())
    }
}

public actual fun glColor3uiv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3uiv(v.toString())
    }
}

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3us(red.toInt(), green.toInt(), blue.toInt())
    }
}

public actual fun glColor3usv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor3usv(v.toString())
    }
}

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4b(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    }
}

public actual fun glColor4bv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4bv(v.toString())
    }
}

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4d(red, green, blue, alpha)
    }
}

public actual fun glColor4dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4dv(v.toString())
    }
}

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4f(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    }
}

public actual fun glColor4fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4fv(v.toString())
    }
}

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4i(red, green, blue, alpha)
    }
}

public actual fun glColor4iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4iv(v.toString())
    }
}

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4s(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    }
}

public actual fun glColor4sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4sv(v.toString())
    }
}

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4ub(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    }
}

public actual fun glColor4ubv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4ubv(v.toString())
    }
}

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4ui(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    }
}

public actual fun glColor4uiv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4uiv(v.toString())
    }
}

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4us(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    }
}

public actual fun glColor4usv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColor4usv(v.toString())
    }
}

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColorMask(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    }
}

public actual fun glColorMaterial(face: UInt, mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColorMaterial(face.toInt(), mode.toInt())
    }
}

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glColorPointer(size, type.toInt(), stride, pointer.toString())
    }
}

public actual fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glCopyPixels(x, y, width, height, type.toInt())
    }
}

public actual fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glCopyTexImage1D(target.toInt(), level, internalformat.toInt(), x, y, width, border)
    }
}

public actual fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glCopyTexImage2D(target.toInt(), level, internalformat.toInt(), x, y, width, height, border)
    }
}

public actual fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D(target.toInt(), level, xoffset, x, y, width)
    }
}

public actual fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D(target.toInt(), level, xoffset, yoffset, x, y, width, height)
    }
}

public actual fun glCullFace(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glCullFace(mode.toInt())
    }
}

public actual fun glDeleteLists(list: UInt, range: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDeleteLists(list.toInt(), range)
    }
}

public actual fun glDeleteTextures(n: Int, textures: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDeleteTextures(n, textures.toString())
    }
}

public actual fun glDepthFunc(func: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDepthFunc(func.toInt())
    }
}

public actual fun glDepthMask(flag: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDepthMask(flag.toInt())
    }
}

public actual fun glDepthRange(znear: Double, zfar: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDepthRange(znear, zfar)
    }
}

public actual fun glDisable(cap: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDisable(cap.toInt())
    }
}

public actual fun glDisableClientState(array: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDisableClientState(array.toInt())
    }
}

public actual fun glDrawArrays(mode: UInt, first: Int, count: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDrawArrays(mode.toInt(), first, count)
    }
}

public actual fun glDrawBuffer(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDrawBuffer(mode.toInt())
    }
}

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDrawElements(mode.toInt(), count, type.toInt(), indices.toString())
    }
}

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glDrawPixels(width, height, format.toInt(), type.toInt(), pixels.toString())
    }
}

public actual fun glEdgeFlag(flag: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEdgeFlag(flag.toInt())
    }
}

public actual fun glEdgeFlagPointer(stride: Int, pointer: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer(stride, pointer.toString())
    }
}

public actual fun glEdgeFlagv(flag: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEdgeFlagv(flag.toString())
    }
}

public actual fun glEnable(cap: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEnable(cap.toInt())
    }
}

public actual fun glEnableClientState(array: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEnableClientState(array.toInt())
    }
}

public actual fun glEnd() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEnd()
    }
}

public actual fun glEndList() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEndList()
    }
}

public actual fun glEvalCoord1d(u: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalCoord1d(u)
    }
}

public actual fun glEvalCoord1dv(u: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalCoord1dv(u.toString())
    }
}

public actual fun glEvalCoord1f(u: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalCoord1f(u.toDouble())
    }
}

public actual fun glEvalCoord1fv(u: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalCoord1fv(u.toString())
    }
}

public actual fun glEvalCoord2d(u: Double, v: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalCoord2d(u, v)
    }
}

public actual fun glEvalCoord2dv(u: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalCoord2dv(u.toString())
    }
}

public actual fun glEvalCoord2f(u: Float, v: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalCoord2f(u.toDouble(), v.toDouble())
    }
}

public actual fun glEvalCoord2fv(u: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalCoord2fv(u.toString())
    }
}

public actual fun glEvalMesh1(mode: UInt, i1: Int, i2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalMesh1(mode.toInt(), i1, i2)
    }
}

public actual fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalMesh2(mode.toInt(), i1, i2, j1, j2)
    }
}

public actual fun glEvalPoint1(i: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalPoint1(i)
    }
}

public actual fun glEvalPoint2(i: Int, j: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glEvalPoint2(i, j)
    }
}

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glFeedbackBuffer(size, type.toInt(), buffer.toString())
    }
}

public actual fun glFinish() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glFinish()
    }
}

public actual fun glFlush() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glFlush()
    }
}

public actual fun glFogf(pname: UInt, param1: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glFogf(pname.toInt(), param1.toDouble())
    }
}

public actual fun glFogfv(pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glFogfv(pname.toInt(), params.toString())
    }
}

public actual fun glFogi(pname: UInt, param1: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glFogi(pname.toInt(), param1)
    }
}

public actual fun glFogiv(pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glFogiv(pname.toInt(), params.toString())
    }
}

public actual fun glFrontFace(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glFrontFace(mode.toInt())
    }
}

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glFrustum(left, right, bottom, top, znear, zfar)
    }
}

public actual fun glGenLists(range: Int): UInt =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGenLists(range) as Int).toUInt() else 0u

public actual fun glGenTextures(n: Int, textures: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGenTextures(n, textures.toString())
    }
}

public actual fun glGetBooleanv(pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetBooleanv(pname.toInt(), params.toString())
    }
}

public actual fun glGetClipPlane(plane: UInt, equation: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetClipPlane(plane.toInt(), equation.toString())
    }
}

public actual fun glGetDoublev(pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetDoublev(pname.toInt(), params.toString())
    }
}

public actual fun glGetError(): UInt =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetError() as Int).toUInt() else 0u

public actual fun glGetFloatv(pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetFloatv(pname.toInt(), params.toString())
    }
}

public actual fun glGetIntegerv(pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetIntegerv(pname.toInt(), params.toString())
    }
}

public actual fun glGetLightfv(light: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetLightfv(light.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glGetLightiv(light: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetLightiv(light.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glGetMapdv(target: UInt, query: UInt, v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetMapdv(target.toInt(), query.toInt(), v.toString())
    }
}

public actual fun glGetMapfv(target: UInt, query: UInt, v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetMapfv(target.toInt(), query.toInt(), v.toString())
    }
}

public actual fun glGetMapiv(target: UInt, query: UInt, v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetMapiv(target.toInt(), query.toInt(), v.toString())
    }
}

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetMaterialfv(face.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetMaterialiv(face.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glGetPixelMapfv(map: UInt, values: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetPixelMapfv(map.toInt(), values.toString())
    }
}

public actual fun glGetPixelMapuiv(map: UInt, values: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv(map.toInt(), values.toString())
    }
}

public actual fun glGetPixelMapusv(map: UInt, values: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetPixelMapusv(map.toInt(), values.toString())
    }
}

public actual fun glGetPointerv(pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetPointerv(pname.toInt(), params.toString())
    }
}

public actual fun glGetPolygonStipple(mask: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetPolygonStipple(mask.toString())
    }
}

public actual fun glGetString(name: UInt): Long =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetString(name.toInt()) as String).toLong() else 0L

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetTexEnvfv(target.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetTexEnviv(target.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetTexGendv(coord.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetTexGenfv(coord.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetTexGeniv(coord.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetTexImage(target.toInt(), level, format.toInt(), type.toInt(), pixels.toString())
    }
}

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv(target.toInt(), level, pname.toInt(), params.toString())
    }
}

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv(target.toInt(), level, pname.toInt(), params.toString())
    }
}

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetTexParameterfv(target.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glGetTexParameteriv(target.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glHint(target: UInt, mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glHint(target.toInt(), mode.toInt())
    }
}

public actual fun glIndexMask(mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexMask(mask.toInt())
    }
}

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexPointer(type.toInt(), stride, pointer.toString())
    }
}

public actual fun glIndexd(c: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexd(c)
    }
}

public actual fun glIndexdv(c: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexdv(c.toString())
    }
}

public actual fun glIndexf(c: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexf(c.toDouble())
    }
}

public actual fun glIndexfv(c: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexfv(c.toString())
    }
}

public actual fun glIndexi(c: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexi(c)
    }
}

public actual fun glIndexiv(c: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexiv(c.toString())
    }
}

public actual fun glIndexs(c: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexs(c.toInt())
    }
}

public actual fun glIndexsv(c: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexsv(c.toString())
    }
}

public actual fun glIndexub(c: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexub(c.toInt())
    }
}

public actual fun glIndexubv(c: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIndexubv(c.toString())
    }
}

public actual fun glInitNames() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glInitNames()
    }
}

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glInterleavedArrays(format.toInt(), stride, pointer.toString())
    }
}

public actual fun glIsEnabled(cap: UInt): UByte =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIsEnabled(cap.toInt()) as Int).toUByte() else 0u

public actual fun glIsList(list: UInt): UByte =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIsList(list.toInt()) as Int).toUByte() else 0u

public actual fun glIsTexture(texture: UInt): UByte =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glIsTexture(texture.toInt()) as Int).toUByte() else 0u

public actual fun glLightModelf(pname: UInt, param1: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLightModelf(pname.toInt(), param1.toDouble())
    }
}

public actual fun glLightModelfv(pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLightModelfv(pname.toInt(), params.toString())
    }
}

public actual fun glLightModeli(pname: UInt, param1: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLightModeli(pname.toInt(), param1)
    }
}

public actual fun glLightModeliv(pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLightModeliv(pname.toInt(), params.toString())
    }
}

public actual fun glLightf(light: UInt, pname: UInt, param2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLightf(light.toInt(), pname.toInt(), param2.toDouble())
    }
}

public actual fun glLightfv(light: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLightfv(light.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glLighti(light: UInt, pname: UInt, param2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLighti(light.toInt(), pname.toInt(), param2)
    }
}

public actual fun glLightiv(light: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLightiv(light.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glLineStipple(factor: Int, pattern: UShort) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLineStipple(factor, pattern.toInt())
    }
}

public actual fun glLineWidth(width: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLineWidth(width.toDouble())
    }
}

public actual fun glListBase(base: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glListBase(base.toInt())
    }
}

public actual fun glLoadIdentity() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLoadIdentity()
    }
}

public actual fun glLoadMatrixd(m: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLoadMatrixd(m.toString())
    }
}

public actual fun glLoadMatrixf(m: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLoadMatrixf(m.toString())
    }
}

public actual fun glLoadName(name: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLoadName(name.toInt())
    }
}

public actual fun glLogicOp(opcode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glLogicOp(opcode.toInt())
    }
}

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMap1d(target.toInt(), u1, u2, stride, order, points.toString())
    }
}

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMap1f(target.toInt(), u1.toDouble(), u2.toDouble(), stride, order, points.toString())
    }
}

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMap2d(target.toInt(), u1, u2, ustride, uorder, v1, v2, vstride, vorder, points.toString())
    }
}

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMap2f(target.toInt(), u1.toDouble(), u2.toDouble(), ustride, uorder, v1.toDouble(), v2.toDouble(), vstride, vorder, points.toString())
    }
}

public actual fun glMapGrid1d(un: Int, u1: Double, u2: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMapGrid1d(un, u1, u2)
    }
}

public actual fun glMapGrid1f(un: Int, u1: Float, u2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMapGrid1f(un, u1.toDouble(), u2.toDouble())
    }
}

public actual fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMapGrid2d(un, u1, u2, vn, v1, v2)
    }
}

public actual fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMapGrid2f(un, u1.toDouble(), u2.toDouble(), vn, v1.toDouble(), v2.toDouble())
    }
}

public actual fun glMaterialf(face: UInt, pname: UInt, param2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMaterialf(face.toInt(), pname.toInt(), param2.toDouble())
    }
}

public actual fun glMaterialfv(face: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMaterialfv(face.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMateriali(face.toInt(), pname.toInt(), param2)
    }
}

public actual fun glMaterialiv(face: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMaterialiv(face.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glMatrixMode(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMatrixMode(mode.toInt())
    }
}

public actual fun glMultMatrixd(m: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMultMatrixd(m.toString())
    }
}

public actual fun glMultMatrixf(m: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glMultMatrixf(m.toString())
    }
}

public actual fun glNewList(list: UInt, mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNewList(list.toInt(), mode.toInt())
    }
}

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormal3b(nx.toInt(), ny.toInt(), nz.toInt())
    }
}

public actual fun glNormal3bv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormal3bv(v.toString())
    }
}

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormal3d(nx, ny, nz)
    }
}

public actual fun glNormal3dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormal3dv(v.toString())
    }
}

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormal3f(nx.toDouble(), ny.toDouble(), nz.toDouble())
    }
}

public actual fun glNormal3fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormal3fv(v.toString())
    }
}

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormal3i(nx, ny, nz)
    }
}

public actual fun glNormal3iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormal3iv(v.toString())
    }
}

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormal3s(nx.toInt(), ny.toInt(), nz.toInt())
    }
}

public actual fun glNormal3sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormal3sv(v.toString())
    }
}

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glNormalPointer(type.toInt(), stride, pointer.toString())
    }
}

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glOrtho(left, right, bottom, top, znear, zfar)
    }
}

public actual fun glPassThrough(token: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPassThrough(token.toDouble())
    }
}

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPixelMapfv(map.toInt(), mapsize, values.toString())
    }
}

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPixelMapuiv(map.toInt(), mapsize, values.toString())
    }
}

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPixelMapusv(map.toInt(), mapsize, values.toString())
    }
}

public actual fun glPixelStoref(pname: UInt, param1: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPixelStoref(pname.toInt(), param1.toDouble())
    }
}

public actual fun glPixelStorei(pname: UInt, param1: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPixelStorei(pname.toInt(), param1)
    }
}

public actual fun glPixelTransferf(pname: UInt, param1: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPixelTransferf(pname.toInt(), param1.toDouble())
    }
}

public actual fun glPixelTransferi(pname: UInt, param1: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPixelTransferi(pname.toInt(), param1)
    }
}

public actual fun glPixelZoom(xfactor: Float, yfactor: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPixelZoom(xfactor.toDouble(), yfactor.toDouble())
    }
}

public actual fun glPointSize(size: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPointSize(size.toDouble())
    }
}

public actual fun glPolygonMode(face: UInt, mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPolygonMode(face.toInt(), mode.toInt())
    }
}

public actual fun glPolygonOffset(factor: Float, units: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPolygonOffset(factor.toDouble(), units.toDouble())
    }
}

public actual fun glPolygonStipple(mask: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPolygonStipple(mask.toString())
    }
}

public actual fun glPopAttrib() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPopAttrib()
    }
}

public actual fun glPopClientAttrib() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPopClientAttrib()
    }
}

public actual fun glPopMatrix() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPopMatrix()
    }
}

public actual fun glPopName() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPopName()
    }
}

public actual fun glPrioritizeTextures(n: Int, textures: Long, priorities: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPrioritizeTextures(n, textures.toString(), priorities.toString())
    }
}

public actual fun glPushAttrib(mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPushAttrib(mask.toInt())
    }
}

public actual fun glPushClientAttrib(mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPushClientAttrib(mask.toInt())
    }
}

public actual fun glPushMatrix() {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPushMatrix()
    }
}

public actual fun glPushName(name: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glPushName(name.toInt())
    }
}

public actual fun glRasterPos2d(x: Double, y: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos2d(x, y)
    }
}

public actual fun glRasterPos2dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos2dv(v.toString())
    }
}

public actual fun glRasterPos2f(x: Float, y: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos2f(x.toDouble(), y.toDouble())
    }
}

public actual fun glRasterPos2fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos2fv(v.toString())
    }
}

public actual fun glRasterPos2i(x: Int, y: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos2i(x, y)
    }
}

public actual fun glRasterPos2iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos2iv(v.toString())
    }
}

public actual fun glRasterPos2s(x: Short, y: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos2s(x.toInt(), y.toInt())
    }
}

public actual fun glRasterPos2sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos2sv(v.toString())
    }
}

public actual fun glRasterPos3d(x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos3d(x, y, z)
    }
}

public actual fun glRasterPos3dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos3dv(v.toString())
    }
}

public actual fun glRasterPos3f(x: Float, y: Float, z: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos3f(x.toDouble(), y.toDouble(), z.toDouble())
    }
}

public actual fun glRasterPos3fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos3fv(v.toString())
    }
}

public actual fun glRasterPos3i(x: Int, y: Int, z: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos3i(x, y, z)
    }
}

public actual fun glRasterPos3iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos3iv(v.toString())
    }
}

public actual fun glRasterPos3s(x: Short, y: Short, z: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos3s(x.toInt(), y.toInt(), z.toInt())
    }
}

public actual fun glRasterPos3sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos3sv(v.toString())
    }
}

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos4d(x, y, z, w)
    }
}

public actual fun glRasterPos4dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos4dv(v.toString())
    }
}

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos4f(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())
    }
}

public actual fun glRasterPos4fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos4fv(v.toString())
    }
}

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos4i(x, y, z, w)
    }
}

public actual fun glRasterPos4iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos4iv(v.toString())
    }
}

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos4s(x.toInt(), y.toInt(), z.toInt(), w.toInt())
    }
}

public actual fun glRasterPos4sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRasterPos4sv(v.toString())
    }
}

public actual fun glReadBuffer(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glReadBuffer(mode.toInt())
    }
}

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glReadPixels(x, y, width, height, format.toInt(), type.toInt(), pixels.toString())
    }
}

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRectd(x1, y1, x2, y2)
    }
}

public actual fun glRectdv(v1: Long, v2: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRectdv(v1.toString(), v2.toString())
    }
}

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRectf(x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble())
    }
}

public actual fun glRectfv(v1: Long, v2: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRectfv(v1.toString(), v2.toString())
    }
}

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRecti(x1, y1, x2, y2)
    }
}

public actual fun glRectiv(v1: Long, v2: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRectiv(v1.toString(), v2.toString())
    }
}

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRects(x1.toInt(), y1.toInt(), x2.toInt(), y2.toInt())
    }
}

public actual fun glRectsv(v1: Long, v2: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRectsv(v1.toString(), v2.toString())
    }
}

public actual fun glRenderMode(mode: UInt): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRenderMode(mode.toInt()) as Int) else 0

public actual fun glRotated(angle: Double, x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRotated(angle, x, y, z)
    }
}

public actual fun glRotatef(angle: Float, x: Float, y: Float, z: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glRotatef(angle.toDouble(), x.toDouble(), y.toDouble(), z.toDouble())
    }
}

public actual fun glScaled(x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glScaled(x, y, z)
    }
}

public actual fun glScalef(x: Float, y: Float, z: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glScalef(x.toDouble(), y.toDouble(), z.toDouble())
    }
}

public actual fun glScissor(x: Int, y: Int, width: Int, height: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glScissor(x, y, width, height)
    }
}

public actual fun glSelectBuffer(size: Int, buffer: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glSelectBuffer(size, buffer.toString())
    }
}

public actual fun glShadeModel(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glShadeModel(mode.toInt())
    }
}

public actual fun glStencilFunc(func: UInt, ref: Int, mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glStencilFunc(func.toInt(), ref, mask.toInt())
    }
}

public actual fun glStencilMask(mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glStencilMask(mask.toInt())
    }
}

public actual fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glStencilOp(fail.toInt(), zfail.toInt(), zpass.toInt())
    }
}

public actual fun glTexCoord1d(s: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord1d(s)
    }
}

public actual fun glTexCoord1dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord1dv(v.toString())
    }
}

public actual fun glTexCoord1f(s: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord1f(s.toDouble())
    }
}

public actual fun glTexCoord1fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord1fv(v.toString())
    }
}

public actual fun glTexCoord1i(s: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord1i(s)
    }
}

public actual fun glTexCoord1iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord1iv(v.toString())
    }
}

public actual fun glTexCoord1s(s: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord1s(s.toInt())
    }
}

public actual fun glTexCoord1sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord1sv(v.toString())
    }
}

public actual fun glTexCoord2d(s: Double, t: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord2d(s, t)
    }
}

public actual fun glTexCoord2dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord2dv(v.toString())
    }
}

public actual fun glTexCoord2f(s: Float, t: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord2f(s.toDouble(), t.toDouble())
    }
}

public actual fun glTexCoord2fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord2fv(v.toString())
    }
}

public actual fun glTexCoord2i(s: Int, t: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord2i(s, t)
    }
}

public actual fun glTexCoord2iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord2iv(v.toString())
    }
}

public actual fun glTexCoord2s(s: Short, t: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord2s(s.toInt(), t.toInt())
    }
}

public actual fun glTexCoord2sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord2sv(v.toString())
    }
}

public actual fun glTexCoord3d(s: Double, t: Double, r: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord3d(s, t, r)
    }
}

public actual fun glTexCoord3dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord3dv(v.toString())
    }
}

public actual fun glTexCoord3f(s: Float, t: Float, r: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord3f(s.toDouble(), t.toDouble(), r.toDouble())
    }
}

public actual fun glTexCoord3fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord3fv(v.toString())
    }
}

public actual fun glTexCoord3i(s: Int, t: Int, r: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord3i(s, t, r)
    }
}

public actual fun glTexCoord3iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord3iv(v.toString())
    }
}

public actual fun glTexCoord3s(s: Short, t: Short, r: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord3s(s.toInt(), t.toInt(), r.toInt())
    }
}

public actual fun glTexCoord3sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord3sv(v.toString())
    }
}

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord4d(s, t, r, q)
    }
}

public actual fun glTexCoord4dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord4dv(v.toString())
    }
}

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord4f(s.toDouble(), t.toDouble(), r.toDouble(), q.toDouble())
    }
}

public actual fun glTexCoord4fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord4fv(v.toString())
    }
}

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord4i(s, t, r, q)
    }
}

public actual fun glTexCoord4iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord4iv(v.toString())
    }
}

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord4s(s.toInt(), t.toInt(), r.toInt(), q.toInt())
    }
}

public actual fun glTexCoord4sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoord4sv(v.toString())
    }
}

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexCoordPointer(size, type.toInt(), stride, pointer.toString())
    }
}

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexEnvf(target.toInt(), pname.toInt(), param2.toDouble())
    }
}

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexEnvfv(target.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexEnvi(target.toInt(), pname.toInt(), param2)
    }
}

public actual fun glTexEnviv(target: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexEnviv(target.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexGend(coord.toInt(), pname.toInt(), param2)
    }
}

public actual fun glTexGendv(coord: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexGendv(coord.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexGenf(coord.toInt(), pname.toInt(), param2.toDouble())
    }
}

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexGenfv(coord.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexGeni(coord.toInt(), pname.toInt(), param2)
    }
}

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexGeniv(coord.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexImage1D(target.toInt(), level, internalformat, width, border, format.toInt(), type.toInt(), pixels.toString())
    }
}

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexImage2D(target.toInt(), level, internalformat, width, height, border, format.toInt(), type.toInt(), pixels.toString())
    }
}

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexParameterf(target.toInt(), pname.toInt(), param2.toDouble())
    }
}

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexParameterfv(target.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexParameteri(target.toInt(), pname.toInt(), param2)
    }
}

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexParameteriv(target.toInt(), pname.toInt(), params.toString())
    }
}

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexSubImage1D(target.toInt(), level, xoffset, width, format.toInt(), type.toInt(), pixels.toString())
    }
}

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTexSubImage2D(target.toInt(), level, xoffset, yoffset, width, height, format.toInt(), type.toInt(), pixels.toString())
    }
}

public actual fun glTranslated(x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTranslated(x, y, z)
    }
}

public actual fun glTranslatef(x: Float, y: Float, z: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glTranslatef(x.toDouble(), y.toDouble(), z.toDouble())
    }
}

public actual fun glVertex2d(x: Double, y: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex2d(x, y)
    }
}

public actual fun glVertex2dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex2dv(v.toString())
    }
}

public actual fun glVertex2f(x: Float, y: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex2f(x.toDouble(), y.toDouble())
    }
}

public actual fun glVertex2fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex2fv(v.toString())
    }
}

public actual fun glVertex2i(x: Int, y: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex2i(x, y)
    }
}

public actual fun glVertex2iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex2iv(v.toString())
    }
}

public actual fun glVertex2s(x: Short, y: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex2s(x.toInt(), y.toInt())
    }
}

public actual fun glVertex2sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex2sv(v.toString())
    }
}

public actual fun glVertex3d(x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex3d(x, y, z)
    }
}

public actual fun glVertex3dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex3dv(v.toString())
    }
}

public actual fun glVertex3f(x: Float, y: Float, z: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex3f(x.toDouble(), y.toDouble(), z.toDouble())
    }
}

public actual fun glVertex3fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex3fv(v.toString())
    }
}

public actual fun glVertex3i(x: Int, y: Int, z: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex3i(x, y, z)
    }
}

public actual fun glVertex3iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex3iv(v.toString())
    }
}

public actual fun glVertex3s(x: Short, y: Short, z: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex3s(x.toInt(), y.toInt(), z.toInt())
    }
}

public actual fun glVertex3sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex3sv(v.toString())
    }
}

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex4d(x, y, z, w)
    }
}

public actual fun glVertex4dv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex4dv(v.toString())
    }
}

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex4f(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())
    }
}

public actual fun glVertex4fv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex4fv(v.toString())
    }
}

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex4i(x, y, z, w)
    }
}

public actual fun glVertex4iv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex4iv(v.toString())
    }
}

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex4s(x.toInt(), y.toInt(), z.toInt(), w.toInt())
    }
}

public actual fun glVertex4sv(v: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertex4sv(v.toString())
    }
}

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glVertexPointer(size, type.toInt(), stride, pointer.toString())
    }
}

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_glViewport(x, y, width, height)
    }
}

public actual fun gluBeginCurve(nobj: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluBeginCurve(nobj.toString())
    }
}

public actual fun gluBeginPolygon(tess: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluBeginPolygon(tess.toString())
    }
}

public actual fun gluBeginSurface(nobj: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluBeginSurface(nobj.toString())
    }
}

public actual fun gluBeginTrim(nobj: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluBeginTrim(nobj.toString())
    }
}

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: Long): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps(target.toInt(), components, width, format.toInt(), type.toInt(), data.toString()) as Int) else 0

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: Long): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps(target.toInt(), components, width, height, format.toInt(), type.toInt(), data.toString()) as Int) else 0

public actual fun gluCylinder(qobj: Long, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluCylinder(qobj.toString(), baseradius, topradius, height, slices, stacks)
    }
}

public actual fun gluDeleteNurbsRenderer(nobj: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer(nobj.toString())
    }
}

public actual fun gluDeleteQuadric(state: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluDeleteQuadric(state.toString())
    }
}

public actual fun gluDeleteTess(tess: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluDeleteTess(tess.toString())
    }
}

public actual fun gluDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluDisk(qobj.toString(), innerradius, outerradius, slices, loops)
    }
}

public actual fun gluEndCurve(nobj: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluEndCurve(nobj.toString())
    }
}

public actual fun gluEndPolygon(tess: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluEndPolygon(tess.toString())
    }
}

public actual fun gluEndSurface(nobj: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluEndSurface(nobj.toString())
    }
}

public actual fun gluEndTrim(nobj: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluEndTrim(nobj.toString())
    }
}

public actual fun gluErrorString(errcode: UInt): Long =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluErrorString(errcode.toInt()) as String).toLong() else 0L

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): PCWSTR =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT(errcode.toInt()) as String).toLong() else 0L

public actual fun gluGetNurbsProperty(nobj: Long, property: UInt, value: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty(nobj.toString(), property.toInt(), value.toString())
    }
}

public actual fun gluGetString(name: UInt): Long =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluGetString(name.toInt()) as String).toLong() else 0L

public actual fun gluGetTessProperty(tess: Long, which: UInt, value: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluGetTessProperty(tess.toString(), which.toInt(), value.toString())
    }
}

public actual fun gluLoadSamplingMatrices(nobj: Long, modelmatrix: Long, projmatrix: Long, viewport: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices(nobj.toString(), modelmatrix.toString(), projmatrix.toString(), viewport.toString())
    }
}

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluLookAt(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz)
    }
}

public actual fun gluNewNurbsRenderer(): Long =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer() as String).toLong() else 0L

public actual fun gluNewQuadric(): Long =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluNewQuadric() as String).toLong() else 0L

public actual fun gluNewTess(): Long =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluNewTess() as String).toLong() else 0L

public actual fun gluNextContour(tess: Long, type: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluNextContour(tess.toString(), type.toInt())
    }
}

public actual fun gluNurbsCallback(nobj: Long, which: UInt, fn: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluNurbsCallback(nobj.toString(), which.toInt(), fn.toString())
    }
}

public actual fun gluNurbsCurve(nobj: Long, nknots: Int, knot: Long, stride: Int, ctlarray: Long, order: Int, type: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluNurbsCurve(nobj.toString(), nknots, knot.toString(), stride, ctlarray.toString(), order, type.toInt())
    }
}

public actual fun gluNurbsProperty(nobj: Long, property: UInt, value: Float) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluNurbsProperty(nobj.toString(), property.toInt(), value.toDouble())
    }
}

public actual fun gluNurbsSurface(nobj: Long, sknot_count: Int, sknot: Long, tknot_count: Int, tknot: Long, s_stride: Int, t_stride: Int, ctlarray: Long, sorder: Int, torder: Int, type: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluNurbsSurface(nobj.toString(), sknot_count, sknot.toString(), tknot_count, tknot.toString(), s_stride, t_stride, ctlarray.toString(), sorder, torder, type.toInt())
    }
}

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluOrtho2D(left, right, bottom, top)
    }
}

public actual fun gluPartialDisk(qobj: Long, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluPartialDisk(qobj.toString(), innerradius, outerradius, slices, loops, startangle, sweepangle)
    }
}

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluPerspective(fovy, aspect, znear, zfar)
    }
}

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluPickMatrix(x, y, width, height, viewport.toString())
    }
}

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, winx: Long, winy: Long, winz: Long): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluProject(objx, objy, objz, modelmatrix.toString(), projmatrix.toString(), viewport.toString(), winx.toString(), winy.toString(), winz.toString()) as Int) else 0

public actual fun gluPwlCurve(nobj: Long, count: Int, array: Long, stride: Int, type: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluPwlCurve(nobj.toString(), count, array.toString(), stride, type.toInt())
    }
}

public actual fun gluQuadricCallback(qobj: Long, which: UInt, fn: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluQuadricCallback(qobj.toString(), which.toInt(), fn.toString())
    }
}

public actual fun gluQuadricDrawStyle(quadobject: Long, drawstyle: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle(quadobject.toString(), drawstyle.toInt())
    }
}

public actual fun gluQuadricNormals(quadobject: Long, normals: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluQuadricNormals(quadobject.toString(), normals.toInt())
    }
}

public actual fun gluQuadricOrientation(quadobject: Long, orientation: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluQuadricOrientation(quadobject.toString(), orientation.toInt())
    }
}

public actual fun gluQuadricTexture(quadobject: Long, texturecoords: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluQuadricTexture(quadobject.toString(), texturecoords.toInt())
    }
}

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: Long, widthout: Int, heightout: Int, typeout: UInt, dataout: Long): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluScaleImage(format.toInt(), widthin, heightin, typein.toInt(), datain.toString(), widthout, heightout, typeout.toInt(), dataout.toString()) as Int) else 0

public actual fun gluSphere(qobj: Long, radius: Double, slices: Int, stacks: Int) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluSphere(qobj.toString(), radius, slices, stacks)
    }
}

public actual fun gluTessBeginContour(tess: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluTessBeginContour(tess.toString())
    }
}

public actual fun gluTessBeginPolygon(tess: Long, polygon_data: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon(tess.toString(), polygon_data.toString())
    }
}

public actual fun gluTessCallback(tess: Long, which: UInt, fn: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluTessCallback(tess.toString(), which.toInt(), fn.toString())
    }
}

public actual fun gluTessEndContour(tess: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluTessEndContour(tess.toString())
    }
}

public actual fun gluTessEndPolygon(tess: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluTessEndPolygon(tess.toString())
    }
}

public actual fun gluTessNormal(tess: Long, x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluTessNormal(tess.toString(), x, y, z)
    }
}

public actual fun gluTessProperty(tess: Long, which: UInt, value: Double) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluTessProperty(tess.toString(), which.toInt(), value)
    }
}

public actual fun gluTessVertex(tess: Long, coords: Long, data: Long) {
    if (_windowsWin32GraphicsOpenglNapiAddon != null) {
        _windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluTessVertex(tess.toString(), coords.toString(), data.toString())
    }
}

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: Long, projmatrix: Long, viewport: Long, objx: Long, objy: Long, objz: Long): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_gluUnProject(winx, winy, winz, modelmatrix.toString(), projmatrix.toString(), viewport.toString(), objx.toString(), objy.toString(), objz.toString()) as Int) else 0

public actual fun wglCopyContext(param0: HGLRC, param1: HGLRC, param2: UInt): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglCopyContext(param0.toString(), param1.toString(), param2.toInt()) as Int) else 0

public actual fun wglCreateContext(param0: HDC): HGLRC =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglCreateContext(param0.toString()) as String).toLong() else 0L

public actual fun wglCreateLayerContext(param0: HDC, param1: Int): HGLRC =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglCreateLayerContext(param0.toString(), param1) as String).toLong() else 0L

public actual fun wglDeleteContext(param0: HGLRC): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglDeleteContext(param0.toString()) as Int) else 0

public actual fun wglDescribeLayerPlane(param0: HDC, param1: Int, param2: Int, param3: UInt, param4: Long): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane(param0.toString(), param1, param2, param3.toInt(), param4.toString()) as Int) else 0

public actual fun wglGetCurrentContext(): HGLRC =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglGetCurrentContext() as String).toLong() else 0L

public actual fun wglGetCurrentDC(): HDC =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglGetCurrentDC() as String).toLong() else 0L

public actual fun wglGetLayerPaletteEntries(param0: HDC, param1: Int, param2: Int, param3: Int, param4: Long): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries(param0.toString(), param1, param2, param3, param4.toString()) as Int) else 0

public actual fun wglGetProcAddress(param0: PCSTR): PROC =
    null

public actual fun wglMakeCurrent(param0: HDC, param1: HGLRC): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglMakeCurrent(param0.toString(), param1.toString()) as Int) else 0

public actual fun wglRealizeLayerPalette(param0: HDC, param1: Int, param2: BOOL): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette(param0.toString(), param1, param2) as Int) else 0

public actual fun wglSetLayerPaletteEntries(param0: HDC, param1: Int, param2: Int, param3: Int, param4: Long): Int =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries(param0.toString(), param1, param2, param3, param4.toString()) as Int) else 0

public actual fun wglShareLists(param0: HGLRC, param1: HGLRC): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglShareLists(param0.toString(), param1.toString()) as Int) else 0

public actual fun wglSwapLayerBuffers(param0: HDC, param1: UInt): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers(param0.toString(), param1.toInt()) as Int) else 0

public actual fun wglUseFontBitmapsA(param0: HDC, param1: UInt, param2: UInt, param3: UInt): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA(param0.toString(), param1.toInt(), param2.toInt(), param3.toInt()) as Int) else 0

public actual fun wglUseFontBitmapsW(param0: HDC, param1: UInt, param2: UInt, param3: UInt): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW(param0.toString(), param1.toInt(), param2.toInt(), param3.toInt()) as Int) else 0

public actual fun wglUseFontOutlinesA(param0: HDC, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: Long): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA(param0.toString(), param1.toInt(), param2.toInt(), param3.toInt(), param4.toDouble(), param5.toDouble(), param6, param7.toString()) as Int) else 0

public actual fun wglUseFontOutlinesW(param0: HDC, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: Long): BOOL =
    if (_windowsWin32GraphicsOpenglNapiAddon != null) (_windowsWin32GraphicsOpenglNapiAddon.windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW(param0.toString(), param1.toInt(), param2.toInt(), param3.toInt(), param4.toDouble(), param5.toDouble(), param6, param7.toString()) as Int) else 0
