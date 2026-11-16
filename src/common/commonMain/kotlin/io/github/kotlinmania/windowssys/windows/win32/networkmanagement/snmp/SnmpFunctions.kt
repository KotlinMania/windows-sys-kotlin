package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun snmpCancelMsg(session: Long, reqid: Int): UInt

public expect fun snmpCleanup(): UInt

public expect fun snmpCleanupEx(): UInt

public expect fun snmpClose(session: Long): UInt

public expect fun snmpContextToStr(context: Long, string: MutPtr): UInt

public expect fun snmpCountVbl(vbl: Long): UInt

public expect fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long

public expect fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: MutPtr): Long

public expect fun snmpCreateVbl(session: Long, name: MutPtr, value: MutPtr): Long

public expect fun snmpDecodeMsg(session: Long, srcentity: MutPtr, dstentity: MutPtr, context: MutPtr, pdu: MutPtr, msgbufdesc: MutPtr): UInt

public expect fun snmpDeleteVb(vbl: Long, index: UInt): UInt

public expect fun snmpDuplicatePdu(session: Long, pdu: Long): Long

public expect fun snmpDuplicateVbl(session: Long, vbl: Long): Long

public expect fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: MutPtr): UInt

public expect fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt

public expect fun snmpFreeContext(context: Long): UInt

public expect fun snmpFreeDescriptor(syntax: UInt, descriptor: MutPtr): UInt

public expect fun snmpFreeEntity(entity: Long): UInt

public expect fun snmpFreePdu(pdu: Long): UInt

public expect fun snmpFreeVbl(vbl: Long): UInt

public expect fun snmpGetLastError(session: Long): UInt

public expect fun snmpGetPduData(pdu: Long, pduType: MutPtr, requestId: MutPtr, errorStatus: MutPtr, errorIndex: MutPtr, varbindlist: MutPtr): UInt

public expect fun snmpGetRetransmitMode(nretransmitmode: MutPtr): UInt

public expect fun snmpGetRetry(hentity: Long, npolicyretry: MutPtr, nactualretry: MutPtr): UInt

public expect fun snmpGetTimeout(hentity: Long, npolicytimeout: MutPtr, nactualtimeout: MutPtr): UInt

public expect fun snmpGetTranslateMode(ntranslatemode: MutPtr): UInt

public expect fun snmpGetVb(vbl: Long, index: UInt, name: MutPtr, value: MutPtr): UInt

public expect fun snmpGetVendorInfo(vendorinfo: MutPtr): UInt

public expect fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt

public expect fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt

public expect fun snmpMgrClose(session: MutPtr): Bool

public expect fun snmpMgrCtl(session: MutPtr, dwctlcode: UInt, lpvinbuffer: MutPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr): Bool

public expect fun snmpMgrGetTrap(enterprise: MutPtr, ipaddress: MutPtr, generictrap: MutPtr, specifictrap: MutPtr, timestamp: MutPtr, variablebindings: MutPtr): Bool

public expect fun snmpMgrGetTrapEx(enterprise: MutPtr, agentaddress: MutPtr, sourceaddress: MutPtr, generictrap: MutPtr, specifictrap: MutPtr, community: MutPtr, timestamp: MutPtr, variablebindings: MutPtr): Bool

public expect fun snmpMgrOidToStr(oid: MutPtr, string: MutPtr): Bool

public expect fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): MutPtr

public expect fun snmpMgrRequest(session: MutPtr, requesttype: UByte, variablebindings: MutPtr, errorstatus: MutPtr, errorindex: MutPtr): Int

public expect fun snmpMgrStrToOid(string: Pcstr, oid: MutPtr): Bool

public expect fun snmpMgrTrapListen(phtrapavailable: MutPtr): Bool

public expect fun snmpOidCompare(xoid: MutPtr, yoid: MutPtr, maxlen: UInt, result: MutPtr): UInt

