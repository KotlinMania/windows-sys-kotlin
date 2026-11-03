package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR

public fun interface FnCallback {
    public operator fun invoke(hsession: Long, hwnd: Foundation.HWND, wmsg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, lpclientdata: Long): UInt
}

public fun SnmpCancelMsg(session: Long, reqid: Int): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpCancelMsg", longArrayOf(session, reqid.toLong())).toUInt()
}

public fun SnmpCleanup(): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpCleanup", longArrayOf()).toUInt()
}

public fun SnmpCleanupEx(): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpCleanupEx", longArrayOf()).toUInt()
}

public fun SnmpClose(session: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpClose", longArrayOf(session)).toUInt()
}

public fun SnmpContextToStr(context: Long, string: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpContextToStr", longArrayOf(context, string)).toUInt()
}

public fun SnmpCountVbl(vbl: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpCountVbl", longArrayOf(vbl)).toUInt()
}

public fun SnmpCreatePdu(session: Long, pdu_type: SNMP_PDU_TYPE, request_id: Int, error_status: Int, error_index: Int, varbindlist: Long): Long {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpCreatePdu", longArrayOf(session, pdu_type.toLong(), request_id.toLong(), error_status.toLong(), error_index.toLong(), varbindlist))
}

public fun SnmpCreateSession(hwnd: Foundation.HWND, wmsg: UInt, fcallback: SNMPAPI_CALLBACK, lpclientdata: Long): Long {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpCreateSession", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), wmsg.toLong(), Win32DynamicFfi.objectSlot(fcallback), lpclientdata))
}

public fun SnmpCreateVbl(session: Long, name: Long, value: Long): Long {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpCreateVbl", longArrayOf(session, name, value))
}

public fun SnmpDecodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpDecodeMsg", longArrayOf(session, srcentity, dstentity, context, pdu, msgbufdesc)).toUInt()
}

public fun SnmpDeleteVb(vbl: Long, index: UInt): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpDeleteVb", longArrayOf(vbl, index.toLong())).toUInt()
}

public fun SnmpDuplicatePdu(session: Long, pdu: Long): Long {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpDuplicatePdu", longArrayOf(session, pdu))
}

public fun SnmpDuplicateVbl(session: Long, vbl: Long): Long {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpDuplicateVbl", longArrayOf(session, vbl))
}

public fun SnmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpEncodeMsg", longArrayOf(session, srcentity, dstentity, context, pdu, msgbufdesc)).toUInt()
}

public fun SnmpEntityToStr(entity: Long, size: UInt, string: PSTR): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpEntityToStr", longArrayOf(entity, size.toLong(), string)).toUInt()
}

public fun SnmpFreeContext(context: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpFreeContext", longArrayOf(context)).toUInt()
}

public fun SnmpFreeDescriptor(syntax: UInt, descriptor: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpFreeDescriptor", longArrayOf(syntax.toLong(), descriptor)).toUInt()
}

public fun SnmpFreeEntity(entity: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpFreeEntity", longArrayOf(entity)).toUInt()
}

public fun SnmpFreePdu(pdu: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpFreePdu", longArrayOf(pdu)).toUInt()
}

public fun SnmpFreeVbl(vbl: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpFreeVbl", longArrayOf(vbl)).toUInt()
}

public fun SnmpGetLastError(session: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpGetLastError", longArrayOf(session)).toUInt()
}

public fun SnmpGetPduData(pdu: Long, pdu_type: Long, request_id: Long, error_status: Long, error_index: Long, varbindlist: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpGetPduData", longArrayOf(pdu, pdu_type, request_id, error_status, error_index, varbindlist)).toUInt()
}

public fun SnmpGetRetransmitMode(nretransmitmode: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpGetRetransmitMode", longArrayOf(nretransmitmode)).toUInt()
}

public fun SnmpGetRetry(hentity: Long, npolicyretry: Long, nactualretry: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpGetRetry", longArrayOf(hentity, npolicyretry, nactualretry)).toUInt()
}

public fun SnmpGetTimeout(hentity: Long, npolicytimeout: Long, nactualtimeout: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpGetTimeout", longArrayOf(hentity, npolicytimeout, nactualtimeout)).toUInt()
}

public fun SnmpGetTranslateMode(ntranslatemode: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpGetTranslateMode", longArrayOf(ntranslatemode)).toUInt()
}

public fun SnmpGetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpGetVb", longArrayOf(vbl, index.toLong(), name, value)).toUInt()
}

public fun SnmpGetVendorInfo(vendorinfo: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpGetVendorInfo", longArrayOf(vendorinfo)).toUInt()
}

public fun SnmpListen(hentity: Long, lstatus: SNMP_STATUS): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpListen", longArrayOf(hentity, lstatus.toLong())).toUInt()
}

public fun SnmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpListenEx", longArrayOf(hentity, lstatus.toLong(), nuseentityaddr.toLong())).toUInt()
}

public fun SnmpMgrClose(session: Long): BOOL {
    return Win32DynamicFfi.invoke("mgmtapi.dll", "SnmpMgrClose", longArrayOf(session)).toInt()
}

