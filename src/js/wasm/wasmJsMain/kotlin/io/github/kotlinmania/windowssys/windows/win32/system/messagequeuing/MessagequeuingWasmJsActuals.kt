@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemMessagequeuingNapiAddon(): Boolean

private val windowsWin32SystemMessagequeuingNapiAvailable: Boolean = initWindowsWin32SystemMessagequeuingNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQBeginTransaction(p0)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQBeginTransaction(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQCloseCursor(p0)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQCloseCursor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQCloseQueue(p0)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQCloseQueue(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQCreateCursor(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQCreateCursor(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQCreateQueue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQCreateQueue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQDeleteQueue(p0)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQDeleteQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQFreeMemory(p0)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQFreeMemory(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult(p0)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQLocateBegin(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQLocateBegin(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQLocateEnd(p0)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQLocateEnd(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQLocateNext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQLocateNext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQMgmtAction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQMgmtAction(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQMoveMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQMoveMessage(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQOpenQueue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQOpenQueue(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(p0)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQReceiveMessage(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQReceiveMessage(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQSendMessage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQSendMessage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity(p0: String, p1: Int, p2: String): Int

public actual fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName(lpwcsadspath.rawAddress.toString(), lpwcsformatname.rawAddress.toString(), lpdwformatnamelength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQBeginTransaction(pptransaction: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQBeginTransaction(pptransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCloseCursor(hcursor: Handle): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQCloseCursor(hcursor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCloseQueue(hqueue: Long): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQCloseQueue(hqueue.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCreateCursor(hqueue: Long, phcursor: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQCreateCursor(hqueue.toString(), phcursor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: MutPtr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQCreateQueue(psecuritydescriptor.rawAddress.toString(), pqueueprops.rawAddress.toString(), lpwcsformatname.rawAddress.toString(), lpdwformatnamelength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQDeleteQueue(lpwcsformatname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQFreeMemory(pvmemory: ConstPtr) {
    if (windowsWin32SystemMessagequeuingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemMessagequeuingMQFreeMemory(pvmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mQFreeSecurityContext(hsecuritycontext: Handle) {
    if (windowsWin32SystemMessagequeuingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext(hsecuritycontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: ConstPtr, pqmprops: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties(lpwcsmachinename.rawAddress.toString(), pguidmachineid.rawAddress.toString(), pqmprops.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetOverlappedResult(lpoverlapped: ConstPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult(lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation(lpwcscomputername.rawAddress.toString(), pprivateprops.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties(lpwcsformatname.rawAddress.toString(), pqueueprops.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity(lpwcsformatname.rawAddress.toString(), requestedinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetSecurityContext(lpcertbuffer: ConstPtr, dwcertbufferlength: UInt, phsecuritycontext: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext(lpcertbuffer.rawAddress.toString(), dwcertbufferlength.toInt(), phsecuritycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetSecurityContextEx(lpcertbuffer: ConstPtr, dwcertbufferlength: UInt, phsecuritycontext: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx(lpcertbuffer.rawAddress.toString(), dwcertbufferlength.toInt(), phsecuritycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName(hqueue.toString(), lpwcsformatname.rawAddress.toString(), lpdwformatnamelength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQInstanceToFormatName(pguid: ConstPtr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName(pguid.rawAddress.toString(), lpwcsformatname.rawAddress.toString(), lpdwformatnamelength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: ConstPtr, pcolumns: ConstPtr, psort: ConstPtr, phenum: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQLocateBegin(lpwcscontext.rawAddress.toString(), prestriction.rawAddress.toString(), pcolumns.rawAddress.toString(), psort.rawAddress.toString(), phenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQLocateEnd(henum: Handle): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQLocateEnd(henum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQLocateNext(henum: Handle, pcprops: MutPtr, apropvar: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQLocateNext(henum.rawAddress.toString(), pcprops.rawAddress.toString(), apropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected(hqueue.rawAddress.toString(), ulllookupid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQMgmtAction(pcomputername.rawAddress.toString(), pobjectname.rawAddress.toString(), paction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo(pcomputername.rawAddress.toString(), pobjectname.rawAddress.toString(), pmgmtprops.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQMoveMessage(hsourcequeue.toString(), hdestinationqueue.toString(), ulllookupid.toString(), ptransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQOpenQueue(lpwcsformatname.rawAddress.toString(), dwaccess.toInt(), dwsharemode.toInt(), phqueue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName(lpwcspathname.rawAddress.toString(), lpwcsformatname.rawAddress.toString(), lpdwformatnamelength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQPurgeQueue(hqueue: Long): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(hqueue.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: MutPtr, lpoverlapped: MutPtr, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQReceiveMessage(hsource.toString(), dwtimeout.toInt(), dwaction.toInt(), pmessageprops.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), hcursor.rawAddress.toString(), ptransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: MutPtr, lpoverlapped: MutPtr, fnreceivecallback: Pmqreceivecallback, ptransaction: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId(hsource.toString(), ulllookupid.toString(), dwlookupaction.toInt(), pmessageprops.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), ptransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: ConstPtr, dwcertbufferlength: UInt): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate(dwflags.toInt(), lpcertbuffer.rawAddress.toString(), dwcertbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQSendMessage(hdestinationqueue: Long, pmessageprops: ConstPtr, ptransaction: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQSendMessage(hdestinationqueue.toString(), pmessageprops.rawAddress.toString(), ptransaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties(lpwcsformatname.rawAddress.toString(), pqueueprops.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAvailable) wasmWindowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity(lpwcsformatname.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