public expect fun snmpOidCopy(srcoid: MutPtr, dstoid: MutPtr): UInt

public expect fun snmpOidToStr(srcoid: ConstPtr, size: UInt, string: Pstr): UInt

public expect fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long

public expect fun snmpRecvMsg(session: Long, srcentity: MutPtr, dstentity: MutPtr, context: MutPtr, pdu: MutPtr): UInt

public expect fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: MutPtr, state: SnmpStatus): UInt

public expect fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt

public expect fun snmpSetPduData(pdu: Long, pduType: ConstPtr, requestId: ConstPtr, nonRepeaters: ConstPtr, maxRepetitions: ConstPtr, varbindlist: ConstPtr): UInt

public expect fun snmpSetPort(hentity: Long, nport: UInt): UInt

public expect fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt

public expect fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt

public expect fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt

public expect fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt

public expect fun snmpSetVb(vbl: Long, index: UInt, name: MutPtr, value: MutPtr): UInt

public expect fun snmpStartup(nmajorversion: MutPtr, nminorversion: MutPtr, nlevel: MutPtr, ntranslatemode: MutPtr, nretransmitmode: MutPtr): UInt

public expect fun snmpStartupEx(nmajorversion: MutPtr, nminorversion: MutPtr, nlevel: MutPtr, ntranslatemode: MutPtr, nretransmitmode: MutPtr): UInt

public expect fun snmpStrToContext(session: Long, string: MutPtr): Long

public expect fun snmpStrToEntity(session: Long, string: Pcstr): Long

public expect fun snmpStrToOid(string: Pcstr, dstoid: MutPtr): UInt

public expect fun snmpSvcGetUptime(): UInt

public expect fun snmpSvcSetLogLevel(nloglevel: SnmpLog)

public expect fun snmpSvcSetLogType(nlogtype: Int)

public expect fun snmpUtilAsnAnyCpy(panydst: MutPtr, panysrc: MutPtr): Int

public expect fun snmpUtilAsnAnyFree(pany: MutPtr)

public expect fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long)

public expect fun snmpUtilIdsToA(ids: MutPtr, idlength: UInt): Pstr

public expect fun snmpUtilMemAlloc(nbytes: UInt): MutPtr

public expect fun snmpUtilMemFree(pmem: MutPtr)

public expect fun snmpUtilMemReAlloc(pmem: MutPtr, nbytes: UInt): MutPtr

public expect fun snmpUtilOctetsCmp(poctets1: MutPtr, poctets2: MutPtr): Int

public expect fun snmpUtilOctetsCpy(poctetsdst: MutPtr, poctetssrc: MutPtr): Int

public expect fun snmpUtilOctetsFree(poctets: MutPtr)

public expect fun snmpUtilOctetsNCmp(poctets1: MutPtr, poctets2: MutPtr, nchars: UInt): Int

public expect fun snmpUtilOidAppend(poiddst: MutPtr, poidsrc: MutPtr): Int

public expect fun snmpUtilOidCmp(poid1: MutPtr, poid2: MutPtr): Int

public expect fun snmpUtilOidCpy(poiddst: MutPtr, poidsrc: MutPtr): Int

public expect fun snmpUtilOidFree(poid: MutPtr)

public expect fun snmpUtilOidNCmp(poid1: MutPtr, poid2: MutPtr, nsubids: UInt): Int

public expect fun snmpUtilOidToA(oid: MutPtr): Pstr

public expect fun snmpUtilPrintAsnAny(pany: MutPtr)

public expect fun snmpUtilPrintOid(oid: MutPtr)

public expect fun snmpUtilVarBindCpy(pvbdst: MutPtr, pvbsrc: MutPtr): Int

public expect fun snmpUtilVarBindFree(pvb: MutPtr)

public expect fun snmpUtilVarBindListCpy(pvbldst: MutPtr, pvblsrc: MutPtr): Int

public expect fun snmpUtilVarBindListFree(pvbl: MutPtr)
