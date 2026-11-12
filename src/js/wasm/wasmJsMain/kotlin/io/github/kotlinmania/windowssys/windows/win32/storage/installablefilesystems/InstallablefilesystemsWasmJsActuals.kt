@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageInstallablefilesystemsNapiAddon(): Boolean

private val windowsWin32StorageInstallablefilesystemsNapiAvailable: Boolean = initWindowsWin32StorageInstallablefilesystemsNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterAttach(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterAttach(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterAttachAtAltitude(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterAttachAtAltitude(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterClose(p0)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterConnectCommunicationPort(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterConnectCommunicationPort(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterCreate(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterDetach(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterDetach(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindClose(p0)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterFindClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindFirst(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterFindFirst(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindNext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterFindNext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetDosName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterGetDosName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterGetInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterGetMessage(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose(p0)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindClose(p0)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindFirst(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindFirst(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindNext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindNext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceGetInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceGetInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterLoad(p0)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterLoad(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterReplyMessage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterReplyMessage(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterSendMessage(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterSendMessage(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterUnload(p0)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterUnload(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindClose(p0)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindFirst(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindFirst(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindNext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindNext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindClose(p0)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindFirst(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindFirst(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindNext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindNext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

public actual fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterAttach(lpfiltername.rawAddress.toString(), lpvolumename.rawAddress.toString(), lpinstancename.rawAddress.toString(), dwcreatedinstancenamelength.toInt(), lpcreatedinstancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterAttachAtAltitude(lpfiltername.rawAddress.toString(), lpvolumename.rawAddress.toString(), lpaltitude.rawAddress.toString(), lpinstancename.rawAddress.toString(), dwcreatedinstancenamelength.toInt(), lpcreatedinstancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterClose(hfilter: Hfilter): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterClose(hfilter.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: ConstPtr, wsizeofcontext: UShort, lpsecurityattributes: ConstPtr, hport: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterConnectCommunicationPort(lpportname.rawAddress.toString(), dwoptions.toInt(), lpcontext.rawAddress.toString(), wsizeofcontext.toInt(), lpsecurityattributes.rawAddress.toString(), hport.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterCreate(lpfiltername: Pcwstr, hfilter: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterCreate(lpfiltername.rawAddress.toString(), hfilter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterDetach(lpfiltername.rawAddress.toString(), lpvolumename.rawAddress.toString(), lpinstancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindClose(hfilterfind: Handle): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterFindClose(hfilterfind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpfilterfind: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterFindFirst(dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpfilterfind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterFindNext(hfilterfind.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterGetDosName(lpvolumename.rawAddress.toString(), lpdosname.rawAddress.toString(), dwdosnamebuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterGetInformation(hfilter.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetMessage(hport: Handle, lpmessagebuffer: MutPtr, dwmessagebuffersize: UInt, lpoverlapped: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterGetMessage(hport.rawAddress.toString(), lpmessagebuffer.rawAddress.toString(), dwmessagebuffersize.toInt(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceClose(hinstance: HfilterInstance): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose(hinstance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceCreate(lpfiltername.rawAddress.toString(), lpvolumename.rawAddress.toString(), lpinstancename.rawAddress.toString(), hinstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindClose(hfilterinstancefind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpfilterinstancefind: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindFirst(lpfiltername.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpfilterinstancefind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindNext(hfilterinstancefind.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceGetInformation(hinstance.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterLoad(lpfiltername: Pcwstr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterLoad(lpfiltername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterReplyMessage(hport: Handle, lpreplybuffer: ConstPtr, dwreplybuffersize: UInt): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterReplyMessage(hport.rawAddress.toString(), lpreplybuffer.rawAddress.toString(), dwreplybuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterSendMessage(hport: Handle, lpinbuffer: ConstPtr, dwinbuffersize: UInt, lpoutbuffer: MutPtr, dwoutbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterSendMessage(hport.rawAddress.toString(), lpinbuffer.rawAddress.toString(), dwinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), dwoutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterUnload(lpfiltername: Pcwstr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterUnload(lpfiltername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindClose(hvolumefind: Handle): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindClose(hvolumefind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpvolumefind: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindFirst(dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpvolumefind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindNext(hvolumefind.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindClose(hvolumeinstancefind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpvolumeinstancefind: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindFirst(lpvolumename.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpvolumeinstancefind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAvailable) wasmWindowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindNext(hvolumeinstancefind.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
