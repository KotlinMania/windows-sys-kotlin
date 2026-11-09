@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32NetworkmanagementSnmpNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun SnmpCancelMsg(session: Long, reqid: Int): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpCancelMsg(session.toString(), reqid) as Int).toUInt() else 0u

public actual fun SnmpCleanup(): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpCleanup() as Int).toUInt() else 0u

public actual fun SnmpCleanupEx(): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpCleanupEx() as Int).toUInt() else 0u

public actual fun SnmpClose(session: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpClose(session.toString()) as Int).toUInt() else 0u

public actual fun SnmpContextToStr(context: Long, string: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpContextToStr(context.toString(), string.toString()) as Int).toUInt() else 0u

public actual fun SnmpCountVbl(vbl: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpCountVbl(vbl.toString()) as Int).toUInt() else 0u

public actual fun SnmpCreatePdu(session: Long, pdu_type: SNMP_PDU_TYPE, request_id: Int, error_status: Int, error_index: Int, varbindlist: Long): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpCreatePdu(session.toString(), pdu_type.toInt(), request_id, error_status, error_index, varbindlist.toString()) as String).toLong() else 0L

public actual fun SnmpCreateSession(hwnd: HWND, wmsg: UInt, fcallback: SNMPAPI_CALLBACK, lpclientdata: Long): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpCreateSession(hwnd.toString(), wmsg.toInt(), fcallback.toLong().toString(), lpclientdata.toString()) as String).toLong() else 0L

public actual fun SnmpCreateVbl(session: Long, name: Long, value: Long): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpCreateVbl(session.toString(), name.toString(), value.toString()) as String).toLong() else 0L

public actual fun SnmpDecodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpDecodeMsg(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), pdu.toString(), msgbufdesc.toString()) as Int).toUInt() else 0u

public actual fun SnmpDeleteVb(vbl: Long, index: UInt): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpDeleteVb(vbl.toString(), index.toInt()) as Int).toUInt() else 0u

public actual fun SnmpDuplicatePdu(session: Long, pdu: Long): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpDuplicatePdu(session.toString(), pdu.toString()) as String).toLong() else 0L

public actual fun SnmpDuplicateVbl(session: Long, vbl: Long): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpDuplicateVbl(session.toString(), vbl.toString()) as String).toLong() else 0L

public actual fun SnmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpEncodeMsg(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), pdu.toString(), msgbufdesc.toString()) as Int).toUInt() else 0u

public actual fun SnmpEntityToStr(entity: Long, size: UInt, string: PSTR): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpEntityToStr(entity.toString(), size.toInt(), string.toString()) as Int).toUInt() else 0u

public actual fun SnmpFreeContext(context: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeContext(context.toString()) as Int).toUInt() else 0u

public actual fun SnmpFreeDescriptor(syntax: UInt, descriptor: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeDescriptor(syntax.toInt(), descriptor.toString()) as Int).toUInt() else 0u

public actual fun SnmpFreeEntity(entity: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeEntity(entity.toString()) as Int).toUInt() else 0u

public actual fun SnmpFreePdu(pdu: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpFreePdu(pdu.toString()) as Int).toUInt() else 0u

public actual fun SnmpFreeVbl(vbl: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeVbl(vbl.toString()) as Int).toUInt() else 0u

public actual fun SnmpGetLastError(session: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpGetLastError(session.toString()) as Int).toUInt() else 0u

public actual fun SnmpGetPduData(pdu: Long, pdu_type: Long, request_id: Long, error_status: Long, error_index: Long, varbindlist: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpGetPduData(pdu.toString(), pdu_type.toString(), request_id.toString(), error_status.toString(), error_index.toString(), varbindlist.toString()) as Int).toUInt() else 0u

public actual fun SnmpGetRetransmitMode(nretransmitmode: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpGetRetransmitMode(nretransmitmode.toString()) as Int).toUInt() else 0u

public actual fun SnmpGetRetry(hentity: Long, npolicyretry: Long, nactualretry: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpGetRetry(hentity.toString(), npolicyretry.toString(), nactualretry.toString()) as Int).toUInt() else 0u

public actual fun SnmpGetTimeout(hentity: Long, npolicytimeout: Long, nactualtimeout: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpGetTimeout(hentity.toString(), npolicytimeout.toString(), nactualtimeout.toString()) as Int).toUInt() else 0u

public actual fun SnmpGetTranslateMode(ntranslatemode: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpGetTranslateMode(ntranslatemode.toString()) as Int).toUInt() else 0u

public actual fun SnmpGetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpGetVb(vbl.toString(), index.toInt(), name.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun SnmpGetVendorInfo(vendorinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpGetVendorInfo(vendorinfo.toString()) as Int).toUInt() else 0u

public actual fun SnmpListen(hentity: Long, lstatus: SNMP_STATUS): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpListen(hentity.toString(), lstatus.toInt()) as Int).toUInt() else 0u

