@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverFsNotification
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KspinLockQueueNumber
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkthread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PnotifySync
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PobjectType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Prkprocess
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.AuditEventType
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityImpersonationLevel
import io.github.kotlinmania.windowssys.windows.win32.security.TokenInformationClass
import io.github.kotlinmania.windowssys.windows.win32.security.TokenType
import io.github.kotlinmania.windowssys.windows.win32.security.WellKnownSidType
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecGetKeyFn
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileAccessRights
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileShareMode
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType

private val windowsWdkStorageFilesystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun applyControlToken(phcontext: ConstPtr, pinput: ConstPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemApplyControlToken(phcontext.rawAddress.toString(), pinput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccAsyncCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr, ioissuerthread: Pethread, asyncreadcontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcAsyncCopyRead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, buffer.rawAddress.toString(), iostatus.rawAddress.toString(), ioissuerthread.toString(), asyncreadcontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCanIWrite(fileobject: ConstPtr, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcCanIWrite(fileobject.rawAddress.toString(), bytestowrite.toInt(), wait, retrying.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, iostatus: MutPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcCoherencyFlushAndPurgeCache(sectionobjectpointer.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), iostatus.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcCopyRead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, buffer.rawAddress.toString(), iostatus.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyReadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr, ioissuerthread: Pethread): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcCopyReadEx(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, buffer.rawAddress.toString(), iostatus.rawAddress.toString(), ioissuerthread.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcCopyWrite(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, buffer.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyWriteEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: ConstPtr, ioissuerthread: Pethread): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcCopyWriteEx(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, buffer.rawAddress.toString(), ioissuerthread.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyWriteWontFlush(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcCopyWriteWontFlush(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccDeferWrite(fileobject: ConstPtr, postroutine: PccPostDeferredWrite, context1: ConstPtr, context2: ConstPtr, bytestowrite: UInt, retrying: Boolean) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcDeferWrite(fileobject.rawAddress.toString(), 0L.toString(), context1.rawAddress.toString(), context2.rawAddress.toString(), bytestowrite.toInt(), retrying)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccErrorCallbackRoutine(context: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcErrorCallbackRoutine(context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccFastCopyRead(fileobject: ConstPtr, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: MutPtr, iostatus: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcFastCopyRead(fileobject.rawAddress.toString(), fileoffset.toInt(), length.toInt(), pagecount.toInt(), buffer.rawAddress.toString(), iostatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccFastCopyWrite(fileobject: ConstPtr, fileoffset: UInt, length: UInt, buffer: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcFastCopyWrite(fileobject.rawAddress.toString(), fileoffset.toInt(), length.toInt(), buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccFlushCache(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, iostatus: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcFlushCache(sectionobjectpointer.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), iostatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccGetDirtyPages(loghandle: ConstPtr, dirtypageroutine: PdirtyPageRoutine, context1: ConstPtr, context2: ConstPtr): Long =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcGetDirtyPages(loghandle.rawAddress.toString(), 0L.toString(), context1.rawAddress.toString(), context2.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFileObjectFromBcb(bcb: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromBcb(bcb.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrs(sectionobjectpointer.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrsRef(sectionobjectpointer.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFlushedValidData(sectionobjectpointer: ConstPtr, bcblistheld: Boolean): Long =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcGetFlushedValidData(sectionobjectpointer.rawAddress.toString(), bcblistheld) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccInitializeCacheMap(fileobject: ConstPtr, filesizes: ConstPtr, pinaccess: Boolean, callbacks: ConstPtr, lazywritecontext: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcInitializeCacheMap(fileobject.rawAddress.toString(), filesizes.rawAddress.toString(), pinaccess, callbacks.rawAddress.toString(), lazywritecontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccInitializeCacheMapEx(fileobject: ConstPtr, filesizes: ConstPtr, pinaccess: Boolean, callbacks: ConstPtr, lazywritecontext: ConstPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcInitializeCacheMapEx(fileobject.rawAddress.toString(), filesizes.rawAddress.toString(), pinaccess, callbacks.rawAddress.toString(), lazywritecontext.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(status) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccIsThereDirtyData(vpb: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcIsThereDirtyData(vpb.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccIsThereDirtyDataEx(vpb: ConstPtr, numberofdirtypages: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcIsThereDirtyDataEx(vpb.rawAddress.toString(), numberofdirtypages.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccMapData(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcMapData(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), flags.toInt(), bcb.rawAddress.toString(), buffer.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccMdlRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, mdlchain: MutPtr, iostatus: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcMdlRead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccMdlReadComplete(fileobject: ConstPtr, mdlchain: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcMdlReadComplete(fileobject.rawAddress.toString(), mdlchain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccMdlWriteAbort(fileobject: ConstPtr, mdlchain: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcMdlWriteAbort(fileobject.rawAddress.toString(), mdlchain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccMdlWriteComplete(fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcMdlWriteComplete(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), mdlchain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccPinMappedData(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcPinMappedData(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), flags.toInt(), bcb.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccPinRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcPinRead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), flags.toInt(), bcb.rawAddress.toString(), buffer.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccPrepareMdlWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, mdlchain: MutPtr, iostatus: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcPrepareMdlWrite(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccPreparePinWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, zero: Boolean, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcPreparePinWrite(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), zero, flags.toInt(), bcb.rawAddress.toString(), buffer.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccPurgeCacheSection(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcPurgeCacheSection(sectionobjectpointer.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), flags.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccRemapBcb(bcb: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcRemapBcb(bcb.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccRepinBcb(bcb: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcRepinBcb(bcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccScheduleReadAhead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcScheduleReadAhead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccScheduleReadAheadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, ioissuerthread: Pethread) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcScheduleReadAheadEx(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), ioissuerthread.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetAdditionalCacheAttributes(fileobject: ConstPtr, disablereadahead: Boolean, disablewritebehind: Boolean) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributes(fileobject.rawAddress.toString(), disablereadahead, disablewritebehind)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetAdditionalCacheAttributesEx(fileobject: ConstPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributesEx(fileobject.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetBcbOwnerPointer(bcb: ConstPtr, ownerpointer: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcSetBcbOwnerPointer(bcb.rawAddress.toString(), ownerpointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetDirtyPageThreshold(fileobject: ConstPtr, dirtypagethreshold: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcSetDirtyPageThreshold(fileobject.rawAddress.toString(), dirtypagethreshold.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetDirtyPinnedData(bcbvoid: ConstPtr, lsn: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcSetDirtyPinnedData(bcbvoid.rawAddress.toString(), lsn.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetFileSizes(fileobject: ConstPtr, filesizes: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcSetFileSizes(fileobject.rawAddress.toString(), filesizes.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetFileSizesEx(fileobject: ConstPtr, filesizes: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcSetFileSizesEx(fileobject.rawAddress.toString(), filesizes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccSetLogHandleForFile(fileobject: ConstPtr, loghandle: ConstPtr, flushtolsnroutine: PflushToLsn) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcSetLogHandleForFile(fileobject.rawAddress.toString(), loghandle.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetParallelFlushFile(fileobject: ConstPtr, enableparallelflush: Boolean) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcSetParallelFlushFile(fileobject.rawAddress.toString(), enableparallelflush)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetReadAheadGranularity(fileobject: ConstPtr, granularity: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcSetReadAheadGranularity(fileobject.rawAddress.toString(), granularity.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccUninitializeCacheMap(fileobject: ConstPtr, truncatesize: ConstPtr, uninitializeevent: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcUninitializeCacheMap(fileobject.rawAddress.toString(), truncatesize.rawAddress.toString(), uninitializeevent.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccUnpinData(bcb: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcUnpinData(bcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccUnpinDataForThread(bcb: ConstPtr, resourcethreadid: ULong) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcUnpinDataForThread(bcb.rawAddress.toString(), resourcethreadid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccUnpinRepinnedBcb(bcb: ConstPtr, writethrough: Boolean, iostatus: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcUnpinRepinnedBcb(bcb.rawAddress.toString(), writethrough, iostatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccWaitForCurrentLazyWriterActivity(): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccZeroData(fileobject: ConstPtr, startoffset: ConstPtr, endoffset: ConstPtr, wait: Boolean): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCcZeroData(fileobject.rawAddress.toString(), startoffset.rawAddress.toString(), endoffset.rawAddress.toString(), wait) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeAuthToken(phcontext: ConstPtr, ptoken: ConstPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemCompleteAuthToken(phcontext.rawAddress.toString(), ptoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDisableResourceBoostLite(resource: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemExDisableResourceBoostLite(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exQueryPoolBlockSize(poolblock: ConstPtr, quotacharged: MutPtr): ULong =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemExQueryPoolBlockSize(poolblock.rawAddress.toString(), quotacharged.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportSecurityContext(phcontext: ConstPtr, fflags: UInt, ppackedcontext: MutPtr, ptoken: MutPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemExportSecurityContext(phcontext.rawAddress.toString(), fflags.toInt(), ppackedcontext.rawAddress.toString(), ptoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAcknowledgeEcp(ecpcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAcknowledgeEcp(ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAcquireFileExclusive(fileobject: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAcquireFileExclusive(fileobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAddBaseMcbEntry(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntry(mcb.rawAddress.toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddBaseMcbEntryEx(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntryEx(mcb.rawAddress.toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddLargeMcbEntry(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAddLargeMcbEntry(mcb.rawAddress.toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddMcbEntry(mcb: MutPtr, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAddMcbEntry(mcb.rawAddress.toString(), vbn.toInt(), lbn.toInt(), sectorcount.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddToTunnelCache(cache: MutPtr, directorykey: ULong, shortname: ConstPtr, longname: ConstPtr, keybyshortname: Boolean, datalength: UInt, data: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCache(cache.rawAddress.toString(), directorykey.toString(), shortname.rawAddress.toString(), longname.rawAddress.toString(), keybyshortname, datalength.toInt(), data.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAddToTunnelCacheEx(cache: MutPtr, directorykey: ULong, shortname: ConstPtr, longname: ConstPtr, flags: UInt, datalength: UInt, data: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCacheEx(cache.rawAddress.toString(), directorykey.toString(), shortname.rawAddress.toString(), longname.rawAddress.toString(), flags.toInt(), datalength.toInt(), data.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAllocateAePushLock(pooltype, tag.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateExtraCreateParameter(ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameter(ecptype.rawAddress.toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), pooltag.toInt(), ecpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterFromLookasideList(ecptype.rawAddress.toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), lookasidelist.rawAddress.toString(), ecpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterList(flags.toInt(), ecplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAllocateFileLock(0L.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateResource(): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAllocateResource() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreNamesEqual(constantnamea: ConstPtr, constantnameb: ConstPtr, ignorecase: Boolean, upcasetable: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAreNamesEqual(constantnamea.rawAddress.toString(), constantnameb.rawAddress.toString(), ignorecase, upcasetable.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAreThereCurrentOrInProgressFileLocks(filelock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreThereWaitingFileLocks(filelock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAreThereWaitingFileLocks(filelock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlBalanceReads(targetdevice: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlBalanceReads(targetdevice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr, waittype: WaitType, timeout: ConstPtr, waitblockarray: ConstPtr, irp: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForMultipleObjects(count.toInt(), objectarray.rawAddress.toString(), waittype, timeout.rawAddress.toString(), waitblockarray.rawAddress.toString(), irp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCancellableWaitForSingleObject(obj: ConstPtr, timeout: ConstPtr, irp: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForSingleObject(obj.rawAddress.toString(), timeout.rawAddress.toString(), irp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlChangeBackingFileObject(currentfileobject: ConstPtr, newfileobject: ConstPtr, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlChangeBackingFileObject(currentfileobject.rawAddress.toString(), newfileobject.rawAddress.toString(), changebackingtype, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckLockForOplockRequest(filelock: ConstPtr, allocationsize: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForOplockRequest(filelock.rawAddress.toString(), allocationsize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckLockForReadAccess(filelock: ConstPtr, irp: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForReadAccess(filelock.rawAddress.toString(), irp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckLockForWriteAccess(filelock: ConstPtr, irp: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForWriteAccess(filelock.rawAddress.toString(), irp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckOplock(oplock: ConstPtr, irp: ConstPtr, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCheckOplock(oplock.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckOplockEx(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx(oplock.rawAddress.toString(), irp.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckOplockEx2(oplock: ConstPtr, irp: ConstPtr, flags: UInt, flagsex2: UInt, completionroutinecontext: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: ConstPtr, notifyroutine: PoplockNotifyRoutine): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx2(oplock.rawAddress.toString(), irp.rawAddress.toString(), flags.toInt(), flagsex2.toInt(), completionroutinecontext.rawAddress.toString(), 0L.toString(), 0L.toString(), timeout.toString(), notifycontext.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckUpperOplock(oplock: ConstPtr, newloweroplockstate: UInt, completionroutinecontext: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCheckUpperOplock(oplock.rawAddress.toString(), newloweroplockstate.toInt(), completionroutinecontext.rawAddress.toString(), 0L.toString(), 0L.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, lockkey: UInt, buffer: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCopyRead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, lockkey.toInt(), buffer.rawAddress.toString(), iostatus.rawAddress.toString(), deviceobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCopyWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, lockkey: UInt, buffer: ConstPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCopyWrite(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, lockkey.toInt(), buffer.rawAddress.toString(), iostatus.rawAddress.toString(), deviceobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCreateSectionForDataScan(sectionhandle: MutPtr, sectionobject: MutPtr, sectionfilesize: MutPtr, fileobject: ConstPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCreateSectionForDataScan(sectionhandle.rawAddress.toString(), sectionobject.rawAddress.toString(), sectionfilesize.rawAddress.toString(), fileobject.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCurrentBatchOplock(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCurrentBatchOplock(oplock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCurrentOplock(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplock(oplock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCurrentOplockH(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplockH(oplock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: MutPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlDeleteExtraCreateParameterLookasideList(lookaside.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDeleteKeyFromTunnelCache(cache: MutPtr, directorykey: ULong) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlDeleteKeyFromTunnelCache(cache.rawAddress.toString(), directorykey.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDeleteTunnelCache(cache: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlDeleteTunnelCache(cache.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDeregisterUncProvider(handle: Handle) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlDeregisterUncProvider(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDismountComplete(deviceobject: ConstPtr, dismountstatus: Ntstatus) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlDismountComplete(deviceobject.rawAddress.toString(), dismountstatus)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDissectDbcs(path: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, firstname: MutPtr, remainingname: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlDissectName(path: UnicodeString, firstname: MutPtr, remainingname: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlDoesDbcsContainWildCards(name: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlDoesDbcsContainWildCards(name.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlDoesNameContainWildCards(name: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlDoesNameContainWildCards(name.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastCheckLockForRead(filelock: ConstPtr, startingbyte: ConstPtr, length: ConstPtr, key: UInt, fileobject: ConstPtr, processid: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForRead(filelock.rawAddress.toString(), startingbyte.rawAddress.toString(), length.rawAddress.toString(), key.toInt(), fileobject.rawAddress.toString(), processid.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastCheckLockForWrite(filelock: ConstPtr, startingbyte: ConstPtr, length: ConstPtr, key: UInt, fileobject: ConstPtr, processid: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForWrite(filelock.rawAddress.toString(), startingbyte.rawAddress.toString(), length.rawAddress.toString(), key.toInt(), fileobject.rawAddress.toString(), processid.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastUnlockAll(filelock: ConstPtr, fileobject: ConstPtr, processid: Peprocess, context: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAll(filelock.rawAddress.toString(), fileobject.rawAddress.toString(), processid.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastUnlockAllByKey(filelock: ConstPtr, fileobject: ConstPtr, processid: Peprocess, key: UInt, context: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAllByKey(filelock.rawAddress.toString(), fileobject.rawAddress.toString(), processid.toString(), key.toInt(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastUnlockSingle(filelock: ConstPtr, fileobject: ConstPtr, fileoffset: ConstPtr, length: ConstPtr, processid: Peprocess, key: UInt, context: ConstPtr, alreadysynchronized: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockSingle(filelock.rawAddress.toString(), fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.rawAddress.toString(), processid.toString(), key.toInt(), context.rawAddress.toString(), alreadysynchronized) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFindExtraCreateParameter(ecplist: ConstPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFindExtraCreateParameter(ecplist.rawAddress.toString(), ecptype.rawAddress.toString(), ecpcontext.rawAddress.toString(), ecpcontextsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFindInTunnelCache(cache: ConstPtr, directorykey: ULong, name: ConstPtr, shortname: MutPtr, longname: MutPtr, datalength: MutPtr, data: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCache(cache.rawAddress.toString(), directorykey.toString(), name.rawAddress.toString(), shortname.rawAddress.toString(), longname.rawAddress.toString(), datalength.rawAddress.toString(), data.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFindInTunnelCacheEx(cache: ConstPtr, directorykey: ULong, name: ConstPtr, shortname: MutPtr, longname: MutPtr, flags: UInt, datalength: MutPtr, data: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCacheEx(cache.rawAddress.toString(), directorykey.toString(), name.rawAddress.toString(), shortname.rawAddress.toString(), longname.rawAddress.toString(), flags.toInt(), datalength.rawAddress.toString(), data.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFreeAePushLock(aepushlock: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFreeAePushLock(aepushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlFreeExtraCreateParameter(ecpcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameter(ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlFreeExtraCreateParameterList(ecplist: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameterList(ecplist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlFreeFileLock(filelock: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlFreeFileLock(filelock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlGetCurrentProcessLoaderList(): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetCurrentProcessLoaderList() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetEcpListFromIrp(irp: ConstPtr, ecplist: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetEcpListFromIrp(irp.rawAddress.toString(), ecplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetFileSize(fileobject: ConstPtr, filesize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetFileSize(fileobject.rawAddress.toString(), filesize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextBaseMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetNextBaseMcbEntry(mcb.rawAddress.toString(), runindex.toInt(), vbn.rawAddress.toString(), lbn.rawAddress.toString(), sectorcount.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextExtraCreateParameter(ecplist: ConstPtr, currentecpcontext: ConstPtr, nextecptype: MutPtr, nextecpcontext: MutPtr, nextecpcontextsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetNextExtraCreateParameter(ecplist.rawAddress.toString(), currentecpcontext.rawAddress.toString(), nextecptype.rawAddress.toString(), nextecpcontext.rawAddress.toString(), nextecpcontextsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextFileLock(filelock: ConstPtr, restart: Boolean): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetNextFileLock(filelock.rawAddress.toString(), restart) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextLargeMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetNextLargeMcbEntry(mcb.rawAddress.toString(), runindex.toInt(), vbn.rawAddress.toString(), lbn.rawAddress.toString(), sectorcount.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetNextMcbEntry(mcb.rawAddress.toString(), runindex.toInt(), vbn.rawAddress.toString(), lbn.rawAddress.toString(), sectorcount.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetSectorSizeInformation(deviceobject: ConstPtr, sectorsizeinfo: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetSectorSizeInformation(deviceobject.rawAddress.toString(), sectorsizeinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetSupportedFeatures(deviceobject: ConstPtr, supportedfeatures: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetSupportedFeatures(deviceobject.rawAddress.toString(), supportedfeatures.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetVirtualDiskNestingLevel(deviceobject: ConstPtr, nestinglevel: MutPtr, nestingflags: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlGetVirtualDiskNestingLevel(deviceobject.rawAddress.toString(), nestinglevel.rawAddress.toString(), nestingflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIncrementCcFastMdlReadWait() {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadNoWait() {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadNotPossible() {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadResourceMiss() {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadWait() {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitExtraCreateParameterLookasideList(lookaside: MutPtr, flags: UInt, size: ULong, tag: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInitExtraCreateParameterLookasideList(lookaside.rawAddress.toString(), flags.toInt(), size.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeBaseMcb(mcb: MutPtr, pooltype: PoolType) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcb(mcb.rawAddress.toString(), pooltype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeBaseMcbEx(mcb: MutPtr, pooltype: PoolType, flags: UShort): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcbEx(mcb.rawAddress.toString(), pooltype, flags.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInitializeExtraCreateParameter(ecp: MutPtr, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: ConstPtr, listallocatedfrom: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameter(ecp.rawAddress.toString(), ecpflags.toInt(), 0L.toString(), totalsize.toInt(), ecptype.rawAddress.toString(), listallocatedfrom.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeExtraCreateParameterList(ecplist: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameterList(ecplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInitializeFileLock(filelock: MutPtr, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInitializeFileLock(filelock.rawAddress.toString(), 0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeLargeMcb(mcb: MutPtr, pooltype: PoolType) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInitializeLargeMcb(mcb.rawAddress.toString(), pooltype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeMcb(mcb: MutPtr, pooltype: PoolType) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInitializeMcb(mcb.rawAddress.toString(), pooltype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeOplock(oplock: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInitializeOplock(oplock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeTunnelCache(cache: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInitializeTunnelCache(cache.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInsertExtraCreateParameter(ecplist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInsertExtraCreateParameter(ecplist.rawAddress.toString(), ecpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInsertPerFileContext(perfilecontextpointer: ConstPtr, ptr: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileContext(perfilecontextpointer.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInsertPerFileObjectContext(fileobject: ConstPtr, ptr: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileObjectContext(fileobject.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInsertPerStreamContext(perstreamcontext: ConstPtr, ptr: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlInsertPerStreamContext(perstreamcontext.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIs32BitProcess(process: Peprocess): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(process.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsDaxVolume(fileobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsDaxVolume(fileobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsDbcsInExpression(expression: ConstPtr, name: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsDbcsInExpression(expression.rawAddress.toString(), name.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsEcpAcknowledged(ecpcontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsEcpAcknowledged(ecpcontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsEcpFromUserMode(ecpcontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsEcpFromUserMode(ecpcontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(startpage.toInt(), numberofpages.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsFatDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsHpfsDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsMobileOS(): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNameInExpression(expression: ConstPtr, name: ConstPtr, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsNameInExpression(expression.rawAddress.toString(), name.rawAddress.toString(), ignorecase, upcasetable.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNameInUnUpcasedExpression(expression: ConstPtr, name: ConstPtr, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsNameInUnUpcasedExpression(expression.rawAddress.toString(), name.rawAddress.toString(), ignorecase, upcasetable.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(exception) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsPagingFile(fileobject: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsPagingFile(fileobject.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsSystemPagingFile(fileobject: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIsSystemPagingFile(fileobject.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIssueDeviceIoControl(deviceobject: ConstPtr, ioctl: UInt, flags: UByte, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: ConstPtr, outputbufferlength: UInt, iosbinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlIssueDeviceIoControl(deviceobject.rawAddress.toString(), ioctl.toInt(), flags.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt(), iosbinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlKernelFsControlFile(fileobject: ConstPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, retoutputbuffersize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlKernelFsControlFile(fileobject.rawAddress.toString(), fscontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt(), retoutputbuffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLogCcFlushError(filename: ConstPtr, deviceobject: ConstPtr, sectionobjectpointer: ConstPtr, flusherror: Ntstatus, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLogCcFlushError(filename.rawAddress.toString(), deviceobject.rawAddress.toString(), sectionobjectpointer.rawAddress.toString(), flusherror, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupBaseMcbEntry(mcb: ConstPtr, vbn: Long, lbn: MutPtr, sectorcountfromlbn: MutPtr, startinglbn: MutPtr, sectorcountfromstartinglbn: MutPtr, index: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupBaseMcbEntry(mcb.rawAddress.toString(), vbn.toString(), lbn.rawAddress.toString(), sectorcountfromlbn.rawAddress.toString(), startinglbn.rawAddress.toString(), sectorcountfromstartinglbn.rawAddress.toString(), index.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLargeMcbEntry(mcb: ConstPtr, vbn: Long, lbn: MutPtr, sectorcountfromlbn: MutPtr, startinglbn: MutPtr, sectorcountfromstartinglbn: MutPtr, index: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupLargeMcbEntry(mcb.rawAddress.toString(), vbn.toString(), lbn.rawAddress.toString(), sectorcountfromlbn.rawAddress.toString(), startinglbn.rawAddress.toString(), sectorcountfromstartinglbn.rawAddress.toString(), index.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastBaseMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntry(mcb.rawAddress.toString(), vbn.rawAddress.toString(), lbn.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: ConstPtr, largevbn: MutPtr, largelbn: MutPtr, index: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb.rawAddress.toString(), largevbn.rawAddress.toString(), largelbn.rawAddress.toString(), index.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastLargeMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntry(mcb.rawAddress.toString(), vbn.rawAddress.toString(), lbn.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: ConstPtr, largevbn: MutPtr, largelbn: MutPtr, index: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb.rawAddress.toString(), largevbn.rawAddress.toString(), largelbn.rawAddress.toString(), index.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastMcbEntry(mcb.rawAddress.toString(), vbn.rawAddress.toString(), lbn.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupMcbEntry(mcb: ConstPtr, vbn: UInt, lbn: MutPtr, sectorcount: MutPtr, index: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupMcbEntry(mcb.rawAddress.toString(), vbn.toInt(), lbn.rawAddress.toString(), sectorcount.rawAddress.toString(), index.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupPerFileContext(perfilecontextpointer: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileContext(perfilecontextpointer.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupPerFileObjectContext(fileobject: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileObjectContext(fileobject.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupPerStreamContextInternal(streamcontext: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlLookupPerStreamContextInternal(streamcontext.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlReadCompleteDev(fileobject: ConstPtr, mdlchain: ConstPtr, deviceobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlMdlReadCompleteDev(fileobject.rawAddress.toString(), mdlchain.rawAddress.toString(), deviceobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlReadDev(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlMdlReadDev(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString(), deviceobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlReadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlMdlReadEx(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlWriteCompleteDev(fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr, deviceobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlMdlWriteCompleteDev(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), mdlchain.rawAddress.toString(), deviceobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMupGetProviderIdFromName(pprovidername: ConstPtr, pproviderid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderIdFromName(pprovidername.rawAddress.toString(), pproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: ConstPtr, level: UInt, pbuffer: MutPtr, pbuffersize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderInfoFromFileObject(pfileobject.rawAddress.toString(), level.toInt(), pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(exception, genericexception) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanup(notifysync.toString(), notifylist.rawAddress.toString(), fscontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanupAll(notifysync.toString(), notifylist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr, fulldirectoryname: ConstPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr, filtercallback: PfilterReportChange) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterChangeDirectory(notifysync.toString(), notifylist.rawAddress.toString(), fscontext.rawAddress.toString(), fulldirectoryname.rawAddress.toString(), watchtree, ignorebuffer, completionfilter.toInt(), notifyirp.rawAddress.toString(), 0L.toString(), subjectcontext.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: ConstPtr, fulltargetname: ConstPtr, targetnameoffset: UShort, streamname: ConstPtr, normalizedparentname: ConstPtr, filtermatch: UInt, action: UInt, targetcontext: ConstPtr, filtercontext: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterReportChange(notifysync.toString(), notifylist.rawAddress.toString(), fulltargetname.rawAddress.toString(), targetnameoffset.toInt(), streamname.rawAddress.toString(), normalizedparentname.rawAddress.toString(), filtermatch.toInt(), action.toInt(), targetcontext.rawAddress.toString(), filtercontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr, fulldirectoryname: MutPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullChangeDirectory(notifysync.toString(), notifylist.rawAddress.toString(), fscontext.rawAddress.toString(), fulldirectoryname.rawAddress.toString(), watchtree, ignorebuffer, completionfilter.toInt(), notifyirp.rawAddress.toString(), 0L.toString(), subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: ConstPtr, fulltargetname: ConstPtr, targetnameoffset: UShort, streamname: ConstPtr, normalizedparentname: ConstPtr, filtermatch: UInt, action: UInt, targetcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullReportChange(notifysync.toString(), notifylist.rawAddress.toString(), fulltargetname.rawAddress.toString(), targetnameoffset.toInt(), streamname.rawAddress.toString(), normalizedparentname.rawAddress.toString(), filtermatch.toInt(), action.toInt(), targetcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyInitializeSync(notifysync: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNotifyInitializeSync(notifysync.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyUninitializeSync(notifysync: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNotifyUninitializeSync(notifysync.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyVolumeEvent(fileobject: ConstPtr, eventcode: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEvent(fileobject.rawAddress.toString(), eventcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNotifyVolumeEventEx(fileobject: ConstPtr, eventcode: UInt, event: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEventEx(fileobject.rawAddress.toString(), eventcode.toInt(), event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNumberOfRunsInBaseMcb(mcb: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInBaseMcb(mcb.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNumberOfRunsInLargeMcb(mcb: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInLargeMcb(mcb.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNumberOfRunsInMcb(mcb: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInMcb(mcb.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakH(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH(oplock.rawAddress.toString(), irp.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakH2(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: ConstPtr, shareaccess: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH2(oplock.rawAddress.toString(), irp.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString(), grantedaccess.rawAddress.toString(), shareaccess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakToNone(oplock: MutPtr, irpsp: ConstPtr, irp: ConstPtr, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNone(oplock.rawAddress.toString(), irpsp.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakToNoneEx(oplock: MutPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNoneEx(oplock.rawAddress.toString(), irp.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockFsctrl(oplock: ConstPtr, irp: ConstPtr, opencount: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrl(oplock.rawAddress.toString(), irp.rawAddress.toString(), opencount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockFsctrlEx(oplock: ConstPtr, irp: ConstPtr, opencount: UInt, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrlEx(oplock.rawAddress.toString(), irp.rawAddress.toString(), opencount.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: ConstPtr): Peprocess =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlOplockGetAnyBreakOwnerProcess(oplock.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockIsFastIoPossible(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlOplockIsFastIoPossible(oplock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockIsSharedRequest(irp: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlOplockIsSharedRequest(irp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockKeysEqual(fo1: ConstPtr, fo2: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlOplockKeysEqual(fo1.rawAddress.toString(), fo2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlPostPagingFileStackOverflow(context: ConstPtr, event: ConstPtr, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlPostPagingFileStackOverflow(context.rawAddress.toString(), event.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlPostStackOverflow(context: ConstPtr, event: ConstPtr, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlPostStackOverflow(context.rawAddress.toString(), event.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlPrepareMdlWriteDev(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteDev(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString(), deviceobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlPrepareMdlWriteEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteEx(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlPrepareToReuseEcp(ecpcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlPrepareToReuseEcp(ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlPrivateLock(filelock: ConstPtr, fileobject: ConstPtr, fileoffset: ConstPtr, length: ConstPtr, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: MutPtr, irp: ConstPtr, context: ConstPtr, alreadysynchronized: Boolean): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlPrivateLock(filelock.rawAddress.toString(), fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.rawAddress.toString(), processid.toString(), key.toInt(), failimmediately, exclusivelock, iosb.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString(), alreadysynchronized) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlProcessFileLock(filelock: ConstPtr, irp: ConstPtr, context: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlProcessFileLock(filelock.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryCachedVdl(fileobject: ConstPtr, vdl: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlQueryCachedVdl(fileobject.rawAddress.toString(), vdl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryInformationFile(fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlQueryInformationFile(fileobject.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, retfileinformationsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryKernelEaFile(fileobject: ConstPtr, returnedeadata: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlQueryKernelEaFile(fileobject.rawAddress.toString(), returnedeadata.rawAddress.toString(), length.toInt(), returnsingleentry, ealist.rawAddress.toString(), ealistlength.toInt(), eaindex.rawAddress.toString(), restartscan, lengthreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: ConstPtr, callbacks: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRegisterFileSystemFilterCallbacks(filterdriverobject.rawAddress.toString(), callbacks.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterUncProvider(muphandle: MutPtr, redirectordevicename: ConstPtr, mailslotssupported: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProvider(muphandle.rawAddress.toString(), redirectordevicename.rawAddress.toString(), mailslotssupported) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterUncProviderEx(muphandle: MutPtr, redirdevname: ConstPtr, deviceobject: ConstPtr, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx(muphandle.rawAddress.toString(), redirdevname.rawAddress.toString(), deviceobject.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterUncProviderEx2(redirdevname: ConstPtr, deviceobject: ConstPtr, registration: ConstPtr, muphandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx2(redirdevname.rawAddress.toString(), deviceobject.rawAddress.toString(), registration.rawAddress.toString(), muphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlReleaseFile(fileobject: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlReleaseFile(fileobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlRemoveBaseMcbEntry(mcb: MutPtr, vbn: Long, sectorcount: Long): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRemoveBaseMcbEntry(mcb.rawAddress.toString(), vbn.toString(), sectorcount.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRemoveDotsFromPath(originalstring.rawAddress.toString(), pathlength.toInt(), newlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemoveExtraCreateParameter(ecplist: MutPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRemoveExtraCreateParameter(ecplist.rawAddress.toString(), ecptype.rawAddress.toString(), ecpcontext.rawAddress.toString(), ecpcontextsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemoveLargeMcbEntry(mcb: MutPtr, vbn: Long, sectorcount: Long) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRemoveLargeMcbEntry(mcb.rawAddress.toString(), vbn.toString(), sectorcount.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlRemoveMcbEntry(mcb: MutPtr, vbn: UInt, sectorcount: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRemoveMcbEntry(mcb.rawAddress.toString(), vbn.toInt(), sectorcount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlRemovePerFileContext(perfilecontextpointer: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileContext(perfilecontextpointer.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemovePerFileObjectContext(fileobject: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileObjectContext(fileobject.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemovePerStreamContext(streamcontext: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlRemovePerStreamContext(streamcontext.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlResetBaseMcb(mcb: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlResetBaseMcb(mcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlResetLargeMcb(mcb: MutPtr, selfsynchronized: Boolean) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlResetLargeMcb(mcb.rawAddress.toString(), selfsynchronized)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlSetDriverBacking(driverobj: ConstPtr, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlSetDriverBacking(driverobj.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSetEcpListIntoIrp(irp: MutPtr, ecplist: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlSetEcpListIntoIrp(irp.rawAddress.toString(), ecplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSetKernelEaFile(fileobject: ConstPtr, eabuffer: ConstPtr, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlSetKernelEaFile(fileobject.rawAddress.toString(), eabuffer.rawAddress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSplitBaseMcb(mcb: MutPtr, vbn: Long, amount: Long): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlSplitBaseMcb(mcb.rawAddress.toString(), vbn.toString(), amount.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSplitLargeMcb(mcb: MutPtr, vbn: Long, amount: Long): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlSplitLargeMcb(mcb.rawAddress.toString(), vbn.toString(), amount.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlTeardownPerFileContexts(perfilecontextpointer: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerFileContexts(perfilecontextpointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTeardownPerStreamContexts(advancedheader: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerStreamContexts(advancedheader.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTruncateBaseMcb(mcb: MutPtr, vbn: Long) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlTruncateBaseMcb(mcb.rawAddress.toString(), vbn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTruncateLargeMcb(mcb: MutPtr, vbn: Long) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlTruncateLargeMcb(mcb.rawAddress.toString(), vbn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTruncateMcb(mcb: MutPtr, vbn: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlTruncateMcb(mcb.rawAddress.toString(), vbn.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeBaseMcb(mcb: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeBaseMcb(mcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeFileLock(filelock: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeFileLock(filelock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeLargeMcb(mcb: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeLargeMcb(mcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeMcb(mcb: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeMcb(mcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeOplock(oplock: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeOplock(oplock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(bytesread.toString(), byteswritten.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUpperOplockFsctrl(oplock: ConstPtr, irp: ConstPtr, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlUpperOplockFsctrl(oplock.rawAddress.toString(), irp.rawAddress.toString(), opencount.toInt(), loweroplockstate.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlValidateReparsePointBuffer(bufferlength.toInt(), reparsebuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: ConstPtr, guid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemFsRtlVolumeDeviceToCorrelationId(volumedeviceobject.rawAddress.toString(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityUserInfo(logonid: ConstPtr, flags: UInt, userinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemGetSecurityUserInfo(logonid.rawAddress.toString(), flags.toInt(), userinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireVpbSpinLock(irql: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoAcquireVpbSpinLock(irql.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioApplyPriorityInfoThread(inputpriorityinfo: ConstPtr, outputpriorityinfo: MutPtr, thread: Pethread): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoApplyPriorityInfoThread(inputpriorityinfo.rawAddress.toString(), outputpriorityinfo.rawAddress.toString(), thread.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckDesiredAccess(desiredaccess: MutPtr, grantedaccess: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoCheckDesiredAccess(desiredaccess.rawAddress.toString(), grantedaccess.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckEaBufferValidity(eabuffer: ConstPtr, ealength: UInt, erroroffset: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoCheckEaBufferValidity(eabuffer.rawAddress.toString(), ealength.toInt(), erroroffset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: ConstPtr, arg2: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoCheckFunctionAccess(grantedaccess.toInt(), majorfunction.toInt(), minorfunction.toInt(), iocontrolcode.toInt(), arg1.rawAddress.toString(), arg2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(fileinformationclass, length.toInt(), setoperation) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(fsinformationclass, length.toInt(), setoperation) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckQuotaBufferValidity(quotabuffer: ConstPtr, quotalength: UInt, erroroffset: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoCheckQuotaBufferValidity(quotabuffer.rawAddress.toString(), quotalength.toInt(), erroroffset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioClearFsTrackOffsetState(irp: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoClearFsTrackOffsetState(irp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObject(fileobject: ConstPtr, deviceobject: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObject(fileobject.rawAddress.toString(), deviceobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObjectEx(fileobject: ConstPtr, deviceobject: ConstPtr, filehandle: MutPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx(fileobject.rawAddress.toString(), deviceobject.rawAddress.toString(), filehandle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObjectEx2(createoptions: ConstPtr, fileobject: ConstPtr, deviceobject: ConstPtr, streamfileobject: MutPtr, filehandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx2(createoptions.rawAddress.toString(), fileobject.rawAddress.toString(), deviceobject.rawAddress.toString(), streamfileobject.rawAddress.toString(), filehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObjectLite(fileobject: ConstPtr, deviceobject: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectLite(fileobject.rawAddress.toString(), deviceobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioEnumerateDeviceObjectList(driverobject: ConstPtr, deviceobjectlist: MutPtr, deviceobjectlistsize: UInt, actualnumberdeviceobjects: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoEnumerateDeviceObjectList(driverobject.rawAddress.toString(), deviceobjectlist.rawAddress.toString(), deviceobjectlistsize.toInt(), actualnumberdeviceobjects.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioEnumerateRegisteredFiltersList(driverobjectlist: MutPtr, driverobjectlistsize: UInt, actualnumberdriverobjects: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoEnumerateRegisteredFiltersList(driverobjectlist.rawAddress.toString(), driverobjectlistsize.toInt(), actualnumberdriverobjects.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFastQueryNetworkAttributes(objectattributes: ConstPtr, desiredaccess: UInt, openoptions: UInt, iostatus: MutPtr, buffer: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoFastQueryNetworkAttributes(objectattributes.rawAddress.toString(), desiredaccess.toInt(), openoptions.toInt(), iostatus.rawAddress.toString(), buffer.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetAttachedDevice(deviceobject: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetAttachedDevice(deviceobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetBaseFileSystemDeviceObject(fileobject: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetBaseFileSystemDeviceObject(fileobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceAttachmentBaseRef(deviceobject: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetDeviceAttachmentBaseRef(deviceobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceToVerify(thread: Pethread): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetDeviceToVerify(thread.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDiskDeviceObject(filesystemdeviceobject: ConstPtr, diskdeviceobject: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetDiskDeviceObject(filesystemdeviceobject.rawAddress.toString(), diskdeviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetFsTrackOffsetState(irp: ConstPtr, retfstrackoffsetblob: MutPtr, rettrackedoffset: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetFsTrackOffsetState(irp.rawAddress.toString(), retfstrackoffsetblob.rawAddress.toString(), rettrackedoffset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetLowerDeviceObject(deviceobject: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetLowerDeviceObject(deviceobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetOplockKeyContext(fileobject: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContext(fileobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetOplockKeyContextEx(fileobject: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContextEx(fileobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRequestorProcess(irp: ConstPtr): Peprocess =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetRequestorProcess(irp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRequestorProcessId(irp: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetRequestorProcessId(irp.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRequestorSessionId(irp: ConstPtr, psessionid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoGetRequestorSessionId(irp.rawAddress.toString(), psessionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIrpHasFsTrackOffsetExtensionType(irp: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoIrpHasFsTrackOffsetExtensionType(irp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsOperationSynchronous(irp: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoIsOperationSynchronous(irp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsSystemThread(thread: Pethread): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoIsSystemThread(thread.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsValidNameGraftingBuffer(irp: ConstPtr, reparsebuffer: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoIsValidNameGraftingBuffer(irp.rawAddress.toString(), reparsebuffer.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioPageRead(fileobject: ConstPtr, memorydescriptorlist: ConstPtr, startingoffset: ConstPtr, event: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoPageRead(fileobject.rawAddress.toString(), memorydescriptorlist.rawAddress.toString(), startingoffset.rawAddress.toString(), event.rawAddress.toString(), iostatusblock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryFileDosDeviceName(fileobject: ConstPtr, objectnameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoQueryFileDosDeviceName(fileobject.rawAddress.toString(), objectnameinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryFileInformation(fileobject: ConstPtr, fileinformationclass: FileInformationClass, length: UInt, fileinformation: MutPtr, returnedlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoQueryFileInformation(fileobject.rawAddress.toString(), fileinformationclass, length.toInt(), fileinformation.rawAddress.toString(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryVolumeInformation(fileobject: ConstPtr, fsinformationclass: FsInformationClass, length: UInt, fsinformation: MutPtr, returnedlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoQueryVolumeInformation(fileobject.rawAddress.toString(), fsinformationclass, length.toInt(), fsinformation.rawAddress.toString(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueueThreadIrp(irp: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoQueueThreadIrp(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRegisterFileSystem(deviceobject: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoRegisterFileSystem(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRegisterFsRegistrationChange(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterFsRegistrationChangeMountAware(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReleaseVpbSpinLock(irql: UByte) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(irql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReplaceFileObjectName(fileobject: ConstPtr, newfilename: Pcwstr, filenamelength: UShort): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoReplaceFileObjectName(fileobject.rawAddress.toString(), newfilename.rawAddress.toString(), filenamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRequestDeviceRemovalForReset(physicaldeviceobject: ConstPtr, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoRequestDeviceRemovalForReset(physicaldeviceobject.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRetrievePriorityInfo(irp: ConstPtr, fileobject: ConstPtr, thread: Pethread, priorityinfo: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoRetrievePriorityInfo(irp.rawAddress.toString(), fileobject.rawAddress.toString(), thread.toString(), priorityinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDeviceToVerify(thread: Pethread, deviceobject: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoSetDeviceToVerify(thread.toString(), deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetFsTrackOffsetState(irp: MutPtr, fstrackoffsetblob: ConstPtr, trackedoffset: Long): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoSetFsTrackOffsetState(irp.rawAddress.toString(), fstrackoffsetblob.rawAddress.toString(), trackedoffset.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetInformation(fileobject: ConstPtr, fileinformationclass: FileInformationClass, length: UInt, fileinformation: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoSetInformation(fileobject.rawAddress.toString(), fileinformationclass, length.toInt(), fileinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSynchronousPageWrite(fileobject: ConstPtr, memorydescriptorlist: ConstPtr, startingoffset: ConstPtr, event: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoSynchronousPageWrite(fileobject.rawAddress.toString(), memorydescriptorlist.rawAddress.toString(), startingoffset.rawAddress.toString(), event.rawAddress.toString(), iostatusblock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioThreadToProcess(thread: Pethread): Peprocess =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoThreadToProcess(thread.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUnregisterFileSystem(deviceobject: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoUnregisterFileSystem(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterFsRegistrationChange(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVerifyVolume(deviceobject: ConstPtr, allowrawmount: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemIoVerifyVolume(deviceobject.rawAddress.toString(), allowrawmount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(number) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireSpinLockRaiseToSynch(spinlock: MutPtr): UByte =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeAcquireSpinLockRaiseToSynch(spinlock.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAttachProcess(process: Prkprocess) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeAttachProcess(process.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keDetachProcess() {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeDetachProcess()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeMutant(mutant: MutPtr, initialowner: Boolean) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeInitializeMutant(mutant.rawAddress.toString(), initialowner)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeQueue(queue: MutPtr, count: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeInitializeQueue(queue.rawAddress.toString(), count.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInsertHeadQueue(queue: MutPtr, entry: MutPtr): Int =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeInsertHeadQueue(queue.rawAddress.toString(), entry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertQueue(queue: MutPtr, entry: MutPtr): Int =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeInsertQueue(queue.rawAddress.toString(), entry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateMutant(mutant: ConstPtr): Int =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeReadStateMutant(mutant.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateQueue(queue: ConstPtr): Int =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeReadStateQueue(queue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseMutant(mutant: MutPtr, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeReleaseMutant(mutant.rawAddress.toString(), increment, abandoned, wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(number, oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRemoveQueue(queue: MutPtr, waitmode: Byte, timeout: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeRemoveQueue(queue.rawAddress.toString(), waitmode.toInt(), timeout.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveQueueEx(queue: MutPtr, waitmode: Byte, alertable: Boolean, timeout: ConstPtr, entryarray: MutPtr, count: UInt): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeRemoveQueueEx(queue.rawAddress.toString(), waitmode.toInt(), alertable, timeout.rawAddress.toString(), entryarray.rawAddress.toString(), count.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRundownQueue(queue: MutPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeRundownQueue(queue.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(thread.toString(), processor.toInt()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetKernelStackSwapEnable(enable: Boolean): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(enable) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keStackAttachProcess(process: Prkprocess, apcstate: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeStackAttachProcess(process.toString(), apcstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: MutPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeTryToAcquireQueuedSpinLock(number, oldirql.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keUnstackDetachProcess(apcstate: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemKeUnstackDetachProcess(apcstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun makeSignature(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMakeSignature(phcontext.rawAddress.toString(), fqop.toInt(), pmessage.rawAddress.toString(), messageseqno.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapSecurityError(secstatus: Hresult): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMapSecurityError(secstatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmCanFileBeTruncated(sectionpointer: ConstPtr, newfilesize: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmCanFileBeTruncated(sectionpointer.rawAddress.toString(), newfilesize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmDoesFileHaveUserWritableReferences(sectionpointer: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmDoesFileHaveUserWritableReferences(sectionpointer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmFlushImageSection(sectionobjectpointer: ConstPtr, flushtype: MmflushType): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmFlushImageSection(sectionobjectpointer.rawAddress.toString(), flushtype) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmForceSectionClosed(sectionobjectpointer: ConstPtr, delayclose: Boolean): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmForceSectionClosed(sectionobjectpointer.rawAddress.toString(), delayclose) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmForceSectionClosedEx(sectionobjectpointer: ConstPtr, forcecloseflags: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmForceSectionClosedEx(sectionobjectpointer.rawAddress.toString(), forcecloseflags.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetMaximumFileSectionSize(): ULong =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsFileSectionActive(fssectionpointer: ConstPtr, flags: UInt, sectionisactive: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmIsFileSectionActive(fssectionpointer.rawAddress.toString(), flags.toInt(), sectionisactive.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsRecursiveIoFault(): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMdlPagesAreZero(mdl: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmMdlPagesAreZero(mdl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmPrefetchPages(numberoflists: UInt, readlists: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmPrefetchPages(numberoflists.toInt(), readlists.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSetAddressRangeModified(address: ConstPtr, length: ULong): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemMmSetAddressRangeModified(address.rawAddress.toString(), length.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtAccessCheckAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), desiredaccess.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtAdjustGroupsToken(tokenhandle.rawAddress.toString(), resettodefault, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtAdjustPrivilegesToken(tokenhandle.rawAddress.toString(), disableallprivileges, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, regionsize: MutPtr, allocationtype: UInt, protect: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), zerobits.toString(), regionsize.rawAddress.toString(), allocationtype.toInt(), protect.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemoryEx(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress.toString(), extendedparametercount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtCancelIoFileEx(filehandle.rawAddress.toString(), iorequesttocancel.rawAddress.toString(), iostatusblock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCloseObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtCloseObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtCreateDirectoryObject(directoryhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, eventtype: EventType, initialstate: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtCreateEvent(eventhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), eventtype, initialstate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateFile(filehandle: MutPtr, desiredaccess: FileAccessRights, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: ConstPtr, ealength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtCreateFile(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtCreateSection(sectionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateSectionEx(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtCreateSectionEx(sectionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress.toString(), extendedparameters.rawAddress.toString(), extendedparametercount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteFile(objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtDeleteFile(objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtDeleteObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtDuplicateObject(sourceprocesshandle.rawAddress.toString(), sourcehandle.rawAddress.toString(), targetprocesshandle.rawAddress.toString(), targethandle.rawAddress.toString(), desiredaccess.toInt(), handleattributes.toInt(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtDuplicateToken(existingtokenhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), effectiveonly, tokentype, newtokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, newtokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtFilterToken(existingtokenhandle.rawAddress.toString(), flags.toInt(), sidstodisable.rawAddress.toString(), privilegestodelete.rawAddress.toString(), restrictedsids.rawAddress.toString(), newtokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtFlushBuffersFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr, parameterssize: UInt, iostatusblock: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtFlushBuffersFileEx(filehandle.rawAddress.toString(), flags.toInt(), parameters.rawAddress.toString(), parameterssize.toInt(), iostatusblock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, iostatus: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtFlushVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), iostatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, freetype: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtFreeVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), freetype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtFsControlFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fscontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtImpersonateAnonymousToken(threadhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtLockFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), byteoffset.rawAddress.toString(), length.rawAddress.toString(), key.toInt(), failimmediately, exclusivelock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtNotifyChangeKey(keyhandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), completionfilter.toInt(), watchtree, buffer.rawAddress.toString(), buffersize.toInt(), asynchronous) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtOpenDirectoryObject(directoryhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenFile(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, openoptions: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtOpenFile(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), shareaccess.toInt(), openoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtOpenObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress.toString(), objectcreation, accessgranted, generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtOpenProcessToken(processhandle.rawAddress.toString(), desiredaccess.toInt(), tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtOpenProcessTokenEx(processhandle.rawAddress.toString(), desiredaccess.toInt(), handleattributes.toInt(), tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenSymbolicLinkObject(linkhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtOpenSymbolicLinkObject(linkhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtOpenThreadToken(threadhandle.rawAddress.toString(), desiredaccess.toInt(), openasself, tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtOpenThreadTokenEx(threadhandle.rawAddress.toString(), desiredaccess.toInt(), openasself, handleattributes.toInt(), tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, result: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtPrivilegeCheck(clienttoken.rawAddress.toString(), requiredprivileges.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrivilegeObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtPrivilegeObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), privileges.rawAddress.toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrivilegedServiceAuditAlarm(subsystemname: ConstPtr, servicename: ConstPtr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtPrivilegedServiceAuditAlarm(subsystemname.rawAddress.toString(), servicename.rawAddress.toString(), clienttoken.rawAddress.toString(), privileges.rawAddress.toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, returnsingleentry, filename.rawAddress.toString(), restartscan) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFileEx(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, queryflags.toInt(), filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryDirectoryObject(directoryhandle.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, restartscan, context.rawAddress.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryEaFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, ealist.rawAddress.toString(), ealistlength.toInt(), eaindex.rawAddress.toString(), restartscan) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryFullAttributesFile(objectattributes: ConstPtr, fileinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryFullAttributesFile(objectattributes.rawAddress.toString(), fileinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationByName(objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryInformationByName(objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryInformationToken(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryQuotaInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, sidlist.rawAddress.toString(), sidlistlength.toInt(), startsid.rawAddress.toString(), restartscan) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQuerySecurityObject(handle.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString(), length.toInt(), lengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr, returnedlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQuerySymbolicLinkObject(linkhandle.rawAddress.toString(), linktarget.rawAddress.toString(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr, memoryinformationlength: ULong, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), memoryinformationclass, memoryinformation.rawAddress.toString(), memoryinformationlength.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtQueryVolumeInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtReadFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), byteoffset.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtSetEaFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetEvent(eventhandle: Handle, previousstate: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtSetEvent(eventhandle.rawAddress.toString(), previousstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtSetInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtSetInformationToken(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr, vminformation: ConstPtr, vminformationlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtSetInformationVirtualMemory(processhandle.rawAddress.toString(), vminformationclass, numberofentries.toString(), virtualaddresses.rawAddress.toString(), vminformation.rawAddress.toString(), vminformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtSetQuotaInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtSetSecurityObject(handle.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: ConstPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtSetVolumeInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntUnlockFile(filehandle: Handle, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtUnlockFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), byteoffset.rawAddress.toString(), length.rawAddress.toString(), key.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemNtWriteFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), byteoffset.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obInsertObject(obj: ConstPtr, passedaccessstate: MutPtr, desiredaccess: UInt, objectpointerbias: UInt, newobject: MutPtr, handle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemObInsertObject(obj.rawAddress.toString(), passedaccessstate.rawAddress.toString(), desiredaccess.toInt(), objectpointerbias.toInt(), newobject.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obIsKernelHandle(handle: Handle): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemObIsKernelHandle(handle.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obMakeTemporaryObject(obj: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemObMakeTemporaryObject(obj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obOpenObjectByPointer(obj: ConstPtr, handleattributes: UInt, passedaccessstate: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemObOpenObjectByPointer(obj.rawAddress.toString(), handleattributes.toInt(), passedaccessstate.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obOpenObjectByPointerWithTag(obj: ConstPtr, handleattributes: UInt, passedaccessstate: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemObOpenObjectByPointerWithTag(obj.rawAddress.toString(), handleattributes.toInt(), passedaccessstate.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obQueryNameString(obj: ConstPtr, objectnameinfo: MutPtr, length: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemObQueryNameString(obj.rawAddress.toString(), objectnameinfo.rawAddress.toString(), length.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemObQueryObjectAuditingByHandle(handle.rawAddress.toString(), generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfxFindPrefix(prefixtable: ConstPtr, fullname: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPfxFindPrefix(prefixtable.rawAddress.toString(), fullname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfxInitialize(prefixtable: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPfxInitialize(prefixtable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pfxInsertPrefix(prefixtable: ConstPtr, prefix: ConstPtr, prefixtableentry: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPfxInsertPrefix(prefixtable.rawAddress.toString(), prefix.rawAddress.toString(), prefixtableentry.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfxRemovePrefix(prefixtable: ConstPtr, prefixtableentry: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPfxRemovePrefix(prefixtable.rawAddress.toString(), prefixtableentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poQueueShutdownWorkItem(workitem: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPoQueueShutdownWorkItem(workitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsAssignImpersonationToken(thread.toString(), token.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsChargePoolQuota(process.toString(), pooltype, amount.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(process.toString(), pooltype, amount.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psDereferenceImpersonationToken(impersonationtoken: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsDereferenceImpersonationToken(impersonationtoken.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psDereferencePrimaryToken(primarytoken: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsDereferencePrimaryToken(primarytoken.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psDisableImpersonation(thread: Pethread, impersonationstate: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsDisableImpersonation(thread.toString(), impersonationstate.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessExitTime(): Long =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsGetProcessExitTime() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadProcess(thread: Pethread): Peprocess =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsGetThreadProcess(thread.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psImpersonateClient(thread: Pethread, token: ConstPtr, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsImpersonateClient(thread.toString(), token.rawAddress.toString(), copyonopen, effectiveonly, impersonationlevel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsDiskCountersEnabled(): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsSystemThread(thread: Pethread): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsIsSystemThread(thread.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsThreadTerminating(thread: Pethread): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(thread.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psLookupProcessByProcessId(processid: Handle, process: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsLookupProcessByProcessId(processid.rawAddress.toString(), process.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psLookupThreadByThreadId(threadid: Handle, thread: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsLookupThreadByThreadId(threadid.rawAddress.toString(), thread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReferenceImpersonationToken(thread: Pethread, copyonopen: MutPtr, effectiveonly: MutPtr, impersonationlevel: MutPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsReferenceImpersonationToken(thread.toString(), copyonopen.rawAddress.toString(), effectiveonly.rawAddress.toString(), impersonationlevel.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReferencePrimaryToken(process: Peprocess): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsReferencePrimaryToken(process.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRestoreImpersonation(thread: Pethread, impersonationstate: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsRestoreImpersonation(thread.toString(), impersonationstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(process.toString(), pooltype, amount.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psRevertToSelf() {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsRevertToSelf()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(process.toString(), bytesread.toString(), byteswritten.toString(), readoperationcount.toInt(), writeoperationcount.toInt(), flushoperationcount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun querySecurityContextToken(phcontext: ConstPtr, token: MutPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemQuerySecurityContextToken(phcontext.rawAddress.toString(), token.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor.rawAddress.toString(), selfrelativesecuritydescriptor.rawAddress.toString(), bufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddAccessAllowedAce(acl: MutPtr, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAce(acl.rawAddress.toString(), acerevision.toInt(), accessmask.toInt(), sid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddAccessAllowedAceEx(acl: MutPtr, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAceEx(acl.rawAddress.toString(), acerevision.toInt(), aceflags.toInt(), accessmask.toInt(), sid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddAce(acl: MutPtr, acerevision: UInt, startingaceindex: UInt, acelist: ConstPtr, acelistlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlAddAce(acl.rawAddress.toString(), acerevision.toInt(), startingaceindex.toInt(), acelist.rawAddress.toString(), acelistlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAllocateAndInitializeSid(identifierauthority: ConstPtr, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSid(identifierauthority.rawAddress.toString(), subauthoritycount.toInt(), subauthority0.toInt(), subauthority1.toInt(), subauthority2.toInt(), subauthority3.toInt(), subauthority4.toInt(), subauthority5.toInt(), subauthority6.toInt(), subauthority7.toInt(), sid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAllocateAndInitializeSidEx(identifierauthority: ConstPtr, subauthoritycount: UByte, subauthorities: ConstPtr, sid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSidEx(identifierauthority.rawAddress.toString(), subauthoritycount.toInt(), subauthorities.rawAddress.toString(), sid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAllocateHeap(heaphandle: ConstPtr, flags: UInt, size: ULong): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlAllocateHeap(heaphandle.rawAddress.toString(), flags.toInt(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAppendStringToString(destination: MutPtr, source: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlAppendStringToString(destination.rawAddress.toString(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareAltitudes(altitude1: ConstPtr, altitude2: ConstPtr): Int =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCompareAltitudes(altitude1.rawAddress.toString(), altitude2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareMemoryUlong(source: ConstPtr, length: ULong, pattern: UInt): ULong =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCompareMemoryUlong(source.rawAddress.toString(), length.toString(), pattern.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: ConstPtr, uncompressedbuffersize: UInt, compressedbuffer: MutPtr, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCompressBuffer(compressionformatandengine.toInt(), uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), uncompressedchunksize.toInt(), finalcompressedsize.rawAddress.toString(), workspace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompressChunks(uncompressedbuffer: ConstPtr, uncompressedbuffersize: UInt, compressedbuffer: MutPtr, compressedbuffersize: UInt, compresseddatainfo: MutPtr, compresseddatainfolength: UInt, workspace: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCompressChunks(uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), compresseddatainfo.rawAddress.toString(), compresseddatainfolength.toInt(), workspace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCopyLuid(destinationluid: MutPtr, sourceluid: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCopyLuid(destinationluid.rawAddress.toString(), sourceluid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCopySid(destinationsidlength.toInt(), destinationsid.rawAddress.toString(), sourcesid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateAcl(acl: MutPtr, acllength: UInt, aclrevision: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCreateAcl(acl.rawAddress.toString(), acllength.toInt(), aclrevision.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateHeap(flags: UInt, heapbase: ConstPtr, reservesize: ULong, commitsize: ULong, lock: ConstPtr, parameters: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCreateHeap(flags.toInt(), heapbase.rawAddress.toString(), reservesize.toString(), commitsize.toString(), lock.rawAddress.toString(), parameters.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateServiceSid(servicename: ConstPtr, servicesid: Psid, servicesidlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCreateServiceSid(servicename.rawAddress.toString(), servicesid.rawAddress.toString(), servicesidlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateSystemVolumeInformationFolder(volumerootpath: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCreateSystemVolumeInformationFolder(volumerootpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateUnicodeString(destinationstring: MutPtr, sourcestring: Pcwstr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCreateUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateVirtualAccountSid(name: ConstPtr, basesubauthority: UInt, sid: Psid, sidlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCreateVirtualAccountSid(name.rawAddress.toString(), basesubauthority.toInt(), sid.rawAddress.toString(), sidlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCustomCPToUnicodeN(customcp: ConstPtr, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlCustomCPToUnicodeN(customcp.rawAddress.toString(), unicodestring.rawAddress.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress.toString(), customcpstring.rawAddress.toString(), bytesincustomcpstring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, finaluncompressedsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDecompressBuffer(compressionformat.toInt(), uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), finaluncompressedsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx(compressionformat.toInt(), uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), finaluncompressedsize.rawAddress.toString(), workspace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx2(compressionformat.toInt(), uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), uncompressedchunksize.toInt(), finaluncompressedsize.rawAddress.toString(), workspace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressChunks(uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, compressedtail: ConstPtr, compressedtailsize: UInt, compresseddatainfo: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDecompressChunks(uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), compressedtail.rawAddress.toString(), compressedtailsize.toInt(), compresseddatainfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: MutPtr, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDecompressFragment(compressionformat.toInt(), uncompressedfragment.rawAddress.toString(), uncompressedfragmentsize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), fragmentoffset.toInt(), finaluncompressedsize.rawAddress.toString(), workspace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: MutPtr, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDecompressFragmentEx(compressionformat.toInt(), uncompressedfragment.rawAddress.toString(), uncompressedfragmentsize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), fragmentoffset.toInt(), uncompressedchunksize.toInt(), finaluncompressedsize.rawAddress.toString(), workspace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteAce(acl: MutPtr, aceindex: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDeleteAce(acl.rawAddress.toString(), aceindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: MutPtr, endofcompressedbufferplus1: ConstPtr, chunkbuffer: MutPtr, chunksize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDescribeChunk(compressionformat.toInt(), compressedbuffer.rawAddress.toString(), endofcompressedbufferplus1.rawAddress.toString(), chunkbuffer.rawAddress.toString(), chunksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDestroyHeap(heaphandle: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDestroyHeap(heaphandle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: MutPtr, filepart: MutPtr, reserved: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDosPathNameToNtPathNameUWithStatus(dosfilename.rawAddress.toString(), ntfilename.rawAddress.toString(), filepart.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDowncaseUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDowncaseUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDuplicateUnicodeString(flags: UInt, stringin: ConstPtr, stringout: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlDuplicateUnicodeString(flags.toInt(), stringin.rawAddress.toString(), stringout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlEqualPrefixSid(sid1.rawAddress.toString(), sid2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlEqualSid(sid1.rawAddress.toString(), sid2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindUnicodePrefix(prefixtable: ConstPtr, fullname: ConstPtr, caseinsensitiveindex: UInt): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlFindUnicodePrefix(prefixtable.rawAddress.toString(), fullname.rawAddress.toString(), caseinsensitiveindex.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeHeap(heaphandle: ConstPtr, flags: UInt, baseaddress: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlFreeHeap(heaphandle.rawAddress.toString(), flags.toInt(), baseaddress.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeSid(sid: Psid): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlFreeSid(sid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGenerate8dot3Name(name: ConstPtr, allowextendedcharacters: Boolean, context: MutPtr, name8dot3: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlGenerate8dot3Name(name.rawAddress.toString(), allowextendedcharacters, context.rawAddress.toString(), name8dot3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetAce(acl: ConstPtr, aceindex: UInt, ace: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlGetAce(acl.rawAddress.toString(), aceindex.toInt(), ace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: MutPtr, compressfragmentworkspacesize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlGetCompressionWorkSpaceSize(compressionformatandengine.toInt(), compressbufferworkspacesize.rawAddress.toString(), compressfragmentworkspacesize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: MutPtr, dacl: MutPtr, dacldefaulted: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlGetDaclSecurityDescriptor(securitydescriptor.rawAddress.toString(), daclpresent.rawAddress.toString(), dacl.rawAddress.toString(), dacldefaulted.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: MutPtr, groupdefaulted: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlGetGroupSecurityDescriptor(securitydescriptor.rawAddress.toString(), group.rawAddress.toString(), groupdefaulted.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: MutPtr, ownerdefaulted: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlGetOwnerSecurityDescriptor(securitydescriptor.rawAddress.toString(), owner.rawAddress.toString(), ownerdefaulted.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: MutPtr, sacl: MutPtr, sacldefaulted: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlGetSaclSecurityDescriptor(securitydescriptor.rawAddress.toString(), saclpresent.rawAddress.toString(), sacl.rawAddress.toString(), sacldefaulted.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdentifierAuthoritySid(sid: Psid): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIdentifierAuthoritySid(sid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIdnToAscii(flags.toInt(), sourcestring.rawAddress.toString(), sourcestringlength, destinationstring.rawAddress.toString(), destinationstringlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIdnToNameprepUnicode(flags.toInt(), sourcestring.rawAddress.toString(), sourcestringlength, destinationstring.rawAddress.toString(), destinationstringlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIdnToUnicode(flags.toInt(), sourcestring.rawAddress.toString(), sourcestringlength, destinationstring.rawAddress.toString(), destinationstringlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitCodePageTable(tablebase: ConstPtr, codepagetable: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlInitCodePageTable(tablebase.rawAddress.toString(), codepagetable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitUnicodeStringEx(destinationstring: MutPtr, sourcestring: Pcwstr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlInitUnicodeStringEx(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeSid(sid: Psid, identifierauthority: ConstPtr, subauthoritycount: UByte): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlInitializeSid(sid.rawAddress.toString(), identifierauthority.rawAddress.toString(), subauthoritycount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeSidEx(sid: Psid, identifierauthority: ConstPtr, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlInitializeSidEx(sid.rawAddress.toString(), identifierauthority.rawAddress.toString(), subauthoritycount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeUnicodePrefix(prefixtable: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlInitializeUnicodePrefix(prefixtable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInsertUnicodePrefix(prefixtable: ConstPtr, prefix: ConstPtr, prefixtableentry: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlInsertUnicodePrefix(prefixtable.rawAddress.toString(), prefix.rawAddress.toString(), prefixtableentry.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(fileattributes.toInt(), reparsetag.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIsDosDeviceNameU(dosfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIsNormalizedString(normform.toInt(), sourcestring.rawAddress.toString(), sourcestringlength, normalized.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(fileattributes.toInt(), reparsetag.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileHandle(filehandle.rawAddress.toString(), ispartialplaceholder.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsPartialPlaceholderFileInfo(infobuffer: ConstPtr, infoclass: FileInformationClass, ispartialplaceholder: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileInfo(infobuffer.rawAddress.toString(), infoclass, ispartialplaceholder.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsSandboxedToken(context: ConstPtr, previousmode: Byte): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIsSandboxedToken(context.rawAddress.toString(), previousmode.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsValidOemCharacter(char: Pwstr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlIsValidOemCharacter(char.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(subauthoritycount.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLengthSid(sid: Psid): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlLengthSid(sid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeN(unicodestring.rawAddress.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress.toString(), multibytestring.rawAddress.toString(), bytesinmultibytestring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlMultiByteToUnicodeSize(bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeSize(bytesinunicodestring.rawAddress.toString(), multibytestring.rawAddress.toString(), bytesinmultibytestring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNextUnicodePrefix(prefixtable: ConstPtr, restart: Boolean): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlNextUnicodePrefix(prefixtable.rawAddress.toString(), restart) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlNormalizeString(normform.toInt(), sourcestring.rawAddress.toString(), sourcestringlength, destinationstring.rawAddress.toString(), destinationstringlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNtStatusToDosErrorNoTeb(status: Ntstatus): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(status) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOemStringToCountedUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlOemStringToCountedUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOemStringToUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlOemStringToUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlOemToUnicodeN(unicodestring.rawAddress.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress.toString(), oemstring.rawAddress.toString(), bytesinoemstring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlPrefixString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlPrefixString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryPackageIdentity(tokenobject: ConstPtr, packagefullname: Pwstr, packagesize: MutPtr, appid: Pwstr, appidsize: MutPtr, packaged: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentity(tokenobject.rawAddress.toString(), packagefullname.rawAddress.toString(), packagesize.rawAddress.toString(), appid.rawAddress.toString(), appidsize.rawAddress.toString(), packaged.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryPackageIdentityEx(tokenobject: ConstPtr, packagefullname: Pwstr, packagesize: MutPtr, appid: Pwstr, appidsize: MutPtr, dynamicid: MutPtr, flags: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentityEx(tokenobject.rawAddress.toString(), packagefullname.rawAddress.toString(), packagesize.rawAddress.toString(), appid.rawAddress.toString(), appidsize.rawAddress.toString(), dynamicid.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode() as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode() as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRandom(seed: MutPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlRandom(seed.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRandomEx(seed: MutPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlRandomEx(seed.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRemoveUnicodePrefix(prefixtable: ConstPtr, prefixtableentry: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlRemoveUnicodePrefix(prefixtable.rawAddress.toString(), prefixtableentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlReplaceSidInSd(securitydescriptor.rawAddress.toString(), oldsid.rawAddress.toString(), newsid.rawAddress.toString(), numchanges.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: MutPtr, endofcompressedbufferplus1: ConstPtr, chunkbuffer: MutPtr, chunksize: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlReserveChunk(compressionformat.toInt(), compressedbuffer.rawAddress.toString(), endofcompressedbufferplus1.rawAddress.toString(), chunkbuffer.rawAddress.toString(), chunksize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlSecondsSince1970ToTime(elapsedseconds.toInt(), time.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlSecondsSince1980ToTime(elapsedseconds.toInt(), time.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: MutPtr, dacl: MutPtr, daclsize: MutPtr, sacl: MutPtr, saclsize: MutPtr, owner: Psid, ownersize: MutPtr, primarygroup: Psid, primarygroupsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor.rawAddress.toString(), absolutesecuritydescriptor.rawAddress.toString(), absolutesecuritydescriptorsize.rawAddress.toString(), dacl.rawAddress.toString(), daclsize.rawAddress.toString(), sacl.rawAddress.toString(), saclsize.rawAddress.toString(), owner.rawAddress.toString(), ownersize.rawAddress.toString(), primarygroup.rawAddress.toString(), primarygroupsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlSetGroupSecurityDescriptor(securitydescriptor.rawAddress.toString(), group.rawAddress.toString(), groupdefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlSetOwnerSecurityDescriptor(securitydescriptor.rawAddress.toString(), owner.rawAddress.toString(), ownerdefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(mode.toInt()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(mode.toInt()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubAuthorityCountSid(sid: Psid): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlSubAuthorityCountSid(sid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlSubAuthoritySid(sid.rawAddress.toString(), subauthority.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeToSecondsSince1980(time: ConstPtr, elapsedseconds: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlTimeToSecondsSince1980(time.rawAddress.toString(), elapsedseconds.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToCountedOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlUnicodeStringToCountedOemString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToCustomCPN(customcp: ConstPtr, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlUnicodeToCustomCPN(customcp.rawAddress.toString(), customcpstring.rawAddress.toString(), maxbytesincustomcpstring.toInt(), bytesincustomcpstring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlUnicodeToMultiByteN(multibytestring.rawAddress.toString(), maxbytesinmultibytestring.toInt(), bytesinmultibytestring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlUnicodeToOemN(oemstring.rawAddress.toString(), maxbytesinoemstring.toInt(), bytesinoemstring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToCountedOemString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeStringToOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToOemString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeToCustomCPN(customcp: ConstPtr, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToCustomCPN(customcp.rawAddress.toString(), customcpstring.rawAddress.toString(), maxbytesincustomcpstring.toInt(), bytesincustomcpstring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToMultiByteN(multibytestring.rawAddress.toString(), maxbytesinmultibytestring.toInt(), bytesinmultibytestring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToOemN(oemstring.rawAddress.toString(), maxbytesinoemstring.toInt(), bytesinoemstring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlValidSid(sid: Psid): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlValidSid(sid.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlValidateUnicodeString(flags: UInt, string: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlValidateUnicodeString(flags.toInt(), string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxOemStringToUnicodeSize(oemstring: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlxOemStringToUnicodeSize(oemstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxUnicodeStringToOemSize(unicodestring: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemRtlxUnicodeStringToOemSize(unicodestring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: ConstPtr, clienttokeninformation: ConstPtr, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr, genericmapping: ConstPtr, accessmode: Byte, grantedaccess: MutPtr, accessstatus: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAccessCheckFromState(securitydescriptor.rawAddress.toString(), primarytokeninformation.rawAddress.toString(), clienttokeninformation.rawAddress.toString(), desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.rawAddress.toString(), genericmapping.rawAddress.toString(), accessmode.toInt(), grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: ConstPtr, clienttoken: ConstPtr, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr, genericmapping: ConstPtr, accessmode: Byte, grantedaccess: MutPtr, accessstatus: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAccessCheckFromStateEx(securitydescriptor.rawAddress.toString(), primarytoken.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.rawAddress.toString(), genericmapping.rawAddress.toString(), accessmode.toInt(), grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAdjustAccessStateForAccessConstraints(objecttype: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForAccessConstraints(objecttype.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAdjustAccessStateForTrustLabel(objecttype: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForTrustLabel(objecttype.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAdjustObjectSecurity(objectname: ConstPtr, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, adjusteddescriptor: MutPtr, applyadjusteddescriptor: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAdjustObjectSecurity(objectname.rawAddress.toString(), originaldescriptor.rawAddress.toString(), proposeddescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), adjusteddescriptor.rawAddress.toString(), applyadjusteddescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAppendPrivileges(accessstate: MutPtr, privileges: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAppendPrivileges(accessstate.rawAddress.toString(), privileges.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(bsuccess, selftestcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditHardLinkCreation(filename: ConstPtr, linkname: ConstPtr, bsuccess: Boolean) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreation(filename.rawAddress.toString(), linkname.rawAddress.toString(), bsuccess)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditHardLinkCreationWithTransaction(filename: ConstPtr, linkname: ConstPtr, bsuccess: Boolean, transactionid: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreationWithTransaction(filename.rawAddress.toString(), linkname.rawAddress.toString(), bsuccess, transactionid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditTransactionStateChange(transactionid: ConstPtr, resourcemanagerid: ConstPtr, newtransactionstate: UInt) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditTransactionStateChange(transactionid.rawAddress.toString(), resourcemanagerid.rawAddress.toString(), newtransactionstate.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContext(securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, stagingenabled: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContextEx(securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), stagingenabled.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditingFileEvents(accessgranted, securitydescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContext(accessgranted, securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, stagingenabled: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContextEx(accessgranted, securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), stagingenabled.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditingFileOrGlobalEvents(accessgranted, securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEvents(accessgranted, securitydescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEventsWithContext(accessgranted, securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeCaptureSubjectContextEx(thread.toString(), process.toString(), subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, aceremoved: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeCheckForCriticalAceRemoval(currentdescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), aceremoved.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: ConstPtr, remotesession: Boolean, clientcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeCreateClientSecurity(clientthread.toString(), clientsecurityqos.rawAddress.toString(), remotesession, clientcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seCreateClientSecurityFromSubjectContext(subjectcontext: ConstPtr, clientsecurityqos: ConstPtr, serverisremote: Boolean, clientcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeCreateClientSecurityFromSubjectContext(subjectcontext.rawAddress.toString(), clientsecurityqos.rawAddress.toString(), serverisremote, clientcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seDeleteClientSecurity(clientcontext: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeDeleteClientSecurity(clientcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seDeleteObjectAuditAlarm(obj: ConstPtr, handle: Handle) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarm(obj.rawAddress.toString(), handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seDeleteObjectAuditAlarmWithTransaction(obj: ConstPtr, handle: Handle, transactionid: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarmWithTransaction(obj.rawAddress.toString(), handle.rawAddress.toString(), transactionid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seExamineSacl(sacl: ConstPtr, resourcesacl: ConstPtr, token: ConstPtr, desiredaccess: UInt, accessgranted: Boolean, generateaudit: MutPtr, generatealarm: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeExamineSacl(sacl.rawAddress.toString(), resourcesacl.rawAddress.toString(), token.rawAddress.toString(), desiredaccess.toInt(), accessgranted, generateaudit.rawAddress.toString(), generatealarm.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seFilterToken(existingtoken: ConstPtr, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, filteredtoken: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeFilterToken(existingtoken.rawAddress.toString(), flags.toInt(), sidstodisable.rawAddress.toString(), privilegestodelete.rawAddress.toString(), restrictedsids.rawAddress.toString(), filteredtoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seFreePrivileges(privileges: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeFreePrivileges(privileges.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seImpersonateClient(clientcontext: ConstPtr, serverthread: Pethread) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeImpersonateClient(clientcontext.rawAddress.toString(), serverthread.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seImpersonateClientEx(clientcontext: ConstPtr, serverthread: Pethread): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeImpersonateClientEx(clientcontext.rawAddress.toString(), serverthread.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seLocateProcessImageName(process: Peprocess, pimagefilename: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeLocateProcessImageName(process.toString(), pimagefilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seMarkLogonSessionForTerminationNotification(logonid: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotification(logonid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seMarkLogonSessionForTerminationNotificationEx(logonid: ConstPtr, pserversilo: Pesilo): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotificationEx(logonid.rawAddress.toString(), pserversilo.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seOpenObjectAuditAlarm(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarm(objecttypename.rawAddress.toString(), obj.rawAddress.toString(), absoluteobjectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString(), objectcreated, accessgranted, accessmode.toInt(), generateonclose.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seOpenObjectAuditAlarmWithTransaction(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr, generateonclose: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarmWithTransaction(objecttypename.rawAddress.toString(), obj.rawAddress.toString(), absoluteobjectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString(), objectcreated, accessgranted, accessmode.toInt(), transactionid.rawAddress.toString(), generateonclose.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seOpenObjectForDeleteAuditAlarm(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarm(objecttypename.rawAddress.toString(), obj.rawAddress.toString(), absoluteobjectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString(), objectcreated, accessgranted, accessmode.toInt(), generateonclose.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr, generateonclose: MutPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename.rawAddress.toString(), obj.rawAddress.toString(), absoluteobjectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString(), objectcreated, accessgranted, accessmode.toInt(), transactionid.rawAddress.toString(), generateonclose.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sePrivilegeCheck(requiredprivileges: MutPtr, subjectsecuritycontext: ConstPtr, accessmode: Byte): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSePrivilegeCheck(requiredprivileges.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), accessmode.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQueryAuthenticationIdToken(token: ConstPtr, authenticationid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeQueryAuthenticationIdToken(token.rawAddress.toString(), authenticationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQueryInformationToken(token: ConstPtr, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeQueryInformationToken(token.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQuerySecurityDescriptorInfo(securityinformation: ConstPtr, securitydescriptor: PsecurityDescriptor, length: MutPtr, objectssecuritydescriptor: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeQuerySecurityDescriptorInfo(securityinformation.rawAddress.toString(), securitydescriptor.rawAddress.toString(), length.rawAddress.toString(), objectssecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQueryServerSiloToken(token: ConstPtr, pserversilo: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeQueryServerSiloToken(token.rawAddress.toString(), pserversilo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQuerySessionIdToken(token: ConstPtr, sessionid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeQuerySessionIdToken(token.rawAddress.toString(), sessionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQuerySessionIdTokenEx(token: ConstPtr, sessionid: MutPtr, isservicesession: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeQuerySessionIdTokenEx(token.rawAddress.toString(), sessionid.rawAddress.toString(), isservicesession.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutine(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutineEx(0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: ConstPtr, usersid: Psid, auditparameters: ConstPtr, auditsubcategoryid: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeReportSecurityEventWithSubCategory(flags.toInt(), sourcename.rawAddress.toString(), usersid.rawAddress.toString(), auditparameters.rawAddress.toString(), auditsubcategoryid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSetAccessStateGenericMapping(accessstate: MutPtr, genericmapping: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeSetAccessStateGenericMapping(accessstate.rawAddress.toString(), genericmapping.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seSetSecurityDescriptorInfo(obj: ConstPtr, securityinformation: ConstPtr, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, pooltype: PoolType, genericmapping: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfo(obj.rawAddress.toString(), securityinformation.rawAddress.toString(), modificationdescriptor.rawAddress.toString(), objectssecuritydescriptor.rawAddress.toString(), pooltype, genericmapping.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSetSecurityDescriptorInfoEx(obj: ConstPtr, securityinformation: ConstPtr, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, autoinheritflags: UInt, pooltype: PoolType, genericmapping: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfoEx(obj.rawAddress.toString(), securityinformation.rawAddress.toString(), modificationdescriptor.rawAddress.toString(), objectssecuritydescriptor.rawAddress.toString(), autoinheritflags.toInt(), pooltype, genericmapping.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seShouldCheckForAccessRightsFromParent(objecttype: ConstPtr, childdescriptor: PsecurityDescriptor, accessstate: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeShouldCheckForAccessRightsFromParent(objecttype.rawAddress.toString(), childdescriptor.rawAddress.toString(), accessstate.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenFromAccessInformation(accessinformation: ConstPtr, token: MutPtr, length: UInt, requiredlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeTokenFromAccessInformation(accessinformation.rawAddress.toString(), token.rawAddress.toString(), length.toInt(), requiredlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenIsAdmin(token: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeTokenIsAdmin(token.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenIsRestricted(token: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeTokenIsRestricted(token.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenIsWriteRestricted(token: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeTokenIsWriteRestricted(token.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenType(token: ConstPtr): TokenType =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeTokenType(token.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutine(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutineEx(0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secLookupAccountName(name: ConstPtr, sidsize: MutPtr, sid: Psid, nameuse: MutPtr, domainsize: MutPtr, referenceddomain: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSecLookupAccountName(name.rawAddress.toString(), sidsize.rawAddress.toString(), sid.rawAddress.toString(), nameuse.rawAddress.toString(), domainsize.rawAddress.toString(), referenceddomain.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secLookupAccountSid(sid: Psid, namesize: MutPtr, namebuffer: MutPtr, domainsize: MutPtr, domainbuffer: MutPtr, nameuse: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSecLookupAccountSid(sid.rawAddress.toString(), namesize.rawAddress.toString(), namebuffer.rawAddress.toString(), domainsize.rawAddress.toString(), domainbuffer.rawAddress.toString(), nameuse.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSecLookupWellKnownSid(sidtype, sid.rawAddress.toString(), sidbuffersize.toInt(), sidsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secMakeSPN(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, spn: MutPtr, length: MutPtr, allocate: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSecMakeSPN(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instancename.rawAddress.toString(), instanceport.toInt(), referrer.rawAddress.toString(), spn.rawAddress.toString(), length.rawAddress.toString(), allocate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secMakeSPNEx(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, targetinfo: MutPtr, spn: MutPtr, length: MutPtr, allocate: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSecMakeSPNEx(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instancename.rawAddress.toString(), instanceport.toInt(), referrer.rawAddress.toString(), targetinfo.rawAddress.toString(), spn.rawAddress.toString(), length.rawAddress.toString(), allocate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secMakeSPNEx2(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, intargetinfo: MutPtr, spn: MutPtr, totalsize: MutPtr, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSecMakeSPNEx2(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instancename.rawAddress.toString(), instanceport.toInt(), referrer.rawAddress.toString(), intargetinfo.rawAddress.toString(), spn.rawAddress.toString(), totalsize.rawAddress.toString(), allocate, istargetinfomarshaled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setContextAttributesW(phcontext: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSetContextAttributesW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiAcceptSecurityContextAsync(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSspiAcceptSecurityContextAsync(asynccontext.rawAddress.toString(), phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), pinput.rawAddress.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiAcquireCredentialsHandleAsyncA(asynccontext: MutPtr, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiAcquireCredentialsHandleAsyncW(asynccontext: MutPtr, pszprincipal: ConstPtr, pszpackage: ConstPtr, fcredentialuse: UInt, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCreateAsyncContext(): MutPtr =
    if (windowsWdkStorageFilesystemNapiAddon != null) MutPtr((windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSspiCreateAsyncContext() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDeleteSecurityContextAsync(asynccontext: MutPtr, phcontext: ConstPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSspiDeleteSecurityContextAsync(asynccontext.rawAddress.toString(), phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiFreeAsyncContext(handle: ConstPtr) {
    if (windowsWdkStorageFilesystemNapiAddon != null) {
        windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSspiFreeAsyncContext(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiFreeCredentialsHandleAsync(asynccontext: MutPtr, phcredential: ConstPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSspiFreeCredentialsHandleAsync(asynccontext.rawAddress.toString(), phcredential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiGetAsyncCallStatus(handle: ConstPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSspiGetAsyncCallStatus(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiInitializeSecurityContextAsyncA(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncA(asynccontext.rawAddress.toString(), phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiInitializeSecurityContextAsyncW(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncW(asynccontext.rawAddress.toString(), phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiReinitAsyncContext(handle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSspiReinitAsyncContext(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiSetAsyncNotifyCallback(context: ConstPtr, callback: SspiAsyncNotifyCallback, callbackdata: ConstPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemSspiSetAsyncNotifyCallback(context.rawAddress.toString(), 0L.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifySignature(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemVerifySignature(phcontext.rawAddress.toString(), pmessage.rawAddress.toString(), messageseqno.toInt(), pfqop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwAccessCheckAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), desiredaccess.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwAdjustGroupsToken(tokenhandle.rawAddress.toString(), resettodefault, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwAdjustPrivilegesToken(tokenhandle.rawAddress.toString(), disableallprivileges, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, regionsize: MutPtr, allocationtype: UInt, protect: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), zerobits.toString(), regionsize.rawAddress.toString(), allocationtype.toInt(), protect.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemoryEx(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress.toString(), extendedparametercount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwCancelIoFileEx(filehandle.rawAddress.toString(), iorequesttocancel.rawAddress.toString(), iostatusblock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCloseObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwCloseObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwCreateDirectoryObject(directoryhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, eventtype: EventType, initialstate: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwCreateEvent(eventhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), eventtype, initialstate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateSectionEx(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwCreateSectionEx(sectionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress.toString(), extendedparameters.rawAddress.toString(), extendedparametercount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteFile(objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwDeleteFile(objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwDeleteObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwDuplicateObject(sourceprocesshandle.rawAddress.toString(), sourcehandle.rawAddress.toString(), targetprocesshandle.rawAddress.toString(), targethandle.rawAddress.toString(), desiredaccess.toInt(), handleattributes.toInt(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwDuplicateToken(existingtokenhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), effectiveonly, tokentype, newtokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, newtokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwFilterToken(existingtokenhandle.rawAddress.toString(), flags.toInt(), sidstodisable.rawAddress.toString(), privilegestodelete.rawAddress.toString(), restrictedsids.rawAddress.toString(), newtokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwFlushBuffersFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr, parameterssize: UInt, iostatusblock: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwFlushBuffersFileEx(filehandle.rawAddress.toString(), flags.toInt(), parameters.rawAddress.toString(), parameterssize.toInt(), iostatusblock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, iostatus: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwFlushVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), iostatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, freetype: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwFreeVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), freetype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwFsControlFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fscontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwImpersonateAnonymousToken(threadhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwLockFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), byteoffset.rawAddress.toString(), length.rawAddress.toString(), key.toInt(), failimmediately, exclusivelock) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwNotifyChangeKey(keyhandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), completionfilter.toInt(), watchtree, buffer.rawAddress.toString(), buffersize.toInt(), asynchronous) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwOpenDirectoryObject(directoryhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwOpenObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress.toString(), objectcreation, accessgranted, generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwOpenProcessToken(processhandle.rawAddress.toString(), desiredaccess.toInt(), tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwOpenProcessTokenEx(processhandle.rawAddress.toString(), desiredaccess.toInt(), handleattributes.toInt(), tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwOpenThreadToken(threadhandle.rawAddress.toString(), desiredaccess.toInt(), openasself, tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwOpenThreadTokenEx(threadhandle.rawAddress.toString(), desiredaccess.toInt(), openasself, handleattributes.toInt(), tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, result: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwPrivilegeCheck(clienttoken.rawAddress.toString(), requiredprivileges.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrivilegeObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwPrivilegeObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), privileges.rawAddress.toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrivilegedServiceAuditAlarm(subsystemname: ConstPtr, servicename: ConstPtr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwPrivilegedServiceAuditAlarm(subsystemname.rawAddress.toString(), servicename.rawAddress.toString(), clienttoken.rawAddress.toString(), privileges.rawAddress.toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, returnsingleentry, filename.rawAddress.toString(), restartscan) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFileEx(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, queryflags.toInt(), filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQueryDirectoryObject(directoryhandle.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, restartscan, context.rawAddress.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQueryEaFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, ealist.rawAddress.toString(), ealistlength.toInt(), eaindex.rawAddress.toString(), restartscan) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryFullAttributesFile(objectattributes: ConstPtr, fileinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQueryFullAttributesFile(objectattributes.rawAddress.toString(), fileinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQueryInformationToken(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr, objectinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQueryObject(handle.rawAddress.toString(), objectinformationclass, objectinformation.rawAddress.toString(), objectinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQueryQuotaInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, sidlist.rawAddress.toString(), sidlistlength.toInt(), startsid.rawAddress.toString(), restartscan) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQuerySecurityObject(handle.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString(), length.toInt(), lengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr, memoryinformationlength: ULong, returnlength: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQueryVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), memoryinformationclass, memoryinformation.rawAddress.toString(), memoryinformationlength.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwQueryVolumeInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwSetEaFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetEvent(eventhandle: Handle, previousstate: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwSetEvent(eventhandle.rawAddress.toString(), previousstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwSetInformationToken(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr, vminformation: ConstPtr, vminformationlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwSetInformationVirtualMemory(processhandle.rawAddress.toString(), vminformationclass, numberofentries.toString(), virtualaddresses.rawAddress.toString(), vminformation.rawAddress.toString(), vminformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwSetQuotaInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwSetSecurityObject(handle.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: ConstPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwSetVolumeInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwUnlockFile(filehandle: Handle, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAddon != null) (windowsWdkStorageFilesystemNapiAddon.windowssysWindowsWdkStorageFilesystemZwUnlockFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), byteoffset.rawAddress.toString(), length.rawAddress.toString(), key.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
