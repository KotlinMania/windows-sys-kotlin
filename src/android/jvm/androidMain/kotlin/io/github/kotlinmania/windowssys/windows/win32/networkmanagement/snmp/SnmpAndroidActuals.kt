@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32NetworkmanagementSnmpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(session: Long, reqid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpClose(session: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr(context: Long, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(vbl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(session: Long, pduType: Int, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession(hwnd: Long, wmsg: Int, fcallback: Long, lpclientdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl(session: Long, name: Long, value: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(vbl: Long, index: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(session: Long, pdu: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(session: Long, vbl: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr(entity: Long, size: Int, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor(syntax: Int, descriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(entity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(pdu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(vbl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(session: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData(pdu: Long, pduType: Long, requestId: Long, errorStatus: Long, errorIndex: Long, varbindlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode(nretransmitmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry(hentity: Long, npolicyretry: Long, nactualretry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout(hentity: Long, npolicytimeout: Long, nactualtimeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode(ntranslatemode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb(vbl: Long, index: Int, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo(vendorinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpListen(hentity: Long, lstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(hentity: Long, lstatus: Int, nuseentityaddr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose(session: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl(session: Long, dwctlcode: Int, lpvinbuffer: Long, cbinbuffer: Int, lpvoutbuffer: Long, cboutbuffer: Int, lpcbbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap(enterprise: Long, ipaddress: Long, generictrap: Long, specifictrap: Long, timestamp: Long, variablebindings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx(enterprise: Long, agentaddress: Long, sourceaddress: Long, generictrap: Long, specifictrap: Long, community: Long, timestamp: Long, variablebindings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr(oid: Long, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen(lpagentaddress: Long, lpagentcommunity: Long, ntimeout: Int, nretries: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest(session: Long, requesttype: Byte, variablebindings: Long, errorstatus: Long, errorindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid(string: Long, oid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen(phtrapavailable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare(xoid: Long, yoid: Long, maxlen: Int, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy(srcoid: Long, dstoid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr(srcoid: Long, size: Int, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpOpen(hwnd: Long, wmsg: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: Long, state: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData(pdu: Long, pduType: Long, requestId: Long, nonRepeaters: Long, maxRepetitions: Long, varbindlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(hentity: Long, nport: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(nretransmitmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(hentity: Long, npolicyretry: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(hentity: Long, npolicytimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(ntranslatemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb(vbl: Long, index: Int, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpStartup(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext(session: Long, string: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity(session: Long, string: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid(string: Long, dstoid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(nloglevel: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(nlogtype: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy(panydst: Long, panysrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree(pany: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint(nloglevel: Int, szformat: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA(ids: Long, idlength: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc(nbytes: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree(pmem: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc(pmem: Long, nbytes: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp(poctets1: Long, poctets2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy(poctetsdst: Long, poctetssrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree(poctets: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp(poctets1: Long, poctets2: Long, nchars: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend(poiddst: Long, poidsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp(poid1: Long, poid2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy(poiddst: Long, poidsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree(poid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp(poid1: Long, poid2: Long, nsubids: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA(oid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny(pany: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid(oid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy(pvbdst: Long, pvbsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree(pvb: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy(pvbldst: Long, pvblsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree(pvbl: Long)
}

public actual fun snmpCancelMsg(session: Long, reqid: Int): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(session, reqid).toUInt()

public actual fun snmpCleanup(): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup().toUInt()

public actual fun snmpCleanupEx(): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx().toUInt()

public actual fun snmpClose(session: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpClose(session).toUInt()

public actual fun snmpContextToStr(context: Long, string: MutPtr<SmiOctets>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr(context, string.rawAddress).toUInt()

public actual fun snmpCountVbl(vbl: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(vbl).toUInt()

public actual fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(session, pduType.toInt(), requestId, errorStatus, errorIndex, varbindlist)

public actual fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: MutPtr<CVoid>): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession(hwnd.rawAddress, wmsg.toInt(), 0L, lpclientdata.rawAddress)

public actual fun snmpCreateVbl(session: Long, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl(session, name.rawAddress, value.rawAddress)

public actual fun snmpDecodeMsg(session: Long, srcentity: MutPtr<Long>, dstentity: MutPtr<Long>, context: MutPtr<Long>, pdu: MutPtr<Long>, msgbufdesc: MutPtr<SmiOctets>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg(session, srcentity.rawAddress, dstentity.rawAddress, context.rawAddress, pdu.rawAddress, msgbufdesc.rawAddress).toUInt()

public actual fun snmpDeleteVb(vbl: Long, index: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(vbl, index.toInt()).toUInt()

public actual fun snmpDuplicatePdu(session: Long, pdu: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(session, pdu)

public actual fun snmpDuplicateVbl(session: Long, vbl: Long): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(session, vbl)

public actual fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: MutPtr<SmiOctets>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg(session, srcentity, dstentity, context, pdu, msgbufdesc.rawAddress).toUInt()

public actual fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr(entity, size.toInt(), string.rawAddress).toUInt()

public actual fun snmpFreeContext(context: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(context).toUInt()

public actual fun snmpFreeDescriptor(syntax: UInt, descriptor: MutPtr<SmiOctets>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor(syntax.toInt(), descriptor.rawAddress).toUInt()

public actual fun snmpFreeEntity(entity: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(entity).toUInt()

public actual fun snmpFreePdu(pdu: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(pdu).toUInt()

public actual fun snmpFreeVbl(vbl: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(vbl).toUInt()

public actual fun snmpGetLastError(session: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(session).toUInt()

public actual fun snmpGetPduData(pdu: Long, pduType: MutPtr<SnmpPduType>, requestId: MutPtr<Int>, errorStatus: MutPtr<SnmpError>, errorIndex: MutPtr<Int>, varbindlist: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData(pdu, pduType.rawAddress, requestId.rawAddress, errorStatus.rawAddress, errorIndex.rawAddress, varbindlist.rawAddress).toUInt()

public actual fun snmpGetRetransmitMode(nretransmitmode: MutPtr<SnmpStatus>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode(nretransmitmode.rawAddress).toUInt()

public actual fun snmpGetRetry(hentity: Long, npolicyretry: MutPtr<UInt>, nactualretry: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry(hentity, npolicyretry.rawAddress, nactualretry.rawAddress).toUInt()

public actual fun snmpGetTimeout(hentity: Long, npolicytimeout: MutPtr<UInt>, nactualtimeout: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout(hentity, npolicytimeout.rawAddress, nactualtimeout.rawAddress).toUInt()

public actual fun snmpGetTranslateMode(ntranslatemode: MutPtr<SnmpApiTranslateMode>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode(ntranslatemode.rawAddress).toUInt()

public actual fun snmpGetVb(vbl: Long, index: UInt, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb(vbl, index.toInt(), name.rawAddress, value.rawAddress).toUInt()

public actual fun snmpGetVendorInfo(vendorinfo: MutPtr<SmiVendorinfo>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo(vendorinfo.rawAddress).toUInt()

public actual fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpListen(hentity, lstatus.toInt()).toUInt()

public actual fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(hentity, lstatus.toInt(), nuseentityaddr.toInt()).toUInt()

public actual fun snmpMgrClose(session: MutPtr<CVoid>): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose(session.rawAddress)

public actual fun snmpMgrCtl(session: MutPtr<CVoid>, dwctlcode: UInt, lpvinbuffer: MutPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl(session.rawAddress, dwctlcode.toInt(), lpvinbuffer.rawAddress, cbinbuffer.toInt(), lpvoutbuffer.rawAddress, cboutbuffer.toInt(), lpcbbytesreturned.rawAddress)

public actual fun snmpMgrGetTrap(enterprise: MutPtr<AsnObjectIdentifier>, ipaddress: MutPtr<AsnOctetString>, generictrap: MutPtr<SnmpGenerictrap>, specifictrap: MutPtr<Int>, timestamp: MutPtr<UInt>, variablebindings: MutPtr<SnmpVarBindList>): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap(enterprise.rawAddress, ipaddress.rawAddress, generictrap.rawAddress, specifictrap.rawAddress, timestamp.rawAddress, variablebindings.rawAddress)

public actual fun snmpMgrGetTrapEx(enterprise: MutPtr<AsnObjectIdentifier>, agentaddress: MutPtr<AsnOctetString>, sourceaddress: MutPtr<AsnOctetString>, generictrap: MutPtr<SnmpGenerictrap>, specifictrap: MutPtr<Int>, community: MutPtr<AsnOctetString>, timestamp: MutPtr<UInt>, variablebindings: MutPtr<SnmpVarBindList>): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx(enterprise.rawAddress, agentaddress.rawAddress, sourceaddress.rawAddress, generictrap.rawAddress, specifictrap.rawAddress, community.rawAddress, timestamp.rawAddress, variablebindings.rawAddress)

public actual fun snmpMgrOidToStr(oid: MutPtr<AsnObjectIdentifier>, string: MutPtr<Pstr>): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr(oid.rawAddress, string.rawAddress)

public actual fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): MutPtr<CVoid> =
    MutPtr(WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen(lpagentaddress.rawAddress, lpagentcommunity.rawAddress, ntimeout, nretries))

public actual fun snmpMgrRequest(session: MutPtr<CVoid>, requesttype: UByte, variablebindings: MutPtr<SnmpVarBindList>, errorstatus: MutPtr<SnmpErrorStatus>, errorindex: MutPtr<Int>): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest(session.rawAddress, requesttype.toByte(), variablebindings.rawAddress, errorstatus.rawAddress, errorindex.rawAddress)

public actual fun snmpMgrStrToOid(string: Pcstr, oid: MutPtr<AsnObjectIdentifier>): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid(string.rawAddress, oid.rawAddress)

public actual fun snmpMgrTrapListen(phtrapavailable: MutPtr<Handle>): Bool =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen(phtrapavailable.rawAddress)

public actual fun snmpOidCompare(xoid: MutPtr<SmiOid>, yoid: MutPtr<SmiOid>, maxlen: UInt, result: MutPtr<Int>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare(xoid.rawAddress, yoid.rawAddress, maxlen.toInt(), result.rawAddress).toUInt()

public actual fun snmpOidCopy(srcoid: MutPtr<SmiOid>, dstoid: MutPtr<SmiOid>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy(srcoid.rawAddress, dstoid.rawAddress).toUInt()

public actual fun snmpOidToStr(srcoid: ConstPtr<SmiOid>, size: UInt, string: Pstr): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr(srcoid.rawAddress, size.toInt(), string.rawAddress).toUInt()

public actual fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpOpen(hwnd.rawAddress, wmsg.toInt())

public actual fun snmpRecvMsg(session: Long, srcentity: MutPtr<Long>, dstentity: MutPtr<Long>, context: MutPtr<Long>, pdu: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg(session, srcentity.rawAddress, dstentity.rawAddress, context.rawAddress, pdu.rawAddress).toUInt()

public actual fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: MutPtr<SmiOid>, state: SnmpStatus): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpRegister(session, srcentity, dstentity, context, notification.rawAddress, state.toInt()).toUInt()

public actual fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(session, srcentity, dstentity, context, pdu).toUInt()

public actual fun snmpSetPduData(pdu: Long, pduType: ConstPtr<Int>, requestId: ConstPtr<Int>, nonRepeaters: ConstPtr<Int>, maxRepetitions: ConstPtr<Int>, varbindlist: ConstPtr<Long>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData(pdu, pduType.rawAddress, requestId.rawAddress, nonRepeaters.rawAddress, maxRepetitions.rawAddress, varbindlist.rawAddress).toUInt()

public actual fun snmpSetPort(hentity: Long, nport: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(hentity, nport.toInt()).toUInt()

public actual fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(nretransmitmode.toInt()).toUInt()

public actual fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(hentity, npolicyretry.toInt()).toUInt()

public actual fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(hentity, npolicytimeout.toInt()).toUInt()

public actual fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(ntranslatemode.toInt()).toUInt()

public actual fun snmpSetVb(vbl: Long, index: UInt, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb(vbl, index.toInt(), name.rawAddress, value.rawAddress).toUInt()

public actual fun snmpStartup(nmajorversion: MutPtr<UInt>, nminorversion: MutPtr<UInt>, nlevel: MutPtr<UInt>, ntranslatemode: MutPtr<SnmpApiTranslateMode>, nretransmitmode: MutPtr<SnmpStatus>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpStartup(nmajorversion.rawAddress, nminorversion.rawAddress, nlevel.rawAddress, ntranslatemode.rawAddress, nretransmitmode.rawAddress).toUInt()

public actual fun snmpStartupEx(nmajorversion: MutPtr<UInt>, nminorversion: MutPtr<UInt>, nlevel: MutPtr<UInt>, ntranslatemode: MutPtr<SnmpApiTranslateMode>, nretransmitmode: MutPtr<SnmpStatus>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx(nmajorversion.rawAddress, nminorversion.rawAddress, nlevel.rawAddress, ntranslatemode.rawAddress, nretransmitmode.rawAddress).toUInt()

public actual fun snmpStrToContext(session: Long, string: MutPtr<SmiOctets>): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext(session, string.rawAddress)

public actual fun snmpStrToEntity(session: Long, string: Pcstr): Long =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity(session, string.rawAddress)

public actual fun snmpStrToOid(string: Pcstr, dstoid: MutPtr<SmiOid>): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid(string.rawAddress, dstoid.rawAddress).toUInt()

public actual fun snmpSvcGetUptime(): UInt =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime().toUInt()

public actual fun snmpSvcSetLogLevel(nloglevel: SnmpLog) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(nloglevel)
}

public actual fun snmpSvcSetLogType(nlogtype: Int) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(nlogtype)
}

public actual fun snmpUtilAsnAnyCpy(panydst: MutPtr<AsnAny>, panysrc: MutPtr<AsnAny>): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy(panydst.rawAddress, panysrc.rawAddress)

public actual fun snmpUtilAsnAnyFree(pany: MutPtr<AsnAny>) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree(pany.rawAddress)
}

public actual fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint(nloglevel, szformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun snmpUtilIdsToA(ids: MutPtr<UInt>, idlength: UInt): Pstr =
    MutPtr(WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA(ids.rawAddress, idlength.toInt()))

public actual fun snmpUtilMemAlloc(nbytes: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc(nbytes.toInt()))

public actual fun snmpUtilMemFree(pmem: MutPtr<CVoid>) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree(pmem.rawAddress)
}

public actual fun snmpUtilMemReAlloc(pmem: MutPtr<CVoid>, nbytes: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc(pmem.rawAddress, nbytes.toInt()))

public actual fun snmpUtilOctetsCmp(poctets1: MutPtr<AsnOctetString>, poctets2: MutPtr<AsnOctetString>): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp(poctets1.rawAddress, poctets2.rawAddress)

public actual fun snmpUtilOctetsCpy(poctetsdst: MutPtr<AsnOctetString>, poctetssrc: MutPtr<AsnOctetString>): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy(poctetsdst.rawAddress, poctetssrc.rawAddress)

public actual fun snmpUtilOctetsFree(poctets: MutPtr<AsnOctetString>) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree(poctets.rawAddress)
}

public actual fun snmpUtilOctetsNCmp(poctets1: MutPtr<AsnOctetString>, poctets2: MutPtr<AsnOctetString>, nchars: UInt): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp(poctets1.rawAddress, poctets2.rawAddress, nchars.toInt())

public actual fun snmpUtilOidAppend(poiddst: MutPtr<AsnObjectIdentifier>, poidsrc: MutPtr<AsnObjectIdentifier>): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend(poiddst.rawAddress, poidsrc.rawAddress)

public actual fun snmpUtilOidCmp(poid1: MutPtr<AsnObjectIdentifier>, poid2: MutPtr<AsnObjectIdentifier>): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp(poid1.rawAddress, poid2.rawAddress)

public actual fun snmpUtilOidCpy(poiddst: MutPtr<AsnObjectIdentifier>, poidsrc: MutPtr<AsnObjectIdentifier>): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy(poiddst.rawAddress, poidsrc.rawAddress)

public actual fun snmpUtilOidFree(poid: MutPtr<AsnObjectIdentifier>) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree(poid.rawAddress)
}

public actual fun snmpUtilOidNCmp(poid1: MutPtr<AsnObjectIdentifier>, poid2: MutPtr<AsnObjectIdentifier>, nsubids: UInt): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp(poid1.rawAddress, poid2.rawAddress, nsubids.toInt())

public actual fun snmpUtilOidToA(oid: MutPtr<AsnObjectIdentifier>): Pstr =
    MutPtr(WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA(oid.rawAddress))

public actual fun snmpUtilPrintAsnAny(pany: MutPtr<AsnAny>) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny(pany.rawAddress)
}

public actual fun snmpUtilPrintOid(oid: MutPtr<AsnObjectIdentifier>) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid(oid.rawAddress)
}

public actual fun snmpUtilVarBindCpy(pvbdst: MutPtr<SnmpVarBind>, pvbsrc: MutPtr<SnmpVarBind>): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy(pvbdst.rawAddress, pvbsrc.rawAddress)

public actual fun snmpUtilVarBindFree(pvb: MutPtr<SnmpVarBind>) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree(pvb.rawAddress)
}

public actual fun snmpUtilVarBindListCpy(pvbldst: MutPtr<SnmpVarBindList>, pvblsrc: MutPtr<SnmpVarBindList>): Int =
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy(pvbldst.rawAddress, pvblsrc.rawAddress)

public actual fun snmpUtilVarBindListFree(pvbl: MutPtr<SnmpVarBindList>) {
    WindowsWin32NetworkmanagementSnmpJniBridge.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree(pvbl.rawAddress)
}
