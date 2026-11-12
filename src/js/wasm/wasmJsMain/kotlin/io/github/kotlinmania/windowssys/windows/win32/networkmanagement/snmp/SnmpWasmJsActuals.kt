@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementSnmpNapiAddon(): Boolean

private val windowsWin32NetworkmanagementSnmpNapiAvailable: Boolean = initWindowsWin32NetworkmanagementSnmpNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpClose(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpListen(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpListen(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpOpen(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpRegister(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpRegister(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpStartup(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpStartup(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree(p0: String)

public actual fun snmpCancelMsg(session: Long, reqid: Int): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(session.toString(), reqid).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCleanup(): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCleanupEx(): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpClose(session: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpClose(session.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpContextToStr(context: Long, string: MutPtr<SmiOctets>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr(context.toString(), string.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCountVbl(vbl: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(vbl.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(session.toString(), pduType.toInt(), requestId, errorStatus, errorIndex, varbindlist.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: MutPtr<CVoid>): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession(hwnd.rawAddress.toString(), wmsg.toInt(), 0L.toString(), lpclientdata.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCreateVbl(session: Long, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl(session.toString(), name.rawAddress.toString(), value.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDecodeMsg(session: Long, srcentity: MutPtr<Long>, dstentity: MutPtr<Long>, context: MutPtr<Long>, pdu: MutPtr<Long>, msgbufdesc: MutPtr<SmiOctets>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg(session.toString(), srcentity.rawAddress.toString(), dstentity.rawAddress.toString(), context.rawAddress.toString(), pdu.rawAddress.toString(), msgbufdesc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDeleteVb(vbl: Long, index: UInt): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(vbl.toString(), index.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDuplicatePdu(session: Long, pdu: Long): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(session.toString(), pdu.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDuplicateVbl(session: Long, vbl: Long): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(session.toString(), vbl.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: MutPtr<SmiOctets>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), pdu.toString(), msgbufdesc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr(entity.toString(), size.toInt(), string.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeContext(context: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(context.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeDescriptor(syntax: UInt, descriptor: MutPtr<SmiOctets>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor(syntax.toInt(), descriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeEntity(entity: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(entity.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreePdu(pdu: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(pdu.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeVbl(vbl: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(vbl.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetLastError(session: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(session.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetPduData(pdu: Long, pduType: MutPtr<SnmpPduType>, requestId: MutPtr<Int>, errorStatus: MutPtr<SnmpError>, errorIndex: MutPtr<Int>, varbindlist: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData(pdu.toString(), pduType.rawAddress.toString(), requestId.rawAddress.toString(), errorStatus.rawAddress.toString(), errorIndex.rawAddress.toString(), varbindlist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetRetransmitMode(nretransmitmode: MutPtr<SnmpStatus>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode(nretransmitmode.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetRetry(hentity: Long, npolicyretry: MutPtr<UInt>, nactualretry: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry(hentity.toString(), npolicyretry.rawAddress.toString(), nactualretry.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetTimeout(hentity: Long, npolicytimeout: MutPtr<UInt>, nactualtimeout: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout(hentity.toString(), npolicytimeout.rawAddress.toString(), nactualtimeout.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetTranslateMode(ntranslatemode: MutPtr<SnmpApiTranslateMode>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode(ntranslatemode.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetVb(vbl: Long, index: UInt, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb(vbl.toString(), index.toInt(), name.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetVendorInfo(vendorinfo: MutPtr<SmiVendorinfo>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo(vendorinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpListen(hentity.toString(), lstatus.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(hentity.toString(), lstatus.toInt(), nuseentityaddr.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrClose(session: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose(session.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrCtl(session: MutPtr<CVoid>, dwctlcode: UInt, lpvinbuffer: MutPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl(session.rawAddress.toString(), dwctlcode.toInt(), lpvinbuffer.rawAddress.toString(), cbinbuffer.toInt(), lpvoutbuffer.rawAddress.toString(), cboutbuffer.toInt(), lpcbbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrGetTrap(enterprise: MutPtr<AsnObjectIdentifier>, ipaddress: MutPtr<AsnOctetString>, generictrap: MutPtr<SnmpGenerictrap>, specifictrap: MutPtr<Int>, timestamp: MutPtr<UInt>, variablebindings: MutPtr<SnmpVarBindList>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap(enterprise.rawAddress.toString(), ipaddress.rawAddress.toString(), generictrap.rawAddress.toString(), specifictrap.rawAddress.toString(), timestamp.rawAddress.toString(), variablebindings.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrGetTrapEx(enterprise: MutPtr<AsnObjectIdentifier>, agentaddress: MutPtr<AsnOctetString>, sourceaddress: MutPtr<AsnOctetString>, generictrap: MutPtr<SnmpGenerictrap>, specifictrap: MutPtr<Int>, community: MutPtr<AsnOctetString>, timestamp: MutPtr<UInt>, variablebindings: MutPtr<SnmpVarBindList>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx(enterprise.rawAddress.toString(), agentaddress.rawAddress.toString(), sourceaddress.rawAddress.toString(), generictrap.rawAddress.toString(), specifictrap.rawAddress.toString(), community.rawAddress.toString(), timestamp.rawAddress.toString(), variablebindings.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrOidToStr(oid: MutPtr<AsnObjectIdentifier>, string: MutPtr<Pstr>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr(oid.rawAddress.toString(), string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): MutPtr<CVoid> =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen(lpagentaddress.rawAddress.toString(), lpagentcommunity.rawAddress.toString(), ntimeout, nretries).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrRequest(session: MutPtr<CVoid>, requesttype: UByte, variablebindings: MutPtr<SnmpVarBindList>, errorstatus: MutPtr<SnmpErrorStatus>, errorindex: MutPtr<Int>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest(session.rawAddress.toString(), requesttype.toInt(), variablebindings.rawAddress.toString(), errorstatus.rawAddress.toString(), errorindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrStrToOid(string: Pcstr, oid: MutPtr<AsnObjectIdentifier>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid(string.rawAddress.toString(), oid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrTrapListen(phtrapavailable: MutPtr<Handle>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen(phtrapavailable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOidCompare(xoid: MutPtr<SmiOid>, yoid: MutPtr<SmiOid>, maxlen: UInt, result: MutPtr<Int>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare(xoid.rawAddress.toString(), yoid.rawAddress.toString(), maxlen.toInt(), result.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOidCopy(srcoid: MutPtr<SmiOid>, dstoid: MutPtr<SmiOid>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy(srcoid.rawAddress.toString(), dstoid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOidToStr(srcoid: ConstPtr<SmiOid>, size: UInt, string: Pstr): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr(srcoid.rawAddress.toString(), size.toInt(), string.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpOpen(hwnd.rawAddress.toString(), wmsg.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpRecvMsg(session: Long, srcentity: MutPtr<Long>, dstentity: MutPtr<Long>, context: MutPtr<Long>, pdu: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg(session.toString(), srcentity.rawAddress.toString(), dstentity.rawAddress.toString(), context.rawAddress.toString(), pdu.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: MutPtr<SmiOid>, state: SnmpStatus): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpRegister(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), notification.rawAddress.toString(), state.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), pdu.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetPduData(pdu: Long, pduType: ConstPtr<Int>, requestId: ConstPtr<Int>, nonRepeaters: ConstPtr<Int>, maxRepetitions: ConstPtr<Int>, varbindlist: ConstPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData(pdu.toString(), pduType.rawAddress.toString(), requestId.rawAddress.toString(), nonRepeaters.rawAddress.toString(), maxRepetitions.rawAddress.toString(), varbindlist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetPort(hentity: Long, nport: UInt): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(hentity.toString(), nport.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(nretransmitmode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(hentity.toString(), npolicyretry.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(hentity.toString(), npolicytimeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(ntranslatemode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetVb(vbl: Long, index: UInt, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb(vbl.toString(), index.toInt(), name.rawAddress.toString(), value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStartup(nmajorversion: MutPtr<UInt>, nminorversion: MutPtr<UInt>, nlevel: MutPtr<UInt>, ntranslatemode: MutPtr<SnmpApiTranslateMode>, nretransmitmode: MutPtr<SnmpStatus>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpStartup(nmajorversion.rawAddress.toString(), nminorversion.rawAddress.toString(), nlevel.rawAddress.toString(), ntranslatemode.rawAddress.toString(), nretransmitmode.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStartupEx(nmajorversion: MutPtr<UInt>, nminorversion: MutPtr<UInt>, nlevel: MutPtr<UInt>, ntranslatemode: MutPtr<SnmpApiTranslateMode>, nretransmitmode: MutPtr<SnmpStatus>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx(nmajorversion.rawAddress.toString(), nminorversion.rawAddress.toString(), nlevel.rawAddress.toString(), ntranslatemode.rawAddress.toString(), nretransmitmode.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStrToContext(session: Long, string: MutPtr<SmiOctets>): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext(session.toString(), string.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStrToEntity(session: Long, string: Pcstr): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity(session.toString(), string.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStrToOid(string: Pcstr, dstoid: MutPtr<SmiOid>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid(string.rawAddress.toString(), dstoid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSvcGetUptime(): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSvcSetLogLevel(nloglevel: SnmpLog) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(nloglevel)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpSvcSetLogType(nlogtype: Int) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(nlogtype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilAsnAnyCpy(panydst: MutPtr<AsnAny>, panysrc: MutPtr<AsnAny>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy(panydst.rawAddress.toString(), panysrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilAsnAnyFree(pany: MutPtr<AsnAny>) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree(pany.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint(nloglevel, szformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilIdsToA(ids: MutPtr<UInt>, idlength: UInt): Pstr =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA(ids.rawAddress.toString(), idlength.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilMemAlloc(nbytes: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc(nbytes.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilMemFree(pmem: MutPtr<CVoid>) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree(pmem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilMemReAlloc(pmem: MutPtr<CVoid>, nbytes: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc(pmem.rawAddress.toString(), nbytes.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOctetsCmp(poctets1: MutPtr<AsnOctetString>, poctets2: MutPtr<AsnOctetString>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp(poctets1.rawAddress.toString(), poctets2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOctetsCpy(poctetsdst: MutPtr<AsnOctetString>, poctetssrc: MutPtr<AsnOctetString>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy(poctetsdst.rawAddress.toString(), poctetssrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOctetsFree(poctets: MutPtr<AsnOctetString>) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree(poctets.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilOctetsNCmp(poctets1: MutPtr<AsnOctetString>, poctets2: MutPtr<AsnOctetString>, nchars: UInt): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp(poctets1.rawAddress.toString(), poctets2.rawAddress.toString(), nchars.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidAppend(poiddst: MutPtr<AsnObjectIdentifier>, poidsrc: MutPtr<AsnObjectIdentifier>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend(poiddst.rawAddress.toString(), poidsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidCmp(poid1: MutPtr<AsnObjectIdentifier>, poid2: MutPtr<AsnObjectIdentifier>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp(poid1.rawAddress.toString(), poid2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidCpy(poiddst: MutPtr<AsnObjectIdentifier>, poidsrc: MutPtr<AsnObjectIdentifier>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy(poiddst.rawAddress.toString(), poidsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidFree(poid: MutPtr<AsnObjectIdentifier>) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree(poid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilOidNCmp(poid1: MutPtr<AsnObjectIdentifier>, poid2: MutPtr<AsnObjectIdentifier>, nsubids: UInt): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp(poid1.rawAddress.toString(), poid2.rawAddress.toString(), nsubids.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidToA(oid: MutPtr<AsnObjectIdentifier>): Pstr =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA(oid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilPrintAsnAny(pany: MutPtr<AsnAny>) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny(pany.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilPrintOid(oid: MutPtr<AsnObjectIdentifier>) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid(oid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilVarBindCpy(pvbdst: MutPtr<SnmpVarBind>, pvbsrc: MutPtr<SnmpVarBind>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy(pvbdst.rawAddress.toString(), pvbsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilVarBindFree(pvb: MutPtr<SnmpVarBind>) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree(pvb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilVarBindListCpy(pvbldst: MutPtr<SnmpVarBindList>, pvblsrc: MutPtr<SnmpVarBindList>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy(pvbldst.rawAddress.toString(), pvblsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilVarBindListFree(pvbl: MutPtr<SnmpVarBindList>) {
    if (windowsWin32NetworkmanagementSnmpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree(pvbl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
