@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpClose
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpListen
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpOpen
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpRegister
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpStartup
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun snmpCancelMsg(session: Long, reqid: Int): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(session, reqid)

public actual fun snmpCleanup(): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup()

public actual fun snmpCleanupEx(): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx()

public actual fun snmpClose(session: Long): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpClose(session)

public actual fun snmpContextToStr(context: Long, string: MutPtr<SmiOctets>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr(context, string.rawAddress.toCPointer<ByteVar>())

public actual fun snmpCountVbl(vbl: Long): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(vbl)

public actual fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(session, pduType, requestId, errorStatus, errorIndex, varbindlist)

public actual fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: MutPtr<CVoid>): Long =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession(hwnd.rawAddress.toCPointer<ByteVar>(), wmsg, 0L.toCPointer<ByteVar>(), lpclientdata.rawAddress.toCPointer<ByteVar>())

public actual fun snmpCreateVbl(session: Long, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): Long =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl(session, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun snmpDecodeMsg(session: Long, srcentity: MutPtr<Long>, dstentity: MutPtr<Long>, context: MutPtr<Long>, pdu: MutPtr<Long>, msgbufdesc: MutPtr<SmiOctets>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg(session, srcentity.rawAddress.toCPointer<ByteVar>(), dstentity.rawAddress.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), pdu.rawAddress.toCPointer<ByteVar>(), msgbufdesc.rawAddress.toCPointer<ByteVar>())

public actual fun snmpDeleteVb(vbl: Long, index: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(vbl, index)

public actual fun snmpDuplicatePdu(session: Long, pdu: Long): Long =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(session, pdu)

public actual fun snmpDuplicateVbl(session: Long, vbl: Long): Long =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(session, vbl)

public actual fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: MutPtr<SmiOctets>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg(session, srcentity, dstentity, context, pdu, msgbufdesc.rawAddress.toCPointer<ByteVar>())

public actual fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr(entity, size, string.rawAddress.toCPointer<ByteVar>())

public actual fun snmpFreeContext(context: Long): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(context)

public actual fun snmpFreeDescriptor(syntax: UInt, descriptor: MutPtr<SmiOctets>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor(syntax, descriptor.rawAddress.toCPointer<ByteVar>())

public actual fun snmpFreeEntity(entity: Long): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(entity)

public actual fun snmpFreePdu(pdu: Long): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(pdu)

public actual fun snmpFreeVbl(vbl: Long): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(vbl)

public actual fun snmpGetLastError(session: Long): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(session)

public actual fun snmpGetPduData(pdu: Long, pduType: MutPtr<SnmpPduType>, requestId: MutPtr<Int>, errorStatus: MutPtr<SnmpError>, errorIndex: MutPtr<Int>, varbindlist: MutPtr<Long>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData(pdu, pduType.rawAddress.toCPointer<ByteVar>(), requestId.rawAddress.toCPointer<ByteVar>(), errorStatus.rawAddress.toCPointer<ByteVar>(), errorIndex.rawAddress.toCPointer<ByteVar>(), varbindlist.rawAddress.toCPointer<ByteVar>())

public actual fun snmpGetRetransmitMode(nretransmitmode: MutPtr<SnmpStatus>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode(nretransmitmode.rawAddress.toCPointer<ByteVar>())

public actual fun snmpGetRetry(hentity: Long, npolicyretry: MutPtr<UInt>, nactualretry: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry(hentity, npolicyretry.rawAddress.toCPointer<ByteVar>(), nactualretry.rawAddress.toCPointer<ByteVar>())

public actual fun snmpGetTimeout(hentity: Long, npolicytimeout: MutPtr<UInt>, nactualtimeout: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout(hentity, npolicytimeout.rawAddress.toCPointer<ByteVar>(), nactualtimeout.rawAddress.toCPointer<ByteVar>())

public actual fun snmpGetTranslateMode(ntranslatemode: MutPtr<SnmpApiTranslateMode>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode(ntranslatemode.rawAddress.toCPointer<ByteVar>())

public actual fun snmpGetVb(vbl: Long, index: UInt, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb(vbl, index, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun snmpGetVendorInfo(vendorinfo: MutPtr<SmiVendorinfo>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo(vendorinfo.rawAddress.toCPointer<ByteVar>())

public actual fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpListen(hentity, lstatus)

public actual fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(hentity, lstatus, nuseentityaddr)

public actual fun snmpMgrClose(session: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose(session.rawAddress.toCPointer<ByteVar>())

public actual fun snmpMgrCtl(session: MutPtr<CVoid>, dwctlcode: UInt, lpvinbuffer: MutPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl(session.rawAddress.toCPointer<ByteVar>(), dwctlcode, lpvinbuffer.rawAddress.toCPointer<ByteVar>(), cbinbuffer, lpvoutbuffer.rawAddress.toCPointer<ByteVar>(), cboutbuffer, lpcbbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun snmpMgrGetTrap(enterprise: MutPtr<AsnObjectIdentifier>, ipaddress: MutPtr<AsnOctetString>, generictrap: MutPtr<SnmpGenerictrap>, specifictrap: MutPtr<Int>, timestamp: MutPtr<UInt>, variablebindings: MutPtr<SnmpVarBindList>): Bool =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap(enterprise.rawAddress.toCPointer<ByteVar>(), ipaddress.rawAddress.toCPointer<ByteVar>(), generictrap.rawAddress.toCPointer<ByteVar>(), specifictrap.rawAddress.toCPointer<ByteVar>(), timestamp.rawAddress.toCPointer<ByteVar>(), variablebindings.rawAddress.toCPointer<ByteVar>())

public actual fun snmpMgrGetTrapEx(enterprise: MutPtr<AsnObjectIdentifier>, agentaddress: MutPtr<AsnOctetString>, sourceaddress: MutPtr<AsnOctetString>, generictrap: MutPtr<SnmpGenerictrap>, specifictrap: MutPtr<Int>, community: MutPtr<AsnOctetString>, timestamp: MutPtr<UInt>, variablebindings: MutPtr<SnmpVarBindList>): Bool =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx(enterprise.rawAddress.toCPointer<ByteVar>(), agentaddress.rawAddress.toCPointer<ByteVar>(), sourceaddress.rawAddress.toCPointer<ByteVar>(), generictrap.rawAddress.toCPointer<ByteVar>(), specifictrap.rawAddress.toCPointer<ByteVar>(), community.rawAddress.toCPointer<ByteVar>(), timestamp.rawAddress.toCPointer<ByteVar>(), variablebindings.rawAddress.toCPointer<ByteVar>())

public actual fun snmpMgrOidToStr(oid: MutPtr<AsnObjectIdentifier>, string: MutPtr<Pstr>): Bool =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr(oid.rawAddress.toCPointer<ByteVar>(), string.rawAddress.toCPointer<ByteVar>())

public actual fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen(lpagentaddress.rawAddress.toCPointer<ByteVar>(), lpagentcommunity.rawAddress.toCPointer<ByteVar>(), ntimeout, nretries)?.toLong() ?: 0L)

public actual fun snmpMgrRequest(session: MutPtr<CVoid>, requesttype: UByte, variablebindings: MutPtr<SnmpVarBindList>, errorstatus: MutPtr<SnmpErrorStatus>, errorindex: MutPtr<Int>): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest(session.rawAddress.toCPointer<ByteVar>(), requesttype, variablebindings.rawAddress.toCPointer<ByteVar>(), errorstatus.rawAddress.toCPointer<ByteVar>(), errorindex.rawAddress.toCPointer<ByteVar>())

public actual fun snmpMgrStrToOid(string: Pcstr, oid: MutPtr<AsnObjectIdentifier>): Bool =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid(string.rawAddress.toCPointer<ByteVar>(), oid.rawAddress.toCPointer<ByteVar>())

public actual fun snmpMgrTrapListen(phtrapavailable: MutPtr<Handle>): Bool =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen(phtrapavailable.rawAddress.toCPointer<ByteVar>())

public actual fun snmpOidCompare(xoid: MutPtr<SmiOid>, yoid: MutPtr<SmiOid>, maxlen: UInt, result: MutPtr<Int>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare(xoid.rawAddress.toCPointer<ByteVar>(), yoid.rawAddress.toCPointer<ByteVar>(), maxlen, result.rawAddress.toCPointer<ByteVar>())

public actual fun snmpOidCopy(srcoid: MutPtr<SmiOid>, dstoid: MutPtr<SmiOid>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy(srcoid.rawAddress.toCPointer<ByteVar>(), dstoid.rawAddress.toCPointer<ByteVar>())

public actual fun snmpOidToStr(srcoid: ConstPtr<SmiOid>, size: UInt, string: Pstr): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr(srcoid.rawAddress.toCPointer<ByteVar>(), size, string.rawAddress.toCPointer<ByteVar>())

public actual fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpOpen(hwnd.rawAddress.toCPointer<ByteVar>(), wmsg)

public actual fun snmpRecvMsg(session: Long, srcentity: MutPtr<Long>, dstentity: MutPtr<Long>, context: MutPtr<Long>, pdu: MutPtr<Long>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg(session, srcentity.rawAddress.toCPointer<ByteVar>(), dstentity.rawAddress.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), pdu.rawAddress.toCPointer<ByteVar>())

public actual fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: MutPtr<SmiOid>, state: SnmpStatus): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpRegister(session, srcentity, dstentity, context, notification.rawAddress.toCPointer<ByteVar>(), state)

public actual fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(session, srcentity, dstentity, context, pdu)

public actual fun snmpSetPduData(pdu: Long, pduType: ConstPtr<Int>, requestId: ConstPtr<Int>, nonRepeaters: ConstPtr<Int>, maxRepetitions: ConstPtr<Int>, varbindlist: ConstPtr<Long>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData(pdu, pduType.rawAddress.toCPointer<ByteVar>(), requestId.rawAddress.toCPointer<ByteVar>(), nonRepeaters.rawAddress.toCPointer<ByteVar>(), maxRepetitions.rawAddress.toCPointer<ByteVar>(), varbindlist.rawAddress.toCPointer<ByteVar>())

public actual fun snmpSetPort(hentity: Long, nport: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(hentity, nport)

public actual fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(nretransmitmode)

public actual fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(hentity, npolicyretry)

public actual fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(hentity, npolicytimeout)

public actual fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(ntranslatemode)

public actual fun snmpSetVb(vbl: Long, index: UInt, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb(vbl, index, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun snmpStartup(nmajorversion: MutPtr<UInt>, nminorversion: MutPtr<UInt>, nlevel: MutPtr<UInt>, ntranslatemode: MutPtr<SnmpApiTranslateMode>, nretransmitmode: MutPtr<SnmpStatus>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpStartup(nmajorversion.rawAddress.toCPointer<ByteVar>(), nminorversion.rawAddress.toCPointer<ByteVar>(), nlevel.rawAddress.toCPointer<ByteVar>(), ntranslatemode.rawAddress.toCPointer<ByteVar>(), nretransmitmode.rawAddress.toCPointer<ByteVar>())

public actual fun snmpStartupEx(nmajorversion: MutPtr<UInt>, nminorversion: MutPtr<UInt>, nlevel: MutPtr<UInt>, ntranslatemode: MutPtr<SnmpApiTranslateMode>, nretransmitmode: MutPtr<SnmpStatus>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx(nmajorversion.rawAddress.toCPointer<ByteVar>(), nminorversion.rawAddress.toCPointer<ByteVar>(), nlevel.rawAddress.toCPointer<ByteVar>(), ntranslatemode.rawAddress.toCPointer<ByteVar>(), nretransmitmode.rawAddress.toCPointer<ByteVar>())

public actual fun snmpStrToContext(session: Long, string: MutPtr<SmiOctets>): Long =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext(session, string.rawAddress.toCPointer<ByteVar>())

public actual fun snmpStrToEntity(session: Long, string: Pcstr): Long =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity(session, string.rawAddress.toCPointer<ByteVar>())

public actual fun snmpStrToOid(string: Pcstr, dstoid: MutPtr<SmiOid>): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid(string.rawAddress.toCPointer<ByteVar>(), dstoid.rawAddress.toCPointer<ByteVar>())

public actual fun snmpSvcGetUptime(): UInt =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime()

public actual fun snmpSvcSetLogLevel(nloglevel: SnmpLog) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(nloglevel)
}

public actual fun snmpSvcSetLogType(nlogtype: Int) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(nlogtype)
}

public actual fun snmpUtilAsnAnyCpy(panydst: MutPtr<AsnAny>, panysrc: MutPtr<AsnAny>): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy(panydst.rawAddress.toCPointer<ByteVar>(), panysrc.rawAddress.toCPointer<ByteVar>())

public actual fun snmpUtilAsnAnyFree(pany: MutPtr<AsnAny>) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree(pany.rawAddress.toCPointer<ByteVar>())
}

public actual fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint(nloglevel, szformat.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun snmpUtilIdsToA(ids: MutPtr<UInt>, idlength: UInt): Pstr =
    MutPtr(windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA(ids.rawAddress.toCPointer<ByteVar>(), idlength)?.toLong() ?: 0L)

public actual fun snmpUtilMemAlloc(nbytes: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc(nbytes)?.toLong() ?: 0L)

public actual fun snmpUtilMemFree(pmem: MutPtr<CVoid>) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree(pmem.rawAddress.toCPointer<ByteVar>())
}

public actual fun snmpUtilMemReAlloc(pmem: MutPtr<CVoid>, nbytes: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc(pmem.rawAddress.toCPointer<ByteVar>(), nbytes)?.toLong() ?: 0L)

public actual fun snmpUtilOctetsCmp(poctets1: MutPtr<AsnOctetString>, poctets2: MutPtr<AsnOctetString>): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp(poctets1.rawAddress.toCPointer<ByteVar>(), poctets2.rawAddress.toCPointer<ByteVar>())

public actual fun snmpUtilOctetsCpy(poctetsdst: MutPtr<AsnOctetString>, poctetssrc: MutPtr<AsnOctetString>): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy(poctetsdst.rawAddress.toCPointer<ByteVar>(), poctetssrc.rawAddress.toCPointer<ByteVar>())

public actual fun snmpUtilOctetsFree(poctets: MutPtr<AsnOctetString>) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree(poctets.rawAddress.toCPointer<ByteVar>())
}

public actual fun snmpUtilOctetsNCmp(poctets1: MutPtr<AsnOctetString>, poctets2: MutPtr<AsnOctetString>, nchars: UInt): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp(poctets1.rawAddress.toCPointer<ByteVar>(), poctets2.rawAddress.toCPointer<ByteVar>(), nchars)

public actual fun snmpUtilOidAppend(poiddst: MutPtr<AsnObjectIdentifier>, poidsrc: MutPtr<AsnObjectIdentifier>): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend(poiddst.rawAddress.toCPointer<ByteVar>(), poidsrc.rawAddress.toCPointer<ByteVar>())

public actual fun snmpUtilOidCmp(poid1: MutPtr<AsnObjectIdentifier>, poid2: MutPtr<AsnObjectIdentifier>): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp(poid1.rawAddress.toCPointer<ByteVar>(), poid2.rawAddress.toCPointer<ByteVar>())

public actual fun snmpUtilOidCpy(poiddst: MutPtr<AsnObjectIdentifier>, poidsrc: MutPtr<AsnObjectIdentifier>): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy(poiddst.rawAddress.toCPointer<ByteVar>(), poidsrc.rawAddress.toCPointer<ByteVar>())

public actual fun snmpUtilOidFree(poid: MutPtr<AsnObjectIdentifier>) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree(poid.rawAddress.toCPointer<ByteVar>())
}

public actual fun snmpUtilOidNCmp(poid1: MutPtr<AsnObjectIdentifier>, poid2: MutPtr<AsnObjectIdentifier>, nsubids: UInt): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp(poid1.rawAddress.toCPointer<ByteVar>(), poid2.rawAddress.toCPointer<ByteVar>(), nsubids)

public actual fun snmpUtilOidToA(oid: MutPtr<AsnObjectIdentifier>): Pstr =
    MutPtr(windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA(oid.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun snmpUtilPrintAsnAny(pany: MutPtr<AsnAny>) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny(pany.rawAddress.toCPointer<ByteVar>())
}

public actual fun snmpUtilPrintOid(oid: MutPtr<AsnObjectIdentifier>) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid(oid.rawAddress.toCPointer<ByteVar>())
}

public actual fun snmpUtilVarBindCpy(pvbdst: MutPtr<SnmpVarBind>, pvbsrc: MutPtr<SnmpVarBind>): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy(pvbdst.rawAddress.toCPointer<ByteVar>(), pvbsrc.rawAddress.toCPointer<ByteVar>())

public actual fun snmpUtilVarBindFree(pvb: MutPtr<SnmpVarBind>) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree(pvb.rawAddress.toCPointer<ByteVar>())
}

public actual fun snmpUtilVarBindListCpy(pvbldst: MutPtr<SnmpVarBindList>, pvblsrc: MutPtr<SnmpVarBindList>): Int =
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy(pvbldst.rawAddress.toCPointer<ByteVar>(), pvblsrc.rawAddress.toCPointer<ByteVar>())

public actual fun snmpUtilVarBindListFree(pvbl: MutPtr<SnmpVarBindList>) {
    windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree(pvbl.rawAddress.toCPointer<ByteVar>())
}
