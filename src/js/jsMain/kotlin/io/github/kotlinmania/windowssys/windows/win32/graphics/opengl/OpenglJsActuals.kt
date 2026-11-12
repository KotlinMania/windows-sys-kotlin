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

private val windowsWin32GraphicsOpenglNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun choosePixelFormat(hdc: Hdc, ppfd: ConstPtr<Pixelformatdescriptor>): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglChoosePixelFormat(hdc.rawAddress.toString(), ppfd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun describePixelFormat(hdc: Hdc, ipixelformat: Int, nbytes: UInt, ppfd: MutPtr<Pixelformatdescriptor>): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglDescribePixelFormat(hdc.rawAddress.toString(), ipixelformat, nbytes.toInt(), ppfd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFilePixelFormat(hemf: Henhmetafile, cbbuffer: UInt, ppfd: MutPtr<Pixelformatdescriptor>): UInt =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGetEnhMetaFilePixelFormat(hemf.rawAddress.toString(), cbbuffer.toInt(), ppfd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPixelFormat(hdc: Hdc): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGetPixelFormat(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPixelFormat(hdc: Hdc, format: Int, ppfd: ConstPtr<Pixelformatdescriptor>): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglSetPixelFormat(hdc.rawAddress.toString(), format, ppfd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapBuffers(param0: Hdc): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglSwapBuffers(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glAccum(op: UInt, value: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlAccum(op.toInt(), value.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glAlphaFunc(func: UInt, ref: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlAlphaFunc(func.toInt(), ref.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glAreTexturesResident(n: Int, textures: ConstPtr<UInt>, residences: MutPtr<UByte>): UByte =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlAreTexturesResident(n, textures.rawAddress.toString(), residences.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glArrayElement(i: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlArrayElement(i)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBegin(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlBegin(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBindTexture(target: UInt, texture: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlBindTexture(target.toInt(), texture.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlBitmap(width, height, xorig.toDouble(), yorig.toDouble(), xmove.toDouble(), ymove.toDouble(), bitmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlBlendFunc(sfactor.toInt(), dfactor.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCallList(list: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlCallList(list.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCallLists(n: Int, type: UInt, lists: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlCallLists(n, type.toInt(), lists.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClear(mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlClear(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlClearAccum(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlClearColor(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearDepth(depth: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlClearDepth(depth)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearIndex(c: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlClearIndex(c.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearStencil(s: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlClearStencil(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClipPlane(plane: UInt, equation: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlClipPlane(plane.toInt(), equation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3b(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3bv(v: ConstPtr<Byte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3bv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3d(red: Double, green: Double, blue: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3d(red, green, blue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3f(red: Float, green: Float, blue: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3f(red.toDouble(), green.toDouble(), blue.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3i(red: Int, green: Int, blue: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3i(red, green, blue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3s(red: Short, green: Short, blue: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3s(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3ub(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3ubv(v: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3ubv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3ui(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3uiv(v: ConstPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3uiv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3us(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3usv(v: ConstPtr<UShort>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor3usv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4b(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4bv(v: ConstPtr<Byte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4bv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4d(red, green, blue, alpha)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4f(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4i(red, green, blue, alpha)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4s(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4ub(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4ubv(v: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4ubv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4ui(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4uiv(v: ConstPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4uiv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4us(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4usv(v: ConstPtr<UShort>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColor4usv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColorMask(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColorMaterial(face: UInt, mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColorMaterial(face.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlColorPointer(size, type.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlCopyPixels(x, y, width, height, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D(target.toInt(), level, internalformat.toInt(), x, y, width, border)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D(target.toInt(), level, internalformat.toInt(), x, y, width, height, border)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D(target.toInt(), level, xoffset, x, y, width)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D(target.toInt(), level, xoffset, yoffset, x, y, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCullFace(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlCullFace(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDeleteLists(list: UInt, range: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDeleteLists(list.toInt(), range)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDeleteTextures(n: Int, textures: ConstPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDeleteTextures(n, textures.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDepthFunc(func: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDepthFunc(func.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDepthMask(flag: UByte) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDepthMask(flag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDepthRange(znear: Double, zfar: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDepthRange(znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDisable(cap: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDisable(cap.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDisableClientState(array: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDisableClientState(array.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawArrays(mode: UInt, first: Int, count: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDrawArrays(mode.toInt(), first, count)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawBuffer(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDrawBuffer(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDrawElements(mode.toInt(), count, type.toInt(), indices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlDrawPixels(width, height, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEdgeFlag(flag: UByte) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEdgeFlag(flag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEdgeFlagPointer(stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEdgeFlagPointer(stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEdgeFlagv(flag: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEdgeFlagv(flag.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEnable(cap: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEnable(cap.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEnableClientState(array: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEnableClientState(array.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEnd() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEnd()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEndList() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEndList()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1d(u: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1d(u)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1dv(u: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1dv(u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1f(u: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1f(u.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1fv(u: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1fv(u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2d(u: Double, v: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2d(u, v)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2dv(u: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2dv(u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2f(u: Float, v: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2f(u.toDouble(), v.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2fv(u: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2fv(u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalMesh1(mode: UInt, i1: Int, i2: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalMesh1(mode.toInt(), i1, i2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalMesh2(mode.toInt(), i1, i2, j1, j2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalPoint1(i: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalPoint1(i)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalPoint2(i: Int, j: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlEvalPoint2(i, j)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlFeedbackBuffer(size, type.toInt(), buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFinish() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlFinish()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFlush() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlFlush()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogf(pname: UInt, param1: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlFogf(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogfv(pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlFogfv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogi(pname: UInt, param1: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlFogi(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogiv(pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlFogiv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFrontFace(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlFrontFace(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlFrustum(left, right, bottom, top, znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGenLists(range: Int): UInt =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGenLists(range) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glGenTextures(n: Int, textures: MutPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGenTextures(n, textures.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetBooleanv(pname: UInt, params: MutPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetBooleanv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetClipPlane(plane: UInt, equation: MutPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetClipPlane(plane.toInt(), equation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetDoublev(pname: UInt, params: MutPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetDoublev(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetError(): UInt =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetError() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glGetFloatv(pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetFloatv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetIntegerv(pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetIntegerv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetLightfv(light: UInt, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetLightfv(light.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetLightiv(light: UInt, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetLightiv(light.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMapdv(target: UInt, query: UInt, v: MutPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetMapdv(target.toInt(), query.toInt(), v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMapfv(target: UInt, query: UInt, v: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetMapfv(target.toInt(), query.toInt(), v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMapiv(target: UInt, query: UInt, v: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetMapiv(target.toInt(), query.toInt(), v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetMaterialfv(face.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetMaterialiv(face.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPixelMapfv(map: UInt, values: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetPixelMapfv(map.toInt(), values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPixelMapuiv(map: UInt, values: MutPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetPixelMapuiv(map.toInt(), values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPixelMapusv(map: UInt, values: MutPtr<UShort>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetPixelMapusv(map.toInt(), values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPointerv(pname: UInt, params: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetPointerv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPolygonStipple(mask: MutPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetPolygonStipple(mask.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetString(name: UInt): MutPtr<UByte> =
    if (windowsWin32GraphicsOpenglNapiAddon != null) MutPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetString(name.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetTexEnvfv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetTexEnviv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: MutPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetTexGendv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetTexGenfv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetTexGeniv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: MutPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetTexImage(target.toInt(), level, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameterfv(target.toInt(), level, pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameteriv(target.toInt(), level, pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetTexParameterfv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlGetTexParameteriv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glHint(target: UInt, mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlHint(target.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexMask(mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexMask(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexPointer(type.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexd(c: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexd(c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexdv(c: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexdv(c.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexf(c: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexf(c.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexfv(c: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexfv(c.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexi(c: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexi(c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexiv(c: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexiv(c.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexs(c: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexs(c.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexsv(c: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexsv(c.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexub(c: UByte) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexub(c.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexubv(c: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIndexubv(c.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glInitNames() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlInitNames()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlInterleavedArrays(format.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIsEnabled(cap: UInt): UByte =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIsEnabled(cap.toInt()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glIsList(list: UInt): UByte =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIsList(list.toInt()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glIsTexture(texture: UInt): UByte =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlIsTexture(texture.toInt()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glLightModelf(pname: UInt, param1: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLightModelf(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightModelfv(pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLightModelfv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightModeli(pname: UInt, param1: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLightModeli(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightModeliv(pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLightModeliv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightf(light: UInt, pname: UInt, param2: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLightf(light.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightfv(light: UInt, pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLightfv(light.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLighti(light: UInt, pname: UInt, param2: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLighti(light.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightiv(light: UInt, pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLightiv(light.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLineStipple(factor: Int, pattern: UShort) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLineStipple(factor, pattern.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLineWidth(width: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLineWidth(width.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glListBase(base: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlListBase(base.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadIdentity() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLoadIdentity()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadMatrixd(m: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLoadMatrixd(m.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadMatrixf(m: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLoadMatrixf(m.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadName(name: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLoadName(name.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLogicOp(opcode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlLogicOp(opcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMap1d(target.toInt(), u1, u2, stride, order, points.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMap1f(target.toInt(), u1.toDouble(), u2.toDouble(), stride, order, points.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMap2d(target.toInt(), u1, u2, ustride, uorder, v1, v2, vstride, vorder, points.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMap2f(target.toInt(), u1.toDouble(), u2.toDouble(), ustride, uorder, v1.toDouble(), v2.toDouble(), vstride, vorder, points.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid1d(un: Int, u1: Double, u2: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMapGrid1d(un, u1, u2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid1f(un: Int, u1: Float, u2: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMapGrid1f(un, u1.toDouble(), u2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMapGrid2d(un, u1, u2, vn, v1, v2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMapGrid2f(un, u1.toDouble(), u2.toDouble(), vn, v1.toDouble(), v2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMaterialf(face: UInt, pname: UInt, param2: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMaterialf(face.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMaterialfv(face: UInt, pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMaterialfv(face.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMateriali(face.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMaterialiv(face: UInt, pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMaterialiv(face.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMatrixMode(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMatrixMode(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMultMatrixd(m: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMultMatrixd(m.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMultMatrixf(m: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlMultMatrixf(m.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNewList(list: UInt, mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNewList(list.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormal3b(nx.toInt(), ny.toInt(), nz.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3bv(v: ConstPtr<Byte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormal3bv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormal3d(nx, ny, nz)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormal3dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormal3f(nx.toDouble(), ny.toDouble(), nz.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormal3fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormal3i(nx, ny, nz)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormal3iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormal3s(nx.toInt(), ny.toInt(), nz.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormal3sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlNormalPointer(type.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlOrtho(left, right, bottom, top, znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPassThrough(token: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPassThrough(token.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPixelMapfv(map.toInt(), mapsize, values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: ConstPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPixelMapuiv(map.toInt(), mapsize, values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: ConstPtr<UShort>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPixelMapusv(map.toInt(), mapsize, values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelStoref(pname: UInt, param1: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPixelStoref(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelStorei(pname: UInt, param1: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPixelStorei(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelTransferf(pname: UInt, param1: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPixelTransferf(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelTransferi(pname: UInt, param1: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPixelTransferi(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelZoom(xfactor: Float, yfactor: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPixelZoom(xfactor.toDouble(), yfactor.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPointSize(size: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPointSize(size.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPolygonMode(face: UInt, mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPolygonMode(face.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPolygonOffset(factor: Float, units: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPolygonOffset(factor.toDouble(), units.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPolygonStipple(mask: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPolygonStipple(mask.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopAttrib() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPopAttrib()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopClientAttrib() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPopClientAttrib()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopMatrix() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPopMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopName() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPopName()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPrioritizeTextures(n: Int, textures: ConstPtr<UInt>, priorities: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPrioritizeTextures(n, textures.rawAddress.toString(), priorities.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushAttrib(mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPushAttrib(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushClientAttrib(mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPushClientAttrib(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushMatrix() {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPushMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushName(name: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlPushName(name.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2d(x: Double, y: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos2d(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos2dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2f(x: Float, y: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos2f(x.toDouble(), y.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos2fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2i(x: Int, y: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos2i(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos2iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2s(x: Short, y: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos2s(x.toInt(), y.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos2sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3d(x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos3d(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos3dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3f(x: Float, y: Float, z: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos3f(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos3fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3i(x: Int, y: Int, z: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos3i(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos3iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3s(x: Short, y: Short, z: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos3s(x.toInt(), y.toInt(), z.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos3sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos4d(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos4dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos4f(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos4fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos4i(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos4iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos4s(x.toInt(), y.toInt(), z.toInt(), w.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRasterPos4sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glReadBuffer(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlReadBuffer(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: MutPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlReadPixels(x, y, width, height, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRectd(x1, y1, x2, y2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectdv(v1: ConstPtr<Double>, v2: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRectdv(v1.rawAddress.toString(), v2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRectf(x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectfv(v1: ConstPtr<Float>, v2: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRectfv(v1.rawAddress.toString(), v2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRecti(x1, y1, x2, y2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectiv(v1: ConstPtr<Int>, v2: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRectiv(v1.rawAddress.toString(), v2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRects(x1.toInt(), y1.toInt(), x2.toInt(), y2.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectsv(v1: ConstPtr<Short>, v2: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRectsv(v1.rawAddress.toString(), v2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRenderMode(mode: UInt): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRenderMode(mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glRotated(angle: Double, x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRotated(angle, x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRotatef(angle: Float, x: Float, y: Float, z: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlRotatef(angle.toDouble(), x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glScaled(x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlScaled(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glScalef(x: Float, y: Float, z: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlScalef(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glScissor(x: Int, y: Int, width: Int, height: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlScissor(x, y, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glSelectBuffer(size: Int, buffer: MutPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlSelectBuffer(size, buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glShadeModel(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlShadeModel(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glStencilFunc(func: UInt, ref: Int, mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlStencilFunc(func.toInt(), ref, mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glStencilMask(mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlStencilMask(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlStencilOp(fail.toInt(), zfail.toInt(), zpass.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1d(s: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord1d(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord1dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1f(s: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord1f(s.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord1fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1i(s: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord1i(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord1iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1s(s: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord1s(s.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord1sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2d(s: Double, t: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord2d(s, t)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord2dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2f(s: Float, t: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord2f(s.toDouble(), t.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord2fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2i(s: Int, t: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord2i(s, t)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord2iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2s(s: Short, t: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord2s(s.toInt(), t.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord2sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3d(s: Double, t: Double, r: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord3d(s, t, r)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord3dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3f(s: Float, t: Float, r: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord3f(s.toDouble(), t.toDouble(), r.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord3fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3i(s: Int, t: Int, r: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord3i(s, t, r)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord3iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3s(s: Short, t: Short, r: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord3s(s.toInt(), t.toInt(), r.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord3sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord4d(s, t, r, q)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord4dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord4f(s.toDouble(), t.toDouble(), r.toDouble(), q.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord4fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord4i(s, t, r, q)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord4iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord4s(s.toInt(), t.toInt(), r.toInt(), q.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoord4sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexCoordPointer(size, type.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexEnvf(target.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexEnvfv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexEnvi(target.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnviv(target: UInt, pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexEnviv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexGend(coord.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGendv(coord: UInt, pname: UInt, params: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexGendv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexGenf(coord.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexGenfv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexGeni(coord.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexGeniv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexImage1D(target.toInt(), level, internalformat, width, border, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexImage2D(target.toInt(), level, internalformat, width, height, border, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexParameterf(target.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexParameterfv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexParameteri(target.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexParameteriv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexSubImage1D(target.toInt(), level, xoffset, width, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTexSubImage2D(target.toInt(), level, xoffset, yoffset, width, height, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTranslated(x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTranslated(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTranslatef(x: Float, y: Float, z: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlTranslatef(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2d(x: Double, y: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex2d(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex2dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2f(x: Float, y: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex2f(x.toDouble(), y.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex2fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2i(x: Int, y: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex2i(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex2iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2s(x: Short, y: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex2s(x.toInt(), y.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex2sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3d(x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex3d(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex3dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3f(x: Float, y: Float, z: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex3f(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex3fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3i(x: Int, y: Int, z: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex3i(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex3iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3s(x: Short, y: Short, z: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex3s(x.toInt(), y.toInt(), z.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex3sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex4d(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex4dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex4f(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex4fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex4i(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex4iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex4s(x.toInt(), y.toInt(), z.toInt(), w.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertex4sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlVertexPointer(size, type.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGlViewport(x, y, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginCurve(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluBeginCurve(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginPolygon(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluBeginPolygon(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginSurface(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluBeginSurface(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginTrim(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluBeginTrim(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: ConstPtr<CVoid>): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluBuild1DMipmaps(target.toInt(), components, width, format.toInt(), type.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: ConstPtr<CVoid>): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluBuild2DMipmaps(target.toInt(), components, width, height, format.toInt(), type.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluCylinder(qobj: MutPtr<GLUquadric>, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluCylinder(qobj.rawAddress.toString(), baseradius, topradius, height, slices, stacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDeleteNurbsRenderer(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluDeleteNurbsRenderer(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDeleteQuadric(state: MutPtr<GLUquadric>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluDeleteQuadric(state.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDeleteTess(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluDeleteTess(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDisk(qobj: MutPtr<GLUquadric>, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluDisk(qobj.rawAddress.toString(), innerradius, outerradius, slices, loops)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndCurve(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluEndCurve(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndPolygon(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluEndPolygon(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndSurface(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluEndSurface(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndTrim(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluEndTrim(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluErrorString(errcode: UInt): MutPtr<UByte> =
    if (windowsWin32GraphicsOpenglNapiAddon != null) MutPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluErrorString(errcode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): Pcwstr =
    if (windowsWin32GraphicsOpenglNapiAddon != null) ConstPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluErrorUnicodeStringEXT(errcode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluGetNurbsProperty(nobj: MutPtr<GLUnurbs>, property: UInt, value: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluGetNurbsProperty(nobj.rawAddress.toString(), property.toInt(), value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluGetString(name: UInt): MutPtr<UByte> =
    if (windowsWin32GraphicsOpenglNapiAddon != null) MutPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluGetString(name.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluGetTessProperty(tess: MutPtr<GLUtesselator>, which: UInt, value: MutPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluGetTessProperty(tess.rawAddress.toString(), which.toInt(), value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluLoadSamplingMatrices(nobj: MutPtr<GLUnurbs>, modelmatrix: ConstPtr<Float>, projmatrix: ConstPtr<Float>, viewport: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluLoadSamplingMatrices(nobj.rawAddress.toString(), modelmatrix.rawAddress.toString(), projmatrix.rawAddress.toString(), viewport.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluLookAt(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNewNurbsRenderer(): MutPtr<GLUnurbs> =
    if (windowsWin32GraphicsOpenglNapiAddon != null) MutPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluNewNurbsRenderer() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluNewQuadric(): MutPtr<GLUquadric> =
    if (windowsWin32GraphicsOpenglNapiAddon != null) MutPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluNewQuadric() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluNewTess(): MutPtr<GLUtesselator> =
    if (windowsWin32GraphicsOpenglNapiAddon != null) MutPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluNewTess() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluNextContour(tess: MutPtr<GLUtesselator>, type: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluNextContour(tess.rawAddress.toString(), type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsCallback(nobj: MutPtr<GLUnurbs>, which: UInt, fn: Long) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluNurbsCallback(nobj.rawAddress.toString(), which.toInt(), fn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsCurve(nobj: MutPtr<GLUnurbs>, nknots: Int, knot: MutPtr<Float>, stride: Int, ctlarray: MutPtr<Float>, order: Int, type: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluNurbsCurve(nobj.rawAddress.toString(), nknots, knot.rawAddress.toString(), stride, ctlarray.rawAddress.toString(), order, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsProperty(nobj: MutPtr<GLUnurbs>, property: UInt, value: Float) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluNurbsProperty(nobj.rawAddress.toString(), property.toInt(), value.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsSurface(nobj: MutPtr<GLUnurbs>, sknotCount: Int, sknot: MutPtr<Float>, tknotCount: Int, tknot: MutPtr<Float>, sStride: Int, tStride: Int, ctlarray: MutPtr<Float>, sorder: Int, torder: Int, type: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluNurbsSurface(nobj.rawAddress.toString(), sknotCount, sknot.rawAddress.toString(), tknotCount, tknot.rawAddress.toString(), sStride, tStride, ctlarray.rawAddress.toString(), sorder, torder, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluOrtho2D(left, right, bottom, top)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluPartialDisk(qobj: MutPtr<GLUquadric>, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluPartialDisk(qobj.rawAddress.toString(), innerradius, outerradius, slices, loops, startangle, sweepangle)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluPerspective(fovy, aspect, znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluPickMatrix(x, y, width, height, viewport.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: ConstPtr<Double>, projmatrix: ConstPtr<Double>, viewport: ConstPtr<Int>, winx: MutPtr<Double>, winy: MutPtr<Double>, winz: MutPtr<Double>): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluProject(objx, objy, objz, modelmatrix.rawAddress.toString(), projmatrix.rawAddress.toString(), viewport.rawAddress.toString(), winx.rawAddress.toString(), winy.rawAddress.toString(), winz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluPwlCurve(nobj: MutPtr<GLUnurbs>, count: Int, array: MutPtr<Float>, stride: Int, type: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluPwlCurve(nobj.rawAddress.toString(), count, array.rawAddress.toString(), stride, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricCallback(qobj: MutPtr<GLUquadric>, which: UInt, fn: Long) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluQuadricCallback(qobj.rawAddress.toString(), which.toInt(), fn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricDrawStyle(quadobject: MutPtr<GLUquadric>, drawstyle: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluQuadricDrawStyle(quadobject.rawAddress.toString(), drawstyle.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricNormals(quadobject: MutPtr<GLUquadric>, normals: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluQuadricNormals(quadobject.rawAddress.toString(), normals.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricOrientation(quadobject: MutPtr<GLUquadric>, orientation: UInt) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluQuadricOrientation(quadobject.rawAddress.toString(), orientation.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricTexture(quadobject: MutPtr<GLUquadric>, texturecoords: UByte) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluQuadricTexture(quadobject.rawAddress.toString(), texturecoords.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: ConstPtr<CVoid>, widthout: Int, heightout: Int, typeout: UInt, dataout: MutPtr<CVoid>): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluScaleImage(format.toInt(), widthin, heightin, typein.toInt(), datain.rawAddress.toString(), widthout, heightout, typeout.toInt(), dataout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluSphere(qobj: MutPtr<GLUquadric>, radius: Double, slices: Int, stacks: Int) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluSphere(qobj.rawAddress.toString(), radius, slices, stacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessBeginContour(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluTessBeginContour(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessBeginPolygon(tess: MutPtr<GLUtesselator>, polygonData: MutPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluTessBeginPolygon(tess.rawAddress.toString(), polygonData.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessCallback(tess: MutPtr<GLUtesselator>, which: UInt, fn: Long) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluTessCallback(tess.rawAddress.toString(), which.toInt(), fn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessEndContour(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluTessEndContour(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessEndPolygon(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluTessEndPolygon(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessNormal(tess: MutPtr<GLUtesselator>, x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluTessNormal(tess.rawAddress.toString(), x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessProperty(tess: MutPtr<GLUtesselator>, which: UInt, value: Double) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluTessProperty(tess.rawAddress.toString(), which.toInt(), value)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessVertex(tess: MutPtr<GLUtesselator>, coords: MutPtr<Double>, data: MutPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAddon != null) {
        windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluTessVertex(tess.rawAddress.toString(), coords.rawAddress.toString(), data.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: ConstPtr<Double>, projmatrix: ConstPtr<Double>, viewport: ConstPtr<Int>, objx: MutPtr<Double>, objy: MutPtr<Double>, objz: MutPtr<Double>): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglGluUnProject(winx, winy, winz, modelmatrix.rawAddress.toString(), projmatrix.rawAddress.toString(), viewport.rawAddress.toString(), objx.rawAddress.toString(), objy.rawAddress.toString(), objz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglCopyContext(param0: Hglrc, param1: Hglrc, param2: UInt): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglCopyContext(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglCreateContext(param0: Hdc): Hglrc =
    if (windowsWin32GraphicsOpenglNapiAddon != null) MutPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglCreateContext(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglCreateLayerContext(param0: Hdc, param1: Int): Hglrc =
    if (windowsWin32GraphicsOpenglNapiAddon != null) MutPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglCreateLayerContext(param0.rawAddress.toString(), param1) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglDeleteContext(param0: Hglrc): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglDeleteContext(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglDescribeLayerPlane(param0: Hdc, param1: Int, param2: Int, param3: UInt, param4: MutPtr<Layerplanedescriptor>): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglDescribeLayerPlane(param0.rawAddress.toString(), param1, param2, param3.toInt(), param4.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetCurrentContext(): Hglrc =
    if (windowsWin32GraphicsOpenglNapiAddon != null) MutPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglGetCurrentContext() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetCurrentDC(): Hdc =
    if (windowsWin32GraphicsOpenglNapiAddon != null) MutPtr((windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglGetCurrentDC() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: MutPtr<Colorref>): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglGetLayerPaletteEntries(param0.rawAddress.toString(), param1, param2, param3, param4.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetProcAddress(param0: Pcstr): Proc =
    if (windowsWin32GraphicsOpenglNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglMakeCurrent(param0: Hdc, param1: Hglrc): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglMakeCurrent(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglRealizeLayerPalette(param0: Hdc, param1: Int, param2: Bool): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglRealizeLayerPalette(param0.rawAddress.toString(), param1, param2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglSetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: ConstPtr<Colorref>): Int =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglSetLayerPaletteEntries(param0.rawAddress.toString(), param1, param2, param3, param4.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglShareLists(param0: Hglrc, param1: Hglrc): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglShareLists(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglSwapLayerBuffers(param0: Hdc, param1: UInt): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglSwapLayerBuffers(param0.rawAddress.toString(), param1.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontBitmapsA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsA(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), param3.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontBitmapsW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsW(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), param3.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontOutlinesA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: MutPtr<Glyphmetricsfloat>): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesA(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), param3.toInt(), param4.toDouble(), param5.toDouble(), param6, param7.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontOutlinesW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: MutPtr<Glyphmetricsfloat>): Bool =
    if (windowsWin32GraphicsOpenglNapiAddon != null) (windowsWin32GraphicsOpenglNapiAddon.windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesW(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), param3.toInt(), param4.toDouble(), param5.toDouble(), param6, param7.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
