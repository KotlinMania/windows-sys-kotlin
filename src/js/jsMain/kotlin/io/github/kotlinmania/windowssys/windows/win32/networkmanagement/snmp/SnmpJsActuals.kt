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

private val windowsWin32NetworkmanagementSnmpNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun snmpCancelMsg(session: Long, reqid: Int): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(session.toString(), reqid) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCleanup(): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCleanupEx(): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpClose(session: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpClose(session.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpContextToStr(context: Long, string: MutPtr<SmiOctets>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr(context.toString(), string.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCountVbl(vbl: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(vbl.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(session.toString(), pduType.toInt(), requestId, errorStatus, errorIndex, varbindlist.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: MutPtr<CVoid>): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession(hwnd.rawAddress.toString(), wmsg.toInt(), 0L.toString(), lpclientdata.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpCreateVbl(session: Long, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl(session.toString(), name.rawAddress.toString(), value.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDecodeMsg(session: Long, srcentity: MutPtr<Long>, dstentity: MutPtr<Long>, context: MutPtr<Long>, pdu: MutPtr<Long>, msgbufdesc: MutPtr<SmiOctets>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg(session.toString(), srcentity.rawAddress.toString(), dstentity.rawAddress.toString(), context.rawAddress.toString(), pdu.rawAddress.toString(), msgbufdesc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDeleteVb(vbl: Long, index: UInt): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(vbl.toString(), index.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDuplicatePdu(session: Long, pdu: Long): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(session.toString(), pdu.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpDuplicateVbl(session: Long, vbl: Long): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(session.toString(), vbl.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: MutPtr<SmiOctets>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), pdu.toString(), msgbufdesc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr(entity.toString(), size.toInt(), string.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeContext(context: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(context.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeDescriptor(syntax: UInt, descriptor: MutPtr<SmiOctets>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor(syntax.toInt(), descriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeEntity(entity: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(entity.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreePdu(pdu: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(pdu.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpFreeVbl(vbl: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(vbl.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetLastError(session: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(session.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetPduData(pdu: Long, pduType: MutPtr<SnmpPduType>, requestId: MutPtr<Int>, errorStatus: MutPtr<SnmpError>, errorIndex: MutPtr<Int>, varbindlist: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData(pdu.toString(), pduType.rawAddress.toString(), requestId.rawAddress.toString(), errorStatus.rawAddress.toString(), errorIndex.rawAddress.toString(), varbindlist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetRetransmitMode(nretransmitmode: MutPtr<SnmpStatus>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode(nretransmitmode.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetRetry(hentity: Long, npolicyretry: MutPtr<UInt>, nactualretry: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry(hentity.toString(), npolicyretry.rawAddress.toString(), nactualretry.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetTimeout(hentity: Long, npolicytimeout: MutPtr<UInt>, nactualtimeout: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout(hentity.toString(), npolicytimeout.rawAddress.toString(), nactualtimeout.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetTranslateMode(ntranslatemode: MutPtr<SnmpApiTranslateMode>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode(ntranslatemode.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetVb(vbl: Long, index: UInt, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb(vbl.toString(), index.toInt(), name.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpGetVendorInfo(vendorinfo: MutPtr<SmiVendorinfo>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo(vendorinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpListen(hentity.toString(), lstatus.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(hentity.toString(), lstatus.toInt(), nuseentityaddr.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrClose(session: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose(session.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrCtl(session: MutPtr<CVoid>, dwctlcode: UInt, lpvinbuffer: MutPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl(session.rawAddress.toString(), dwctlcode.toInt(), lpvinbuffer.rawAddress.toString(), cbinbuffer.toInt(), lpvoutbuffer.rawAddress.toString(), cboutbuffer.toInt(), lpcbbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrGetTrap(enterprise: MutPtr<AsnObjectIdentifier>, ipaddress: MutPtr<AsnOctetString>, generictrap: MutPtr<SnmpGenerictrap>, specifictrap: MutPtr<Int>, timestamp: MutPtr<UInt>, variablebindings: MutPtr<SnmpVarBindList>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap(enterprise.rawAddress.toString(), ipaddress.rawAddress.toString(), generictrap.rawAddress.toString(), specifictrap.rawAddress.toString(), timestamp.rawAddress.toString(), variablebindings.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrGetTrapEx(enterprise: MutPtr<AsnObjectIdentifier>, agentaddress: MutPtr<AsnOctetString>, sourceaddress: MutPtr<AsnOctetString>, generictrap: MutPtr<SnmpGenerictrap>, specifictrap: MutPtr<Int>, community: MutPtr<AsnOctetString>, timestamp: MutPtr<UInt>, variablebindings: MutPtr<SnmpVarBindList>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx(enterprise.rawAddress.toString(), agentaddress.rawAddress.toString(), sourceaddress.rawAddress.toString(), generictrap.rawAddress.toString(), specifictrap.rawAddress.toString(), community.rawAddress.toString(), timestamp.rawAddress.toString(), variablebindings.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrOidToStr(oid: MutPtr<AsnObjectIdentifier>, string: MutPtr<Pstr>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr(oid.rawAddress.toString(), string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): MutPtr<CVoid> =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) MutPtr((windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen(lpagentaddress.rawAddress.toString(), lpagentcommunity.rawAddress.toString(), ntimeout, nretries) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrRequest(session: MutPtr<CVoid>, requesttype: UByte, variablebindings: MutPtr<SnmpVarBindList>, errorstatus: MutPtr<SnmpErrorStatus>, errorindex: MutPtr<Int>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest(session.rawAddress.toString(), requesttype.toInt(), variablebindings.rawAddress.toString(), errorstatus.rawAddress.toString(), errorindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrStrToOid(string: Pcstr, oid: MutPtr<AsnObjectIdentifier>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid(string.rawAddress.toString(), oid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpMgrTrapListen(phtrapavailable: MutPtr<Handle>): Bool =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen(phtrapavailable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOidCompare(xoid: MutPtr<SmiOid>, yoid: MutPtr<SmiOid>, maxlen: UInt, result: MutPtr<Int>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare(xoid.rawAddress.toString(), yoid.rawAddress.toString(), maxlen.toInt(), result.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOidCopy(srcoid: MutPtr<SmiOid>, dstoid: MutPtr<SmiOid>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy(srcoid.rawAddress.toString(), dstoid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOidToStr(srcoid: ConstPtr<SmiOid>, size: UInt, string: Pstr): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr(srcoid.rawAddress.toString(), size.toInt(), string.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpOpen(hwnd.rawAddress.toString(), wmsg.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpRecvMsg(session: Long, srcentity: MutPtr<Long>, dstentity: MutPtr<Long>, context: MutPtr<Long>, pdu: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg(session.toString(), srcentity.rawAddress.toString(), dstentity.rawAddress.toString(), context.rawAddress.toString(), pdu.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: MutPtr<SmiOid>, state: SnmpStatus): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpRegister(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), notification.rawAddress.toString(), state.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(session.toString(), srcentity.toString(), dstentity.toString(), context.toString(), pdu.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetPduData(pdu: Long, pduType: ConstPtr<Int>, requestId: ConstPtr<Int>, nonRepeaters: ConstPtr<Int>, maxRepetitions: ConstPtr<Int>, varbindlist: ConstPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData(pdu.toString(), pduType.rawAddress.toString(), requestId.rawAddress.toString(), nonRepeaters.rawAddress.toString(), maxRepetitions.rawAddress.toString(), varbindlist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetPort(hentity: Long, nport: UInt): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(hentity.toString(), nport.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(nretransmitmode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(hentity.toString(), npolicyretry.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(hentity.toString(), npolicytimeout.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(ntranslatemode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSetVb(vbl: Long, index: UInt, name: MutPtr<SmiOid>, value: MutPtr<SmiValue>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb(vbl.toString(), index.toInt(), name.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStartup(nmajorversion: MutPtr<UInt>, nminorversion: MutPtr<UInt>, nlevel: MutPtr<UInt>, ntranslatemode: MutPtr<SnmpApiTranslateMode>, nretransmitmode: MutPtr<SnmpStatus>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpStartup(nmajorversion.rawAddress.toString(), nminorversion.rawAddress.toString(), nlevel.rawAddress.toString(), ntranslatemode.rawAddress.toString(), nretransmitmode.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStartupEx(nmajorversion: MutPtr<UInt>, nminorversion: MutPtr<UInt>, nlevel: MutPtr<UInt>, ntranslatemode: MutPtr<SnmpApiTranslateMode>, nretransmitmode: MutPtr<SnmpStatus>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx(nmajorversion.rawAddress.toString(), nminorversion.rawAddress.toString(), nlevel.rawAddress.toString(), ntranslatemode.rawAddress.toString(), nretransmitmode.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStrToContext(session: Long, string: MutPtr<SmiOctets>): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext(session.toString(), string.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStrToEntity(session: Long, string: Pcstr): Long =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity(session.toString(), string.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpStrToOid(string: Pcstr, dstoid: MutPtr<SmiOid>): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid(string.rawAddress.toString(), dstoid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSvcGetUptime(): UInt =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpSvcSetLogLevel(nloglevel: SnmpLog) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(nloglevel)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpSvcSetLogType(nlogtype: Int) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(nlogtype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilAsnAnyCpy(panydst: MutPtr<AsnAny>, panysrc: MutPtr<AsnAny>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy(panydst.rawAddress.toString(), panysrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilAsnAnyFree(pany: MutPtr<AsnAny>) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree(pany.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint(nloglevel, szformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilIdsToA(ids: MutPtr<UInt>, idlength: UInt): Pstr =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) MutPtr((windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA(ids.rawAddress.toString(), idlength.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilMemAlloc(nbytes: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) MutPtr((windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc(nbytes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilMemFree(pmem: MutPtr<CVoid>) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree(pmem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilMemReAlloc(pmem: MutPtr<CVoid>, nbytes: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) MutPtr((windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc(pmem.rawAddress.toString(), nbytes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOctetsCmp(poctets1: MutPtr<AsnOctetString>, poctets2: MutPtr<AsnOctetString>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp(poctets1.rawAddress.toString(), poctets2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOctetsCpy(poctetsdst: MutPtr<AsnOctetString>, poctetssrc: MutPtr<AsnOctetString>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy(poctetsdst.rawAddress.toString(), poctetssrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOctetsFree(poctets: MutPtr<AsnOctetString>) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree(poctets.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilOctetsNCmp(poctets1: MutPtr<AsnOctetString>, poctets2: MutPtr<AsnOctetString>, nchars: UInt): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp(poctets1.rawAddress.toString(), poctets2.rawAddress.toString(), nchars.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidAppend(poiddst: MutPtr<AsnObjectIdentifier>, poidsrc: MutPtr<AsnObjectIdentifier>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend(poiddst.rawAddress.toString(), poidsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidCmp(poid1: MutPtr<AsnObjectIdentifier>, poid2: MutPtr<AsnObjectIdentifier>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp(poid1.rawAddress.toString(), poid2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidCpy(poiddst: MutPtr<AsnObjectIdentifier>, poidsrc: MutPtr<AsnObjectIdentifier>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy(poiddst.rawAddress.toString(), poidsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidFree(poid: MutPtr<AsnObjectIdentifier>) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree(poid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilOidNCmp(poid1: MutPtr<AsnObjectIdentifier>, poid2: MutPtr<AsnObjectIdentifier>, nsubids: UInt): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp(poid1.rawAddress.toString(), poid2.rawAddress.toString(), nsubids.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilOidToA(oid: MutPtr<AsnObjectIdentifier>): Pstr =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) MutPtr((windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA(oid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilPrintAsnAny(pany: MutPtr<AsnAny>) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny(pany.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilPrintOid(oid: MutPtr<AsnObjectIdentifier>) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid(oid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilVarBindCpy(pvbdst: MutPtr<SnmpVarBind>, pvbsrc: MutPtr<SnmpVarBind>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy(pvbdst.rawAddress.toString(), pvbsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilVarBindFree(pvb: MutPtr<SnmpVarBind>) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree(pvb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snmpUtilVarBindListCpy(pvbldst: MutPtr<SnmpVarBindList>, pvblsrc: MutPtr<SnmpVarBindList>): Int =
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) (windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy(pvbldst.rawAddress.toString(), pvblsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snmpUtilVarBindListFree(pvbl: MutPtr<SnmpVarBindList>) {
    if (windowsWin32NetworkmanagementSnmpNapiAddon != null) {
        windowsWin32NetworkmanagementSnmpNapiAddon.windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree(pvbl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
