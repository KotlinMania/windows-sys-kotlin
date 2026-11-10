package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun snmpCancelMsg(session: Long, reqid: Int): UInt

public expect fun snmpCleanup(): UInt

public expect fun snmpCleanupEx(): UInt

public expect fun snmpClose(session: Long): UInt

public expect fun snmpContextToStr(context: Long, string: COpaquePointer?): UInt

public expect fun snmpCountVbl(vbl: Long): UInt

public expect fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long

public expect fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: COpaquePointer?): Long

public expect fun snmpCreateVbl(session: Long, name: COpaquePointer?, value: COpaquePointer?): Long

public expect fun snmpDecodeMsg(session: Long, srcentity: COpaquePointer?, dstentity: COpaquePointer?, context: COpaquePointer?, pdu: COpaquePointer?, msgbufdesc: COpaquePointer?): UInt

public expect fun snmpDeleteVb(vbl: Long, index: UInt): UInt

public expect fun snmpDuplicatePdu(session: Long, pdu: Long): Long

public expect fun snmpDuplicateVbl(session: Long, vbl: Long): Long

public expect fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: COpaquePointer?): UInt

public expect fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt

public expect fun snmpFreeContext(context: Long): UInt

public expect fun snmpFreeDescriptor(syntax: UInt, descriptor: COpaquePointer?): UInt

public expect fun snmpFreeEntity(entity: Long): UInt

public expect fun snmpFreePdu(pdu: Long): UInt

public expect fun snmpFreeVbl(vbl: Long): UInt

public expect fun snmpGetLastError(session: Long): UInt

public expect fun snmpGetPduData(pdu: Long, pduType: COpaquePointer?, requestId: COpaquePointer?, errorStatus: COpaquePointer?, errorIndex: COpaquePointer?, varbindlist: COpaquePointer?): UInt

public expect fun snmpGetRetransmitMode(nretransmitmode: COpaquePointer?): UInt

public expect fun snmpGetRetry(hentity: Long, npolicyretry: COpaquePointer?, nactualretry: COpaquePointer?): UInt

public expect fun snmpGetTimeout(hentity: Long, npolicytimeout: COpaquePointer?, nactualtimeout: COpaquePointer?): UInt

public expect fun snmpGetTranslateMode(ntranslatemode: COpaquePointer?): UInt

public expect fun snmpGetVb(vbl: Long, index: UInt, name: COpaquePointer?, value: COpaquePointer?): UInt

public expect fun snmpGetVendorInfo(vendorinfo: COpaquePointer?): UInt

public expect fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt

public expect fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt

public expect fun snmpMgrClose(session: COpaquePointer?): Bool

public expect fun snmpMgrCtl(session: COpaquePointer?, dwctlcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?): Bool

public expect fun snmpMgrGetTrap(enterprise: COpaquePointer?, ipaddress: COpaquePointer?, generictrap: COpaquePointer?, specifictrap: COpaquePointer?, timestamp: COpaquePointer?, variablebindings: COpaquePointer?): Bool

public expect fun snmpMgrGetTrapEx(enterprise: COpaquePointer?, agentaddress: COpaquePointer?, sourceaddress: COpaquePointer?, generictrap: COpaquePointer?, specifictrap: COpaquePointer?, community: COpaquePointer?, timestamp: COpaquePointer?, variablebindings: COpaquePointer?): Bool

public expect fun snmpMgrOidToStr(oid: COpaquePointer?, string: COpaquePointer?): Bool

public expect fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): COpaquePointer?

public expect fun snmpMgrRequest(session: COpaquePointer?, requesttype: UByte, variablebindings: COpaquePointer?, errorstatus: COpaquePointer?, errorindex: COpaquePointer?): Int

public expect fun snmpMgrStrToOid(string: Pcstr, oid: COpaquePointer?): Bool

public expect fun snmpMgrTrapListen(phtrapavailable: COpaquePointer?): Bool

public expect fun snmpOidCompare(xoid: COpaquePointer?, yoid: COpaquePointer?, maxlen: UInt, result: COpaquePointer?): UInt

public expect fun snmpOidCopy(srcoid: COpaquePointer?, dstoid: COpaquePointer?): UInt

