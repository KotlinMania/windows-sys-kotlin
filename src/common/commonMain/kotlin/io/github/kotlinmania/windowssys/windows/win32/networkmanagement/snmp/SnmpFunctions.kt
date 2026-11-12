package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun snmpCancelMsg(session: Long, reqid: Int): UInt

public expect fun snmpCleanup(): UInt

public expect fun snmpCleanupEx(): UInt

public expect fun snmpClose(session: Long): UInt

public expect fun snmpContextToStr(context: Long, string: MutPtr<SmiOctets>): UInt

public expect fun snmpCountVbl(vbl: Long): UInt

public expect fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long

public expect fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: MutPtr<CVoid>): Long

public expect fun snmpCreateVbl(session: Long, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): Long

public expect fun snmpDecodeMsg(session: Long, srcentity: MutPtr<Long>, dstentity: MutPtr<Long>, context: MutPtr<Long>, pdu: MutPtr<Long>, msgbufdesc: MutPtr<SmiOctets>): UInt

public expect fun snmpDeleteVb(vbl: Long, index: UInt): UInt

public expect fun snmpDuplicatePdu(session: Long, pdu: Long): Long

public expect fun snmpDuplicateVbl(session: Long, vbl: Long): Long

public expect fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: MutPtr<SmiOctets>): UInt

public expect fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt

public expect fun snmpFreeContext(context: Long): UInt

public expect fun snmpFreeDescriptor(syntax: UInt, descriptor: MutPtr<SmiOctets>): UInt

public expect fun snmpFreeEntity(entity: Long): UInt

public expect fun snmpFreePdu(pdu: Long): UInt

public expect fun snmpFreeVbl(vbl: Long): UInt

public expect fun snmpGetLastError(session: Long): UInt

public expect fun snmpGetPduData(pdu: Long, pduType: MutPtr<SnmpPduType>, requestId: MutPtr<Int>, errorStatus: MutPtr<SnmpError>, errorIndex: MutPtr<Int>, varbindlist: MutPtr<Long>): UInt

public expect fun snmpGetRetransmitMode(nretransmitmode: MutPtr<SnmpStatus>): UInt

public expect fun snmpGetRetry(hentity: Long, npolicyretry: MutPtr<UInt>, nactualretry: MutPtr<UInt>): UInt

public expect fun snmpGetTimeout(hentity: Long, npolicytimeout: MutPtr<UInt>, nactualtimeout: MutPtr<UInt>): UInt

public expect fun snmpGetTranslateMode(ntranslatemode: MutPtr<SnmpApiTranslateMode>): UInt

public expect fun snmpGetVb(vbl: Long, index: UInt, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): UInt

public expect fun snmpGetVendorInfo(vendorinfo: MutPtr<SmiVendorinfo>): UInt

public expect fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt

public expect fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt

public expect fun snmpMgrClose(session: MutPtr<CVoid>): Bool

public expect fun snmpMgrCtl(session: MutPtr<CVoid>, dwctlcode: UInt, lpvinbuffer: MutPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>): Bool

public expect fun snmpMgrGetTrap(enterprise: MutPtr<AsnObjectIdentifier>, ipaddress: MutPtr<AsnOctetString>, generictrap: MutPtr<SnmpGenerictrap>, specifictrap: MutPtr<Int>, timestamp: MutPtr<UInt>, variablebindings: MutPtr<SnmpVarBindList>): Bool

public expect fun snmpMgrGetTrapEx(enterprise: MutPtr<AsnObjectIdentifier>, agentaddress: MutPtr<AsnOctetString>, sourceaddress: MutPtr<AsnOctetString>, generictrap: MutPtr<SnmpGenerictrap>, specifictrap: MutPtr<Int>, community: MutPtr<AsnOctetString>, timestamp: MutPtr<UInt>, variablebindings: MutPtr<SnmpVarBindList>): Bool

public expect fun snmpMgrOidToStr(oid: MutPtr<AsnObjectIdentifier>, string: MutPtr<Pstr>): Bool

public expect fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): MutPtr<CVoid>

public expect fun snmpMgrRequest(session: MutPtr<CVoid>, requesttype: UByte, variablebindings: MutPtr<SnmpVarBindList>, errorstatus: MutPtr<SnmpErrorStatus>, errorindex: MutPtr<Int>): Int

public expect fun snmpMgrStrToOid(string: Pcstr, oid: MutPtr<AsnObjectIdentifier>): Bool

public expect fun snmpMgrTrapListen(phtrapavailable: MutPtr<Handle>): Bool

public expect fun snmpOidCompare(xoid: MutPtr<SmiOid>, yoid: MutPtr<SmiOid>, maxlen: UInt, result: MutPtr<Int>): UInt

public expect fun snmpOidCopy(srcoid: MutPtr<SmiOid>, dstoid: MutPtr<SmiOid>): UInt

public expect fun snmpOidToStr(srcoid: ConstPtr<SmiOid>, size: UInt, string: Pstr): UInt

