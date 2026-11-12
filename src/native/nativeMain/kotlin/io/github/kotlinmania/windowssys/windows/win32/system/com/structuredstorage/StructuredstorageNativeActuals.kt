@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgm
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageGetConvertStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantClear
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToString
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageReadClassStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageReadClassStm
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageSetConvertStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageStgSetTimes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageWriteClassStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageWriteClassStm
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun clearPropVariantArray(rgpropvar: MutPtr, cvars: UInt) {
    windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(rgpropvar.rawAddress.toCPointer<ByteVar>(), cvars)
}

public actual fun coGetInstanceFromFile(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(pserverinfo.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), dwclsctx, grfmode, pwszname.rawAddress.toCPointer<ByteVar>(), dwcount, presults.rawAddress.toCPointer<ByteVar>())

public actual fun coGetInstanceFromIStorage(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pstg: MutPtr, dwcount: UInt, presults: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(pserverinfo.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), dwclsctx, pstg.rawAddress.toCPointer<ByteVar>(), dwcount, presults.rawAddress.toCPointer<ByteVar>())

public actual fun coGetInterfaceAndReleaseStream(pstm: MutPtr, iid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(pstm.rawAddress.toCPointer<ByteVar>(), iid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(hglobal.rawAddress.toCPointer<ByteVar>(), fdeleteonrelease, pplkbyt.rawAddress.toCPointer<ByteVar>())

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(hglobal.rawAddress.toCPointer<ByteVar>(), fdeleteonrelease, ppstm.rawAddress.toCPointer<ByteVar>())

public actual fun fmtIdToPropStgName(pfmtid: ConstPtr, oszname: Pwstr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(pfmtid.rawAddress.toCPointer<ByteVar>(), oszname.rawAddress.toCPointer<ByteVar>())

public actual fun freePropVariantArray(cvariants: UInt, rgvars: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(cvariants, rgvars.rawAddress.toCPointer<ByteVar>())

public actual fun getConvertStg(pstg: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageGetConvertStg(pstg.rawAddress.toCPointer<ByteVar>())

public actual fun getHGlobalFromILockBytes(plkbyt: MutPtr, phglobal: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(plkbyt.rawAddress.toCPointer<ByteVar>(), phglobal.rawAddress.toCPointer<ByteVar>())

public actual fun getHGlobalFromStream(pstm: MutPtr, phglobal: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(pstm.rawAddress.toCPointer<ByteVar>(), phglobal.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromBooleanVector(prgf: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(prgf.rawAddress.toCPointer<ByteVar>(), celems, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromBuffer(pv: ConstPtr, cb: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(pv.rawAddress.toCPointer<ByteVar>(), cb, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromCLSID(clsid: ConstPtr, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(clsid.rawAddress.toCPointer<ByteVar>(), ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromDoubleVector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(prgn.rawAddress.toCPointer<ByteVar>(), celems, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromFileTime(pftin: ConstPtr, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(pftin.rawAddress.toCPointer<ByteVar>(), ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromFileTimeVector(prgft: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(prgft.rawAddress.toCPointer<ByteVar>(), celems, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromGUIDAsString(guid: ConstPtr, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(guid.rawAddress.toCPointer<ByteVar>(), ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(prgn.rawAddress.toCPointer<ByteVar>(), celems, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(prgn.rawAddress.toCPointer<ByteVar>(), celems, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(prgn.rawAddress.toCPointer<ByteVar>(), celems, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: ConstPtr, ielem: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(propvarin.rawAddress.toCPointer<ByteVar>(), ielem, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(hinst.rawAddress.toCPointer<ByteVar>(), id, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(psz.rawAddress.toCPointer<ByteVar>(), ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromStringVector(prgsz: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(prgsz.rawAddress.toCPointer<ByteVar>(), celems, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromUInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(prgn.rawAddress.toCPointer<ByteVar>(), celems, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromUInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(prgn.rawAddress.toCPointer<ByteVar>(), celems, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantFromUInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(prgn.rawAddress.toCPointer<ByteVar>(), celems, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: ConstPtr, ppropvarvector: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(propvarsingle.rawAddress.toCPointer<ByteVar>(), ppropvarvector.rawAddress.toCPointer<ByteVar>())

public actual fun oleConvertIStorageToOLESTREAM(pstg: MutPtr, lpolestream: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(pstg.rawAddress.toCPointer<ByteVar>(), lpolestream.rawAddress.toCPointer<ByteVar>())

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: MutPtr, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: ConstPtr, polestm: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(pstg.rawAddress.toCPointer<ByteVar>(), cfformat, lwidth, lheight, dwsize, pmedium.rawAddress.toCPointer<ByteVar>(), polestm.rawAddress.toCPointer<ByteVar>())

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: ConstPtr, pstg: MutPtr, ptd: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(lpolestream.rawAddress.toCPointer<ByteVar>(), pstg.rawAddress.toCPointer<ByteVar>(), ptd.rawAddress.toCPointer<ByteVar>())

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: ConstPtr, pstg: MutPtr, pcfformat: MutPtr, plwwidth: MutPtr, plheight: MutPtr, pdwsize: MutPtr, pmedium: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(polestm.rawAddress.toCPointer<ByteVar>(), pstg.rawAddress.toCPointer<ByteVar>(), pcfformat.rawAddress.toCPointer<ByteVar>(), plwwidth.rawAddress.toCPointer<ByteVar>(), plheight.rawAddress.toCPointer<ByteVar>(), pdwsize.rawAddress.toCPointer<ByteVar>(), pmedium.rawAddress.toCPointer<ByteVar>())

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(oszname.rawAddress.toCPointer<ByteVar>(), pfmtid.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantChangeType(ppropvardest: MutPtr, propvarsrc: ConstPtr, flags: PropvarChangeFlags, vt: Variant.Varenum): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(ppropvardest.rawAddress.toCPointer<ByteVar>(), propvarsrc.rawAddress.toCPointer<ByteVar>(), flags, vt)

public actual fun propVariantClear(pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantClear(pvar.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantCompareEx(propvar1: ConstPtr, propvar2: ConstPtr, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(propvar1.rawAddress.toCPointer<ByteVar>(), propvar2.rawAddress.toCPointer<ByteVar>(), unit, flags)

public actual fun propVariantCopy(pvardest: MutPtr, pvarsrc: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(pvardest.rawAddress.toCPointer<ByteVar>(), pvarsrc.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetBooleanElem(propvar: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(propvar.rawAddress.toCPointer<ByteVar>(), ielem, pfval.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetDoubleElem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(propvar.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetElementCount(propvar: ConstPtr): UInt =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(propvar.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetFileTimeElem(propvar: ConstPtr, ielem: UInt, pftval: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(propvar.rawAddress.toCPointer<ByteVar>(), ielem, pftval.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(propvar.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(propvar.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(propvar.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetStringElem(propvar: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(propvar.rawAddress.toCPointer<ByteVar>(), ielem, ppszval.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetUInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(propvar.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetUInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(propvar.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantGetUInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(propvar.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToBSTR(propvar: ConstPtr, pbstrout: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(propvar.rawAddress.toCPointer<ByteVar>(), pbstrout.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToBoolean(propvarin: ConstPtr, pfret: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(propvarin.rawAddress.toCPointer<ByteVar>(), pfret.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToBooleanVector(propvar: ConstPtr, prgf: MutPtr, crgf: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(propvar.rawAddress.toCPointer<ByteVar>(), prgf.rawAddress.toCPointer<ByteVar>(), crgf, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToBooleanVectorAlloc(propvar: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(propvar.rawAddress.toCPointer<ByteVar>(), pprgf.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToBooleanWithDefault(propvarin: ConstPtr, fdefault: Bool): Bool =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(propvarin.rawAddress.toCPointer<ByteVar>(), fdefault)

public actual fun propVariantToBuffer(propvar: ConstPtr, pv: MutPtr, cb: UInt): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(propvar.rawAddress.toCPointer<ByteVar>(), pv.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun propVariantToDouble(propvarin: ConstPtr, pdblret: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(propvarin.rawAddress.toCPointer<ByteVar>(), pdblret.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToDoubleVector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(propvar.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToDoubleVectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(propvar.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToDoubleWithDefault(propvarin: ConstPtr, dbldefault: Double): Double =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(propvarin.rawAddress.toCPointer<ByteVar>(), dbldefault)

public actual fun propVariantToFileTime(propvar: ConstPtr, pstfout: Variant.PstimeFlags, pftout: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(propvar.rawAddress.toCPointer<ByteVar>(), pstfout, pftout.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToFileTimeVector(propvar: ConstPtr, prgft: MutPtr, crgft: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(propvar.rawAddress.toCPointer<ByteVar>(), prgft.rawAddress.toCPointer<ByteVar>(), crgft, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToFileTimeVectorAlloc(propvar: ConstPtr, pprgft: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(propvar.rawAddress.toCPointer<ByteVar>(), pprgft.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToGUID(propvar: ConstPtr, pguid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(propvar.rawAddress.toCPointer<ByteVar>(), pguid.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToInt16(propvarin: ConstPtr, piret: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(propvarin.rawAddress.toCPointer<ByteVar>(), piret.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(propvar.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(propvar.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToInt16WithDefault(propvarin: ConstPtr, idefault: Short): Short =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(propvarin.rawAddress.toCPointer<ByteVar>(), idefault)

public actual fun propVariantToInt32(propvarin: ConstPtr, plret: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(propvarin.rawAddress.toCPointer<ByteVar>(), plret.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(propvar.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(propvar.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToInt32WithDefault(propvarin: ConstPtr, ldefault: Int): Int =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(propvarin.rawAddress.toCPointer<ByteVar>(), ldefault)

public actual fun propVariantToInt64(propvarin: ConstPtr, pllret: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(propvarin.rawAddress.toCPointer<ByteVar>(), pllret.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(propvar.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(propvar.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToInt64WithDefault(propvarin: ConstPtr, lldefault: Long): Long =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(propvarin.rawAddress.toCPointer<ByteVar>(), lldefault)

public actual fun propVariantToString(propvar: ConstPtr, psz: Pwstr, cch: UInt): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToString(propvar.rawAddress.toCPointer<ByteVar>(), psz.rawAddress.toCPointer<ByteVar>(), cch)

public actual fun propVariantToStringAlloc(propvar: ConstPtr, ppszout: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(propvar.rawAddress.toCPointer<ByteVar>(), ppszout.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToStringVector(propvar: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(propvar.rawAddress.toCPointer<ByteVar>(), prgsz.rawAddress.toCPointer<ByteVar>(), crgsz, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToStringVectorAlloc(propvar: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(propvar.rawAddress.toCPointer<ByteVar>(), pprgsz.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToStringWithDefault(propvarin: ConstPtr, pszdefault: Pcwstr): Pcwstr =
    ConstPtr(windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(propvarin.rawAddress.toCPointer<ByteVar>(), pszdefault.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun propVariantToUInt16(propvarin: ConstPtr, puiret: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(propvarin.rawAddress.toCPointer<ByteVar>(), puiret.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToUInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(propvar.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToUInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(propvar.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToUInt16WithDefault(propvarin: ConstPtr, uidefault: UShort): UShort =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(propvarin.rawAddress.toCPointer<ByteVar>(), uidefault)

public actual fun propVariantToUInt32(propvarin: ConstPtr, pulret: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(propvarin.rawAddress.toCPointer<ByteVar>(), pulret.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToUInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(propvar.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToUInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(propvar.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToUInt32WithDefault(propvarin: ConstPtr, uldefault: UInt): UInt =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(propvarin.rawAddress.toCPointer<ByteVar>(), uldefault)

public actual fun propVariantToUInt64(propvarin: ConstPtr, pullret: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(propvarin.rawAddress.toCPointer<ByteVar>(), pullret.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToUInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(propvar.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToUInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(propvar.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToUInt64WithDefault(propvarin: ConstPtr, ulldefault: ULong): ULong =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(propvarin.rawAddress.toCPointer<ByteVar>(), ulldefault)

public actual fun propVariantToVariant(ppropvar: ConstPtr, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(ppropvar.rawAddress.toCPointer<ByteVar>(), pvar.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToWinRTPropertyValue(propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(propvar.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun readClassStg(pstg: MutPtr, pclsid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageReadClassStg(pstg.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>())

public actual fun readClassStm(pstm: MutPtr, pclsid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageReadClassStm(pstm.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>())

public actual fun readFmtUserTypeStg(pstg: MutPtr, pcf: MutPtr, lplpszusertype: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(pstg.rawAddress.toCPointer<ByteVar>(), pcf.rawAddress.toCPointer<ByteVar>(), lplpszusertype.rawAddress.toCPointer<ByteVar>())

public actual fun setConvertStg(pstg: MutPtr, fconvert: Bool): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageSetConvertStg(pstg.rawAddress.toCPointer<ByteVar>(), fconvert)

public actual fun stgConvertPropertyToVariant(pprop: ConstPtr, codepage: UShort, pvar: MutPtr, pma: MutPtr): Boolean =
    windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(pprop.rawAddress.toCPointer<ByteVar>(), codepage, pvar.rawAddress.toCPointer<ByteVar>(), pma.rawAddress.toCPointer<ByteVar>())

public actual fun stgConvertVariantToProperty(pvar: ConstPtr, codepage: UShort, pprop: MutPtr, pcb: MutPtr, pid: UInt, freserved: Boolean, pcindirect: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(pvar.rawAddress.toCPointer<ByteVar>(), codepage, pprop.rawAddress.toCPointer<ByteVar>(), pcb.rawAddress.toCPointer<ByteVar>(), pid, freserved, pcindirect.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(pwcsname.rawAddress.toCPointer<ByteVar>(), grfmode, reserved, ppstgopen.rawAddress.toCPointer<ByteVar>())

public actual fun stgCreateDocfileOnILockBytes(plkbyt: MutPtr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(plkbyt.rawAddress.toCPointer<ByteVar>(), grfmode, reserved, ppstgopen.rawAddress.toCPointer<ByteVar>())

public actual fun stgCreatePropSetStg(pstorage: MutPtr, dwreserved: UInt, pppropsetstg: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(pstorage.rawAddress.toCPointer<ByteVar>(), dwreserved, pppropsetstg.rawAddress.toCPointer<ByteVar>())

public actual fun stgCreatePropStg(punk: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(punk.rawAddress.toCPointer<ByteVar>(), fmtid.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>(), grfflags, dwreserved, pppropstg.rawAddress.toCPointer<ByteVar>())

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(pwcsname.rawAddress.toCPointer<ByteVar>(), grfmode, stgfmt, grfattrs, pstgoptions.rawAddress.toCPointer<ByteVar>(), psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppobjectopen.rawAddress.toCPointer<ByteVar>())

public actual fun stgDeserializePropVariant(pprop: ConstPtr, cbmax: UInt, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(pprop.rawAddress.toCPointer<ByteVar>(), cbmax, ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(pwcsname.rawAddress.toCPointer<ByteVar>(), ppflb.rawAddress.toCPointer<ByteVar>())

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: MutPtr, ppflb: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(pilb.rawAddress.toCPointer<ByteVar>(), ppflb.rawAddress.toCPointer<ByteVar>())

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(pwcsname.rawAddress.toCPointer<ByteVar>())

public actual fun stgIsStorageILockBytes(plkbyt: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(plkbyt.rawAddress.toCPointer<ByteVar>())

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: MutPtr, grfmode: UInt, asyncflags: UInt, ppstgopen: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(pflb.rawAddress.toCPointer<ByteVar>(), grfmode, asyncflags, ppstgopen.rawAddress.toCPointer<ByteVar>())

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(pwcsdfname.rawAddress.toCPointer<ByteVar>(), grfmode, reserved, ppstgopen.rawAddress.toCPointer<ByteVar>())

public actual fun stgOpenPropStg(punk: MutPtr, fmtid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(punk.rawAddress.toCPointer<ByteVar>(), fmtid.rawAddress.toCPointer<ByteVar>(), grfflags, dwreserved, pppropstg.rawAddress.toCPointer<ByteVar>())

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(pwcsname.rawAddress.toCPointer<ByteVar>(), pstgpriority.rawAddress.toCPointer<ByteVar>(), grfmode, snbexclude.rawAddress.toCPointer<ByteVar>(), reserved, ppstgopen.rawAddress.toCPointer<ByteVar>())

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(pwcsname.rawAddress.toCPointer<ByteVar>(), grfmode, stgfmt, grfattrs, pstgoptions.rawAddress.toCPointer<ByteVar>(), psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppobjectopen.rawAddress.toCPointer<ByteVar>())

public actual fun stgOpenStorageOnILockBytes(plkbyt: MutPtr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(plkbyt.rawAddress.toCPointer<ByteVar>(), pstgpriority.rawAddress.toCPointer<ByteVar>(), grfmode, snbexclude.rawAddress.toCPointer<ByteVar>(), reserved, ppstgopen.rawAddress.toCPointer<ByteVar>())

public actual fun stgPropertyLengthAsVariant(pprop: ConstPtr, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(pprop.rawAddress.toCPointer<ByteVar>(), cbprop, codepage, breserved)

public actual fun stgSerializePropVariant(ppropvar: ConstPtr, ppprop: MutPtr, pcb: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(ppropvar.rawAddress.toCPointer<ByteVar>(), ppprop.rawAddress.toCPointer<ByteVar>(), pcb.rawAddress.toCPointer<ByteVar>())

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: ConstPtr, patime: ConstPtr, pmtime: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageStgSetTimes(lpszname.rawAddress.toCPointer<ByteVar>(), pctime.rawAddress.toCPointer<ByteVar>(), patime.rawAddress.toCPointer<ByteVar>(), pmtime.rawAddress.toCPointer<ByteVar>())

public actual fun variantToPropVariant(pvar: ConstPtr, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(pvar.rawAddress.toCPointer<ByteVar>(), ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: MutPtr, ppropvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(punkpropertyvalue.rawAddress.toCPointer<ByteVar>(), ppropvar.rawAddress.toCPointer<ByteVar>())

public actual fun writeClassStg(pstg: MutPtr, rclsid: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageWriteClassStg(pstg.rawAddress.toCPointer<ByteVar>(), rclsid.rawAddress.toCPointer<ByteVar>())

public actual fun writeClassStm(pstm: MutPtr, rclsid: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageWriteClassStm(pstm.rawAddress.toCPointer<ByteVar>(), rclsid.rawAddress.toCPointer<ByteVar>())

public actual fun writeFmtUserTypeStg(pstg: MutPtr, cf: UShort, lpszusertype: Pcwstr): Hresult =
    windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(pstg.rawAddress.toCPointer<ByteVar>(), cf, lpszusertype.rawAddress.toCPointer<ByteVar>())