public expect fun snmpOidToStr(srcoid: COpaquePointer?, size: UInt, string: Pstr): UInt

public expect fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long

public expect fun snmpRecvMsg(session: Long, srcentity: COpaquePointer?, dstentity: COpaquePointer?, context: COpaquePointer?, pdu: COpaquePointer?): UInt

public expect fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: COpaquePointer?, state: SnmpStatus): UInt

public expect fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt

public expect fun snmpSetPduData(pdu: Long, pduType: COpaquePointer?, requestId: COpaquePointer?, nonRepeaters: COpaquePointer?, maxRepetitions: COpaquePointer?, varbindlist: COpaquePointer?): UInt

public expect fun snmpSetPort(hentity: Long, nport: UInt): UInt

public expect fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt

public expect fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt

public expect fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt

public expect fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt

public expect fun snmpSetVb(vbl: Long, index: UInt, name: COpaquePointer?, value: COpaquePointer?): UInt

public expect fun snmpStartup(nmajorversion: COpaquePointer?, nminorversion: COpaquePointer?, nlevel: COpaquePointer?, ntranslatemode: COpaquePointer?, nretransmitmode: COpaquePointer?): UInt

public expect fun snmpStartupEx(nmajorversion: COpaquePointer?, nminorversion: COpaquePointer?, nlevel: COpaquePointer?, ntranslatemode: COpaquePointer?, nretransmitmode: COpaquePointer?): UInt

public expect fun snmpStrToContext(session: Long, string: COpaquePointer?): Long

public expect fun snmpStrToEntity(session: Long, string: Pcstr): Long

public expect fun snmpStrToOid(string: Pcstr, dstoid: COpaquePointer?): UInt

public expect fun snmpSvcGetUptime(): UInt

public expect fun snmpSvcSetLogLevel(nloglevel: SnmpLog)

public expect fun snmpSvcSetLogType(nlogtype: Int)

public expect fun snmpUtilAsnAnyCpy(panydst: COpaquePointer?, panysrc: COpaquePointer?): Int

public expect fun snmpUtilAsnAnyFree(pany: COpaquePointer?)

public expect fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long)

public expect fun snmpUtilIdsToA(ids: COpaquePointer?, idlength: UInt): Pstr

public expect fun snmpUtilMemAlloc(nbytes: UInt): COpaquePointer?

public expect fun snmpUtilMemFree(pmem: COpaquePointer?)

public expect fun snmpUtilMemReAlloc(pmem: COpaquePointer?, nbytes: UInt): COpaquePointer?

public expect fun snmpUtilOctetsCmp(poctets1: COpaquePointer?, poctets2: COpaquePointer?): Int

public expect fun snmpUtilOctetsCpy(poctetsdst: COpaquePointer?, poctetssrc: COpaquePointer?): Int

public expect fun snmpUtilOctetsFree(poctets: COpaquePointer?)

public expect fun snmpUtilOctetsNCmp(poctets1: COpaquePointer?, poctets2: COpaquePointer?, nchars: UInt): Int

public expect fun snmpUtilOidAppend(poiddst: COpaquePointer?, poidsrc: COpaquePointer?): Int

public expect fun snmpUtilOidCmp(poid1: COpaquePointer?, poid2: COpaquePointer?): Int

public expect fun snmpUtilOidCpy(poiddst: COpaquePointer?, poidsrc: COpaquePointer?): Int

public expect fun snmpUtilOidFree(poid: COpaquePointer?)

public expect fun snmpUtilOidNCmp(poid1: COpaquePointer?, poid2: COpaquePointer?, nsubids: UInt): Int

public expect fun snmpUtilOidToA(oid: COpaquePointer?): Pstr

public expect fun snmpUtilPrintAsnAny(pany: COpaquePointer?)

public expect fun snmpUtilPrintOid(oid: COpaquePointer?)

public expect fun snmpUtilVarBindCpy(pvbdst: COpaquePointer?, pvbsrc: COpaquePointer?): Int

public expect fun snmpUtilVarBindFree(pvb: COpaquePointer?)

public expect fun snmpUtilVarBindListCpy(pvbldst: COpaquePointer?, pvblsrc: COpaquePointer?): Int

public expect fun snmpUtilVarBindListFree(pvbl: COpaquePointer?)
