@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageInstallablefilesystemsNapiAddon(): Boolean

private val _windowsWin32StorageInstallablefilesystemsNapiAvailable: Boolean = _initWindowsWin32StorageInstallablefilesystemsNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterAttach(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterAttach(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterAttachAtAltitude(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterAttachAtAltitude(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterClose(p0)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterConnectCommunicationPort(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterConnectCommunicationPort(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterCreate(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterDetach(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterDetach(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterFindClose(p0)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterFindClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterFindFirst(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterFindFirst(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterFindNext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterFindNext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterGetDosName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterGetDosName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterGetInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterGetInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterGetMessage(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterGetMessage(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterInstanceClose(p0)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceClose(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterInstanceCreate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindClose(p0)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindFirst(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindFirst(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindNext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindNext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterInstanceGetInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceGetInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterLoad(p0)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterLoad(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterReplyMessage(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterReplyMessage(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterSendMessage(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterSendMessage(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterUnload(p0)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterUnload(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindClose(p0)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindFirst(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindFirst(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindNext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindNext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindClose(p0)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindFirst(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindFirst(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindNext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindNext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

public actual fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterAttach((lpfiltername?.value ?: 0L).toString(), (lpvolumename?.value ?: 0L).toString(), (lpinstancename?.value ?: 0L).toString(), dwcreatedinstancenamelength.toInt(), (lpcreatedinstancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterAttachAtAltitude((lpfiltername?.value ?: 0L).toString(), (lpvolumename?.value ?: 0L).toString(), (lpaltitude?.value ?: 0L).toString(), (lpinstancename?.value ?: 0L).toString(), dwcreatedinstancenamelength.toInt(), (lpcreatedinstancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterClose(hfilter: Hfilter): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterClose(hfilter.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: COpaquePointer?, wsizeofcontext: UShort, lpsecurityattributes: COpaquePointer?, hport: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterConnectCommunicationPort((lpportname?.value ?: 0L).toString(), dwoptions.toInt(), (lpcontext?.value ?: 0L).toString(), wsizeofcontext.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), (hport?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterCreate(lpfiltername: Pcwstr, hfilter: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterCreate((lpfiltername?.value ?: 0L).toString(), (hfilter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterDetach((lpfiltername?.value ?: 0L).toString(), (lpvolumename?.value ?: 0L).toString(), (lpinstancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindClose(hfilterfind: Handle): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterFindClose((hfilterfind?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpfilterfind: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterFindFirst(dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpfilterfind?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterFindNext((hfilterfind?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterGetDosName((lpvolumename?.value ?: 0L).toString(), (lpdosname?.value ?: 0L).toString(), dwdosnamebuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterGetInformation(hfilter.toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetMessage(hport: Handle, lpmessagebuffer: COpaquePointer?, dwmessagebuffersize: UInt, lpoverlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterGetMessage((hport?.value ?: 0L).toString(), (lpmessagebuffer?.value ?: 0L).toString(), dwmessagebuffersize.toInt(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceClose(hinstance: HfilterInstance): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceClose(hinstance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceCreate((lpfiltername?.value ?: 0L).toString(), (lpvolumename?.value ?: 0L).toString(), (lpinstancename?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindClose((hfilterinstancefind?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpfilterinstancefind: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindFirst((lpfiltername?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpfilterinstancefind?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindNext((hfilterinstancefind?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterInstanceGetInformation(hinstance.toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterLoad(lpfiltername: Pcwstr): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterLoad((lpfiltername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterReplyMessage(hport: Handle, lpreplybuffer: COpaquePointer?, dwreplybuffersize: UInt): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterReplyMessage((hport?.value ?: 0L).toString(), (lpreplybuffer?.value ?: 0L).toString(), dwreplybuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterSendMessage(hport: Handle, lpinbuffer: COpaquePointer?, dwinbuffersize: UInt, lpoutbuffer: COpaquePointer?, dwoutbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterSendMessage((hport?.value ?: 0L).toString(), (lpinbuffer?.value ?: 0L).toString(), dwinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), dwoutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterUnload(lpfiltername: Pcwstr): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterUnload((lpfiltername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindClose(hvolumefind: Handle): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindClose((hvolumefind?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpvolumefind: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindFirst(dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpvolumefind?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindNext((hvolumefind?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindClose((hvolumeinstancefind?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpvolumeinstancefind: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindFirst((lpvolumename?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpvolumeinstancefind?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAvailable) _wasm_windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindNext((hvolumeinstancefind?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
