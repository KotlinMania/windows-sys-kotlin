package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun SnmpCancelMsg(session: Long, reqid: Int): UInt

public expect fun SnmpCleanup(): UInt

public expect fun SnmpCleanupEx(): UInt

public expect fun SnmpClose(session: Long): UInt

public expect fun SnmpContextToStr(context: Long, string: Long): UInt

public expect fun SnmpCountVbl(vbl: Long): UInt

public expect fun SnmpCreatePdu(session: Long, pdu_type: SNMP_PDU_TYPE, request_id: Int, error_status: Int, error_index: Int, varbindlist: Long): Long

public expect fun SnmpCreateSession(hwnd: HWND, wmsg: UInt, fcallback: SNMPAPI_CALLBACK, lpclientdata: Long): Long

public expect fun SnmpCreateVbl(session: Long, name: Long, value: Long): Long

public expect fun SnmpDecodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt

public expect fun SnmpDeleteVb(vbl: Long, index: UInt): UInt

public expect fun SnmpDuplicatePdu(session: Long, pdu: Long): Long

public expect fun SnmpDuplicateVbl(session: Long, vbl: Long): Long

public expect fun SnmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt

public expect fun SnmpEntityToStr(entity: Long, size: UInt, string: PSTR): UInt

public expect fun SnmpFreeContext(context: Long): UInt

public expect fun SnmpFreeDescriptor(syntax: UInt, descriptor: Long): UInt

public expect fun SnmpFreeEntity(entity: Long): UInt

public expect fun SnmpFreePdu(pdu: Long): UInt

public expect fun SnmpFreeVbl(vbl: Long): UInt

public expect fun SnmpGetLastError(session: Long): UInt

public expect fun SnmpGetPduData(pdu: Long, pdu_type: Long, request_id: Long, error_status: Long, error_index: Long, varbindlist: Long): UInt

public expect fun SnmpGetRetransmitMode(nretransmitmode: Long): UInt

public expect fun SnmpGetRetry(hentity: Long, npolicyretry: Long, nactualretry: Long): UInt

public expect fun SnmpGetTimeout(hentity: Long, npolicytimeout: Long, nactualtimeout: Long): UInt

public expect fun SnmpGetTranslateMode(ntranslatemode: Long): UInt

public expect fun SnmpGetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt

public expect fun SnmpGetVendorInfo(vendorinfo: Long): UInt

public expect fun SnmpListen(hentity: Long, lstatus: SNMP_STATUS): UInt

public expect fun SnmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt

public expect fun SnmpMgrClose(session: Long): BOOL

public expect fun SnmpMgrCtl(session: Long, dwctlcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long): BOOL

public expect fun SnmpMgrGetTrap(enterprise: Long, ipaddress: Long, generictrap: Long, specifictrap: Long, timestamp: Long, variablebindings: Long): BOOL

public expect fun SnmpMgrGetTrapEx(enterprise: Long, agentaddress: Long, sourceaddress: Long, generictrap: Long, specifictrap: Long, community: Long, timestamp: Long, variablebindings: Long): BOOL

public expect fun SnmpMgrOidToStr(oid: Long, string: Long): BOOL

public expect fun SnmpMgrOpen(lpagentaddress: PCSTR, lpagentcommunity: PCSTR, ntimeout: Int, nretries: Int): Long

public expect fun SnmpMgrRequest(session: Long, requesttype: UByte, variablebindings: Long, errorstatus: Long, errorindex: Long): Int

public expect fun SnmpMgrStrToOid(string: PCSTR, oid: Long): BOOL

public expect fun SnmpMgrTrapListen(phtrapavailable: Long): BOOL

public expect fun SnmpOidCompare(xoid: Long, yoid: Long, maxlen: UInt, result: Long): UInt

public expect fun SnmpOidCopy(srcoid: Long, dstoid: Long): UInt

public expect fun SnmpOidToStr(srcoid: Long, size: UInt, string: PSTR): UInt

public expect fun SnmpOpen(hwnd: HWND, wmsg: UInt): Long

public expect fun SnmpRecvMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt

public expect fun SnmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: Long, state: SNMP_STATUS): UInt

public expect fun SnmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt

public expect fun SnmpSetPduData(pdu: Long, pdu_type: Long, request_id: Long, non_repeaters: Long, max_repetitions: Long, varbindlist: Long): UInt

public expect fun SnmpSetPort(hentity: Long, nport: UInt): UInt

public expect fun SnmpSetRetransmitMode(nretransmitmode: SNMP_STATUS): UInt

public expect fun SnmpSetRetry(hentity: Long, npolicyretry: UInt): UInt

public expect fun SnmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt

public expect fun SnmpSetTranslateMode(ntranslatemode: SNMP_API_TRANSLATE_MODE): UInt

public expect fun SnmpSetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt

public expect fun SnmpStartup(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt

public expect fun SnmpStartupEx(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt

public expect fun SnmpStrToContext(session: Long, string: Long): Long

public expect fun SnmpStrToEntity(session: Long, string: PCSTR): Long

public expect fun SnmpStrToOid(string: PCSTR, dstoid: Long): UInt

public expect fun SnmpSvcGetUptime(): UInt

public expect fun SnmpSvcSetLogLevel(nloglevel: SNMP_LOG)

public expect fun SnmpSvcSetLogType(nlogtype: Int)

public expect fun SnmpUtilAsnAnyCpy(panydst: Long, panysrc: Long): Int

public expect fun SnmpUtilAsnAnyFree(pany: Long)

public expect fun SnmpUtilDbgPrint(nloglevel: SNMP_LOG, szformat: PCSTR, vararg variadicArgs: Long)

public expect fun SnmpUtilIdsToA(ids: Long, idlength: UInt): PSTR

public expect fun SnmpUtilMemAlloc(nbytes: UInt): Long

public expect fun SnmpUtilMemFree(pmem: Long)

public expect fun SnmpUtilMemReAlloc(pmem: Long, nbytes: UInt): Long

public expect fun SnmpUtilOctetsCmp(poctets1: Long, poctets2: Long): Int

public expect fun SnmpUtilOctetsCpy(poctetsdst: Long, poctetssrc: Long): Int

public expect fun SnmpUtilOctetsFree(poctets: Long)

public expect fun SnmpUtilOctetsNCmp(poctets1: Long, poctets2: Long, nchars: UInt): Int

public expect fun SnmpUtilOidAppend(poiddst: Long, poidsrc: Long): Int

public expect fun SnmpUtilOidCmp(poid1: Long, poid2: Long): Int

public expect fun SnmpUtilOidCpy(poiddst: Long, poidsrc: Long): Int

public expect fun SnmpUtilOidFree(poid: Long)

public expect fun SnmpUtilOidNCmp(poid1: Long, poid2: Long, nsubids: UInt): Int

public expect fun SnmpUtilOidToA(oid: Long): PSTR

public expect fun SnmpUtilPrintAsnAny(pany: Long)

public expect fun SnmpUtilPrintOid(oid: Long)

public expect fun SnmpUtilVarBindCpy(pvbdst: Long, pvbsrc: Long): Int

public expect fun SnmpUtilVarBindFree(pvb: Long)

public expect fun SnmpUtilVarBindListCpy(pvbldst: Long, pvblsrc: Long): Int

public expect fun SnmpUtilVarBindListFree(pvbl: Long)