public fun SnmpMgrCtl(session: Long, dwctlcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("mgmtapi.dll", "SnmpMgrCtl", longArrayOf(session, dwctlcode.toLong(), lpvinbuffer, cbinbuffer.toLong(), lpvoutbuffer, cboutbuffer.toLong(), lpcbbytesreturned)).toInt()
}

public fun SnmpMgrGetTrap(enterprise: Long, ipaddress: Long, generictrap: Long, specifictrap: Long, timestamp: Long, variablebindings: Long): BOOL {
    return Win32DynamicFfi.invoke("mgmtapi.dll", "SnmpMgrGetTrap", longArrayOf(enterprise, ipaddress, generictrap, specifictrap, timestamp, variablebindings)).toInt()
}

public fun SnmpMgrGetTrapEx(enterprise: Long, agentaddress: Long, sourceaddress: Long, generictrap: Long, specifictrap: Long, community: Long, timestamp: Long, variablebindings: Long): BOOL {
    return Win32DynamicFfi.invoke("mgmtapi.dll", "SnmpMgrGetTrapEx", longArrayOf(enterprise, agentaddress, sourceaddress, generictrap, specifictrap, community, timestamp, variablebindings)).toInt()
}

public fun SnmpMgrOidToStr(oid: Long, string: Long): BOOL {
    return Win32DynamicFfi.invoke("mgmtapi.dll", "SnmpMgrOidToStr", longArrayOf(oid, string)).toInt()
}

public fun SnmpMgrOpen(lpagentaddress: PCSTR, lpagentcommunity: PCSTR, ntimeout: Int, nretries: Int): Long {
    return Win32DynamicFfi.invoke("mgmtapi.dll", "SnmpMgrOpen", longArrayOf(lpagentaddress, lpagentcommunity, ntimeout.toLong(), nretries.toLong()))
}

public fun SnmpMgrRequest(session: Long, requesttype: UByte, variablebindings: Long, errorstatus: Long, errorindex: Long): Int {
    return Win32DynamicFfi.invoke("mgmtapi.dll", "SnmpMgrRequest", longArrayOf(session, requesttype.toLong(), variablebindings, errorstatus, errorindex)).toInt()
}

public fun SnmpMgrStrToOid(string: PCSTR, oid: Long): BOOL {
    return Win32DynamicFfi.invoke("mgmtapi.dll", "SnmpMgrStrToOid", longArrayOf(string, oid)).toInt()
}

public fun SnmpMgrTrapListen(phtrapavailable: Long): BOOL {
    return Win32DynamicFfi.invoke("mgmtapi.dll", "SnmpMgrTrapListen", longArrayOf(phtrapavailable)).toInt()
}

public fun SnmpOidCompare(xoid: Long, yoid: Long, maxlen: UInt, result: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpOidCompare", longArrayOf(xoid, yoid, maxlen.toLong(), result)).toUInt()
}

public fun SnmpOidCopy(srcoid: Long, dstoid: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpOidCopy", longArrayOf(srcoid, dstoid)).toUInt()
}

public fun SnmpOidToStr(srcoid: Long, size: UInt, string: PSTR): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpOidToStr", longArrayOf(srcoid, size.toLong(), string)).toUInt()
}

public fun SnmpOpen(hwnd: Foundation.HWND, wmsg: UInt): Long {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpOpen", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), wmsg.toLong()))
}

public fun SnmpRecvMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpRecvMsg", longArrayOf(session, srcentity, dstentity, context, pdu)).toUInt()
}

public fun SnmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: Long, state: SNMP_STATUS): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpRegister", longArrayOf(session, srcentity, dstentity, context, notification, state.toLong())).toUInt()
}

public fun SnmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpSendMsg", longArrayOf(session, srcentity, dstentity, context, pdu)).toUInt()
}

public fun SnmpSetPduData(pdu: Long, pdu_type: Long, request_id: Long, non_repeaters: Long, max_repetitions: Long, varbindlist: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpSetPduData", longArrayOf(pdu, pdu_type, request_id, non_repeaters, max_repetitions, varbindlist)).toUInt()
}

public fun SnmpSetPort(hentity: Long, nport: UInt): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpSetPort", longArrayOf(hentity, nport.toLong())).toUInt()
}

public fun SnmpSetRetransmitMode(nretransmitmode: SNMP_STATUS): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpSetRetransmitMode", longArrayOf(nretransmitmode.toLong())).toUInt()
}

public fun SnmpSetRetry(hentity: Long, npolicyretry: UInt): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpSetRetry", longArrayOf(hentity, npolicyretry.toLong())).toUInt()
}

public fun SnmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpSetTimeout", longArrayOf(hentity, npolicytimeout.toLong())).toUInt()
}

public fun SnmpSetTranslateMode(ntranslatemode: SNMP_API_TRANSLATE_MODE): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpSetTranslateMode", longArrayOf(ntranslatemode.toLong())).toUInt()
}

public fun SnmpSetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpSetVb", longArrayOf(vbl, index.toLong(), name, value)).toUInt()
}

