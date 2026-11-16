@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr

private val windowsWin32SystemTpmbaseservicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun getDeviceID(pbwindowsaik: MutPtr, cbwindowsaik: UInt, pcbresult: MutPtr, pfprotectedbytpm: MutPtr): Hresult =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesGetDeviceID(pbwindowsaik.rawAddress.toString(), cbwindowsaik.toInt(), pcbresult.rawAddress.toString(), pfprotectedbytpm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: MutPtr, pfprotectedbytpm: MutPtr): Hresult =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString(pszwindowsaik.rawAddress.toString(), cchwindowsaik.toInt(), pcchresult.rawAddress.toString(), pfprotectedbytpm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiContextCreate(pcontextparams: ConstPtr, phcontext: MutPtr): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate(pcontextparams.rawAddress.toString(), phcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiCreateWindowsKey(keyhandle: UInt): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(keyhandle.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetDeviceInfo(size: UInt, info: MutPtr): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo(size.toInt(), info.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetOwnerAuth(hcontext: ConstPtr, ownerauthtype: UInt, poutputbuf: MutPtr, poutputbuflen: MutPtr): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth(hcontext.rawAddress.toString(), ownerauthtype.toInt(), poutputbuf.rawAddress.toString(), poutputbuflen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetTcgLog(hcontext: ConstPtr, poutputbuf: MutPtr, poutputbuflen: MutPtr): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog(hcontext.rawAddress.toString(), poutputbuf.rawAddress.toString(), poutputbuflen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetTcgLogEx(logtype: UInt, pboutput: MutPtr, pcboutput: MutPtr): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx(logtype.toInt(), pboutput.rawAddress.toString(), pcboutput.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiIsTpmPresent(): Bool =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiPhysicalPresenceCommand(hcontext: ConstPtr, pabinput: ConstPtr, cbinput: UInt, paboutput: MutPtr, pcboutput: MutPtr): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand(hcontext.rawAddress.toString(), pabinput.rawAddress.toString(), cbinput.toInt(), paboutput.rawAddress.toString(), pcboutput.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiRevokeAttestation(): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsipCancelCommands(hcontext: ConstPtr): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands(hcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsipContextClose(hcontext: ConstPtr): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose(hcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsipSubmitCommand(hcontext: ConstPtr, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: ConstPtr, cbcommand: UInt, pabresult: MutPtr, pcbresult: MutPtr): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAddon != null) (windowsWin32SystemTpmbaseservicesNapiAddon.windowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand(hcontext.rawAddress.toString(), locality.toInt(), priority.toInt(), pabcommand.rawAddress.toString(), cbcommand.toInt(), pabresult.rawAddress.toString(), pcbresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
