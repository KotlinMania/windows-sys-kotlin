@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesSensorsNapiAddon(): Boolean

private val windowsWin32DevicesSensorsNapiAvailable: Boolean = initWindowsWin32DevicesSensorsNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListMarshall(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListMarshall(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsGetPerformanceTime(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsGetPerformanceTime(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsIsCollectionListSame(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsIsCollectionListSame(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(p0: String, p1: Int, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropVariantGetInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropVariantGetInformation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropertiesListCopy(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropertiesListCopy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSensorsSerializationBufferFree(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSensorsSerializationBufferFree(p0: String)

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: ConstPtr<SensorCollectionList>, ptargetbuffersizeinbytes: MutPtr<UInt>, ptargetbuffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(sourcecollection.rawAddress.toString(), ptargetbuffersizeinbytes.rawAddress.toString(), ptargetbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListCopyAndMarshall(target: MutPtr<SensorCollectionList>, source: ConstPtr<SensorCollectionList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(target.rawAddress.toString(), source.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: ConstPtr<UByte>, targetcollection: MutPtr<SensorCollectionList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes.toInt(), sourcebuffer.rawAddress.toString(), targetcollection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetMarshalledSize(collection: ConstPtr<SensorCollectionList>): UInt =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(collection.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: ConstPtr<SensorCollectionList>): UInt =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(collection.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetSerializedSize(collection: ConstPtr<SensorCollectionList>): UInt =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(collection.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListMarshall(target: MutPtr<SensorCollectionList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListMarshall(target.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListSerializeToBuffer(sourcecollection: ConstPtr<SensorCollectionList>, targetbuffersizeinbytes: UInt, targetbuffer: MutPtr<UByte>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(sourcecollection.rawAddress.toString(), targetbuffersizeinbytes.toInt(), targetbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: ConstPtr<SensorCollectionList>, pcollection: MutPtr<SensorCollectionList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(thresholds.rawAddress.toString(), pcollection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListUpdateMarshalledPointer(collection: MutPtr<SensorCollectionList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(collection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateActivityThresholds(newsample: ConstPtr<SensorCollectionList>, oldsample: ConstPtr<SensorCollectionList>, thresholds: ConstPtr<SensorCollectionList>): Boolean =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(newsample.rawAddress.toString(), oldsample.rawAddress.toString(), thresholds.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerformanceTime(timems: MutPtr<UInt>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsGetPerformanceTime(timems.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromCLSIDArray(members: ConstPtr<Guid>, size: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(members.rawAddress.toString(), size.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(fltval.toDouble(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCollectionListSame(lista: ConstPtr<SensorCollectionList>, listb: ConstPtr<SensorCollectionList>): Boolean =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsIsCollectionListSame(lista.rawAddress.toString(), listb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isGUIDPresentInList(guidarray: ConstPtr<Guid>, arraylength: UInt, guidelem: ConstPtr<Guid>): Boolean =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(guidarray.rawAddress.toString(), arraylength.toInt(), guidelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isKeyPresentInCollectionList(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>): Boolean =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(plist.rawAddress.toString(), pkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isKeyPresentInPropertyList(plist: ConstPtr<SensorPropertyList>, pkey: ConstPtr<Propertykey>): Boolean =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(plist.rawAddress.toString(), pkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isSensorSubscribed(subscriptionlist: ConstPtr<SensorCollectionList>, currenttype: Guid): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetBool(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Bool>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetDouble(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Double>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetFileTime(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Filetime>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetFloat(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Float>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetGuid(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Guid>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetInt32(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Int>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetInt64(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Long>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthInt64(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<Long>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(plist.rawAddress.toString(), pkey.rawAddress.toString(), occurrence.toInt(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthUlong(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<UInt>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(plist.rawAddress.toString(), pkey.rawAddress.toString(), occurrence.toInt(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthUshort(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<UShort>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(plist.rawAddress.toString(), pkey.rawAddress.toString(), occurrence.toInt(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetPropVariant(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, typecheck: Boolean, pvalue: MutPtr<Propvariant>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(plist.rawAddress.toString(), pkey.rawAddress.toString(), typecheck, pvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetUlong(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<UInt>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetUshort(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<UShort>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeySetPropVariant(plist: MutPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, typecheck: Boolean, pvalue: ConstPtr<Propvariant>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(plist.rawAddress.toString(), pkey.rawAddress.toString(), typecheck, pvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInformation(propvariantvalue: ConstPtr<Propvariant>, propvariantoffset: MutPtr<UInt>, propvariantsize: MutPtr<UInt>, propvariantpointer: MutPtr<MutPtr<CVoid>>, remappedtype: MutPtr<Devproptype>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropVariantGetInformation(propvariantvalue.rawAddress.toString(), propvariantoffset.rawAddress.toString(), propvariantsize.rawAddress.toString(), propvariantpointer.rawAddress.toString(), remappedtype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertiesListCopy(target: MutPtr<SensorPropertyList>, source: ConstPtr<SensorPropertyList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropertiesListCopy(target.rawAddress.toString(), source.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: ConstPtr<SensorCollectionList>, pkey: MutPtr<Propertykey>, pvalue: MutPtr<Propvariant>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(index.toInt(), psensorslist.rawAddress.toString(), pkey.rawAddress.toString(), pvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAvailable) wasmWindowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(sizeinbytes.toInt(), pbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun serializationBufferFree(buffer: ConstPtr<UByte>) {
    if (windowsWin32DevicesSensorsNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesSensorsSerializationBufferFree(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
