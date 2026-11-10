@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val _windowsWin32NetworkmanagementSnmpNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun snmpCancelMsg(session: Long, reqid: Int): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpCancelMsg(session.toString(), reqid) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCleanup(): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpCleanup() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCleanupEx(): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpCleanupEx() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpClose(session: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpClose(session.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpContextToStr(context: Long, string: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpContextToStr(context.toString(), (string?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCountVbl(vbl: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpCountVbl(vbl.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpCreatePdu(session.toString(), pduType.toInt(), requestId, errorStatus, errorIndex, varbindlist.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: COpaquePointer?): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpCreateSession((hwnd?.value ?: 0L).toString(), wmsg.toInt(), 0L.toString(), (lpclientdata?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCreateVbl(session: Long, name: COpaquePointer?, value: COpaquePointer?): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpCreateVbl(session.toString(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDecodeMsg(session: Long, srcentity: COpaquePointer?, dstentity: COpaquePointer?, context: COpaquePointer?, pdu: COpaquePointer?, msgbufdesc: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpDecodeMsg(session.toString(), (srcentity?.value ?: 0L).toString(), (dstentity?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (pdu?.value ?: 0L).toString(), (msgbufdesc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDeleteVb(vbl: Long, index: UInt): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpDeleteVb(vbl.toString(), index.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDuplicatePdu(session: Long, pdu: Long): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpDuplicatePdu(session.toString(), pdu.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDuplicateVbl(session: Long, vbl: Long): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpDuplicateVbl(session.toString(), vbl.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpEncodeMsg(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), pdu.toString(), (msgbufdesc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpEntityToStr(entity.toString(), size.toInt(), (string?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeContext(context: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpFreeContext(context.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeDescriptor(syntax: UInt, descriptor: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpFreeDescriptor(syntax.toInt(), (descriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeEntity(entity: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpFreeEntity(entity.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreePdu(pdu: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpFreePdu(pdu.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeVbl(vbl: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpFreeVbl(vbl.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetLastError(session: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpGetLastError(session.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetPduData(pdu: Long, pduType: COpaquePointer?, requestId: COpaquePointer?, errorStatus: COpaquePointer?, errorIndex: COpaquePointer?, varbindlist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpGetPduData(pdu.toString(), (pduType?.value ?: 0L).toString(), (requestId?.value ?: 0L).toString(), (errorStatus?.value ?: 0L).toString(), (errorIndex?.value ?: 0L).toString(), (varbindlist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetRetransmitMode(nretransmitmode: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpGetRetransmitMode((nretransmitmode?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetRetry(hentity: Long, npolicyretry: COpaquePointer?, nactualretry: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpGetRetry(hentity.toString(), (npolicyretry?.value ?: 0L).toString(), (nactualretry?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetTimeout(hentity: Long, npolicytimeout: COpaquePointer?, nactualtimeout: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpGetTimeout(hentity.toString(), (npolicytimeout?.value ?: 0L).toString(), (nactualtimeout?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetTranslateMode(ntranslatemode: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpGetTranslateMode((ntranslatemode?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetVb(vbl: Long, index: UInt, name: COpaquePointer?, value: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpGetVb(vbl.toString(), index.toInt(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetVendorInfo(vendorinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpGetVendorInfo((vendorinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpListen(hentity.toString(), lstatus.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpListenEx(hentity.toString(), lstatus.toInt(), nuseentityaddr.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrClose(session: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpMgrClose((session?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrCtl(session: COpaquePointer?, dwctlcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpMgrCtl((session?.value ?: 0L).toString(), dwctlcode.toInt(), (lpvinbuffer?.value ?: 0L).toString(), cbinbuffer.toInt(), (lpvoutbuffer?.value ?: 0L).toString(), cboutbuffer.toInt(), (lpcbbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrGetTrap(enterprise: COpaquePointer?, ipaddress: COpaquePointer?, generictrap: COpaquePointer?, specifictrap: COpaquePointer?, timestamp: COpaquePointer?, variablebindings: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpMgrGetTrap((enterprise?.value ?: 0L).toString(), (ipaddress?.value ?: 0L).toString(), (generictrap?.value ?: 0L).toString(), (specifictrap?.value ?: 0L).toString(), (timestamp?.value ?: 0L).toString(), (variablebindings?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrGetTrapEx(enterprise: COpaquePointer?, agentaddress: COpaquePointer?, sourceaddress: COpaquePointer?, generictrap: COpaquePointer?, specifictrap: COpaquePointer?, community: COpaquePointer?, timestamp: COpaquePointer?, variablebindings: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpMgrGetTrapEx((enterprise?.value ?: 0L).toString(), (agentaddress?.value ?: 0L).toString(), (sourceaddress?.value ?: 0L).toString(), (generictrap?.value ?: 0L).toString(), (specifictrap?.value ?: 0L).toString(), (community?.value ?: 0L).toString(), (timestamp?.value ?: 0L).toString(), (variablebindings?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrOidToStr(oid: COpaquePointer?, string: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpMgrOidToStr((oid?.value ?: 0L).toString(), (string?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): COpaquePointer? =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpMgrOpen((lpagentaddress?.value ?: 0L).toString(), (lpagentcommunity?.value ?: 0L).toString(), ntimeout, nretries) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrRequest(session: COpaquePointer?, requesttype: UByte, variablebindings: COpaquePointer?, errorstatus: COpaquePointer?, errorindex: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpMgrRequest((session?.value ?: 0L).toString(), requesttype.toInt(), (variablebindings?.value ?: 0L).toString(), (errorstatus?.value ?: 0L).toString(), (errorindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrStrToOid(string: Pcstr, oid: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpMgrStrToOid((string?.value ?: 0L).toString(), (oid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrTrapListen(phtrapavailable: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpMgrTrapListen((phtrapavailable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOidCompare(xoid: COpaquePointer?, yoid: COpaquePointer?, maxlen: UInt, result: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpOidCompare((xoid?.value ?: 0L).toString(), (yoid?.value ?: 0L).toString(), maxlen.toInt(), (result?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOidCopy(srcoid: COpaquePointer?, dstoid: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpOidCopy((srcoid?.value ?: 0L).toString(), (dstoid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOidToStr(srcoid: COpaquePointer?, size: UInt, string: Pstr): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpOidToStr((srcoid?.value ?: 0L).toString(), size.toInt(), (string?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpOpen((hwnd?.value ?: 0L).toString(), wmsg.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpRecvMsg(session: Long, srcentity: COpaquePointer?, dstentity: COpaquePointer?, context: COpaquePointer?, pdu: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpRecvMsg(session.toString(), (srcentity?.value ?: 0L).toString(), (dstentity?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (pdu?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: COpaquePointer?, state: SnmpStatus): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpRegister(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), (notification?.value ?: 0L).toString(), state.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSendMsg(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), pdu.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetPduData(pdu: Long, pduType: COpaquePointer?, requestId: COpaquePointer?, nonRepeaters: COpaquePointer?, maxRepetitions: COpaquePointer?, varbindlist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSetPduData(pdu.toString(), (pduType?.value ?: 0L).toString(), (requestId?.value ?: 0L).toString(), (nonRepeaters?.value ?: 0L).toString(), (maxRepetitions?.value ?: 0L).toString(), (varbindlist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetPort(hentity: Long, nport: UInt): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSetPort(hentity.toString(), nport.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSetRetransmitMode(nretransmitmode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSetRetry(hentity.toString(), npolicyretry.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSetTimeout(hentity.toString(), npolicytimeout.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSetTranslateMode(ntranslatemode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetVb(vbl: Long, index: UInt, name: COpaquePointer?, value: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSetVb(vbl.toString(), index.toInt(), (name?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStartup(nmajorversion: COpaquePointer?, nminorversion: COpaquePointer?, nlevel: COpaquePointer?, ntranslatemode: COpaquePointer?, nretransmitmode: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpStartup((nmajorversion?.value ?: 0L).toString(), (nminorversion?.value ?: 0L).toString(), (nlevel?.value ?: 0L).toString(), (ntranslatemode?.value ?: 0L).toString(), (nretransmitmode?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStartupEx(nmajorversion: COpaquePointer?, nminorversion: COpaquePointer?, nlevel: COpaquePointer?, ntranslatemode: COpaquePointer?, nretransmitmode: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpStartupEx((nmajorversion?.value ?: 0L).toString(), (nminorversion?.value ?: 0L).toString(), (nlevel?.value ?: 0L).toString(), (ntranslatemode?.value ?: 0L).toString(), (nretransmitmode?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStrToContext(session: Long, string: COpaquePointer?): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpStrToContext(session.toString(), (string?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStrToEntity(session: Long, string: Pcstr): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpStrToEntity(session.toString(), (string?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStrToOid(string: Pcstr, dstoid: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpStrToOid((string?.value ?: 0L).toString(), (dstoid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSvcGetUptime(): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSvcGetUptime() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSvcSetLogLevel(nloglevel: SnmpLog) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSvcSetLogLevel(nloglevel)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpSvcSetLogType(nlogtype: Int) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpSvcSetLogType(nlogtype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilAsnAnyCpy(panydst: COpaquePointer?, panysrc: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilAsnAnyCpy((panydst?.value ?: 0L).toString(), (panysrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilAsnAnyFree(pany: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilAsnAnyFree((pany?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilDbgPrint(nloglevel, (szformat?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilIdsToA(ids: COpaquePointer?, idlength: UInt): Pstr =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilIdsToA((ids?.value ?: 0L).toString(), idlength.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilMemAlloc(nbytes: UInt): COpaquePointer? =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemAlloc(nbytes.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilMemFree(pmem: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemFree((pmem?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilMemReAlloc(pmem: COpaquePointer?, nbytes: UInt): COpaquePointer? =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemReAlloc((pmem?.value ?: 0L).toString(), nbytes.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOctetsCmp(poctets1: COpaquePointer?, poctets2: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsCmp((poctets1?.value ?: 0L).toString(), (poctets2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOctetsCpy(poctetsdst: COpaquePointer?, poctetssrc: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsCpy((poctetsdst?.value ?: 0L).toString(), (poctetssrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOctetsFree(poctets: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsFree((poctets?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilOctetsNCmp(poctets1: COpaquePointer?, poctets2: COpaquePointer?, nchars: UInt): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsNCmp((poctets1?.value ?: 0L).toString(), (poctets2?.value ?: 0L).toString(), nchars.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidAppend(poiddst: COpaquePointer?, poidsrc: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidAppend((poiddst?.value ?: 0L).toString(), (poidsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidCmp(poid1: COpaquePointer?, poid2: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidCmp((poid1?.value ?: 0L).toString(), (poid2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidCpy(poiddst: COpaquePointer?, poidsrc: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidCpy((poiddst?.value ?: 0L).toString(), (poidsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidFree(poid: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidFree((poid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilOidNCmp(poid1: COpaquePointer?, poid2: COpaquePointer?, nsubids: UInt): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidNCmp((poid1?.value ?: 0L).toString(), (poid2?.value ?: 0L).toString(), nsubids.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidToA(oid: COpaquePointer?): Pstr =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidToA((oid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilPrintAsnAny(pany: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilPrintAsnAny((pany?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilPrintOid(oid: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilPrintOid((oid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilVarBindCpy(pvbdst: COpaquePointer?, pvbsrc: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindCpy((pvbdst?.value ?: 0L).toString(), (pvbsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilVarBindFree(pvb: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindFree((pvb?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilVarBindListCpy(pvbldst: COpaquePointer?, pvblsrc: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindListCpy((pvbldst?.value ?: 0L).toString(), (pvblsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilVarBindListFree(pvbl: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindListFree((pvbl?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