public fun SnmpStartup(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpStartup", longArrayOf(nmajorversion, nminorversion, nlevel, ntranslatemode, nretransmitmode)).toUInt()
}

public fun SnmpStartupEx(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpStartupEx", longArrayOf(nmajorversion, nminorversion, nlevel, ntranslatemode, nretransmitmode)).toUInt()
}

public fun SnmpStrToContext(session: Long, string: Long): Long {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpStrToContext", longArrayOf(session, string))
}

public fun SnmpStrToEntity(session: Long, string: PCSTR): Long {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpStrToEntity", longArrayOf(session, string))
}

public fun SnmpStrToOid(string: PCSTR, dstoid: Long): UInt {
    return Win32DynamicFfi.invoke("wsnmp32.dll", "SnmpStrToOid", longArrayOf(string, dstoid)).toUInt()
}

public fun SnmpSvcGetUptime(): UInt {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpSvcGetUptime", longArrayOf()).toUInt()
}

public fun SnmpSvcSetLogLevel(nloglevel: SNMP_LOG) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpSvcSetLogLevel", longArrayOf(nloglevel.toLong()))
}

public fun SnmpSvcSetLogType(nlogtype: Int) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpSvcSetLogType", longArrayOf(nlogtype.toLong()))
}

public fun SnmpUtilAsnAnyCpy(panydst: Long, panysrc: Long): Int {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilAsnAnyCpy", longArrayOf(panydst, panysrc)).toInt()
}

public fun SnmpUtilAsnAnyFree(pany: Long) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilAsnAnyFree", longArrayOf(pany))
}

public fun SnmpUtilDbgPrint(nloglevel: SNMP_LOG, szformat: PCSTR, vararg variadicArgs: Long) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilDbgPrint", longArrayOf(nloglevel.toLong(), szformat) + variadicArgs)
}

public fun SnmpUtilIdsToA(ids: Long, idlength: UInt): PSTR {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilIdsToA", longArrayOf(ids, idlength.toLong()))
}

public fun SnmpUtilMemAlloc(nbytes: UInt): Long {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilMemAlloc", longArrayOf(nbytes.toLong()))
}

public fun SnmpUtilMemFree(pmem: Long) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilMemFree", longArrayOf(pmem))
}

public fun SnmpUtilMemReAlloc(pmem: Long, nbytes: UInt): Long {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilMemReAlloc", longArrayOf(pmem, nbytes.toLong()))
}

public fun SnmpUtilOctetsCmp(poctets1: Long, poctets2: Long): Int {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilOctetsCmp", longArrayOf(poctets1, poctets2)).toInt()
}

public fun SnmpUtilOctetsCpy(poctetsdst: Long, poctetssrc: Long): Int {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilOctetsCpy", longArrayOf(poctetsdst, poctetssrc)).toInt()
}

public fun SnmpUtilOctetsFree(poctets: Long) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilOctetsFree", longArrayOf(poctets))
}

public fun SnmpUtilOctetsNCmp(poctets1: Long, poctets2: Long, nchars: UInt): Int {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilOctetsNCmp", longArrayOf(poctets1, poctets2, nchars.toLong())).toInt()
}

public fun SnmpUtilOidAppend(poiddst: Long, poidsrc: Long): Int {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilOidAppend", longArrayOf(poiddst, poidsrc)).toInt()
}

public fun SnmpUtilOidCmp(poid1: Long, poid2: Long): Int {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilOidCmp", longArrayOf(poid1, poid2)).toInt()
}

public fun SnmpUtilOidCpy(poiddst: Long, poidsrc: Long): Int {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilOidCpy", longArrayOf(poiddst, poidsrc)).toInt()
}

public fun SnmpUtilOidFree(poid: Long) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilOidFree", longArrayOf(poid))
}

public fun SnmpUtilOidNCmp(poid1: Long, poid2: Long, nsubids: UInt): Int {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilOidNCmp", longArrayOf(poid1, poid2, nsubids.toLong())).toInt()
}

public fun SnmpUtilOidToA(oid: Long): PSTR {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilOidToA", longArrayOf(oid))
}

public fun SnmpUtilPrintAsnAny(pany: Long) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilPrintAsnAny", longArrayOf(pany))
}

public fun SnmpUtilPrintOid(oid: Long) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilPrintOid", longArrayOf(oid))
}

public fun SnmpUtilVarBindCpy(pvbdst: Long, pvbsrc: Long): Int {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilVarBindCpy", longArrayOf(pvbdst, pvbsrc)).toInt()
}

public fun SnmpUtilVarBindFree(pvb: Long) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilVarBindFree", longArrayOf(pvb))
}

public fun SnmpUtilVarBindListCpy(pvbldst: Long, pvblsrc: Long): Int {
    return Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilVarBindListCpy", longArrayOf(pvbldst, pvblsrc)).toInt()
}

public fun SnmpUtilVarBindListFree(pvbl: Long) {
    Win32DynamicFfi.invoke("snmpapi.dll", "SnmpUtilVarBindListFree", longArrayOf(pvbl))
}
