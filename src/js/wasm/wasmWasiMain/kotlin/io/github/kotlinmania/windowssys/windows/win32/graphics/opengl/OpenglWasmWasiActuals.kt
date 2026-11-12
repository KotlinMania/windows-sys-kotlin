@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun choosePixelFormat(hdc: Hdc, ppfd: ConstPtr<Pixelformatdescriptor>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglChoosePixelFormat")

public actual fun describePixelFormat(hdc: Hdc, ipixelformat: Int, nbytes: UInt, ppfd: MutPtr<Pixelformatdescriptor>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglDescribePixelFormat")

public actual fun getEnhMetaFilePixelFormat(hemf: Henhmetafile, cbbuffer: UInt, ppfd: MutPtr<Pixelformatdescriptor>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGetEnhMetaFilePixelFormat")

public actual fun getPixelFormat(hdc: Hdc): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGetPixelFormat")

public actual fun setPixelFormat(hdc: Hdc, format: Int, ppfd: ConstPtr<Pixelformatdescriptor>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglSetPixelFormat")

public actual fun swapBuffers(param0: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglSwapBuffers")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlAccum")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlAccum(op: Int, value: Float): Unit

public actual fun glAccum(op: UInt, value: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlAccum(op.toInt(), value)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlAlphaFunc")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlAlphaFunc(func: Int, ref: Float): Unit

public actual fun glAlphaFunc(func: UInt, ref: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlAlphaFunc(func.toInt(), ref)

public actual fun glAreTexturesResident(n: Int, textures: ConstPtr<UInt>, residences: MutPtr<UByte>): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlAreTexturesResident")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlArrayElement")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlArrayElement(i: Int): Unit

public actual fun glArrayElement(i: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlArrayElement(i)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlBegin")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlBegin(mode: Int): Unit

public actual fun glBegin(mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlBegin(mode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlBindTexture")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlBindTexture(target: Int, texture: Int): Unit

public actual fun glBindTexture(target: UInt, texture: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlBindTexture(target.toInt(), texture.toInt())

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: ConstPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlBitmap")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlBlendFunc")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlBlendFunc(sfactor: Int, dfactor: Int): Unit

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlBlendFunc(sfactor.toInt(), dfactor.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlCallList")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlCallList(list: Int): Unit

public actual fun glCallList(list: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlCallList(list.toInt())

public actual fun glCallLists(n: Int, type: UInt, lists: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlCallLists")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlClear")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlClear(mask: Int): Unit

public actual fun glClear(mask: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlClear(mask.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlClearAccum")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlClearAccum(red: Float, green: Float, blue: Float, alpha: Float): Unit

public actual fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlClearAccum(red, green, blue, alpha)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlClearColor")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlClearColor(red: Float, green: Float, blue: Float, alpha: Float): Unit

public actual fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlClearColor(red, green, blue, alpha)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlClearDepth")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlClearDepth(depth: Double): Unit

public actual fun glClearDepth(depth: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlClearDepth(depth)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlClearIndex")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlClearIndex(c: Float): Unit

public actual fun glClearIndex(c: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlClearIndex(c)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlClearStencil")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlClearStencil(s: Int): Unit

public actual fun glClearStencil(s: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlClearStencil(s)

public actual fun glClipPlane(plane: UInt, equation: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlClipPlane")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor3b")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor3b(red: Int, green: Int, blue: Int): Unit

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor3b(red.toInt(), green.toInt(), blue.toInt())

public actual fun glColor3bv(v: ConstPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor3bv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor3d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor3d(red: Double, green: Double, blue: Double): Unit

public actual fun glColor3d(red: Double, green: Double, blue: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor3d(red, green, blue)

public actual fun glColor3dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor3dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor3f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor3f(red: Float, green: Float, blue: Float): Unit

public actual fun glColor3f(red: Float, green: Float, blue: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor3f(red, green, blue)

public actual fun glColor3fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor3fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor3i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor3i(red: Int, green: Int, blue: Int): Unit

public actual fun glColor3i(red: Int, green: Int, blue: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor3i(red, green, blue)

public actual fun glColor3iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor3iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor3s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor3s(red: Int, green: Int, blue: Int): Unit

public actual fun glColor3s(red: Short, green: Short, blue: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor3s(red.toInt(), green.toInt(), blue.toInt())

public actual fun glColor3sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor3sv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor3ub")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor3ub(red: Int, green: Int, blue: Int): Unit

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor3ub(red.toInt(), green.toInt(), blue.toInt())

public actual fun glColor3ubv(v: ConstPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor3ubv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor3ui")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor3ui(red: Int, green: Int, blue: Int): Unit

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor3ui(red.toInt(), green.toInt(), blue.toInt())

public actual fun glColor3uiv(v: ConstPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor3uiv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor3us")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor3us(red: Int, green: Int, blue: Int): Unit

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor3us(red.toInt(), green.toInt(), blue.toInt())

public actual fun glColor3usv(v: ConstPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor3usv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor4b")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor4b(red: Int, green: Int, blue: Int, alpha: Int): Unit

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor4b(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())

public actual fun glColor4bv(v: ConstPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor4bv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor4d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor4d(red: Double, green: Double, blue: Double, alpha: Double): Unit

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor4d(red, green, blue, alpha)

public actual fun glColor4dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor4dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor4f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor4f(red: Float, green: Float, blue: Float, alpha: Float): Unit

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor4f(red, green, blue, alpha)

public actual fun glColor4fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor4fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor4i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor4i(red: Int, green: Int, blue: Int, alpha: Int): Unit

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor4i(red, green, blue, alpha)

public actual fun glColor4iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor4iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor4s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor4s(red: Int, green: Int, blue: Int, alpha: Int): Unit

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor4s(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())

public actual fun glColor4sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor4sv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor4ub")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor4ub(red: Int, green: Int, blue: Int, alpha: Int): Unit

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor4ub(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())

public actual fun glColor4ubv(v: ConstPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor4ubv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor4ui")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor4ui(red: Int, green: Int, blue: Int, alpha: Int): Unit

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor4ui(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())

public actual fun glColor4uiv(v: ConstPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor4uiv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColor4us")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColor4us(red: Int, green: Int, blue: Int, alpha: Int): Unit

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColor4us(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())

public actual fun glColor4usv(v: ConstPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColor4usv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColorMask")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColorMask(red: Int, green: Int, blue: Int, alpha: Int): Unit

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColorMask(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlColorMaterial")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlColorMaterial(face: Int, mode: Int): Unit

public actual fun glColorMaterial(face: UInt, mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlColorMaterial(face.toInt(), mode.toInt())

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlColorPointer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlCopyPixels")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlCopyPixels(x: Int, y: Int, width: Int, height: Int, type: Int): Unit

public actual fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlCopyPixels(x, y, width, height, type.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, border: Int): Unit

public actual fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D(target.toInt(), level, internalformat.toInt(), x, y, width, border)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int): Unit

public actual fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D(target.toInt(), level, internalformat.toInt(), x, y, width, height, border)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D(target: Int, level: Int, xoffset: Int, x: Int, y: Int, width: Int): Unit

public actual fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D(target.toInt(), level, xoffset, x, y, width)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit

public actual fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D(target.toInt(), level, xoffset, yoffset, x, y, width, height)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlCullFace")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlCullFace(mode: Int): Unit

public actual fun glCullFace(mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlCullFace(mode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlDeleteLists")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlDeleteLists(list: Int, range: Int): Unit

public actual fun glDeleteLists(list: UInt, range: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlDeleteLists(list.toInt(), range)

public actual fun glDeleteTextures(n: Int, textures: ConstPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlDeleteTextures")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlDepthFunc")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlDepthFunc(func: Int): Unit

public actual fun glDepthFunc(func: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlDepthFunc(func.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlDepthMask")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlDepthMask(flag: Int): Unit

public actual fun glDepthMask(flag: UByte): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlDepthMask(flag.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlDepthRange")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlDepthRange(znear: Double, zfar: Double): Unit

public actual fun glDepthRange(znear: Double, zfar: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlDepthRange(znear, zfar)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlDisable")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlDisable(cap: Int): Unit

public actual fun glDisable(cap: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlDisable(cap.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlDisableClientState")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlDisableClientState(array: Int): Unit

public actual fun glDisableClientState(array: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlDisableClientState(array.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlDrawArrays")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlDrawArrays(mode: Int, first: Int, count: Int): Unit

public actual fun glDrawArrays(mode: UInt, first: Int, count: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlDrawArrays(mode.toInt(), first, count)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlDrawBuffer")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlDrawBuffer(mode: Int): Unit

public actual fun glDrawBuffer(mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlDrawBuffer(mode.toInt())

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlDrawElements")

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlDrawPixels")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEdgeFlag")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEdgeFlag(flag: Int): Unit

public actual fun glEdgeFlag(flag: UByte): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEdgeFlag(flag.toInt())

public actual fun glEdgeFlagPointer(stride: Int, pointer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlEdgeFlagPointer")

public actual fun glEdgeFlagv(flag: ConstPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlEdgeFlagv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEnable")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEnable(cap: Int): Unit

public actual fun glEnable(cap: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEnable(cap.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEnableClientState")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEnableClientState(array: Int): Unit

public actual fun glEnableClientState(array: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEnableClientState(array.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEnd")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEnd(): Unit

public actual fun glEnd(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEnd()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEndList")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEndList(): Unit

public actual fun glEndList(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEndList()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEvalCoord1d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1d(u: Double): Unit

public actual fun glEvalCoord1d(u: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1d(u)

public actual fun glEvalCoord1dv(u: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlEvalCoord1dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEvalCoord1f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1f(u: Float): Unit

public actual fun glEvalCoord1f(u: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1f(u)

public actual fun glEvalCoord1fv(u: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlEvalCoord1fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEvalCoord2d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2d(u: Double, v: Double): Unit

public actual fun glEvalCoord2d(u: Double, v: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2d(u, v)

public actual fun glEvalCoord2dv(u: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlEvalCoord2dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEvalCoord2f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2f(u: Float, v: Float): Unit

public actual fun glEvalCoord2f(u: Float, v: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2f(u, v)

public actual fun glEvalCoord2fv(u: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlEvalCoord2fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEvalMesh1")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEvalMesh1(mode: Int, i1: Int, i2: Int): Unit

public actual fun glEvalMesh1(mode: UInt, i1: Int, i2: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEvalMesh1(mode.toInt(), i1, i2)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEvalMesh2")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEvalMesh2(mode: Int, i1: Int, i2: Int, j1: Int, j2: Int): Unit

public actual fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEvalMesh2(mode.toInt(), i1, i2, j1, j2)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEvalPoint1")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEvalPoint1(i: Int): Unit

public actual fun glEvalPoint1(i: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEvalPoint1(i)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlEvalPoint2")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlEvalPoint2(i: Int, j: Int): Unit

public actual fun glEvalPoint2(i: Int, j: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlEvalPoint2(i, j)

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlFeedbackBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlFinish")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlFinish(): Unit

public actual fun glFinish(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlFinish()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlFlush")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlFlush(): Unit

public actual fun glFlush(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlFlush()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlFogf")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlFogf(pname: Int, param1: Float): Unit

public actual fun glFogf(pname: UInt, param1: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlFogf(pname.toInt(), param1)

public actual fun glFogfv(pname: UInt, params: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlFogfv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlFogi")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlFogi(pname: Int, param1: Int): Unit

public actual fun glFogi(pname: UInt, param1: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlFogi(pname.toInt(), param1)

public actual fun glFogiv(pname: UInt, params: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlFogiv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlFrontFace")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlFrontFace(mode: Int): Unit

public actual fun glFrontFace(mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlFrontFace(mode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlFrustum")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Unit

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlFrustum(left, right, bottom, top, znear, zfar)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlGenLists")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlGenLists(range: Int): Int

public actual fun glGenLists(range: Int): UInt =
    wasiWindowssysWindowsWin32GraphicsOpenglGlGenLists(range).toUInt()

public actual fun glGenTextures(n: Int, textures: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGenTextures")

public actual fun glGetBooleanv(pname: UInt, params: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetBooleanv")

public actual fun glGetClipPlane(plane: UInt, equation: MutPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetClipPlane")

public actual fun glGetDoublev(pname: UInt, params: MutPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetDoublev")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlGetError")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlGetError(): Int

public actual fun glGetError(): UInt =
    wasiWindowssysWindowsWin32GraphicsOpenglGlGetError().toUInt()

public actual fun glGetFloatv(pname: UInt, params: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetFloatv")

public actual fun glGetIntegerv(pname: UInt, params: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetIntegerv")

public actual fun glGetLightfv(light: UInt, pname: UInt, params: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetLightfv")

public actual fun glGetLightiv(light: UInt, pname: UInt, params: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetLightiv")

public actual fun glGetMapdv(target: UInt, query: UInt, v: MutPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetMapdv")

public actual fun glGetMapfv(target: UInt, query: UInt, v: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetMapfv")

public actual fun glGetMapiv(target: UInt, query: UInt, v: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetMapiv")

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetMaterialfv")

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetMaterialiv")

public actual fun glGetPixelMapfv(map: UInt, values: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetPixelMapfv")

public actual fun glGetPixelMapuiv(map: UInt, values: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetPixelMapuiv")

public actual fun glGetPixelMapusv(map: UInt, values: MutPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetPixelMapusv")

public actual fun glGetPointerv(pname: UInt, params: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetPointerv")

public actual fun glGetPolygonStipple(mask: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetPolygonStipple")

public actual fun glGetString(name: UInt): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetString")

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetTexEnvfv")

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetTexEnviv")

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: MutPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetTexGendv")

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetTexGenfv")

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetTexGeniv")

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetTexImage")

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameterfv")

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameteriv")

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetTexParameterfv")

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlGetTexParameteriv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlHint")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlHint(target: Int, mode: Int): Unit

public actual fun glHint(target: UInt, mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlHint(target.toInt(), mode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlIndexMask")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlIndexMask(mask: Int): Unit

public actual fun glIndexMask(mask: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlIndexMask(mask.toInt())

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlIndexPointer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlIndexd")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlIndexd(c: Double): Unit

public actual fun glIndexd(c: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlIndexd(c)

public actual fun glIndexdv(c: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlIndexdv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlIndexf")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlIndexf(c: Float): Unit

public actual fun glIndexf(c: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlIndexf(c)

public actual fun glIndexfv(c: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlIndexfv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlIndexi")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlIndexi(c: Int): Unit

public actual fun glIndexi(c: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlIndexi(c)

public actual fun glIndexiv(c: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlIndexiv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlIndexs")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlIndexs(c: Int): Unit

public actual fun glIndexs(c: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlIndexs(c.toInt())

public actual fun glIndexsv(c: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlIndexsv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlIndexub")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlIndexub(c: Int): Unit

public actual fun glIndexub(c: UByte): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlIndexub(c.toInt())

public actual fun glIndexubv(c: ConstPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlIndexubv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlInitNames")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlInitNames(): Unit

public actual fun glInitNames(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlInitNames()

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlInterleavedArrays")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlIsEnabled")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlIsEnabled(cap: Int): Int

public actual fun glIsEnabled(cap: UInt): UByte =
    wasiWindowssysWindowsWin32GraphicsOpenglGlIsEnabled(cap.toInt()).toUByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlIsList")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlIsList(list: Int): Int

public actual fun glIsList(list: UInt): UByte =
    wasiWindowssysWindowsWin32GraphicsOpenglGlIsList(list.toInt()).toUByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlIsTexture")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlIsTexture(texture: Int): Int

public actual fun glIsTexture(texture: UInt): UByte =
    wasiWindowssysWindowsWin32GraphicsOpenglGlIsTexture(texture.toInt()).toUByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlLightModelf")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlLightModelf(pname: Int, param1: Float): Unit

public actual fun glLightModelf(pname: UInt, param1: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlLightModelf(pname.toInt(), param1)

public actual fun glLightModelfv(pname: UInt, params: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlLightModelfv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlLightModeli")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlLightModeli(pname: Int, param1: Int): Unit

public actual fun glLightModeli(pname: UInt, param1: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlLightModeli(pname.toInt(), param1)

public actual fun glLightModeliv(pname: UInt, params: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlLightModeliv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlLightf")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlLightf(light: Int, pname: Int, param2: Float): Unit

public actual fun glLightf(light: UInt, pname: UInt, param2: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlLightf(light.toInt(), pname.toInt(), param2)

public actual fun glLightfv(light: UInt, pname: UInt, params: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlLightfv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlLighti")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlLighti(light: Int, pname: Int, param2: Int): Unit

public actual fun glLighti(light: UInt, pname: UInt, param2: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlLighti(light.toInt(), pname.toInt(), param2)

public actual fun glLightiv(light: UInt, pname: UInt, params: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlLightiv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlLineStipple")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlLineStipple(factor: Int, pattern: Int): Unit

public actual fun glLineStipple(factor: Int, pattern: UShort): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlLineStipple(factor, pattern.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlLineWidth")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlLineWidth(width: Float): Unit

public actual fun glLineWidth(width: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlLineWidth(width)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlListBase")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlListBase(base: Int): Unit

public actual fun glListBase(base: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlListBase(base.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlLoadIdentity")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlLoadIdentity(): Unit

public actual fun glLoadIdentity(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlLoadIdentity()

public actual fun glLoadMatrixd(m: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlLoadMatrixd")

public actual fun glLoadMatrixf(m: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlLoadMatrixf")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlLoadName")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlLoadName(name: Int): Unit

public actual fun glLoadName(name: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlLoadName(name.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlLogicOp")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlLogicOp(opcode: Int): Unit

public actual fun glLogicOp(opcode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlLogicOp(opcode.toInt())

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlMap1d")

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlMap1f")

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlMap2d")

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlMap2f")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlMapGrid1d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlMapGrid1d(un: Int, u1: Double, u2: Double): Unit

public actual fun glMapGrid1d(un: Int, u1: Double, u2: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlMapGrid1d(un, u1, u2)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlMapGrid1f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlMapGrid1f(un: Int, u1: Float, u2: Float): Unit

public actual fun glMapGrid1f(un: Int, u1: Float, u2: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlMapGrid1f(un, u1, u2)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlMapGrid2d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double): Unit

public actual fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlMapGrid2d(un, u1, u2, vn, v1, v2)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlMapGrid2f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float): Unit

public actual fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlMapGrid2f(un, u1, u2, vn, v1, v2)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlMaterialf")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlMaterialf(face: Int, pname: Int, param2: Float): Unit

public actual fun glMaterialf(face: UInt, pname: UInt, param2: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlMaterialf(face.toInt(), pname.toInt(), param2)

public actual fun glMaterialfv(face: UInt, pname: UInt, params: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlMaterialfv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlMateriali")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlMateriali(face: Int, pname: Int, param2: Int): Unit

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlMateriali(face.toInt(), pname.toInt(), param2)

public actual fun glMaterialiv(face: UInt, pname: UInt, params: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlMaterialiv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlMatrixMode")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlMatrixMode(mode: Int): Unit

public actual fun glMatrixMode(mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlMatrixMode(mode.toInt())

public actual fun glMultMatrixd(m: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlMultMatrixd")

public actual fun glMultMatrixf(m: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlMultMatrixf")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlNewList")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlNewList(list: Int, mode: Int): Unit

public actual fun glNewList(list: UInt, mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlNewList(list.toInt(), mode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlNormal3b")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlNormal3b(nx: Int, ny: Int, nz: Int): Unit

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlNormal3b(nx.toInt(), ny.toInt(), nz.toInt())

public actual fun glNormal3bv(v: ConstPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlNormal3bv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlNormal3d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlNormal3d(nx: Double, ny: Double, nz: Double): Unit

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlNormal3d(nx, ny, nz)

public actual fun glNormal3dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlNormal3dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlNormal3f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlNormal3f(nx: Float, ny: Float, nz: Float): Unit

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlNormal3f(nx, ny, nz)

public actual fun glNormal3fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlNormal3fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlNormal3i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlNormal3i(nx: Int, ny: Int, nz: Int): Unit

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlNormal3i(nx, ny, nz)

public actual fun glNormal3iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlNormal3iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlNormal3s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlNormal3s(nx: Int, ny: Int, nz: Int): Unit

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlNormal3s(nx.toInt(), ny.toInt(), nz.toInt())

public actual fun glNormal3sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlNormal3sv")

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlNormalPointer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlOrtho")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Unit

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlOrtho(left, right, bottom, top, znear, zfar)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPassThrough")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPassThrough(token: Float): Unit

public actual fun glPassThrough(token: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPassThrough(token)

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlPixelMapfv")

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: ConstPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlPixelMapuiv")

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: ConstPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlPixelMapusv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPixelStoref")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPixelStoref(pname: Int, param1: Float): Unit

public actual fun glPixelStoref(pname: UInt, param1: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPixelStoref(pname.toInt(), param1)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPixelStorei")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPixelStorei(pname: Int, param1: Int): Unit

public actual fun glPixelStorei(pname: UInt, param1: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPixelStorei(pname.toInt(), param1)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPixelTransferf")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPixelTransferf(pname: Int, param1: Float): Unit

public actual fun glPixelTransferf(pname: UInt, param1: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPixelTransferf(pname.toInt(), param1)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPixelTransferi")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPixelTransferi(pname: Int, param1: Int): Unit

public actual fun glPixelTransferi(pname: UInt, param1: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPixelTransferi(pname.toInt(), param1)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPixelZoom")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPixelZoom(xfactor: Float, yfactor: Float): Unit

public actual fun glPixelZoom(xfactor: Float, yfactor: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPixelZoom(xfactor, yfactor)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPointSize")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPointSize(size: Float): Unit

public actual fun glPointSize(size: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPointSize(size)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPolygonMode")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPolygonMode(face: Int, mode: Int): Unit

public actual fun glPolygonMode(face: UInt, mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPolygonMode(face.toInt(), mode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPolygonOffset")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPolygonOffset(factor: Float, units: Float): Unit

public actual fun glPolygonOffset(factor: Float, units: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPolygonOffset(factor, units)

public actual fun glPolygonStipple(mask: ConstPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlPolygonStipple")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPopAttrib")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPopAttrib(): Unit

public actual fun glPopAttrib(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPopAttrib()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPopClientAttrib")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPopClientAttrib(): Unit

public actual fun glPopClientAttrib(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPopClientAttrib()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPopMatrix")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPopMatrix(): Unit

public actual fun glPopMatrix(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPopMatrix()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPopName")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPopName(): Unit

public actual fun glPopName(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPopName()

public actual fun glPrioritizeTextures(n: Int, textures: ConstPtr<UInt>, priorities: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlPrioritizeTextures")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPushAttrib")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPushAttrib(mask: Int): Unit

public actual fun glPushAttrib(mask: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPushAttrib(mask.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPushClientAttrib")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPushClientAttrib(mask: Int): Unit

public actual fun glPushClientAttrib(mask: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPushClientAttrib(mask.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPushMatrix")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPushMatrix(): Unit

public actual fun glPushMatrix(): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPushMatrix()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlPushName")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlPushName(name: Int): Unit

public actual fun glPushName(name: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlPushName(name.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos2d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos2d(x: Double, y: Double): Unit

public actual fun glRasterPos2d(x: Double, y: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos2d(x, y)

public actual fun glRasterPos2dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos2dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos2f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos2f(x: Float, y: Float): Unit

public actual fun glRasterPos2f(x: Float, y: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos2f(x, y)

public actual fun glRasterPos2fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos2fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos2i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos2i(x: Int, y: Int): Unit

public actual fun glRasterPos2i(x: Int, y: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos2i(x, y)

public actual fun glRasterPos2iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos2iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos2s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos2s(x: Int, y: Int): Unit

public actual fun glRasterPos2s(x: Short, y: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos2s(x.toInt(), y.toInt())

public actual fun glRasterPos2sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos2sv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos3d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos3d(x: Double, y: Double, z: Double): Unit

public actual fun glRasterPos3d(x: Double, y: Double, z: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos3d(x, y, z)

public actual fun glRasterPos3dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos3dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos3f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos3f(x: Float, y: Float, z: Float): Unit

public actual fun glRasterPos3f(x: Float, y: Float, z: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos3f(x, y, z)

public actual fun glRasterPos3fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos3fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos3i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos3i(x: Int, y: Int, z: Int): Unit

public actual fun glRasterPos3i(x: Int, y: Int, z: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos3i(x, y, z)

public actual fun glRasterPos3iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos3iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos3s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos3s(x: Int, y: Int, z: Int): Unit

public actual fun glRasterPos3s(x: Short, y: Short, z: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos3s(x.toInt(), y.toInt(), z.toInt())

public actual fun glRasterPos3sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos3sv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos4d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos4d(x: Double, y: Double, z: Double, w: Double): Unit

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos4d(x, y, z, w)

public actual fun glRasterPos4dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos4dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos4f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos4f(x: Float, y: Float, z: Float, w: Float): Unit

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos4f(x, y, z, w)

public actual fun glRasterPos4fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos4fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos4i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos4i(x: Int, y: Int, z: Int, w: Int): Unit

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos4i(x, y, z, w)

public actual fun glRasterPos4iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos4iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRasterPos4s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos4s(x: Int, y: Int, z: Int, w: Int): Unit

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRasterPos4s(x.toInt(), y.toInt(), z.toInt(), w.toInt())

public actual fun glRasterPos4sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRasterPos4sv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlReadBuffer")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlReadBuffer(mode: Int): Unit

public actual fun glReadBuffer(mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlReadBuffer(mode.toInt())

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlReadPixels")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRectd")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRectd(x1: Double, y1: Double, x2: Double, y2: Double): Unit

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRectd(x1, y1, x2, y2)

public actual fun glRectdv(v1: ConstPtr<Double>, v2: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRectdv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRectf")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRectf(x1: Float, y1: Float, x2: Float, y2: Float): Unit

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRectf(x1, y1, x2, y2)

public actual fun glRectfv(v1: ConstPtr<Float>, v2: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRectfv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRecti")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRecti(x1: Int, y1: Int, x2: Int, y2: Int): Unit

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRecti(x1, y1, x2, y2)

public actual fun glRectiv(v1: ConstPtr<Int>, v2: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRectiv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRects")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRects(x1: Int, y1: Int, x2: Int, y2: Int): Unit

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRects(x1.toInt(), y1.toInt(), x2.toInt(), y2.toInt())

public actual fun glRectsv(v1: ConstPtr<Short>, v2: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlRectsv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRenderMode")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRenderMode(mode: Int): Int

public actual fun glRenderMode(mode: UInt): Int =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRenderMode(mode.toInt()).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRotated")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRotated(angle: Double, x: Double, y: Double, z: Double): Unit

public actual fun glRotated(angle: Double, x: Double, y: Double, z: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRotated(angle, x, y, z)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlRotatef")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlRotatef(angle: Float, x: Float, y: Float, z: Float): Unit

public actual fun glRotatef(angle: Float, x: Float, y: Float, z: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlRotatef(angle, x, y, z)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlScaled")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlScaled(x: Double, y: Double, z: Double): Unit

public actual fun glScaled(x: Double, y: Double, z: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlScaled(x, y, z)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlScalef")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlScalef(x: Float, y: Float, z: Float): Unit

public actual fun glScalef(x: Float, y: Float, z: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlScalef(x, y, z)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlScissor")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlScissor(x: Int, y: Int, width: Int, height: Int): Unit

public actual fun glScissor(x: Int, y: Int, width: Int, height: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlScissor(x, y, width, height)

public actual fun glSelectBuffer(size: Int, buffer: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlSelectBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlShadeModel")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlShadeModel(mode: Int): Unit

public actual fun glShadeModel(mode: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlShadeModel(mode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlStencilFunc")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlStencilFunc(func: Int, ref: Int, mask: Int): Unit

public actual fun glStencilFunc(func: UInt, ref: Int, mask: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlStencilFunc(func.toInt(), ref, mask.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlStencilMask")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlStencilMask(mask: Int): Unit

public actual fun glStencilMask(mask: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlStencilMask(mask.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlStencilOp")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlStencilOp(fail: Int, zfail: Int, zpass: Int): Unit

public actual fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlStencilOp(fail.toInt(), zfail.toInt(), zpass.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord1d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord1d(s: Double): Unit

public actual fun glTexCoord1d(s: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord1d(s)

public actual fun glTexCoord1dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord1dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord1f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord1f(s: Float): Unit

public actual fun glTexCoord1f(s: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord1f(s)

public actual fun glTexCoord1fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord1fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord1i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord1i(s: Int): Unit

public actual fun glTexCoord1i(s: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord1i(s)

public actual fun glTexCoord1iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord1iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord1s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord1s(s: Int): Unit

public actual fun glTexCoord1s(s: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord1s(s.toInt())

public actual fun glTexCoord1sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord1sv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord2d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord2d(s: Double, t: Double): Unit

public actual fun glTexCoord2d(s: Double, t: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord2d(s, t)

public actual fun glTexCoord2dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord2dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord2f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord2f(s: Float, t: Float): Unit

public actual fun glTexCoord2f(s: Float, t: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord2f(s, t)

public actual fun glTexCoord2fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord2fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord2i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord2i(s: Int, t: Int): Unit

public actual fun glTexCoord2i(s: Int, t: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord2i(s, t)

public actual fun glTexCoord2iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord2iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord2s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord2s(s: Int, t: Int): Unit

public actual fun glTexCoord2s(s: Short, t: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord2s(s.toInt(), t.toInt())

public actual fun glTexCoord2sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord2sv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord3d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord3d(s: Double, t: Double, r: Double): Unit

public actual fun glTexCoord3d(s: Double, t: Double, r: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord3d(s, t, r)

public actual fun glTexCoord3dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord3dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord3f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord3f(s: Float, t: Float, r: Float): Unit

public actual fun glTexCoord3f(s: Float, t: Float, r: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord3f(s, t, r)

public actual fun glTexCoord3fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord3fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord3i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord3i(s: Int, t: Int, r: Int): Unit

public actual fun glTexCoord3i(s: Int, t: Int, r: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord3i(s, t, r)

public actual fun glTexCoord3iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord3iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord3s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord3s(s: Int, t: Int, r: Int): Unit

public actual fun glTexCoord3s(s: Short, t: Short, r: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord3s(s.toInt(), t.toInt(), r.toInt())

public actual fun glTexCoord3sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord3sv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord4d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord4d(s: Double, t: Double, r: Double, q: Double): Unit

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord4d(s, t, r, q)

public actual fun glTexCoord4dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord4dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord4f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord4f(s: Float, t: Float, r: Float, q: Float): Unit

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord4f(s, t, r, q)

public actual fun glTexCoord4fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord4fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord4i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord4i(s: Int, t: Int, r: Int, q: Int): Unit

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord4i(s, t, r, q)

public actual fun glTexCoord4iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord4iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexCoord4s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord4s(s: Int, t: Int, r: Int, q: Int): Unit

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexCoord4s(s.toInt(), t.toInt(), r.toInt(), q.toInt())

public actual fun glTexCoord4sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoord4sv")

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexCoordPointer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexEnvf")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexEnvf(target: Int, pname: Int, param2: Float): Unit

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexEnvf(target.toInt(), pname.toInt(), param2)

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexEnvfv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexEnvi")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexEnvi(target: Int, pname: Int, param2: Int): Unit

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexEnvi(target.toInt(), pname.toInt(), param2)

public actual fun glTexEnviv(target: UInt, pname: UInt, params: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexEnviv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexGend")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexGend(coord: Int, pname: Int, param2: Double): Unit

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexGend(coord.toInt(), pname.toInt(), param2)

public actual fun glTexGendv(coord: UInt, pname: UInt, params: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexGendv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexGenf")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexGenf(coord: Int, pname: Int, param2: Float): Unit

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexGenf(coord.toInt(), pname.toInt(), param2)

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexGenfv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexGeni")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexGeni(coord: Int, pname: Int, param2: Int): Unit

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexGeni(coord.toInt(), pname.toInt(), param2)

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexGeniv")

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexImage1D")

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexImage2D")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexParameterf")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexParameterf(target: Int, pname: Int, param2: Float): Unit

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexParameterf(target.toInt(), pname.toInt(), param2)

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexParameterfv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTexParameteri")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTexParameteri(target: Int, pname: Int, param2: Int): Unit

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTexParameteri(target.toInt(), pname.toInt(), param2)

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexParameteriv")

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexSubImage1D")

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlTexSubImage2D")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTranslated")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTranslated(x: Double, y: Double, z: Double): Unit

public actual fun glTranslated(x: Double, y: Double, z: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTranslated(x, y, z)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlTranslatef")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlTranslatef(x: Float, y: Float, z: Float): Unit

public actual fun glTranslatef(x: Float, y: Float, z: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlTranslatef(x, y, z)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex2d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex2d(x: Double, y: Double): Unit

public actual fun glVertex2d(x: Double, y: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex2d(x, y)

public actual fun glVertex2dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex2dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex2f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex2f(x: Float, y: Float): Unit

public actual fun glVertex2f(x: Float, y: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex2f(x, y)

public actual fun glVertex2fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex2fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex2i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex2i(x: Int, y: Int): Unit

public actual fun glVertex2i(x: Int, y: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex2i(x, y)

public actual fun glVertex2iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex2iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex2s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex2s(x: Int, y: Int): Unit

public actual fun glVertex2s(x: Short, y: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex2s(x.toInt(), y.toInt())

public actual fun glVertex2sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex2sv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex3d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex3d(x: Double, y: Double, z: Double): Unit

public actual fun glVertex3d(x: Double, y: Double, z: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex3d(x, y, z)

public actual fun glVertex3dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex3dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex3f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex3f(x: Float, y: Float, z: Float): Unit

public actual fun glVertex3f(x: Float, y: Float, z: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex3f(x, y, z)

public actual fun glVertex3fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex3fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex3i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex3i(x: Int, y: Int, z: Int): Unit

public actual fun glVertex3i(x: Int, y: Int, z: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex3i(x, y, z)

public actual fun glVertex3iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex3iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex3s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex3s(x: Int, y: Int, z: Int): Unit

public actual fun glVertex3s(x: Short, y: Short, z: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex3s(x.toInt(), y.toInt(), z.toInt())

public actual fun glVertex3sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex3sv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex4d")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex4d(x: Double, y: Double, z: Double, w: Double): Unit

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex4d(x, y, z, w)

public actual fun glVertex4dv(v: ConstPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex4dv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex4f")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex4f(x: Float, y: Float, z: Float, w: Float): Unit

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex4f(x, y, z, w)

public actual fun glVertex4fv(v: ConstPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex4fv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex4i")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex4i(x: Int, y: Int, z: Int, w: Int): Unit

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex4i(x, y, z, w)

public actual fun glVertex4iv(v: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex4iv")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlVertex4s")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlVertex4s(x: Int, y: Int, z: Int, w: Int): Unit

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlVertex4s(x.toInt(), y.toInt(), z.toInt(), w.toInt())

public actual fun glVertex4sv(v: ConstPtr<Short>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertex4sv")

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGlVertexPointer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGlViewport")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGlViewport(x: Int, y: Int, width: Int, height: Int): Unit

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGlViewport(x, y, width, height)

public actual fun gluBeginCurve(nobj: MutPtr<GLUnurbs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluBeginCurve")

public actual fun gluBeginPolygon(tess: MutPtr<GLUtesselator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluBeginPolygon")

public actual fun gluBeginSurface(nobj: MutPtr<GLUnurbs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluBeginSurface")

public actual fun gluBeginTrim(nobj: MutPtr<GLUnurbs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluBeginTrim")

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluBuild1DMipmaps")

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluBuild2DMipmaps")

public actual fun gluCylinder(qobj: MutPtr<GLUquadric>, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluCylinder")

public actual fun gluDeleteNurbsRenderer(nobj: MutPtr<GLUnurbs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluDeleteNurbsRenderer")

public actual fun gluDeleteQuadric(state: MutPtr<GLUquadric>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluDeleteQuadric")

public actual fun gluDeleteTess(tess: MutPtr<GLUtesselator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluDeleteTess")

public actual fun gluDisk(qobj: MutPtr<GLUquadric>, innerradius: Double, outerradius: Double, slices: Int, loops: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluDisk")

public actual fun gluEndCurve(nobj: MutPtr<GLUnurbs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluEndCurve")

public actual fun gluEndPolygon(tess: MutPtr<GLUtesselator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluEndPolygon")

public actual fun gluEndSurface(nobj: MutPtr<GLUnurbs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluEndSurface")

public actual fun gluEndTrim(nobj: MutPtr<GLUnurbs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluEndTrim")

public actual fun gluErrorString(errcode: UInt): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluErrorString")

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluErrorUnicodeStringEXT")

public actual fun gluGetNurbsProperty(nobj: MutPtr<GLUnurbs>, property: UInt, value: MutPtr<Float>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluGetNurbsProperty")

public actual fun gluGetString(name: UInt): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluGetString")

public actual fun gluGetTessProperty(tess: MutPtr<GLUtesselator>, which: UInt, value: MutPtr<Double>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluGetTessProperty")

public actual fun gluLoadSamplingMatrices(nobj: MutPtr<GLUnurbs>, modelmatrix: ConstPtr<Float>, projmatrix: ConstPtr<Float>, viewport: ConstPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluLoadSamplingMatrices")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGluLookAt")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double): Unit

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGluLookAt(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz)

public actual fun gluNewNurbsRenderer(): MutPtr<GLUnurbs> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluNewNurbsRenderer")

public actual fun gluNewQuadric(): MutPtr<GLUquadric> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluNewQuadric")

public actual fun gluNewTess(): MutPtr<GLUtesselator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluNewTess")

public actual fun gluNextContour(tess: MutPtr<GLUtesselator>, type: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluNextContour")

public actual fun gluNurbsCallback(nobj: MutPtr<GLUnurbs>, which: UInt, fn: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluNurbsCallback")

public actual fun gluNurbsCurve(nobj: MutPtr<GLUnurbs>, nknots: Int, knot: MutPtr<Float>, stride: Int, ctlarray: MutPtr<Float>, order: Int, type: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluNurbsCurve")

public actual fun gluNurbsProperty(nobj: MutPtr<GLUnurbs>, property: UInt, value: Float): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluNurbsProperty")

public actual fun gluNurbsSurface(nobj: MutPtr<GLUnurbs>, sknotCount: Int, sknot: MutPtr<Float>, tknotCount: Int, tknot: MutPtr<Float>, sStride: Int, tStride: Int, ctlarray: MutPtr<Float>, sorder: Int, torder: Int, type: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluNurbsSurface")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGluOrtho2D")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGluOrtho2D(left: Double, right: Double, bottom: Double, top: Double): Unit

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGluOrtho2D(left, right, bottom, top)

public actual fun gluPartialDisk(qobj: MutPtr<GLUquadric>, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluPartialDisk")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsOpenglGluPerspective")
private external fun wasiWindowssysWindowsWin32GraphicsOpenglGluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double): Unit

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double): Unit =
    wasiWindowssysWindowsWin32GraphicsOpenglGluPerspective(fovy, aspect, znear, zfar)

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluPickMatrix")

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: ConstPtr<Double>, projmatrix: ConstPtr<Double>, viewport: ConstPtr<Int>, winx: MutPtr<Double>, winy: MutPtr<Double>, winz: MutPtr<Double>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluProject")

public actual fun gluPwlCurve(nobj: MutPtr<GLUnurbs>, count: Int, array: MutPtr<Float>, stride: Int, type: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluPwlCurve")

public actual fun gluQuadricCallback(qobj: MutPtr<GLUquadric>, which: UInt, fn: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluQuadricCallback")

public actual fun gluQuadricDrawStyle(quadobject: MutPtr<GLUquadric>, drawstyle: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluQuadricDrawStyle")

public actual fun gluQuadricNormals(quadobject: MutPtr<GLUquadric>, normals: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluQuadricNormals")

public actual fun gluQuadricOrientation(quadobject: MutPtr<GLUquadric>, orientation: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluQuadricOrientation")

public actual fun gluQuadricTexture(quadobject: MutPtr<GLUquadric>, texturecoords: UByte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluQuadricTexture")

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: ConstPtr<CVoid>, widthout: Int, heightout: Int, typeout: UInt, dataout: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluScaleImage")

public actual fun gluSphere(qobj: MutPtr<GLUquadric>, radius: Double, slices: Int, stacks: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluSphere")

public actual fun gluTessBeginContour(tess: MutPtr<GLUtesselator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluTessBeginContour")

public actual fun gluTessBeginPolygon(tess: MutPtr<GLUtesselator>, polygonData: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluTessBeginPolygon")

public actual fun gluTessCallback(tess: MutPtr<GLUtesselator>, which: UInt, fn: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluTessCallback")

public actual fun gluTessEndContour(tess: MutPtr<GLUtesselator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluTessEndContour")

public actual fun gluTessEndPolygon(tess: MutPtr<GLUtesselator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluTessEndPolygon")

public actual fun gluTessNormal(tess: MutPtr<GLUtesselator>, x: Double, y: Double, z: Double): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluTessNormal")

public actual fun gluTessProperty(tess: MutPtr<GLUtesselator>, which: UInt, value: Double): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluTessProperty")

public actual fun gluTessVertex(tess: MutPtr<GLUtesselator>, coords: MutPtr<Double>, data: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluTessVertex")

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: ConstPtr<Double>, projmatrix: ConstPtr<Double>, viewport: ConstPtr<Int>, objx: MutPtr<Double>, objy: MutPtr<Double>, objz: MutPtr<Double>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglGluUnProject")

public actual fun wglCopyContext(param0: Hglrc, param1: Hglrc, param2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglCopyContext")

public actual fun wglCreateContext(param0: Hdc): Hglrc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglCreateContext")

public actual fun wglCreateLayerContext(param0: Hdc, param1: Int): Hglrc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglCreateLayerContext")

public actual fun wglDeleteContext(param0: Hglrc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglDeleteContext")

public actual fun wglDescribeLayerPlane(param0: Hdc, param1: Int, param2: Int, param3: UInt, param4: MutPtr<Layerplanedescriptor>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglDescribeLayerPlane")

public actual fun wglGetCurrentContext(): Hglrc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglGetCurrentContext")

public actual fun wglGetCurrentDC(): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglGetCurrentDC")

public actual fun wglGetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: MutPtr<Colorref>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglGetLayerPaletteEntries")

public actual fun wglGetProcAddress(param0: Pcstr): Proc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglGetProcAddress")

public actual fun wglMakeCurrent(param0: Hdc, param1: Hglrc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglMakeCurrent")

public actual fun wglRealizeLayerPalette(param0: Hdc, param1: Int, param2: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglRealizeLayerPalette")

public actual fun wglSetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: ConstPtr<Colorref>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglSetLayerPaletteEntries")

public actual fun wglShareLists(param0: Hglrc, param1: Hglrc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglShareLists")

public actual fun wglSwapLayerBuffers(param0: Hdc, param1: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglSwapLayerBuffers")

public actual fun wglUseFontBitmapsA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsA")

public actual fun wglUseFontBitmapsW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsW")

public actual fun wglUseFontOutlinesA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: MutPtr<Glyphmetricsfloat>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesA")

public actual fun wglUseFontOutlinesW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: MutPtr<Glyphmetricsfloat>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesW")