public actual fun SnmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpListenEx(hentity.toString(), lstatus.toInt(), nuseentityaddr.toInt()) as Int).toUInt() else 0u

public actual fun SnmpMgrClose(session: Long): BOOL =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrClose(session.toString()) as Int) else 0

public actual fun SnmpMgrCtl(session: Long, dwctlcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long): BOOL =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrCtl(session.toString(), dwctlcode.toInt(), lpvinbuffer.toString(), cbinbuffer.toInt(), lpvoutbuffer.toString(), cboutbuffer.toInt(), lpcbbytesreturned.toString()) as Int) else 0

public actual fun SnmpMgrGetTrap(enterprise: Long, ipaddress: Long, generictrap: Long, specifictrap: Long, timestamp: Long, variablebindings: Long): BOOL =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrGetTrap(enterprise.toString(), ipaddress.toString(), generictrap.toString(), specifictrap.toString(), timestamp.toString(), variablebindings.toString()) as Int) else 0

public actual fun SnmpMgrGetTrapEx(enterprise: Long, agentaddress: Long, sourceaddress: Long, generictrap: Long, specifictrap: Long, community: Long, timestamp: Long, variablebindings: Long): BOOL =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrGetTrapEx(enterprise.toString(), agentaddress.toString(), sourceaddress.toString(), generictrap.toString(), specifictrap.toString(), community.toString(), timestamp.toString(), variablebindings.toString()) as Int) else 0

public actual fun SnmpMgrOidToStr(oid: Long, string: Long): BOOL =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrOidToStr(oid.toString(), string.toString()) as Int) else 0

public actual fun SnmpMgrOpen(lpagentaddress: PCSTR, lpagentcommunity: PCSTR, ntimeout: Int, nretries: Int): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrOpen(lpagentaddress.toString(), lpagentcommunity.toString(), ntimeout, nretries) as String).toLong() else 0L

public actual fun SnmpMgrRequest(session: Long, requesttype: UByte, variablebindings: Long, errorstatus: Long, errorindex: Long): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrRequest(session.toString(), requesttype.toInt(), variablebindings.toString(), errorstatus.toString(), errorindex.toString()) as Int) else 0

public actual fun SnmpMgrStrToOid(string: PCSTR, oid: Long): BOOL =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrStrToOid(string.toString(), oid.toString()) as Int) else 0

public actual fun SnmpMgrTrapListen(phtrapavailable: Long): BOOL =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrTrapListen(phtrapavailable.toString()) as Int) else 0

public actual fun SnmpOidCompare(xoid: Long, yoid: Long, maxlen: UInt, result: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpOidCompare(xoid.toString(), yoid.toString(), maxlen.toInt(), result.toString()) as Int).toUInt() else 0u

public actual fun SnmpOidCopy(srcoid: Long, dstoid: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpOidCopy(srcoid.toString(), dstoid.toString()) as Int).toUInt() else 0u

public actual fun SnmpOidToStr(srcoid: Long, size: UInt, string: PSTR): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpOidToStr(srcoid.toString(), size.toInt(), string.toString()) as Int).toUInt() else 0u

public actual fun SnmpOpen(hwnd: HWND, wmsg: UInt): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpOpen(hwnd.toString(), wmsg.toInt()) as String).toLong() else 0L

public actual fun SnmpRecvMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpRecvMsg(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), pdu.toString()) as Int).toUInt() else 0u

public actual fun SnmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: Long, state: SNMP_STATUS): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpRegister(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), notification.toString(), state.toInt()) as Int).toUInt() else 0u

public actual fun SnmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSendMsg(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), pdu.toString()) as Int).toUInt() else 0u

public actual fun SnmpSetPduData(pdu: Long, pdu_type: Long, request_id: Long, non_repeaters: Long, max_repetitions: Long, varbindlist: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSetPduData(pdu.toString(), pdu_type.toString(), request_id.toString(), non_repeaters.toString(), max_repetitions.toString(), varbindlist.toString()) as Int).toUInt() else 0u

public actual fun SnmpSetPort(hentity: Long, nport: UInt): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSetPort(hentity.toString(), nport.toInt()) as Int).toUInt() else 0u

public actual fun SnmpSetRetransmitMode(nretransmitmode: SNMP_STATUS): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSetRetransmitMode(nretransmitmode.toInt()) as Int).toUInt() else 0u

public actual fun SnmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSetRetry(hentity.toString(), npolicyretry.toInt()) as Int).toUInt() else 0u

public actual fun SnmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSetTimeout(hentity.toString(), npolicytimeout.toInt()) as Int).toUInt() else 0u

public actual fun SnmpSetTranslateMode(ntranslatemode: SNMP_API_TRANSLATE_MODE): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSetTranslateMode(ntranslatemode.toInt()) as Int).toUInt() else 0u

