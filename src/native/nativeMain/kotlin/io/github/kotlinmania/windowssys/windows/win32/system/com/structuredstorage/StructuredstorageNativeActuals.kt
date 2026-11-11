@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgm
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_clearPropVariantArray
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromFile
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromIStorage
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_coGetInterfaceAndReleaseStream
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_createILockBytesOnHGlobal
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_createStreamOnHGlobal
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_fmtIdToPropStgName
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_freePropVariantArray
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_getConvertStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromILockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromStream
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBooleanVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromCLSID
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromDoubleVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTimeVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromGUIDAsString
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt16Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt32Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt64Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromPropVariantVectorElem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromResource
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringAsVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt16Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt32Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt64Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_initPropVariantVectorFromPropVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAM
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAMEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorage
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorageEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propStgNameToFmtId
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantChangeType
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantClear
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantCompareEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantCopy
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetBooleanElem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetDoubleElem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetElementCount
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetFileTimeElem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt16Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt32Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt64Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetStringElem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt16Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt32Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt64Elem
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToBSTR
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToBoolean
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanWithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToDouble
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleWithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToGUID
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToString
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringWithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64Vector
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64VectorAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_propVariantToWinRTPropertyValue
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_readClassStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_readClassStm
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_readFmtUserTypeStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_setConvertStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgConvertPropertyToVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgConvertVariantToProperty
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfile
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfileOnILockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgCreatePropSetStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgCreatePropStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgCreateStorageEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgDeserializePropVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnFile
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnILockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgIsStorageFile
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgIsStorageILockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgOpenAsyncDocfileOnIFillLockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgOpenLayoutDocfile
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgOpenPropStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgOpenStorage
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageOnILockBytes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgPropertyLengthAsVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgSerializePropVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_stgSetTimes
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_variantToPropVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_winRTPropertyValueToPropVariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_writeClassStg
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_writeClassStm
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_writeFmtUserTypeStg
import io.github.kotlinmania.windowssys.windows.win32.system.variant.PstimeFlags
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun clearPropVariantArray(rgpropvar: COpaquePointer?, cvars: UInt) {
    windowssys_windows_win32_system_com_structuredstorage_clearPropVariantArray(rgpropvar?.value?.toCPointer<ByteVar>(), cvars)
}

public actual fun coGetInstanceFromFile(pserverinfo: COpaquePointer?, pclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromFile(pserverinfo?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), dwclsctx, grfmode, pwszname?.value?.toCPointer<ByteVar>(), dwcount, presults?.value?.toCPointer<ByteVar>())

public actual fun coGetInstanceFromIStorage(pserverinfo: COpaquePointer?, pclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, pstg: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromIStorage(pserverinfo?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), dwclsctx, pstg?.value?.toCPointer<ByteVar>(), dwcount, presults?.value?.toCPointer<ByteVar>())

