@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

private val windowsWin32StorageInstallablefilesystemsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterAttach(lpfiltername.rawAddress.toString(), lpvolumename.rawAddress.toString(), lpinstancename.rawAddress.toString(), dwcreatedinstancenamelength.toInt(), lpcreatedinstancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterAttachAtAltitude(lpfiltername.rawAddress.toString(), lpvolumename.rawAddress.toString(), lpaltitude.rawAddress.toString(), lpinstancename.rawAddress.toString(), dwcreatedinstancenamelength.toInt(), lpcreatedinstancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterClose(hfilter: Hfilter): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterClose(hfilter.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: ConstPtr<CVoid>, wsizeofcontext: UShort, lpsecurityattributes: ConstPtr<SecurityAttributes>, hport: MutPtr<Handle>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterConnectCommunicationPort(lpportname.rawAddress.toString(), dwoptions.toInt(), lpcontext.rawAddress.toString(), wsizeofcontext.toInt(), lpsecurityattributes.rawAddress.toString(), hport.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterCreate(lpfiltername: Pcwstr, hfilter: MutPtr<Hfilter>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterCreate(lpfiltername.rawAddress.toString(), hfilter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterDetach(lpfiltername.rawAddress.toString(), lpvolumename.rawAddress.toString(), lpinstancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindClose(hfilterfind: Handle): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindClose(hfilterfind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpfilterfind: MutPtr<Handle>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindFirst(dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpfilterfind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindNext(hfilterfind.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetDosName(lpvolumename.rawAddress.toString(), lpdosname.rawAddress.toString(), dwdosnamebuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetInformation(hfilter.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterGetMessage(hport: Handle, lpmessagebuffer: MutPtr<FilterMessageHeader>, dwmessagebuffersize: UInt, lpoverlapped: MutPtr<Overlapped>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetMessage(hport.rawAddress.toString(), lpmessagebuffer.rawAddress.toString(), dwmessagebuffersize.toInt(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceClose(hinstance: HfilterInstance): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose(hinstance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: MutPtr<HfilterInstance>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceCreate(lpfiltername.rawAddress.toString(), lpvolumename.rawAddress.toString(), lpinstancename.rawAddress.toString(), hinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindClose(hfilterinstancefind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpfilterinstancefind: MutPtr<Handle>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindFirst(lpfiltername.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpfilterinstancefind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindNext(hfilterinstancefind.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceGetInformation(hinstance.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterLoad(lpfiltername: Pcwstr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterLoad(lpfiltername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterReplyMessage(hport: Handle, lpreplybuffer: ConstPtr<FilterReplyHeader>, dwreplybuffersize: UInt): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterReplyMessage(hport.rawAddress.toString(), lpreplybuffer.rawAddress.toString(), dwreplybuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterSendMessage(hport: Handle, lpinbuffer: ConstPtr<CVoid>, dwinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, dwoutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterSendMessage(hport.rawAddress.toString(), lpinbuffer.rawAddress.toString(), dwinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), dwoutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterUnload(lpfiltername: Pcwstr): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterUnload(lpfiltername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindClose(hvolumefind: Handle): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindClose(hvolumefind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpvolumefind: MutPtr<Handle>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindFirst(dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpvolumefind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindNext(hvolumefind.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindClose(hvolumeinstancefind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpvolumeinstancefind: MutPtr<Handle>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindFirst(lpvolumename.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpvolumeinstancefind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    if (windowsWin32StorageInstallablefilesystemsNapiAddon != null) (windowsWin32StorageInstallablefilesystemsNapiAddon.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindNext(hvolumeinstancefind.rawAddress.toString(), dwinformationclass, lpbuffer.rawAddress.toString(), dwbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
