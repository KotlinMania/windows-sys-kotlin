@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemSearchNapiAddon(): Boolean

private val windowsWin32SystemSearchNapiAvailable: Boolean = initWindowsWin32SystemSearchNapiAddon()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchODBCGetTryWaitValue()")
private external fun wasmWindowssysWindowsWin32SystemSearchODBCGetTryWaitValue(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchODBCSetTryWaitValue(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchODBCSetTryWaitValue(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLAllocConnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLAllocConnect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLAllocEnv(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLAllocEnv(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLAllocHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLAllocHandle(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLAllocHandleStd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLAllocHandleStd(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLAllocStmt(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLAllocStmt(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLBindCol(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLBindCol(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLBindParam(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLBindParam(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLBindParameter(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLBindParameter(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLBrowseConnect(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLBrowseConnect(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLBrowseConnectA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLBrowseConnectA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLBrowseConnectW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLBrowseConnectW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLBulkOperations(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLBulkOperations(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLCancel(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLCancelHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLCancelHandle(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLCloseCursor(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLCloseCursor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLCloseEnumServers(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLCloseEnumServers(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColAttribute(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColAttribute(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColAttributeA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColAttributeA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColAttributeW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColAttributeW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColAttributes(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColAttributes(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColAttributesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColAttributesA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColAttributesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColAttributesW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColumnPrivileges(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColumnPrivileges(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColumnPrivilegesA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColumnPrivilegesW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColumns(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColumns(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColumnsA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColumnsA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLColumnsW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLColumnsW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLCompleteAsync(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLCompleteAsync(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLConnect(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLConnect(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLConnectA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLConnectA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLConnectW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLConnectW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLCopyDesc(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLCopyDesc(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDataSources(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDataSources(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDataSourcesA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDataSourcesA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDataSourcesW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDataSourcesW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDescribeCol(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDescribeCol(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDescribeColA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDescribeColA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDescribeColW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDescribeColW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDescribeParam(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDescribeParam(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDisconnect(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDisconnect(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDriverConnect(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDriverConnect(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDriverConnectA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDriverConnectA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDriverConnectW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDriverConnectW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDrivers(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDrivers(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDriversA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDriversA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLDriversW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLDriversW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLEndTran(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLEndTran(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLError(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLError(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLErrorA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLErrorA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLErrorW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLErrorW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLExecDirect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLExecDirect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLExecDirectA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLExecDirectA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLExecDirectW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLExecDirectW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLExecute(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLExecute(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLExtendedFetch(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLExtendedFetch(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLFetch(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLFetch(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLFetchScroll(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLFetchScroll(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLForeignKeys(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLForeignKeys(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int, p9: String, p10: Int, p11: String, p12: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLForeignKeysA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLForeignKeysA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int, p9: String, p10: Int, p11: String, p12: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLForeignKeysW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLForeignKeysW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int, p9: String, p10: Int, p11: String, p12: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLFreeConnect(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLFreeConnect(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLFreeEnv(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLFreeEnv(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLFreeHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLFreeHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLFreeStmt(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLFreeStmt(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetConnectAttr(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetConnectAttr(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetConnectAttrA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetConnectAttrA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetConnectAttrW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetConnectAttrW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetConnectOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetConnectOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetConnectOptionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetConnectOptionA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetConnectOptionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetConnectOptionW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetCursorName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetCursorName(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetCursorNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetCursorNameA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetCursorNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetCursorNameW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetData(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDescField(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDescField(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDescFieldA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDescFieldA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDescFieldW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDescFieldW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDescRec(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDescRec(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDescRecA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDescRecA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDescRecW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDescRecW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDiagField(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDiagField(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDiagFieldA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDiagFieldA(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDiagFieldW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDiagFieldW(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDiagRec(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDiagRec(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDiagRecA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDiagRecA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetDiagRecW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetDiagRecW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetEnvAttr(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetEnvAttr(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetFunctions(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetFunctions(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetInfo(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetInfoA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetInfoW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetNextEnumeration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetNextEnumeration(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetStmtAttr(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetStmtAttr(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetStmtAttrA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetStmtAttrA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetStmtAttrW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetStmtAttrW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetStmtOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetStmtOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetTypeInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetTypeInfo(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetTypeInfoA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetTypeInfoA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLGetTypeInfoW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLGetTypeInfoW(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLInitEnumServers(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLInitEnumServers(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLLinkedCatalogsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLLinkedCatalogsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLLinkedServers(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLLinkedServers(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLMoreResults(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLMoreResults(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLNativeSql(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLNativeSql(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLNativeSqlA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLNativeSqlA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLNativeSqlW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLNativeSqlW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLNumParams(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLNumParams(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLNumResultCols(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLNumResultCols(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLParamData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLParamData(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLParamOptions(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLParamOptions(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLPrepare(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLPrepare(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLPrepareA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLPrepareA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLPrepareW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLPrepareW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLPrimaryKeys(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLPrimaryKeys(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLPrimaryKeysA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLPrimaryKeysA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLPrimaryKeysW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLPrimaryKeysW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLProcedureColumns(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLProcedureColumns(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLProcedureColumnsA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLProcedureColumnsA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLProcedureColumnsW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLProcedureColumnsW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLProcedures(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLProcedures(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLProceduresA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLProceduresA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLProceduresW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLProceduresW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLPutData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLPutData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLRowCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLRowCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetConnectAttr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetConnectAttr(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetConnectAttrA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetConnectAttrA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetConnectAttrW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetConnectAttrW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetConnectOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetConnectOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetConnectOptionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetConnectOptionA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetConnectOptionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetConnectOptionW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetCursorName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetCursorName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetCursorNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetCursorNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetCursorNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetCursorNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetDescField(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetDescField(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetDescFieldW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetDescFieldW(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetDescRec(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetDescRec(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetEnvAttr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetEnvAttr(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetParam(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetParam(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetPos(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetPos(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetScrollOptions(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetScrollOptions(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetStmtAttr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetStmtAttr(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetStmtAttrW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetStmtAttrW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSetStmtOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSetStmtOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSpecialColumns(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSpecialColumns(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSpecialColumnsA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSpecialColumnsA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLSpecialColumnsW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLSpecialColumnsW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLStatistics(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLStatistics(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLStatisticsA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLStatisticsA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLStatisticsW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLStatisticsW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLTablePrivileges(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLTablePrivileges(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLTablePrivilegesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLTablePrivilegesA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLTablePrivilegesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLTablePrivilegesW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLTables(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLTables(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLTablesA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLTablesA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLTablesW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLTablesW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchSQLTransact(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchSQLTransact(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpBatch(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpBatch(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpBind(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpBind(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpColfmt(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpColfmt(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpCollen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpCollen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpColptr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpColptr(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpColumns(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpColumns(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpControl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpControl(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpDone(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpDone(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpExec(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpExec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpGetcolfmt(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpGetcolfmt(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpInitA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpInitA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpInitW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpInitW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpMoretext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpMoretext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpReadfmtA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpReadfmtA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpReadfmtW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpReadfmtW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpSendrow(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpSendrow(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpSetcolfmt(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpSetcolfmt(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpWritefmtA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpWritefmtA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchBcpWritefmtW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSearchBcpWritefmtW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchDbprtypeA(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchDbprtypeA(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSearchDbprtypeW(p0)")
private external fun wasmWindowssysWindowsWin32SystemSearchDbprtypeW(p0: Int): String

public actual fun oDBCGetTryWaitValue(): UInt =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchODBCGetTryWaitValue().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oDBCSetTryWaitValue(dwvalue: UInt): Bool =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchODBCSetTryWaitValue(dwvalue.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocConnect(environmenthandle: MutPtr, connectionhandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLAllocConnect(environmenthandle.rawAddress.toString(), connectionhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocEnv(environmenthandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLAllocEnv(environmenthandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocHandle(handletype: Short, inputhandle: MutPtr, outputhandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLAllocHandle(handletype.toInt(), inputhandle.rawAddress.toString(), outputhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocHandleStd(fhandletype: Short, hinput: MutPtr, phoutput: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLAllocHandleStd(fhandletype.toInt(), hinput.rawAddress.toString(), phoutput.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocStmt(connectionhandle: MutPtr, statementhandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLAllocStmt(connectionhandle.rawAddress.toString(), statementhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBindCol(statementhandle: MutPtr, columnnumber: UShort, targettype: Short, targetvalue: MutPtr, bufferlength: Long, strlenOrInd: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLBindCol(statementhandle.rawAddress.toString(), columnnumber.toInt(), targettype.toInt(), targetvalue.rawAddress.toString(), bufferlength.toString(), strlenOrInd.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBindParam(statementhandle: MutPtr, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: MutPtr, strlenOrInd: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLBindParam(statementhandle.rawAddress.toString(), parameternumber.toInt(), valuetype.toInt(), parametertype.toInt(), lengthprecision.toString(), parameterscale.toInt(), parametervalue.rawAddress.toString(), strlenOrInd.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBindParameter(hstmt: MutPtr, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: MutPtr, cbvaluemax: Long, pcbvalue: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLBindParameter(hstmt.rawAddress.toString(), ipar.toInt(), fparamtype.toInt(), fctype.toInt(), fsqltype.toInt(), cbcoldef.toString(), ibscale.toInt(), rgbvalue.rawAddress.toString(), cbvaluemax.toString(), pcbvalue.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBrowseConnect(hdbc: MutPtr, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLBrowseConnect(hdbc.rawAddress.toString(), szconnstrin.rawAddress.toString(), cchconnstrin.toInt(), szconnstrout.rawAddress.toString(), cchconnstroutmax.toInt(), pcchconnstrout.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBrowseConnectA(hdbc: MutPtr, szconnstrin: ConstPtr, cbconnstrin: Short, szconnstrout: MutPtr, cbconnstroutmax: Short, pcbconnstrout: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLBrowseConnectA(hdbc.rawAddress.toString(), szconnstrin.rawAddress.toString(), cbconnstrin.toInt(), szconnstrout.rawAddress.toString(), cbconnstroutmax.toInt(), pcbconnstrout.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBrowseConnectW(hdbc: MutPtr, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLBrowseConnectW(hdbc.rawAddress.toString(), szconnstrin.rawAddress.toString(), cchconnstrin.toInt(), szconnstrout.rawAddress.toString(), cchconnstroutmax.toInt(), pcchconnstrout.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBulkOperations(statementhandle: MutPtr, operation: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLBulkOperations(statementhandle.rawAddress.toString(), operation.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCancel(statementhandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLCancel(statementhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCancelHandle(handletype: Short, inputhandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLCancelHandle(handletype.toInt(), inputhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCloseCursor(statementhandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLCloseCursor(statementhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCloseEnumServers(henumhandle: Handle): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLCloseEnumServers(henumhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttribute(statementhandle: MutPtr, columnnumber: UShort, fieldidentifier: UShort, characterattribute: MutPtr, bufferlength: Short, stringlength: MutPtr, numericattribute: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColAttribute(statementhandle.rawAddress.toString(), columnnumber.toInt(), fieldidentifier.toInt(), characterattribute.rawAddress.toString(), bufferlength.toInt(), stringlength.rawAddress.toString(), numericattribute.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributeA(hstmt: MutPtr, icol: Short, ifield: Short, pcharattr: MutPtr, cbcharattrmax: Short, pcbcharattr: MutPtr, pnumattr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColAttributeA(hstmt.rawAddress.toString(), icol.toInt(), ifield.toInt(), pcharattr.rawAddress.toString(), cbcharattrmax.toInt(), pcbcharattr.rawAddress.toString(), pnumattr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributeW(hstmt: MutPtr, icol: UShort, ifield: UShort, pcharattr: MutPtr, cbdescmax: Short, pcbcharattr: MutPtr, pnumattr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColAttributeW(hstmt.rawAddress.toString(), icol.toInt(), ifield.toInt(), pcharattr.rawAddress.toString(), cbdescmax.toInt(), pcbcharattr.rawAddress.toString(), pnumattr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributes(hstmt: MutPtr, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr, cbdescmax: Short, pcbdesc: MutPtr, pfdesc: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColAttributes(hstmt.rawAddress.toString(), icol.toInt(), fdesctype.toInt(), rgbdesc.rawAddress.toString(), cbdescmax.toInt(), pcbdesc.rawAddress.toString(), pfdesc.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributesA(hstmt: MutPtr, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr, cbdescmax: Short, pcbdesc: MutPtr, pfdesc: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColAttributesA(hstmt.rawAddress.toString(), icol.toInt(), fdesctype.toInt(), rgbdesc.rawAddress.toString(), cbdescmax.toInt(), pcbdesc.rawAddress.toString(), pfdesc.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributesW(hstmt: MutPtr, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr, cbdescmax: Short, pcbdesc: MutPtr, pfdesc: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColAttributesW(hstmt.rawAddress.toString(), icol.toInt(), fdesctype.toInt(), rgbdesc.rawAddress.toString(), cbdescmax.toInt(), pcbdesc.rawAddress.toString(), pfdesc.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnPrivileges(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColumnPrivileges(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), szcolumnname.rawAddress.toString(), cchcolumnname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnPrivilegesA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, szcolumnname: ConstPtr, cbcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColumnPrivilegesA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt(), szcolumnname.rawAddress.toString(), cbcolumnname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnPrivilegesW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColumnPrivilegesW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), szcolumnname.rawAddress.toString(), cchcolumnname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumns(statementhandle: MutPtr, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, columnname: ConstPtr, namelength4: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColumns(statementhandle.rawAddress.toString(), catalogname.rawAddress.toString(), namelength1.toInt(), schemaname.rawAddress.toString(), namelength2.toInt(), tablename.rawAddress.toString(), namelength3.toInt(), columnname.rawAddress.toString(), namelength4.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnsA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, szcolumnname: ConstPtr, cbcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColumnsA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt(), szcolumnname.rawAddress.toString(), cbcolumnname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnsW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLColumnsW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), szcolumnname.rawAddress.toString(), cchcolumnname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCompleteAsync(handletype: Short, handle: MutPtr, asyncretcodeptr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLCompleteAsync(handletype.toInt(), handle.rawAddress.toString(), asyncretcodeptr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLConnect(connectionhandle: MutPtr, servername: ConstPtr, namelength1: Short, username: ConstPtr, namelength2: Short, authentication: ConstPtr, namelength3: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLConnect(connectionhandle.rawAddress.toString(), servername.rawAddress.toString(), namelength1.toInt(), username.rawAddress.toString(), namelength2.toInt(), authentication.rawAddress.toString(), namelength3.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLConnectA(hdbc: MutPtr, szdsn: ConstPtr, cbdsn: Short, szuid: ConstPtr, cbuid: Short, szauthstr: ConstPtr, cbauthstr: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLConnectA(hdbc.rawAddress.toString(), szdsn.rawAddress.toString(), cbdsn.toInt(), szuid.rawAddress.toString(), cbuid.toInt(), szauthstr.rawAddress.toString(), cbauthstr.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLConnectW(hdbc: MutPtr, szdsn: ConstPtr, cchdsn: Short, szuid: ConstPtr, cchuid: Short, szauthstr: ConstPtr, cchauthstr: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLConnectW(hdbc.rawAddress.toString(), szdsn.rawAddress.toString(), cchdsn.toInt(), szuid.rawAddress.toString(), cchuid.toInt(), szauthstr.rawAddress.toString(), cchauthstr.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCopyDesc(sourcedeschandle: MutPtr, targetdeschandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLCopyDesc(sourcedeschandle.rawAddress.toString(), targetdeschandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDataSources(environmenthandle: MutPtr, direction: UShort, servername: MutPtr, bufferlength1: Short, namelength1ptr: MutPtr, description: MutPtr, bufferlength2: Short, namelength2ptr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDataSources(environmenthandle.rawAddress.toString(), direction.toInt(), servername.rawAddress.toString(), bufferlength1.toInt(), namelength1ptr.rawAddress.toString(), description.rawAddress.toString(), bufferlength2.toInt(), namelength2ptr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDataSourcesA(henv: MutPtr, fdirection: UShort, szdsn: MutPtr, cbdsnmax: Short, pcbdsn: MutPtr, szdescription: MutPtr, cbdescriptionmax: Short, pcbdescription: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDataSourcesA(henv.rawAddress.toString(), fdirection.toInt(), szdsn.rawAddress.toString(), cbdsnmax.toInt(), pcbdsn.rawAddress.toString(), szdescription.rawAddress.toString(), cbdescriptionmax.toInt(), pcbdescription.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDataSourcesW(henv: MutPtr, fdirection: UShort, szdsn: MutPtr, cchdsnmax: Short, pcchdsn: MutPtr, wszdescription: MutPtr, cchdescriptionmax: Short, pcchdescription: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDataSourcesW(henv.rawAddress.toString(), fdirection.toInt(), szdsn.rawAddress.toString(), cchdsnmax.toInt(), pcchdsn.rawAddress.toString(), wszdescription.rawAddress.toString(), cchdescriptionmax.toInt(), pcchdescription.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeCol(statementhandle: MutPtr, columnnumber: UShort, columnname: MutPtr, bufferlength: Short, namelength: MutPtr, datatype: MutPtr, columnsize: MutPtr, decimaldigits: MutPtr, nullable: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDescribeCol(statementhandle.rawAddress.toString(), columnnumber.toInt(), columnname.rawAddress.toString(), bufferlength.toInt(), namelength.rawAddress.toString(), datatype.rawAddress.toString(), columnsize.rawAddress.toString(), decimaldigits.rawAddress.toString(), nullable.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeColA(hstmt: MutPtr, icol: UShort, szcolname: MutPtr, cbcolnamemax: Short, pcbcolname: MutPtr, pfsqltype: MutPtr, pcbcoldef: MutPtr, pibscale: MutPtr, pfnullable: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDescribeColA(hstmt.rawAddress.toString(), icol.toInt(), szcolname.rawAddress.toString(), cbcolnamemax.toInt(), pcbcolname.rawAddress.toString(), pfsqltype.rawAddress.toString(), pcbcoldef.rawAddress.toString(), pibscale.rawAddress.toString(), pfnullable.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeColW(hstmt: MutPtr, icol: UShort, szcolname: MutPtr, cchcolnamemax: Short, pcchcolname: MutPtr, pfsqltype: MutPtr, pcbcoldef: MutPtr, pibscale: MutPtr, pfnullable: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDescribeColW(hstmt.rawAddress.toString(), icol.toInt(), szcolname.rawAddress.toString(), cchcolnamemax.toInt(), pcchcolname.rawAddress.toString(), pfsqltype.rawAddress.toString(), pcbcoldef.rawAddress.toString(), pibscale.rawAddress.toString(), pfnullable.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeParam(hstmt: MutPtr, ipar: UShort, pfsqltype: MutPtr, pcbparamdef: MutPtr, pibscale: MutPtr, pfnullable: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDescribeParam(hstmt.rawAddress.toString(), ipar.toInt(), pfsqltype.rawAddress.toString(), pcbparamdef.rawAddress.toString(), pibscale.rawAddress.toString(), pfnullable.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDisconnect(connectionhandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDisconnect(connectionhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriverConnect(hdbc: MutPtr, hwnd: Long, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr, fdrivercompletion: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDriverConnect(hdbc.rawAddress.toString(), hwnd.toString(), szconnstrin.rawAddress.toString(), cchconnstrin.toInt(), szconnstrout.rawAddress.toString(), cchconnstroutmax.toInt(), pcchconnstrout.rawAddress.toString(), fdrivercompletion.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriverConnectA(hdbc: MutPtr, hwnd: Long, szconnstrin: ConstPtr, cbconnstrin: Short, szconnstrout: MutPtr, cbconnstroutmax: Short, pcbconnstrout: MutPtr, fdrivercompletion: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDriverConnectA(hdbc.rawAddress.toString(), hwnd.toString(), szconnstrin.rawAddress.toString(), cbconnstrin.toInt(), szconnstrout.rawAddress.toString(), cbconnstroutmax.toInt(), pcbconnstrout.rawAddress.toString(), fdrivercompletion.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriverConnectW(hdbc: MutPtr, hwnd: Long, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr, fdrivercompletion: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDriverConnectW(hdbc.rawAddress.toString(), hwnd.toString(), szconnstrin.rawAddress.toString(), cchconnstrin.toInt(), szconnstrout.rawAddress.toString(), cchconnstroutmax.toInt(), pcchconnstrout.rawAddress.toString(), fdrivercompletion.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDrivers(henv: MutPtr, fdirection: UShort, szdriverdesc: MutPtr, cchdriverdescmax: Short, pcchdriverdesc: MutPtr, szdriverattributes: MutPtr, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDrivers(henv.rawAddress.toString(), fdirection.toInt(), szdriverdesc.rawAddress.toString(), cchdriverdescmax.toInt(), pcchdriverdesc.rawAddress.toString(), szdriverattributes.rawAddress.toString(), cchdrvrattrmax.toInt(), pcchdrvrattr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriversA(henv: MutPtr, fdirection: UShort, szdriverdesc: MutPtr, cbdriverdescmax: Short, pcbdriverdesc: MutPtr, szdriverattributes: MutPtr, cbdrvrattrmax: Short, pcbdrvrattr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDriversA(henv.rawAddress.toString(), fdirection.toInt(), szdriverdesc.rawAddress.toString(), cbdriverdescmax.toInt(), pcbdriverdesc.rawAddress.toString(), szdriverattributes.rawAddress.toString(), cbdrvrattrmax.toInt(), pcbdrvrattr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriversW(henv: MutPtr, fdirection: UShort, szdriverdesc: MutPtr, cchdriverdescmax: Short, pcchdriverdesc: MutPtr, szdriverattributes: MutPtr, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLDriversW(henv.rawAddress.toString(), fdirection.toInt(), szdriverdesc.rawAddress.toString(), cchdriverdescmax.toInt(), pcchdriverdesc.rawAddress.toString(), szdriverattributes.rawAddress.toString(), cchdrvrattrmax.toInt(), pcchdrvrattr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLEndTran(handletype: Short, handle: MutPtr, completiontype: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLEndTran(handletype.toInt(), handle.rawAddress.toString(), completiontype.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLError(environmenthandle: MutPtr, connectionhandle: MutPtr, statementhandle: MutPtr, sqlstate: MutPtr, nativeerror: MutPtr, messagetext: MutPtr, bufferlength: Short, textlength: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLError(environmenthandle.rawAddress.toString(), connectionhandle.rawAddress.toString(), statementhandle.rawAddress.toString(), sqlstate.rawAddress.toString(), nativeerror.rawAddress.toString(), messagetext.rawAddress.toString(), bufferlength.toInt(), textlength.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLErrorA(henv: MutPtr, hdbc: MutPtr, hstmt: MutPtr, szsqlstate: MutPtr, pfnativeerror: MutPtr, szerrormsg: MutPtr, cberrormsgmax: Short, pcberrormsg: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLErrorA(henv.rawAddress.toString(), hdbc.rawAddress.toString(), hstmt.rawAddress.toString(), szsqlstate.rawAddress.toString(), pfnativeerror.rawAddress.toString(), szerrormsg.rawAddress.toString(), cberrormsgmax.toInt(), pcberrormsg.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLErrorW(henv: MutPtr, hdbc: MutPtr, hstmt: MutPtr, wszsqlstate: MutPtr, pfnativeerror: MutPtr, wszerrormsg: MutPtr, ccherrormsgmax: Short, pccherrormsg: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLErrorW(henv.rawAddress.toString(), hdbc.rawAddress.toString(), hstmt.rawAddress.toString(), wszsqlstate.rawAddress.toString(), pfnativeerror.rawAddress.toString(), wszerrormsg.rawAddress.toString(), ccherrormsgmax.toInt(), pccherrormsg.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecDirect(statementhandle: MutPtr, statementtext: ConstPtr, textlength: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLExecDirect(statementhandle.rawAddress.toString(), statementtext.rawAddress.toString(), textlength).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecDirectA(hstmt: MutPtr, szsqlstr: ConstPtr, cbsqlstr: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLExecDirectA(hstmt.rawAddress.toString(), szsqlstr.rawAddress.toString(), cbsqlstr).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecDirectW(hstmt: MutPtr, szsqlstr: ConstPtr, textlength: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLExecDirectW(hstmt.rawAddress.toString(), szsqlstr.rawAddress.toString(), textlength).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecute(statementhandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLExecute(statementhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExtendedFetch(hstmt: MutPtr, ffetchtype: UShort, irow: Long, pcrow: MutPtr, rgfrowstatus: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLExtendedFetch(hstmt.rawAddress.toString(), ffetchtype.toInt(), irow.toString(), pcrow.rawAddress.toString(), rgfrowstatus.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFetch(statementhandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLFetch(statementhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFetchScroll(statementhandle: MutPtr, fetchorientation: Short, fetchoffset: Long): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLFetchScroll(statementhandle.rawAddress.toString(), fetchorientation.toInt(), fetchoffset.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLForeignKeys(hstmt: MutPtr, szpkcatalogname: ConstPtr, cchpkcatalogname: Short, szpkschemaname: ConstPtr, cchpkschemaname: Short, szpktablename: ConstPtr, cchpktablename: Short, szfkcatalogname: ConstPtr, cchfkcatalogname: Short, szfkschemaname: ConstPtr, cchfkschemaname: Short, szfktablename: ConstPtr, cchfktablename: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLForeignKeys(hstmt.rawAddress.toString(), szpkcatalogname.rawAddress.toString(), cchpkcatalogname.toInt(), szpkschemaname.rawAddress.toString(), cchpkschemaname.toInt(), szpktablename.rawAddress.toString(), cchpktablename.toInt(), szfkcatalogname.rawAddress.toString(), cchfkcatalogname.toInt(), szfkschemaname.rawAddress.toString(), cchfkschemaname.toInt(), szfktablename.rawAddress.toString(), cchfktablename.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLForeignKeysA(hstmt: MutPtr, szpkcatalogname: ConstPtr, cbpkcatalogname: Short, szpkschemaname: ConstPtr, cbpkschemaname: Short, szpktablename: ConstPtr, cbpktablename: Short, szfkcatalogname: ConstPtr, cbfkcatalogname: Short, szfkschemaname: ConstPtr, cbfkschemaname: Short, szfktablename: ConstPtr, cbfktablename: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLForeignKeysA(hstmt.rawAddress.toString(), szpkcatalogname.rawAddress.toString(), cbpkcatalogname.toInt(), szpkschemaname.rawAddress.toString(), cbpkschemaname.toInt(), szpktablename.rawAddress.toString(), cbpktablename.toInt(), szfkcatalogname.rawAddress.toString(), cbfkcatalogname.toInt(), szfkschemaname.rawAddress.toString(), cbfkschemaname.toInt(), szfktablename.rawAddress.toString(), cbfktablename.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLForeignKeysW(hstmt: MutPtr, szpkcatalogname: ConstPtr, cchpkcatalogname: Short, szpkschemaname: ConstPtr, cchpkschemaname: Short, szpktablename: ConstPtr, cchpktablename: Short, szfkcatalogname: ConstPtr, cchfkcatalogname: Short, szfkschemaname: ConstPtr, cchfkschemaname: Short, szfktablename: ConstPtr, cchfktablename: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLForeignKeysW(hstmt.rawAddress.toString(), szpkcatalogname.rawAddress.toString(), cchpkcatalogname.toInt(), szpkschemaname.rawAddress.toString(), cchpkschemaname.toInt(), szpktablename.rawAddress.toString(), cchpktablename.toInt(), szfkcatalogname.rawAddress.toString(), cchfkcatalogname.toInt(), szfkschemaname.rawAddress.toString(), cchfkschemaname.toInt(), szfktablename.rawAddress.toString(), cchfktablename.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeConnect(connectionhandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLFreeConnect(connectionhandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeEnv(environmenthandle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLFreeEnv(environmenthandle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeHandle(handletype: Short, handle: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLFreeHandle(handletype.toInt(), handle.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeStmt(statementhandle: MutPtr, option: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLFreeStmt(statementhandle.rawAddress.toString(), option.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectAttr(connectionhandle: MutPtr, attribute: Int, value: MutPtr, bufferlength: Int, stringlengthptr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetConnectAttr(connectionhandle.rawAddress.toString(), attribute, value.rawAddress.toString(), bufferlength, stringlengthptr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectAttrA(hdbc: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetConnectAttrA(hdbc.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvaluemax, pcbvalue.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectAttrW(hdbc: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetConnectAttrW(hdbc.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvaluemax, pcbvalue.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectOption(connectionhandle: MutPtr, option: UShort, value: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetConnectOption(connectionhandle.rawAddress.toString(), option.toInt(), value.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectOptionA(hdbc: MutPtr, foption: UShort, pvparam: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetConnectOptionA(hdbc.rawAddress.toString(), foption.toInt(), pvparam.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectOptionW(hdbc: MutPtr, foption: UShort, pvparam: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetConnectOptionW(hdbc.rawAddress.toString(), foption.toInt(), pvparam.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetCursorName(statementhandle: MutPtr, cursorname: MutPtr, bufferlength: Short, namelengthptr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetCursorName(statementhandle.rawAddress.toString(), cursorname.rawAddress.toString(), bufferlength.toInt(), namelengthptr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetCursorNameA(hstmt: MutPtr, szcursor: MutPtr, cbcursormax: Short, pcbcursor: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetCursorNameA(hstmt.rawAddress.toString(), szcursor.rawAddress.toString(), cbcursormax.toInt(), pcbcursor.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetCursorNameW(hstmt: MutPtr, szcursor: MutPtr, cchcursormax: Short, pcchcursor: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetCursorNameW(hstmt.rawAddress.toString(), szcursor.rawAddress.toString(), cchcursormax.toInt(), pcchcursor.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetData(statementhandle: MutPtr, columnnumber: UShort, targettype: Short, targetvalue: MutPtr, bufferlength: Long, strlenOrIndptr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetData(statementhandle.rawAddress.toString(), columnnumber.toInt(), targettype.toInt(), targetvalue.rawAddress.toString(), bufferlength.toString(), strlenOrIndptr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescField(descriptorhandle: MutPtr, recnumber: Short, fieldidentifier: Short, value: MutPtr, bufferlength: Int, stringlength: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDescField(descriptorhandle.rawAddress.toString(), recnumber.toInt(), fieldidentifier.toInt(), value.rawAddress.toString(), bufferlength, stringlength.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescFieldA(hdesc: MutPtr, irecord: Short, ifield: Short, rgbvalue: MutPtr, cbbufferlength: Int, stringlength: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDescFieldA(hdesc.rawAddress.toString(), irecord.toInt(), ifield.toInt(), rgbvalue.rawAddress.toString(), cbbufferlength, stringlength.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescFieldW(hdesc: MutPtr, irecord: Short, ifield: Short, rgbvalue: MutPtr, cbbufferlength: Int, stringlength: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDescFieldW(hdesc.rawAddress.toString(), irecord.toInt(), ifield.toInt(), rgbvalue.rawAddress.toString(), cbbufferlength, stringlength.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescRec(descriptorhandle: MutPtr, recnumber: Short, name: MutPtr, bufferlength: Short, stringlengthptr: MutPtr, typeptr: MutPtr, subtypeptr: MutPtr, lengthptr: MutPtr, precisionptr: MutPtr, scaleptr: MutPtr, nullableptr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDescRec(descriptorhandle.rawAddress.toString(), recnumber.toInt(), name.rawAddress.toString(), bufferlength.toInt(), stringlengthptr.rawAddress.toString(), typeptr.rawAddress.toString(), subtypeptr.rawAddress.toString(), lengthptr.rawAddress.toString(), precisionptr.rawAddress.toString(), scaleptr.rawAddress.toString(), nullableptr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescRecA(hdesc: MutPtr, irecord: Short, szname: MutPtr, cbnamemax: Short, pcbname: MutPtr, pftype: MutPtr, pfsubtype: MutPtr, plength: MutPtr, pprecision: MutPtr, pscale: MutPtr, pnullable: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDescRecA(hdesc.rawAddress.toString(), irecord.toInt(), szname.rawAddress.toString(), cbnamemax.toInt(), pcbname.rawAddress.toString(), pftype.rawAddress.toString(), pfsubtype.rawAddress.toString(), plength.rawAddress.toString(), pprecision.rawAddress.toString(), pscale.rawAddress.toString(), pnullable.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescRecW(hdesc: MutPtr, irecord: Short, szname: MutPtr, cchnamemax: Short, pcchname: MutPtr, pftype: MutPtr, pfsubtype: MutPtr, plength: MutPtr, pprecision: MutPtr, pscale: MutPtr, pnullable: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDescRecW(hdesc.rawAddress.toString(), irecord.toInt(), szname.rawAddress.toString(), cchnamemax.toInt(), pcchname.rawAddress.toString(), pftype.rawAddress.toString(), pfsubtype.rawAddress.toString(), plength.rawAddress.toString(), pprecision.rawAddress.toString(), pscale.rawAddress.toString(), pnullable.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagField(handletype: Short, handle: MutPtr, recnumber: Short, diagidentifier: Short, diaginfo: MutPtr, bufferlength: Short, stringlength: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDiagField(handletype.toInt(), handle.rawAddress.toString(), recnumber.toInt(), diagidentifier.toInt(), diaginfo.rawAddress.toString(), bufferlength.toInt(), stringlength.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagFieldA(fhandletype: Short, handle: MutPtr, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr, cbdiaginfomax: Short, pcbdiaginfo: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDiagFieldA(fhandletype.toInt(), handle.rawAddress.toString(), irecord.toInt(), fdiagfield.toInt(), rgbdiaginfo.rawAddress.toString(), cbdiaginfomax.toInt(), pcbdiaginfo.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagFieldW(fhandletype: Short, handle: MutPtr, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr, cbbufferlength: Short, pcbstringlength: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDiagFieldW(fhandletype.toInt(), handle.rawAddress.toString(), irecord.toInt(), fdiagfield.toInt(), rgbdiaginfo.rawAddress.toString(), cbbufferlength.toInt(), pcbstringlength.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagRec(handletype: Short, handle: MutPtr, recnumber: Short, sqlstate: MutPtr, nativeerror: MutPtr, messagetext: MutPtr, bufferlength: Short, textlength: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDiagRec(handletype.toInt(), handle.rawAddress.toString(), recnumber.toInt(), sqlstate.rawAddress.toString(), nativeerror.rawAddress.toString(), messagetext.rawAddress.toString(), bufferlength.toInt(), textlength.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagRecA(fhandletype: Short, handle: MutPtr, irecord: Short, szsqlstate: MutPtr, pfnativeerror: MutPtr, szerrormsg: MutPtr, cberrormsgmax: Short, pcberrormsg: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDiagRecA(fhandletype.toInt(), handle.rawAddress.toString(), irecord.toInt(), szsqlstate.rawAddress.toString(), pfnativeerror.rawAddress.toString(), szerrormsg.rawAddress.toString(), cberrormsgmax.toInt(), pcberrormsg.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagRecW(fhandletype: Short, handle: MutPtr, irecord: Short, szsqlstate: MutPtr, pfnativeerror: MutPtr, szerrormsg: MutPtr, ccherrormsgmax: Short, pccherrormsg: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetDiagRecW(fhandletype.toInt(), handle.rawAddress.toString(), irecord.toInt(), szsqlstate.rawAddress.toString(), pfnativeerror.rawAddress.toString(), szerrormsg.rawAddress.toString(), ccherrormsgmax.toInt(), pccherrormsg.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetEnvAttr(environmenthandle: MutPtr, attribute: Int, value: MutPtr, bufferlength: Int, stringlength: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetEnvAttr(environmenthandle.rawAddress.toString(), attribute, value.rawAddress.toString(), bufferlength, stringlength.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetFunctions(connectionhandle: MutPtr, functionid: UShort, supported: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetFunctions(connectionhandle.rawAddress.toString(), functionid.toInt(), supported.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetInfo(connectionhandle: MutPtr, infotype: UShort, infovalue: MutPtr, bufferlength: Short, stringlengthptr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetInfo(connectionhandle.rawAddress.toString(), infotype.toInt(), infovalue.rawAddress.toString(), bufferlength.toInt(), stringlengthptr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetInfoA(hdbc: MutPtr, finfotype: UShort, rgbinfovalue: MutPtr, cbinfovaluemax: Short, pcbinfovalue: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetInfoA(hdbc.rawAddress.toString(), finfotype.toInt(), rgbinfovalue.rawAddress.toString(), cbinfovaluemax.toInt(), pcbinfovalue.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetInfoW(hdbc: MutPtr, finfotype: UShort, rgbinfovalue: MutPtr, cbinfovaluemax: Short, pcbinfovalue: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetInfoW(hdbc.rawAddress.toString(), finfotype.toInt(), rgbinfovalue.rawAddress.toString(), cbinfovaluemax.toInt(), pcbinfovalue.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: MutPtr, pienumlength: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetNextEnumeration(henumhandle.rawAddress.toString(), prgenumdata.rawAddress.toString(), pienumlength.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtAttr(statementhandle: MutPtr, attribute: Int, value: MutPtr, bufferlength: Int, stringlength: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetStmtAttr(statementhandle.rawAddress.toString(), attribute, value.rawAddress.toString(), bufferlength, stringlength.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtAttrA(hstmt: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetStmtAttrA(hstmt.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvaluemax, pcbvalue.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtAttrW(hstmt: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetStmtAttrW(hstmt.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvaluemax, pcbvalue.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtOption(statementhandle: MutPtr, option: UShort, value: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetStmtOption(statementhandle.rawAddress.toString(), option.toInt(), value.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetTypeInfo(statementhandle: MutPtr, datatype: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetTypeInfo(statementhandle.rawAddress.toString(), datatype.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetTypeInfoA(statementhandle: MutPtr, datatype: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetTypeInfoA(statementhandle.rawAddress.toString(), datatype.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetTypeInfoW(statementhandle: MutPtr, datatype: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLGetTypeInfoW(statementhandle.rawAddress.toString(), datatype.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle =
    if (windowsWin32SystemSearchNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemSearchSQLInitEnumServers(pwchservername.rawAddress.toString(), pwchinstancename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLLinkedCatalogsA(param0: MutPtr, param1: Pcstr, param2: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLLinkedCatalogsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLLinkedCatalogsW(param0: MutPtr, param1: Pcwstr, param2: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLLinkedCatalogsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLLinkedServers(param0: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLLinkedServers(param0.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLMoreResults(hstmt: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLMoreResults(hstmt.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNativeSql(hdbc: MutPtr, szsqlstrin: ConstPtr, cchsqlstrin: Int, szsqlstr: MutPtr, cchsqlstrmax: Int, pcbsqlstr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLNativeSql(hdbc.rawAddress.toString(), szsqlstrin.rawAddress.toString(), cchsqlstrin, szsqlstr.rawAddress.toString(), cchsqlstrmax, pcbsqlstr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNativeSqlA(hdbc: MutPtr, szsqlstrin: ConstPtr, cbsqlstrin: Int, szsqlstr: MutPtr, cbsqlstrmax: Int, pcbsqlstr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLNativeSqlA(hdbc.rawAddress.toString(), szsqlstrin.rawAddress.toString(), cbsqlstrin, szsqlstr.rawAddress.toString(), cbsqlstrmax, pcbsqlstr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNativeSqlW(hdbc: MutPtr, szsqlstrin: ConstPtr, cchsqlstrin: Int, szsqlstr: MutPtr, cchsqlstrmax: Int, pcchsqlstr: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLNativeSqlW(hdbc.rawAddress.toString(), szsqlstrin.rawAddress.toString(), cchsqlstrin, szsqlstr.rawAddress.toString(), cchsqlstrmax, pcchsqlstr.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNumParams(hstmt: MutPtr, pcpar: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLNumParams(hstmt.rawAddress.toString(), pcpar.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNumResultCols(statementhandle: MutPtr, columncount: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLNumResultCols(statementhandle.rawAddress.toString(), columncount.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLParamData(statementhandle: MutPtr, value: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLParamData(statementhandle.rawAddress.toString(), value.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLParamOptions(hstmt: MutPtr, crow: ULong, pirow: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLParamOptions(hstmt.rawAddress.toString(), crow.toString(), pirow.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrepare(statementhandle: MutPtr, statementtext: ConstPtr, textlength: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLPrepare(statementhandle.rawAddress.toString(), statementtext.rawAddress.toString(), textlength).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrepareA(hstmt: MutPtr, szsqlstr: ConstPtr, cbsqlstr: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLPrepareA(hstmt.rawAddress.toString(), szsqlstr.rawAddress.toString(), cbsqlstr).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrepareW(hstmt: MutPtr, szsqlstr: ConstPtr, cchsqlstr: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLPrepareW(hstmt.rawAddress.toString(), szsqlstr.rawAddress.toString(), cchsqlstr).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrimaryKeys(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLPrimaryKeys(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrimaryKeysA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLPrimaryKeysA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrimaryKeysW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLPrimaryKeysW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedureColumns(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLProcedureColumns(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), szprocname.rawAddress.toString(), cchprocname.toInt(), szcolumnname.rawAddress.toString(), cchcolumnname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedureColumnsA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, szprocname: ConstPtr, cbprocname: Short, szcolumnname: ConstPtr, cbcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLProcedureColumnsA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), szprocname.rawAddress.toString(), cbprocname.toInt(), szcolumnname.rawAddress.toString(), cbcolumnname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedureColumnsW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLProcedureColumnsW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), szprocname.rawAddress.toString(), cchprocname.toInt(), szcolumnname.rawAddress.toString(), cchcolumnname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedures(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLProcedures(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), szprocname.rawAddress.toString(), cchprocname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProceduresA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, szprocname: ConstPtr, cbprocname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLProceduresA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), szprocname.rawAddress.toString(), cbprocname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProceduresW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLProceduresW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), szprocname.rawAddress.toString(), cchprocname.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPutData(statementhandle: MutPtr, data: ConstPtr, strlenOrInd: Long): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLPutData(statementhandle.rawAddress.toString(), data.rawAddress.toString(), strlenOrInd.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLRowCount(statementhandle: ConstPtr, rowcount: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLRowCount(statementhandle.rawAddress.toString(), rowcount.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectAttr(connectionhandle: MutPtr, attribute: Int, value: ConstPtr, stringlength: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetConnectAttr(connectionhandle.rawAddress.toString(), attribute, value.rawAddress.toString(), stringlength).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectAttrA(hdbc: MutPtr, fattribute: Int, rgbvalue: ConstPtr, cbvalue: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetConnectAttrA(hdbc.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvalue).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectAttrW(hdbc: MutPtr, fattribute: Int, rgbvalue: ConstPtr, cbvalue: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetConnectAttrW(hdbc.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvalue).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectOption(connectionhandle: MutPtr, option: UShort, value: ULong): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetConnectOption(connectionhandle.rawAddress.toString(), option.toInt(), value.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectOptionA(hdbc: MutPtr, foption: UShort, vparam: ULong): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetConnectOptionA(hdbc.rawAddress.toString(), foption.toInt(), vparam.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectOptionW(hdbc: MutPtr, foption: UShort, vparam: ULong): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetConnectOptionW(hdbc.rawAddress.toString(), foption.toInt(), vparam.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetCursorName(statementhandle: MutPtr, cursorname: ConstPtr, namelength: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetCursorName(statementhandle.rawAddress.toString(), cursorname.rawAddress.toString(), namelength.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetCursorNameA(hstmt: MutPtr, szcursor: ConstPtr, cbcursor: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetCursorNameA(hstmt.rawAddress.toString(), szcursor.rawAddress.toString(), cbcursor.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetCursorNameW(hstmt: MutPtr, szcursor: ConstPtr, cchcursor: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetCursorNameW(hstmt.rawAddress.toString(), szcursor.rawAddress.toString(), cchcursor.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetDescField(descriptorhandle: MutPtr, recnumber: Short, fieldidentifier: Short, value: ConstPtr, bufferlength: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetDescField(descriptorhandle.rawAddress.toString(), recnumber.toInt(), fieldidentifier.toInt(), value.rawAddress.toString(), bufferlength).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetDescFieldW(descriptorhandle: MutPtr, recnumber: Short, fieldidentifier: Short, value: MutPtr, bufferlength: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetDescFieldW(descriptorhandle.rawAddress.toString(), recnumber.toInt(), fieldidentifier.toInt(), value.rawAddress.toString(), bufferlength).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetDescRec(descriptorhandle: MutPtr, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: MutPtr, stringlength: MutPtr, indicator: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetDescRec(descriptorhandle.rawAddress.toString(), recnumber.toInt(), type.toInt(), subtype.toInt(), length.toString(), precision.toInt(), scale.toInt(), data.rawAddress.toString(), stringlength.rawAddress.toString(), indicator.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetEnvAttr(environmenthandle: MutPtr, attribute: Int, value: ConstPtr, stringlength: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetEnvAttr(environmenthandle.rawAddress.toString(), attribute, value.rawAddress.toString(), stringlength).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetParam(statementhandle: MutPtr, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: ConstPtr, strlenOrInd: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetParam(statementhandle.rawAddress.toString(), parameternumber.toInt(), valuetype.toInt(), parametertype.toInt(), lengthprecision.toString(), parameterscale.toInt(), parametervalue.rawAddress.toString(), strlenOrInd.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetPos(hstmt: MutPtr, irow: ULong, foption: UShort, flock: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetPos(hstmt.rawAddress.toString(), irow.toString(), foption.toInt(), flock.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetScrollOptions(hstmt: MutPtr, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetScrollOptions(hstmt.rawAddress.toString(), fconcurrency.toInt(), crowkeyset.toString(), crowrowset.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetStmtAttr(statementhandle: MutPtr, attribute: Int, value: ConstPtr, stringlength: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetStmtAttr(statementhandle.rawAddress.toString(), attribute, value.rawAddress.toString(), stringlength).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetStmtAttrW(hstmt: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetStmtAttrW(hstmt.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvaluemax).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetStmtOption(statementhandle: MutPtr, option: UShort, value: ULong): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSetStmtOption(statementhandle.rawAddress.toString(), option.toInt(), value.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSpecialColumns(statementhandle: MutPtr, identifiertype: UShort, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, scope: UShort, nullable: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSpecialColumns(statementhandle.rawAddress.toString(), identifiertype.toInt(), catalogname.rawAddress.toString(), namelength1.toInt(), schemaname.rawAddress.toString(), namelength2.toInt(), tablename.rawAddress.toString(), namelength3.toInt(), scope.toInt(), nullable.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSpecialColumnsA(hstmt: MutPtr, fcoltype: UShort, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSpecialColumnsA(hstmt.rawAddress.toString(), fcoltype.toInt(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt(), fscope.toInt(), fnullable.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSpecialColumnsW(hstmt: MutPtr, fcoltype: UShort, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLSpecialColumnsW(hstmt.rawAddress.toString(), fcoltype.toInt(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), fscope.toInt(), fnullable.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLStatistics(statementhandle: MutPtr, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, unique: UShort, reserved: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLStatistics(statementhandle.rawAddress.toString(), catalogname.rawAddress.toString(), namelength1.toInt(), schemaname.rawAddress.toString(), namelength2.toInt(), tablename.rawAddress.toString(), namelength3.toInt(), unique.toInt(), reserved.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLStatisticsA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLStatisticsA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt(), funique.toInt(), faccuracy.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLStatisticsW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLStatisticsW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), funique.toInt(), faccuracy.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablePrivileges(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLTablePrivileges(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablePrivilegesA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLTablePrivilegesA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablePrivilegesW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLTablePrivilegesW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTables(statementhandle: MutPtr, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, tabletype: ConstPtr, namelength4: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLTables(statementhandle.rawAddress.toString(), catalogname.rawAddress.toString(), namelength1.toInt(), schemaname.rawAddress.toString(), namelength2.toInt(), tablename.rawAddress.toString(), namelength3.toInt(), tabletype.rawAddress.toString(), namelength4.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablesA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, sztabletype: ConstPtr, cbtabletype: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLTablesA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt(), sztabletype.rawAddress.toString(), cbtabletype.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablesW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, sztabletype: ConstPtr, cchtabletype: Short): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLTablesW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), sztabletype.rawAddress.toString(), cchtabletype.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTransact(environmenthandle: MutPtr, connectionhandle: MutPtr, completiontype: UShort): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchSQLTransact(environmenthandle.rawAddress.toString(), connectionhandle.rawAddress.toString(), completiontype.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpBatch(param0: MutPtr): Int =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpBatch(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpBind(param0: MutPtr, param1: MutPtr, param2: Int, param3: Int, param4: MutPtr, param5: Int, param6: Int, param7: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpBind(param0.rawAddress.toString(), param1.rawAddress.toString(), param2, param3, param4.rawAddress.toString(), param5, param6, param7).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpColfmt(param0: MutPtr, param1: Int, param2: UByte, param3: Int, param4: Int, param5: MutPtr, param6: Int, param7: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpColfmt(param0.rawAddress.toString(), param1, param2.toInt(), param3, param4, param5.rawAddress.toString(), param6, param7).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpCollen(param0: MutPtr, param1: Int, param2: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpCollen(param0.rawAddress.toString(), param1, param2).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpColptr(param0: MutPtr, param1: MutPtr, param2: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpColptr(param0.rawAddress.toString(), param1.rawAddress.toString(), param2).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpColumns(param0: MutPtr, param1: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpColumns(param0.rawAddress.toString(), param1).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpControl(param0: MutPtr, param1: Int, param2: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpControl(param0.rawAddress.toString(), param1, param2.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpDone(param0: MutPtr): Int =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpDone(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpExec(param0: MutPtr, param1: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpExec(param0.rawAddress.toString(), param1.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpGetcolfmt(param0: MutPtr, param1: Int, param2: Int, param3: MutPtr, param4: Int, param5: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpGetcolfmt(param0.rawAddress.toString(), param1, param2, param3.rawAddress.toString(), param4, param5.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpInitA(param0: MutPtr, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpInitA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpInitW(param0: MutPtr, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpInitW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpMoretext(param0: MutPtr, param1: Int, param2: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpMoretext(param0.rawAddress.toString(), param1, param2.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpReadfmtA(param0: MutPtr, param1: Pcstr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpReadfmtA(param0.rawAddress.toString(), param1.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpReadfmtW(param0: MutPtr, param1: Pcwstr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpReadfmtW(param0.rawAddress.toString(), param1.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpSendrow(param0: MutPtr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpSendrow(param0.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpSetcolfmt(param0: MutPtr, param1: Int, param2: Int, param3: MutPtr, param4: Int): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpSetcolfmt(param0.rawAddress.toString(), param1, param2, param3.rawAddress.toString(), param4).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpWritefmtA(param0: MutPtr, param1: Pcstr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpWritefmtA(param0.rawAddress.toString(), param1.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpWritefmtW(param0: MutPtr, param1: Pcwstr): Short =
    if (windowsWin32SystemSearchNapiAvailable) wasmWindowssysWindowsWin32SystemSearchBcpWritefmtW(param0.rawAddress.toString(), param1.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbprtypeA(param0: Int): Pstr =
    if (windowsWin32SystemSearchNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemSearchDbprtypeA(param0).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbprtypeW(param0: Int): Pwstr =
    if (windowsWin32SystemSearchNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemSearchDbprtypeW(param0).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
