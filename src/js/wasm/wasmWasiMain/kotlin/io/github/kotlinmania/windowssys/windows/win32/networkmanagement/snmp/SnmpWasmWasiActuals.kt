@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun SnmpCancelMsg(session: Long, reqid: Int): UInt =
    0u

public actual fun SnmpCleanup(): UInt =
    0u

public actual fun SnmpCleanupEx(): UInt =
    0u

public actual fun SnmpClose(session: Long): UInt =
    0u

public actual fun SnmpContextToStr(context: Long, string: Long): UInt =
    0u

public actual fun SnmpCountVbl(vbl: Long): UInt =
    0u

public actual fun SnmpCreatePdu(session: Long, pdu_type: SNMP_PDU_TYPE, request_id: Int, error_status: Int, error_index: Int, varbindlist: Long): Long =
    0L

public actual fun SnmpCreateSession(hwnd: HWND, wmsg: UInt, fcallback: SNMPAPI_CALLBACK, lpclientdata: Long): Long =
    0L

public actual fun SnmpCreateVbl(session: Long, name: Long, value: Long): Long =
    0L

public actual fun SnmpDecodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt =
    0u

public actual fun SnmpDeleteVb(vbl: Long, index: UInt): UInt =
    0u

public actual fun SnmpDuplicatePdu(session: Long, pdu: Long): Long =
    0L

public actual fun SnmpDuplicateVbl(session: Long, vbl: Long): Long =
    0L

public actual fun SnmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt =
    0u

public actual fun SnmpEntityToStr(entity: Long, size: UInt, string: PSTR): UInt =
    0u

public actual fun SnmpFreeContext(context: Long): UInt =
    0u

public actual fun SnmpFreeDescriptor(syntax: UInt, descriptor: Long): UInt =
    0u

public actual fun SnmpFreeEntity(entity: Long): UInt =
    0u

public actual fun SnmpFreePdu(pdu: Long): UInt =
    0u

public actual fun SnmpFreeVbl(vbl: Long): UInt =
    0u

public actual fun SnmpGetLastError(session: Long): UInt =
    0u

public actual fun SnmpGetPduData(pdu: Long, pdu_type: Long, request_id: Long, error_status: Long, error_index: Long, varbindlist: Long): UInt =
    0u

public actual fun SnmpGetRetransmitMode(nretransmitmode: Long): UInt =
    0u

public actual fun SnmpGetRetry(hentity: Long, npolicyretry: Long, nactualretry: Long): UInt =
    0u

public actual fun SnmpGetTimeout(hentity: Long, npolicytimeout: Long, nactualtimeout: Long): UInt =
    0u

public actual fun SnmpGetTranslateMode(ntranslatemode: Long): UInt =
    0u

public actual fun SnmpGetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt =
    0u

public actual fun SnmpGetVendorInfo(vendorinfo: Long): UInt =
    0u

public actual fun SnmpListen(hentity: Long, lstatus: SNMP_STATUS): UInt =
    0u

public actual fun SnmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    0u

public actual fun SnmpMgrClose(session: Long): BOOL =
    0

public actual fun SnmpMgrCtl(session: Long, dwctlcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long): BOOL =
    0

public actual fun SnmpMgrGetTrap(enterprise: Long, ipaddress: Long, generictrap: Long, specifictrap: Long, timestamp: Long, variablebindings: Long): BOOL =
    0

public actual fun SnmpMgrGetTrapEx(enterprise: Long, agentaddress: Long, sourceaddress: Long, generictrap: Long, specifictrap: Long, community: Long, timestamp: Long, variablebindings: Long): BOOL =
    0

public actual fun SnmpMgrOidToStr(oid: Long, string: Long): BOOL =
    0

public actual fun SnmpMgrOpen(lpagentaddress: PCSTR, lpagentcommunity: PCSTR, ntimeout: Int, nretries: Int): Long =
    0L

public actual fun SnmpMgrRequest(session: Long, requesttype: UByte, variablebindings: Long, errorstatus: Long, errorindex: Long): Int =
    0

public actual fun SnmpMgrStrToOid(string: PCSTR, oid: Long): BOOL =
    0

