@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32DevicesSensorsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: ConstPtr<SensorCollectionList>, ptargetbuffersizeinbytes: MutPtr<UInt>, ptargetbuffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(sourcecollection.rawAddress.toString(), ptargetbuffersizeinbytes.rawAddress.toString(), ptargetbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListCopyAndMarshall(target: MutPtr<SensorCollectionList>, source: ConstPtr<SensorCollectionList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(target.rawAddress.toString(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: ConstPtr<UByte>, targetcollection: MutPtr<SensorCollectionList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes.toInt(), sourcebuffer.rawAddress.toString(), targetcollection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetMarshalledSize(collection: ConstPtr<SensorCollectionList>): UInt =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(collection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: ConstPtr<SensorCollectionList>): UInt =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(collection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetSerializedSize(collection: ConstPtr<SensorCollectionList>): UInt =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(collection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListMarshall(target: MutPtr<SensorCollectionList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListMarshall(target.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListSerializeToBuffer(sourcecollection: ConstPtr<SensorCollectionList>, targetbuffersizeinbytes: UInt, targetbuffer: MutPtr<UByte>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(sourcecollection.rawAddress.toString(), targetbuffersizeinbytes.toInt(), targetbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: ConstPtr<SensorCollectionList>, pcollection: MutPtr<SensorCollectionList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(thresholds.rawAddress.toString(), pcollection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListUpdateMarshalledPointer(collection: MutPtr<SensorCollectionList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(collection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateActivityThresholds(newsample: ConstPtr<SensorCollectionList>, oldsample: ConstPtr<SensorCollectionList>, thresholds: ConstPtr<SensorCollectionList>): Boolean =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(newsample.rawAddress.toString(), oldsample.rawAddress.toString(), thresholds.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerformanceTime(timems: MutPtr<UInt>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsGetPerformanceTime(timems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromCLSIDArray(members: ConstPtr<Guid>, size: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(members.rawAddress.toString(), size.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(fltval.toDouble(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCollectionListSame(lista: ConstPtr<SensorCollectionList>, listb: ConstPtr<SensorCollectionList>): Boolean =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsIsCollectionListSame(lista.rawAddress.toString(), listb.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isGUIDPresentInList(guidarray: ConstPtr<Guid>, arraylength: UInt, guidelem: ConstPtr<Guid>): Boolean =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(guidarray.rawAddress.toString(), arraylength.toInt(), guidelem.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isKeyPresentInCollectionList(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>): Boolean =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(plist.rawAddress.toString(), pkey.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isKeyPresentInPropertyList(plist: ConstPtr<SensorPropertyList>, pkey: ConstPtr<Propertykey>): Boolean =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(plist.rawAddress.toString(), pkey.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isSensorSubscribed(subscriptionlist: ConstPtr<SensorCollectionList>, currenttype: Guid): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetBool(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Bool>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetDouble(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Double>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetFileTime(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Filetime>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetFloat(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Float>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetGuid(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Guid>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetInt32(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Int>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetInt64(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<Long>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthInt64(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<Long>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(plist.rawAddress.toString(), pkey.rawAddress.toString(), occurrence.toInt(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthUlong(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<UInt>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(plist.rawAddress.toString(), pkey.rawAddress.toString(), occurrence.toInt(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthUshort(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, occurrence: UInt, pretvalue: MutPtr<UShort>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(plist.rawAddress.toString(), pkey.rawAddress.toString(), occurrence.toInt(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetPropVariant(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, typecheck: Boolean, pvalue: MutPtr<Propvariant>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(plist.rawAddress.toString(), pkey.rawAddress.toString(), typecheck, pvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetUlong(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<UInt>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetUshort(plist: ConstPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, pretvalue: MutPtr<UShort>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeySetPropVariant(plist: MutPtr<SensorCollectionList>, pkey: ConstPtr<Propertykey>, typecheck: Boolean, pvalue: ConstPtr<Propvariant>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(plist.rawAddress.toString(), pkey.rawAddress.toString(), typecheck, pvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInformation(propvariantvalue: ConstPtr<Propvariant>, propvariantoffset: MutPtr<UInt>, propvariantsize: MutPtr<UInt>, propvariantpointer: MutPtr<MutPtr<CVoid>>, remappedtype: MutPtr<Devproptype>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropVariantGetInformation(propvariantvalue.rawAddress.toString(), propvariantoffset.rawAddress.toString(), propvariantsize.rawAddress.toString(), propvariantpointer.rawAddress.toString(), remappedtype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertiesListCopy(target: MutPtr<SensorPropertyList>, source: ConstPtr<SensorPropertyList>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropertiesListCopy(target.rawAddress.toString(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: ConstPtr<SensorCollectionList>, pkey: MutPtr<Propertykey>, pvalue: MutPtr<Propvariant>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(index.toInt(), psensorslist.rawAddress.toString(), pkey.rawAddress.toString(), pvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(sizeinbytes.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun serializationBufferFree(buffer: ConstPtr<UByte>) {
    if (windowsWin32DevicesSensorsNapiAddon != null) {
        windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsSerializationBufferFree(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
