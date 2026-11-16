@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val windowsWin32SystemMessagequeuingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName(lpwcsadspath.rawAddress.toString(), lpwcsformatname.rawAddress.toString(), lpdwformatnamelength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQBeginTransaction(pptransaction: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQBeginTransaction(pptransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCloseCursor(hcursor: Handle): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQCloseCursor(hcursor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCloseQueue(hqueue: Long): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQCloseQueue(hqueue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCreateCursor(hqueue: Long, phcursor: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQCreateCursor(hqueue.toString(), phcursor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: MutPtr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQCreateQueue(psecuritydescriptor.rawAddress.toString(), pqueueprops.rawAddress.toString(), lpwcsformatname.rawAddress.toString(), lpdwformatnamelength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQDeleteQueue(lpwcsformatname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQFreeMemory(pvmemory: ConstPtr) {
    if (windowsWin32SystemMessagequeuingNapiAddon != null) {
        windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQFreeMemory(pvmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mQFreeSecurityContext(hsecuritycontext: Handle) {
    if (windowsWin32SystemMessagequeuingNapiAddon != null) {
        windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext(hsecuritycontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: ConstPtr, pqmprops: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties(lpwcsmachinename.rawAddress.toString(), pguidmachineid.rawAddress.toString(), pqmprops.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetOverlappedResult(lpoverlapped: ConstPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult(lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation(lpwcscomputername.rawAddress.toString(), pprivateprops.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties(lpwcsformatname.rawAddress.toString(), pqueueprops.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity(lpwcsformatname.rawAddress.toString(), requestedinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetSecurityContext(lpcertbuffer: ConstPtr, dwcertbufferlength: UInt, phsecuritycontext: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext(lpcertbuffer.rawAddress.toString(), dwcertbufferlength.toInt(), phsecuritycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetSecurityContextEx(lpcertbuffer: ConstPtr, dwcertbufferlength: UInt, phsecuritycontext: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx(lpcertbuffer.rawAddress.toString(), dwcertbufferlength.toInt(), phsecuritycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName(hqueue.toString(), lpwcsformatname.rawAddress.toString(), lpdwformatnamelength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQInstanceToFormatName(pguid: ConstPtr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName(pguid.rawAddress.toString(), lpwcsformatname.rawAddress.toString(), lpdwformatnamelength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: ConstPtr, pcolumns: ConstPtr, psort: ConstPtr, phenum: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQLocateBegin(lpwcscontext.rawAddress.toString(), prestriction.rawAddress.toString(), pcolumns.rawAddress.toString(), psort.rawAddress.toString(), phenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQLocateEnd(henum: Handle): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQLocateEnd(henum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQLocateNext(henum: Handle, pcprops: MutPtr, apropvar: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQLocateNext(henum.rawAddress.toString(), pcprops.rawAddress.toString(), apropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected(hqueue.rawAddress.toString(), ulllookupid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQMgmtAction(pcomputername.rawAddress.toString(), pobjectname.rawAddress.toString(), paction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo(pcomputername.rawAddress.toString(), pobjectname.rawAddress.toString(), pmgmtprops.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQMoveMessage(hsourcequeue.toString(), hdestinationqueue.toString(), ulllookupid.toString(), ptransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQOpenQueue(lpwcsformatname.rawAddress.toString(), dwaccess.toInt(), dwsharemode.toInt(), phqueue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName(lpwcspathname.rawAddress.toString(), lpwcsformatname.rawAddress.toString(), lpdwformatnamelength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQPurgeQueue(hqueue: Long): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(hqueue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: MutPtr, lpoverlapped: MutPtr, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQReceiveMessage(hsource.toString(), dwtimeout.toInt(), dwaction.toInt(), pmessageprops.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), hcursor.rawAddress.toString(), ptransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: MutPtr, lpoverlapped: MutPtr, fnreceivecallback: Pmqreceivecallback, ptransaction: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId(hsource.toString(), ulllookupid.toString(), dwlookupaction.toInt(), pmessageprops.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), ptransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: ConstPtr, dwcertbufferlength: UInt): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate(dwflags.toInt(), lpcertbuffer.rawAddress.toString(), dwcertbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQSendMessage(hdestinationqueue: Long, pmessageprops: ConstPtr, ptransaction: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQSendMessage(hdestinationqueue.toString(), pmessageprops.rawAddress.toString(), ptransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties(lpwcsformatname.rawAddress.toString(), pqueueprops.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult =
    if (windowsWin32SystemMessagequeuingNapiAddon != null) (windowsWin32SystemMessagequeuingNapiAddon.windowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity(lpwcsformatname.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