public actual fun coGetInterfaceAndReleaseStream(pstm: COpaquePointer?, iid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_coGetInterfaceAndReleaseStream(pstm?.value?.toCPointer<ByteVar>(), iid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_createILockBytesOnHGlobal(hglobal?.value?.toCPointer<ByteVar>(), fdeleteonrelease, pplkbyt?.value?.toCPointer<ByteVar>())

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_createStreamOnHGlobal(hglobal?.value?.toCPointer<ByteVar>(), fdeleteonrelease, ppstm?.value?.toCPointer<ByteVar>())

public actual fun fmtIdToPropStgName(pfmtid: COpaquePointer?, oszname: Pwstr): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_fmtIdToPropStgName(pfmtid?.value?.toCPointer<ByteVar>(), oszname?.value?.toCPointer<ByteVar>())

public actual fun freePropVariantArray(cvariants: UInt, rgvars: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_freePropVariantArray(cvariants, rgvars?.value?.toCPointer<ByteVar>())

public actual fun getConvertStg(pstg: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_getConvertStg(pstg?.value?.toCPointer<ByteVar>())

public actual fun getHGlobalFromILockBytes(plkbyt: COpaquePointer?, phglobal: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromILockBytes(plkbyt?.value?.toCPointer<ByteVar>(), phglobal?.value?.toCPointer<ByteVar>())

public actual fun getHGlobalFromStream(pstm: COpaquePointer?, phglobal: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromStream(pstm?.value?.toCPointer<ByteVar>(), phglobal?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromBooleanVector(prgf: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBooleanVector(prgf?.value?.toCPointer<ByteVar>(), celems, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromBuffer(pv: COpaquePointer?, cb: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBuffer(pv?.value?.toCPointer<ByteVar>(), cb, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromCLSID(clsid: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromCLSID(clsid?.value?.toCPointer<ByteVar>(), ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromDoubleVector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromDoubleVector(prgn?.value?.toCPointer<ByteVar>(), celems, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromFileTime(pftin: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTime(pftin?.value?.toCPointer<ByteVar>(), ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromFileTimeVector(prgft: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTimeVector(prgft?.value?.toCPointer<ByteVar>(), celems, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromGUIDAsString(guid: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromGUIDAsString(guid?.value?.toCPointer<ByteVar>(), ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromInt16Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt16Vector(prgn?.value?.toCPointer<ByteVar>(), celems, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromInt32Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt32Vector(prgn?.value?.toCPointer<ByteVar>(), celems, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromInt64Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt64Vector(prgn?.value?.toCPointer<ByteVar>(), celems, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: COpaquePointer?, ielem: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromPropVariantVectorElem(propvarin?.value?.toCPointer<ByteVar>(), ielem, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromResource(hinst?.value?.toCPointer<ByteVar>(), id, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringAsVector(psz?.value?.toCPointer<ByteVar>(), ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromStringVector(prgsz: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringVector(prgsz?.value?.toCPointer<ByteVar>(), celems, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromUInt16Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt16Vector(prgn?.value?.toCPointer<ByteVar>(), celems, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromUInt32Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt32Vector(prgn?.value?.toCPointer<ByteVar>(), celems, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantFromUInt64Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt64Vector(prgn?.value?.toCPointer<ByteVar>(), celems, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: COpaquePointer?, ppropvarvector: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_initPropVariantVectorFromPropVariant(propvarsingle?.value?.toCPointer<ByteVar>(), ppropvarvector?.value?.toCPointer<ByteVar>())

public actual fun oleConvertIStorageToOLESTREAM(pstg: COpaquePointer?, lpolestream: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAM(pstg?.value?.toCPointer<ByteVar>(), lpolestream?.value?.toCPointer<ByteVar>())

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: COpaquePointer?, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: COpaquePointer?, polestm: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAMEx(pstg?.value?.toCPointer<ByteVar>(), cfformat, lwidth, lheight, dwsize, pmedium?.value?.toCPointer<ByteVar>(), polestm?.value?.toCPointer<ByteVar>())

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: COpaquePointer?, pstg: COpaquePointer?, ptd: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorage(lpolestream?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ptd?.value?.toCPointer<ByteVar>())

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: COpaquePointer?, pstg: COpaquePointer?, pcfformat: COpaquePointer?, plwwidth: COpaquePointer?, plheight: COpaquePointer?, pdwsize: COpaquePointer?, pmedium: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorageEx(polestm?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), pcfformat?.value?.toCPointer<ByteVar>(), plwwidth?.value?.toCPointer<ByteVar>(), plheight?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>(), pmedium?.value?.toCPointer<ByteVar>())

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propStgNameToFmtId(oszname?.value?.toCPointer<ByteVar>(), pfmtid?.value?.toCPointer<ByteVar>())

public actual fun propVariantChangeType(ppropvardest: COpaquePointer?, propvarsrc: COpaquePointer?, flags: PropvarChangeFlags, vt: Varenum): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantChangeType(ppropvardest?.value?.toCPointer<ByteVar>(), propvarsrc?.value?.toCPointer<ByteVar>(), flags, vt)

public actual fun propVariantClear(pvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantClear(pvar?.value?.toCPointer<ByteVar>())

public actual fun propVariantCompareEx(propvar1: COpaquePointer?, propvar2: COpaquePointer?, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    windowssys_windows_win32_system_com_structuredstorage_propVariantCompareEx(propvar1?.value?.toCPointer<ByteVar>(), propvar2?.value?.toCPointer<ByteVar>(), unit, flags)

public actual fun propVariantCopy(pvardest: COpaquePointer?, pvarsrc: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantCopy(pvardest?.value?.toCPointer<ByteVar>(), pvarsrc?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetBooleanElem(propvar: COpaquePointer?, ielem: UInt, pfval: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetBooleanElem(propvar?.value?.toCPointer<ByteVar>(), ielem, pfval?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetDoubleElem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetDoubleElem(propvar?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetElementCount(propvar: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetElementCount(propvar?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetFileTimeElem(propvar: COpaquePointer?, ielem: UInt, pftval: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetFileTimeElem(propvar?.value?.toCPointer<ByteVar>(), ielem, pftval?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetInt16Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt16Elem(propvar?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetInt32Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt32Elem(propvar?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetInt64Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt64Elem(propvar?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetStringElem(propvar: COpaquePointer?, ielem: UInt, ppszval: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetStringElem(propvar?.value?.toCPointer<ByteVar>(), ielem, ppszval?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetUInt16Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt16Elem(propvar?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetUInt32Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt32Elem(propvar?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun propVariantGetUInt64Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt64Elem(propvar?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun propVariantToBSTR(propvar: COpaquePointer?, pbstrout: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToBSTR(propvar?.value?.toCPointer<ByteVar>(), pbstrout?.value?.toCPointer<ByteVar>())

public actual fun propVariantToBoolean(propvarin: COpaquePointer?, pfret: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToBoolean(propvarin?.value?.toCPointer<ByteVar>(), pfret?.value?.toCPointer<ByteVar>())

public actual fun propVariantToBooleanVector(propvar: COpaquePointer?, prgf: COpaquePointer?, crgf: UInt, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVector(propvar?.value?.toCPointer<ByteVar>(), prgf?.value?.toCPointer<ByteVar>(), crgf, pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToBooleanVectorAlloc(propvar: COpaquePointer?, pprgf: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVectorAlloc(propvar?.value?.toCPointer<ByteVar>(), pprgf?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToBooleanWithDefault(propvarin: COpaquePointer?, fdefault: Bool): Bool =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanWithDefault(propvarin?.value?.toCPointer<ByteVar>(), fdefault)

public actual fun propVariantToBuffer(propvar: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToBuffer(propvar?.value?.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), cb)

public actual fun propVariantToDouble(propvarin: COpaquePointer?, pdblret: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToDouble(propvarin?.value?.toCPointer<ByteVar>(), pdblret?.value?.toCPointer<ByteVar>())

public actual fun propVariantToDoubleVector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVector(propvar?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToDoubleVectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVectorAlloc(propvar?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToDoubleWithDefault(propvarin: COpaquePointer?, dbldefault: Double): Double =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleWithDefault(propvarin?.value?.toCPointer<ByteVar>(), dbldefault)

public actual fun propVariantToFileTime(propvar: COpaquePointer?, pstfout: PstimeFlags, pftout: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTime(propvar?.value?.toCPointer<ByteVar>(), pstfout, pftout?.value?.toCPointer<ByteVar>())

public actual fun propVariantToFileTimeVector(propvar: COpaquePointer?, prgft: COpaquePointer?, crgft: UInt, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVector(propvar?.value?.toCPointer<ByteVar>(), prgft?.value?.toCPointer<ByteVar>(), crgft, pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToFileTimeVectorAlloc(propvar: COpaquePointer?, pprgft: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVectorAlloc(propvar?.value?.toCPointer<ByteVar>(), pprgft?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToGUID(propvar: COpaquePointer?, pguid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToGUID(propvar?.value?.toCPointer<ByteVar>(), pguid?.value?.toCPointer<ByteVar>())

public actual fun propVariantToInt16(propvarin: COpaquePointer?, piret: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16(propvarin?.value?.toCPointer<ByteVar>(), piret?.value?.toCPointer<ByteVar>())

public actual fun propVariantToInt16Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16Vector(propvar?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToInt16VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16VectorAlloc(propvar?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToInt16WithDefault(propvarin: COpaquePointer?, idefault: Short): Short =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16WithDefault(propvarin?.value?.toCPointer<ByteVar>(), idefault)

public actual fun propVariantToInt32(propvarin: COpaquePointer?, plret: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32(propvarin?.value?.toCPointer<ByteVar>(), plret?.value?.toCPointer<ByteVar>())

public actual fun propVariantToInt32Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32Vector(propvar?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToInt32VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32VectorAlloc(propvar?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToInt32WithDefault(propvarin: COpaquePointer?, ldefault: Int): Int =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32WithDefault(propvarin?.value?.toCPointer<ByteVar>(), ldefault)

public actual fun propVariantToInt64(propvarin: COpaquePointer?, pllret: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64(propvarin?.value?.toCPointer<ByteVar>(), pllret?.value?.toCPointer<ByteVar>())

public actual fun propVariantToInt64Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64Vector(propvar?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToInt64VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64VectorAlloc(propvar?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToInt64WithDefault(propvarin: COpaquePointer?, lldefault: Long): Long =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64WithDefault(propvarin?.value?.toCPointer<ByteVar>(), lldefault)

public actual fun propVariantToString(propvar: COpaquePointer?, psz: Pwstr, cch: UInt): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToString(propvar?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>(), cch)

public actual fun propVariantToStringAlloc(propvar: COpaquePointer?, ppszout: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToStringAlloc(propvar?.value?.toCPointer<ByteVar>(), ppszout?.value?.toCPointer<ByteVar>())

public actual fun propVariantToStringVector(propvar: COpaquePointer?, prgsz: COpaquePointer?, crgsz: UInt, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVector(propvar?.value?.toCPointer<ByteVar>(), prgsz?.value?.toCPointer<ByteVar>(), crgsz, pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToStringVectorAlloc(propvar: COpaquePointer?, pprgsz: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVectorAlloc(propvar?.value?.toCPointer<ByteVar>(), pprgsz?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToStringWithDefault(propvarin: COpaquePointer?, pszdefault: Pcwstr): Pcwstr =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToStringWithDefault(propvarin?.value?.toCPointer<ByteVar>(), pszdefault?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun propVariantToUInt16(propvarin: COpaquePointer?, puiret: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16(propvarin?.value?.toCPointer<ByteVar>(), puiret?.value?.toCPointer<ByteVar>())

public actual fun propVariantToUInt16Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16Vector(propvar?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToUInt16VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16VectorAlloc(propvar?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToUInt16WithDefault(propvarin: COpaquePointer?, uidefault: UShort): UShort =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16WithDefault(propvarin?.value?.toCPointer<ByteVar>(), uidefault)

public actual fun propVariantToUInt32(propvarin: COpaquePointer?, pulret: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32(propvarin?.value?.toCPointer<ByteVar>(), pulret?.value?.toCPointer<ByteVar>())

public actual fun propVariantToUInt32Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32Vector(propvar?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToUInt32VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32VectorAlloc(propvar?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToUInt32WithDefault(propvarin: COpaquePointer?, uldefault: UInt): UInt =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32WithDefault(propvarin?.value?.toCPointer<ByteVar>(), uldefault)

public actual fun propVariantToUInt64(propvarin: COpaquePointer?, pullret: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64(propvarin?.value?.toCPointer<ByteVar>(), pullret?.value?.toCPointer<ByteVar>())

public actual fun propVariantToUInt64Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64Vector(propvar?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToUInt64VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64VectorAlloc(propvar?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun propVariantToUInt64WithDefault(propvarin: COpaquePointer?, ulldefault: ULong): ULong =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64WithDefault(propvarin?.value?.toCPointer<ByteVar>(), ulldefault)

public actual fun propVariantToVariant(ppropvar: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToVariant(ppropvar?.value?.toCPointer<ByteVar>(), pvar?.value?.toCPointer<ByteVar>())

public actual fun propVariantToWinRTPropertyValue(propvar: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_propVariantToWinRTPropertyValue(propvar?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun readClassStg(pstg: COpaquePointer?, pclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_readClassStg(pstg?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>())

public actual fun readClassStm(pstm: COpaquePointer?, pclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_readClassStm(pstm?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>())

public actual fun readFmtUserTypeStg(pstg: COpaquePointer?, pcf: COpaquePointer?, lplpszusertype: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_readFmtUserTypeStg(pstg?.value?.toCPointer<ByteVar>(), pcf?.value?.toCPointer<ByteVar>(), lplpszusertype?.value?.toCPointer<ByteVar>())

public actual fun setConvertStg(pstg: COpaquePointer?, fconvert: Bool): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_setConvertStg(pstg?.value?.toCPointer<ByteVar>(), fconvert)

public actual fun stgConvertPropertyToVariant(pprop: COpaquePointer?, codepage: UShort, pvar: COpaquePointer?, pma: COpaquePointer?): Boolean =
    windowssys_windows_win32_system_com_structuredstorage_stgConvertPropertyToVariant(pprop?.value?.toCPointer<ByteVar>(), codepage, pvar?.value?.toCPointer<ByteVar>(), pma?.value?.toCPointer<ByteVar>())

public actual fun stgConvertVariantToProperty(pvar: COpaquePointer?, codepage: UShort, pprop: COpaquePointer?, pcb: COpaquePointer?, pid: UInt, freserved: Boolean, pcindirect: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_structuredstorage_stgConvertVariantToProperty(pvar?.value?.toCPointer<ByteVar>(), codepage, pprop?.value?.toCPointer<ByteVar>(), pcb?.value?.toCPointer<ByteVar>(), pid, freserved, pcindirect?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfile(pwcsname?.value?.toCPointer<ByteVar>(), grfmode, reserved, ppstgopen?.value?.toCPointer<ByteVar>())

public actual fun stgCreateDocfileOnILockBytes(plkbyt: COpaquePointer?, grfmode: Stgm, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfileOnILockBytes(plkbyt?.value?.toCPointer<ByteVar>(), grfmode, reserved, ppstgopen?.value?.toCPointer<ByteVar>())

public actual fun stgCreatePropSetStg(pstorage: COpaquePointer?, dwreserved: UInt, pppropsetstg: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgCreatePropSetStg(pstorage?.value?.toCPointer<ByteVar>(), dwreserved, pppropsetstg?.value?.toCPointer<ByteVar>())

public actual fun stgCreatePropStg(punk: COpaquePointer?, fmtid: COpaquePointer?, pclsid: COpaquePointer?, grfflags: UInt, dwreserved: UInt, pppropstg: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgCreatePropStg(punk?.value?.toCPointer<ByteVar>(), fmtid?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>(), grfflags, dwreserved, pppropstg?.value?.toCPointer<ByteVar>())

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: COpaquePointer?, psecuritydescriptor: PsecurityDescriptor, riid: COpaquePointer?, ppobjectopen: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgCreateStorageEx(pwcsname?.value?.toCPointer<ByteVar>(), grfmode, stgfmt, grfattrs, pstgoptions?.value?.toCPointer<ByteVar>(), psecuritydescriptor?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppobjectopen?.value?.toCPointer<ByteVar>())

public actual fun stgDeserializePropVariant(pprop: COpaquePointer?, cbmax: UInt, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgDeserializePropVariant(pprop?.value?.toCPointer<ByteVar>(), cbmax, ppropvar?.value?.toCPointer<ByteVar>())

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnFile(pwcsname?.value?.toCPointer<ByteVar>(), ppflb?.value?.toCPointer<ByteVar>())

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: COpaquePointer?, ppflb: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnILockBytes(pilb?.value?.toCPointer<ByteVar>(), ppflb?.value?.toCPointer<ByteVar>())

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgIsStorageFile(pwcsname?.value?.toCPointer<ByteVar>())

public actual fun stgIsStorageILockBytes(plkbyt: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgIsStorageILockBytes(plkbyt?.value?.toCPointer<ByteVar>())

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: COpaquePointer?, grfmode: UInt, asyncflags: UInt, ppstgopen: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgOpenAsyncDocfileOnIFillLockBytes(pflb?.value?.toCPointer<ByteVar>(), grfmode, asyncflags, ppstgopen?.value?.toCPointer<ByteVar>())

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgOpenLayoutDocfile(pwcsdfname?.value?.toCPointer<ByteVar>(), grfmode, reserved, ppstgopen?.value?.toCPointer<ByteVar>())

public actual fun stgOpenPropStg(punk: COpaquePointer?, fmtid: COpaquePointer?, grfflags: UInt, dwreserved: UInt, pppropstg: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgOpenPropStg(punk?.value?.toCPointer<ByteVar>(), fmtid?.value?.toCPointer<ByteVar>(), grfflags, dwreserved, pppropstg?.value?.toCPointer<ByteVar>())

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: COpaquePointer?, grfmode: Stgm, snbexclude: COpaquePointer?, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgOpenStorage(pwcsname?.value?.toCPointer<ByteVar>(), pstgpriority?.value?.toCPointer<ByteVar>(), grfmode, snbexclude?.value?.toCPointer<ByteVar>(), reserved, ppstgopen?.value?.toCPointer<ByteVar>())

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: COpaquePointer?, psecuritydescriptor: PsecurityDescriptor, riid: COpaquePointer?, ppobjectopen: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageEx(pwcsname?.value?.toCPointer<ByteVar>(), grfmode, stgfmt, grfattrs, pstgoptions?.value?.toCPointer<ByteVar>(), psecuritydescriptor?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppobjectopen?.value?.toCPointer<ByteVar>())

public actual fun stgOpenStorageOnILockBytes(plkbyt: COpaquePointer?, pstgpriority: COpaquePointer?, grfmode: Stgm, snbexclude: COpaquePointer?, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageOnILockBytes(plkbyt?.value?.toCPointer<ByteVar>(), pstgpriority?.value?.toCPointer<ByteVar>(), grfmode, snbexclude?.value?.toCPointer<ByteVar>(), reserved, ppstgopen?.value?.toCPointer<ByteVar>())

public actual fun stgPropertyLengthAsVariant(pprop: COpaquePointer?, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    windowssys_windows_win32_system_com_structuredstorage_stgPropertyLengthAsVariant(pprop?.value?.toCPointer<ByteVar>(), cbprop, codepage, breserved)

public actual fun stgSerializePropVariant(ppropvar: COpaquePointer?, ppprop: COpaquePointer?, pcb: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgSerializePropVariant(ppropvar?.value?.toCPointer<ByteVar>(), ppprop?.value?.toCPointer<ByteVar>(), pcb?.value?.toCPointer<ByteVar>())

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: COpaquePointer?, patime: COpaquePointer?, pmtime: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_stgSetTimes(lpszname?.value?.toCPointer<ByteVar>(), pctime?.value?.toCPointer<ByteVar>(), patime?.value?.toCPointer<ByteVar>(), pmtime?.value?.toCPointer<ByteVar>())

public actual fun variantToPropVariant(pvar: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_variantToPropVariant(pvar?.value?.toCPointer<ByteVar>(), ppropvar?.value?.toCPointer<ByteVar>())

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_winRTPropertyValueToPropVariant(punkpropertyvalue?.value?.toCPointer<ByteVar>(), ppropvar?.value?.toCPointer<ByteVar>())

public actual fun writeClassStg(pstg: COpaquePointer?, rclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_writeClassStg(pstg?.value?.toCPointer<ByteVar>(), rclsid?.value?.toCPointer<ByteVar>())

public actual fun writeClassStm(pstm: COpaquePointer?, rclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_writeClassStm(pstm?.value?.toCPointer<ByteVar>(), rclsid?.value?.toCPointer<ByteVar>())

public actual fun writeFmtUserTypeStg(pstg: COpaquePointer?, cf: UShort, lpszusertype: Pcwstr): Hresult =
    windowssys_windows_win32_system_com_structuredstorage_writeFmtUserTypeStg(pstg?.value?.toCPointer<ByteVar>(), cf, lpszusertype?.value?.toCPointer<ByteVar>())