public actual fun SnmpMgrTrapListen(phtrapavailable: Long): BOOL =
    0

public actual fun SnmpOidCompare(xoid: Long, yoid: Long, maxlen: UInt, result: Long): UInt =
    0u

public actual fun SnmpOidCopy(srcoid: Long, dstoid: Long): UInt =
    0u

public actual fun SnmpOidToStr(srcoid: Long, size: UInt, string: PSTR): UInt =
    0u

public actual fun SnmpOpen(hwnd: HWND, wmsg: UInt): Long =
    0L

public actual fun SnmpRecvMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    0u

public actual fun SnmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: Long, state: SNMP_STATUS): UInt =
    0u

public actual fun SnmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    0u

public actual fun SnmpSetPduData(pdu: Long, pdu_type: Long, request_id: Long, non_repeaters: Long, max_repetitions: Long, varbindlist: Long): UInt =
    0u

public actual fun SnmpSetPort(hentity: Long, nport: UInt): UInt =
    0u

public actual fun SnmpSetRetransmitMode(nretransmitmode: SNMP_STATUS): UInt =
    0u

public actual fun SnmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    0u

public actual fun SnmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    0u

public actual fun SnmpSetTranslateMode(ntranslatemode: SNMP_API_TRANSLATE_MODE): UInt =
    0u

public actual fun SnmpSetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt =
    0u

public actual fun SnmpStartup(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt =
    0u

public actual fun SnmpStartupEx(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt =
    0u

public actual fun SnmpStrToContext(session: Long, string: Long): Long =
    0L

public actual fun SnmpStrToEntity(session: Long, string: PCSTR): Long =
    0L

public actual fun SnmpStrToOid(string: PCSTR, dstoid: Long): UInt =
    0u

public actual fun SnmpSvcGetUptime(): UInt =
    0u

public actual fun SnmpSvcSetLogLevel(nloglevel: SNMP_LOG) {
}

public actual fun SnmpSvcSetLogType(nlogtype: Int) {
}

public actual fun SnmpUtilAsnAnyCpy(panydst: Long, panysrc: Long): Int =
    0

public actual fun SnmpUtilAsnAnyFree(pany: Long) {
}

public actual fun SnmpUtilDbgPrint(nloglevel: SNMP_LOG, szformat: PCSTR) {
}

public actual fun SnmpUtilIdsToA(ids: Long, idlength: UInt): PSTR =
    0L

public actual fun SnmpUtilMemAlloc(nbytes: UInt): Long =
    0L

public actual fun SnmpUtilMemFree(pmem: Long) {
}

public actual fun SnmpUtilMemReAlloc(pmem: Long, nbytes: UInt): Long =
    0L

public actual fun SnmpUtilOctetsCmp(poctets1: Long, poctets2: Long): Int =
    0

public actual fun SnmpUtilOctetsCpy(poctetsdst: Long, poctetssrc: Long): Int =
    0

public actual fun SnmpUtilOctetsFree(poctets: Long) {
}

public actual fun SnmpUtilOctetsNCmp(poctets1: Long, poctets2: Long, nchars: UInt): Int =
    0

public actual fun SnmpUtilOidAppend(poiddst: Long, poidsrc: Long): Int =
    0

public actual fun SnmpUtilOidCmp(poid1: Long, poid2: Long): Int =
    0

public actual fun SnmpUtilOidCpy(poiddst: Long, poidsrc: Long): Int =
    0

public actual fun SnmpUtilOidFree(poid: Long) {
}

public actual fun SnmpUtilOidNCmp(poid1: Long, poid2: Long, nsubids: UInt): Int =
    0

public actual fun SnmpUtilOidToA(oid: Long): PSTR =
    0L

public actual fun SnmpUtilPrintAsnAny(pany: Long) {
}

public actual fun SnmpUtilPrintOid(oid: Long) {
}

public actual fun SnmpUtilVarBindCpy(pvbdst: Long, pvbsrc: Long): Int =
    0

public actual fun SnmpUtilVarBindFree(pvb: Long) {
}

public actual fun SnmpUtilVarBindListCpy(pvbldst: Long, pvblsrc: Long): Int =
    0

public actual fun SnmpUtilVarBindListFree(pvbl: Long) {
}