public actual fun SnmpSetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSetVb(vbl.toString(), index.toInt(), name.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun SnmpStartup(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpStartup(nmajorversion.toString(), nminorversion.toString(), nlevel.toString(), ntranslatemode.toString(), nretransmitmode.toString()) as Int).toUInt() else 0u

public actual fun SnmpStartupEx(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpStartupEx(nmajorversion.toString(), nminorversion.toString(), nlevel.toString(), ntranslatemode.toString(), nretransmitmode.toString()) as Int).toUInt() else 0u

public actual fun SnmpStrToContext(session: Long, string: Long): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpStrToContext(session.toString(), string.toString()) as String).toLong() else 0L

public actual fun SnmpStrToEntity(session: Long, string: PCSTR): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpStrToEntity(session.toString(), string.toString()) as String).toLong() else 0L

public actual fun SnmpStrToOid(string: PCSTR, dstoid: Long): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpStrToOid(string.toString(), dstoid.toString()) as Int).toUInt() else 0u

public actual fun SnmpSvcGetUptime(): UInt =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSvcGetUptime() as Int).toUInt() else 0u

public actual fun SnmpSvcSetLogLevel(nloglevel: SNMP_LOG) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSvcSetLogLevel(nloglevel)
    }
}

public actual fun SnmpSvcSetLogType(nlogtype: Int) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpSvcSetLogType(nlogtype)
    }
}

public actual fun SnmpUtilAsnAnyCpy(panydst: Long, panysrc: Long): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilAsnAnyCpy(panydst.toString(), panysrc.toString()) as Int) else 0

public actual fun SnmpUtilAsnAnyFree(pany: Long) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilAsnAnyFree(pany.toString())
    }
}

public actual fun SnmpUtilDbgPrint(nloglevel: SNMP_LOG, szformat: PCSTR) {
}

public actual fun SnmpUtilIdsToA(ids: Long, idlength: UInt): PSTR =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilIdsToA(ids.toString(), idlength.toInt()) as String).toLong() else 0L

public actual fun SnmpUtilMemAlloc(nbytes: UInt): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemAlloc(nbytes.toInt()) as String).toLong() else 0L

public actual fun SnmpUtilMemFree(pmem: Long) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemFree(pmem.toString())
    }
}

public actual fun SnmpUtilMemReAlloc(pmem: Long, nbytes: UInt): Long =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemReAlloc(pmem.toString(), nbytes.toInt()) as String).toLong() else 0L

public actual fun SnmpUtilOctetsCmp(poctets1: Long, poctets2: Long): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsCmp(poctets1.toString(), poctets2.toString()) as Int) else 0

public actual fun SnmpUtilOctetsCpy(poctetsdst: Long, poctetssrc: Long): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsCpy(poctetsdst.toString(), poctetssrc.toString()) as Int) else 0

public actual fun SnmpUtilOctetsFree(poctets: Long) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsFree(poctets.toString())
    }
}

public actual fun SnmpUtilOctetsNCmp(poctets1: Long, poctets2: Long, nchars: UInt): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsNCmp(poctets1.toString(), poctets2.toString(), nchars.toInt()) as Int) else 0

public actual fun SnmpUtilOidAppend(poiddst: Long, poidsrc: Long): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidAppend(poiddst.toString(), poidsrc.toString()) as Int) else 0

public actual fun SnmpUtilOidCmp(poid1: Long, poid2: Long): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidCmp(poid1.toString(), poid2.toString()) as Int) else 0

public actual fun SnmpUtilOidCpy(poiddst: Long, poidsrc: Long): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidCpy(poiddst.toString(), poidsrc.toString()) as Int) else 0

public actual fun SnmpUtilOidFree(poid: Long) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidFree(poid.toString())
    }
}

public actual fun SnmpUtilOidNCmp(poid1: Long, poid2: Long, nsubids: UInt): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidNCmp(poid1.toString(), poid2.toString(), nsubids.toInt()) as Int) else 0

public actual fun SnmpUtilOidToA(oid: Long): PSTR =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidToA(oid.toString()) as String).toLong() else 0L

public actual fun SnmpUtilPrintAsnAny(pany: Long) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilPrintAsnAny(pany.toString())
    }
}

public actual fun SnmpUtilPrintOid(oid: Long) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilPrintOid(oid.toString())
    }
}

public actual fun SnmpUtilVarBindCpy(pvbdst: Long, pvbsrc: Long): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindCpy(pvbdst.toString(), pvbsrc.toString()) as Int) else 0

public actual fun SnmpUtilVarBindFree(pvb: Long) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindFree(pvb.toString())
    }
}

public actual fun SnmpUtilVarBindListCpy(pvbldst: Long, pvblsrc: Long): Int =
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) (_windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindListCpy(pvbldst.toString(), pvblsrc.toString()) as Int) else 0

public actual fun SnmpUtilVarBindListFree(pvbl: Long) {
    if (_windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        _windowsWin32NetworkmanagementSnmpNapiAddon.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindListFree(pvbl.toString())
    }
}