public expect fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long

public expect fun snmpRecvMsg(session: Long, srcentity: MutPtr<Long>, dstentity: MutPtr<Long>, context: MutPtr<Long>, pdu: MutPtr<Long>): UInt

public expect fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: MutPtr<SmiOid>, state: SnmpStatus): UInt

public expect fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt

public expect fun snmpSetPduData(pdu: Long, pduType: ConstPtr<Int>, requestId: ConstPtr<Int>, nonRepeaters: ConstPtr<Int>, maxRepetitions: ConstPtr<Int>, varbindlist: ConstPtr<Long>): UInt

public expect fun snmpSetPort(hentity: Long, nport: UInt): UInt

public expect fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt

public expect fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt

public expect fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt

public expect fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt

public expect fun snmpSetVb(vbl: Long, index: UInt, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): UInt

public expect fun snmpStartup(nmajorversion: MutPtr<UInt>, nminorversion: MutPtr<UInt>, nlevel: MutPtr<UInt>, ntranslatemode: MutPtr<SnmpApiTranslateMode>, nretransmitmode: MutPtr<SnmpStatus>): UInt

public expect fun snmpStartupEx(nmajorversion: MutPtr<UInt>, nminorversion: MutPtr<UInt>, nlevel: MutPtr<UInt>, ntranslatemode: MutPtr<SnmpApiTranslateMode>, nretransmitmode: MutPtr<SnmpStatus>): UInt

public expect fun snmpStrToContext(session: Long, string: MutPtr<SmiOctets>): Long

public expect fun snmpStrToEntity(session: Long, string: Pcstr): Long

public expect fun snmpStrToOid(string: Pcstr, dstoid: MutPtr<SmiOid>): UInt

public expect fun snmpSvcGetUptime(): UInt

public expect fun snmpSvcSetLogLevel(nloglevel: SnmpLog)

public expect fun snmpSvcSetLogType(nlogtype: Int)

public expect fun snmpUtilAsnAnyCpy(panydst: MutPtr<AsnAny>, panysrc: MutPtr<AsnAny>): Int

public expect fun snmpUtilAsnAnyFree(pany: MutPtr<AsnAny>)

public expect fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long)

public expect fun snmpUtilIdsToA(ids: MutPtr<UInt>, idlength: UInt): Pstr

public expect fun snmpUtilMemAlloc(nbytes: UInt): MutPtr<CVoid>

public expect fun snmpUtilMemFree(pmem: MutPtr<CVoid>)

public expect fun snmpUtilMemReAlloc(pmem: MutPtr<CVoid>, nbytes: UInt): MutPtr<CVoid>

public expect fun snmpUtilOctetsCmp(poctets1: MutPtr<AsnOctetString>, poctets2: MutPtr<AsnOctetString>): Int

public expect fun snmpUtilOctetsCpy(poctetsdst: MutPtr<AsnOctetString>, poctetssrc: MutPtr<AsnOctetString>): Int

public expect fun snmpUtilOctetsFree(poctets: MutPtr<AsnOctetString>)

public expect fun snmpUtilOctetsNCmp(poctets1: MutPtr<AsnOctetString>, poctets2: MutPtr<AsnOctetString>, nchars: UInt): Int

public expect fun snmpUtilOidAppend(poiddst: MutPtr<AsnObjectIdentifier>, poidsrc: MutPtr<AsnObjectIdentifier>): Int

public expect fun snmpUtilOidCmp(poid1: MutPtr<AsnObjectIdentifier>, poid2: MutPtr<AsnObjectIdentifier>): Int

public expect fun snmpUtilOidCpy(poiddst: MutPtr<AsnObjectIdentifier>, poidsrc: MutPtr<AsnObjectIdentifier>): Int

public expect fun snmpUtilOidFree(poid: MutPtr<AsnObjectIdentifier>)

public expect fun snmpUtilOidNCmp(poid1: MutPtr<AsnObjectIdentifier>, poid2: MutPtr<AsnObjectIdentifier>, nsubids: UInt): Int

public expect fun snmpUtilOidToA(oid: MutPtr<AsnObjectIdentifier>): Pstr

public expect fun snmpUtilPrintAsnAny(pany: MutPtr<AsnAny>)

public expect fun snmpUtilPrintOid(oid: MutPtr<AsnObjectIdentifier>)

public expect fun snmpUtilVarBindCpy(pvbdst: MutPtr<SnmpVarBind>, pvbsrc: MutPtr<SnmpVarBind>): Int

public expect fun snmpUtilVarBindFree(pvb: MutPtr<SnmpVarBind>)

public expect fun snmpUtilVarBindListCpy(pvbldst: MutPtr<SnmpVarBindList>, pvblsrc: MutPtr<SnmpVarBindList>): Int

public expect fun snmpUtilVarBindListFree(pvbl: MutPtr<SnmpVarBindList>)
