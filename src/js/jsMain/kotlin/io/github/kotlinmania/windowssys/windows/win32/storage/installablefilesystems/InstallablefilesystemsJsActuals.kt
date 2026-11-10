@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32StorageInstallablefilesystemsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterAttach((lpfiltername?.value ?: 0L).toString(), (lpvolumename?.value ?: 0L).toString(), (lpinstancename?.value ?: 0L).toString(), dwcreatedinstancenamelength.toInt(), (lpcreatedinstancename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterAttachAtAltitude((lpfiltername?.value ?: 0L).toString(), (lpvolumename?.value ?: 0L).toString(), (lpaltitude?.value ?: 0L).toString(), (lpinstancename?.value ?: 0L).toString(), dwcreatedinstancenamelength.toInt(), (lpcreatedinstancename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterClose(hfilter: Hfilter): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterClose(hfilter.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: COpaquePointer?, wsizeofcontext: UShort, lpsecurityattributes: COpaquePointer?, hport: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterConnectCommunicationPort((lpportname?.value ?: 0L).toString(), dwoptions.toInt(), (lpcontext?.value ?: 0L).toString(), wsizeofcontext.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), (hport?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterCreate(lpfiltername: Pcwstr, hfilter: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterCreate((lpfiltername?.value ?: 0L).toString(), (hfilter?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterDetach((lpfiltername?.value ?: 0L).toString(), (lpvolumename?.value ?: 0L).toString(), (lpinstancename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindClose(hfilterfind: Handle): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterFindClose((hfilterfind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpfilterfind: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterFindFirst(dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpfilterfind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterFindNext((hfilterfind?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterGetDosName((lpvolumename?.value ?: 0L).toString(), (lpdosname?.value ?: 0L).toString(), dwdosnamebuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterGetInformation(hfilter.toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetMessage(hport: Handle, lpmessagebuffer: COpaquePointer?, dwmessagebuffersize: UInt, lpoverlapped: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterGetMessage((hport?.value ?: 0L).toString(), (lpmessagebuffer?.value ?: 0L).toString(), dwmessagebuffersize.toInt(), (lpoverlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceClose(hinstance: HfilterInstance): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterInstanceClose(hinstance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterInstanceCreate((lpfiltername?.value ?: 0L).toString(), (lpvolumename?.value ?: 0L).toString(), (lpinstancename?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindClose((hfilterinstancefind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpfilterinstancefind: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindFirst((lpfiltername?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpfilterinstancefind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindNext((hfilterinstancefind?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterInstanceGetInformation(hinstance.toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterLoad(lpfiltername: Pcwstr): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterLoad((lpfiltername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterReplyMessage(hport: Handle, lpreplybuffer: COpaquePointer?, dwreplybuffersize: UInt): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterReplyMessage((hport?.value ?: 0L).toString(), (lpreplybuffer?.value ?: 0L).toString(), dwreplybuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterSendMessage(hport: Handle, lpinbuffer: COpaquePointer?, dwinbuffersize: UInt, lpoutbuffer: COpaquePointer?, dwoutbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterSendMessage((hport?.value ?: 0L).toString(), (lpinbuffer?.value ?: 0L).toString(), dwinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), dwoutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterUnload(lpfiltername: Pcwstr): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterUnload((lpfiltername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindClose(hvolumefind: Handle): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindClose((hvolumefind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpvolumefind: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindFirst(dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpvolumefind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindNext((hvolumefind?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindClose((hvolumeinstancefind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpvolumeinstancefind: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindFirst((lpvolumename?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpvolumeinstancefind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindNext((hvolumeinstancefind?.value ?: 0L).toString(), dwinformationclass, (lpbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
