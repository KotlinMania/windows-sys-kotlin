@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val windowsWin32DevicesSensorsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: ConstPtr, ptargetbuffersizeinbytes: MutPtr, ptargetbuffer: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(sourcecollection.rawAddress.toString(), ptargetbuffersizeinbytes.rawAddress.toString(), ptargetbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListCopyAndMarshall(target: MutPtr, source: ConstPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(target.rawAddress.toString(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: ConstPtr, targetcollection: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes.toInt(), sourcebuffer.rawAddress.toString(), targetcollection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetMarshalledSize(collection: ConstPtr): UInt =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(collection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: ConstPtr): UInt =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(collection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetSerializedSize(collection: ConstPtr): UInt =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(collection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListMarshall(target: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListMarshall(target.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListSerializeToBuffer(sourcecollection: ConstPtr, targetbuffersizeinbytes: UInt, targetbuffer: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(sourcecollection.rawAddress.toString(), targetbuffersizeinbytes.toInt(), targetbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: ConstPtr, pcollection: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(thresholds.rawAddress.toString(), pcollection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListUpdateMarshalledPointer(collection: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(collection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateActivityThresholds(newsample: ConstPtr, oldsample: ConstPtr, thresholds: ConstPtr): Boolean =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(newsample.rawAddress.toString(), oldsample.rawAddress.toString(), thresholds.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerformanceTime(timems: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsGetPerformanceTime(timems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromCLSIDArray(members: ConstPtr, size: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(members.rawAddress.toString(), size.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: MutPtr): Hresult =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(fltval.toDouble(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCollectionListSame(lista: ConstPtr, listb: ConstPtr): Boolean =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsIsCollectionListSame(lista.rawAddress.toString(), listb.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isGUIDPresentInList(guidarray: ConstPtr, arraylength: UInt, guidelem: ConstPtr): Boolean =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(guidarray.rawAddress.toString(), arraylength.toInt(), guidelem.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isKeyPresentInCollectionList(plist: ConstPtr, pkey: ConstPtr): Boolean =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(plist.rawAddress.toString(), pkey.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isKeyPresentInPropertyList(plist: ConstPtr, pkey: ConstPtr): Boolean =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(plist.rawAddress.toString(), pkey.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isSensorSubscribed(subscriptionlist: ConstPtr, currenttype: Guid): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetBool(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetDouble(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetFileTime(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetFloat(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetGuid(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetInt32(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetInt64(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthInt64(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(plist.rawAddress.toString(), pkey.rawAddress.toString(), occurrence.toInt(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthUlong(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(plist.rawAddress.toString(), pkey.rawAddress.toString(), occurrence.toInt(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthUshort(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(plist.rawAddress.toString(), pkey.rawAddress.toString(), occurrence.toInt(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetPropVariant(plist: ConstPtr, pkey: ConstPtr, typecheck: Boolean, pvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(plist.rawAddress.toString(), pkey.rawAddress.toString(), typecheck, pvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetUlong(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetUshort(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(plist.rawAddress.toString(), pkey.rawAddress.toString(), pretvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeySetPropVariant(plist: MutPtr, pkey: ConstPtr, typecheck: Boolean, pvalue: ConstPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(plist.rawAddress.toString(), pkey.rawAddress.toString(), typecheck, pvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInformation(propvariantvalue: ConstPtr, propvariantoffset: MutPtr, propvariantsize: MutPtr, propvariantpointer: MutPtr, remappedtype: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropVariantGetInformation(propvariantvalue.rawAddress.toString(), propvariantoffset.rawAddress.toString(), propvariantsize.rawAddress.toString(), propvariantpointer.rawAddress.toString(), remappedtype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertiesListCopy(target: MutPtr, source: ConstPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropertiesListCopy(target.rawAddress.toString(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: ConstPtr, pkey: MutPtr, pvalue: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(index.toInt(), psensorslist.rawAddress.toString(), pkey.rawAddress.toString(), pvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: MutPtr): Ntstatus =
    if (windowsWin32DevicesSensorsNapiAddon != null) (windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(sizeinbytes.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun serializationBufferFree(buffer: ConstPtr) {
    if (windowsWin32DevicesSensorsNapiAddon != null) {
        windowsWin32DevicesSensorsNapiAddon.windowssysWindowsWin32DevicesSensorsSerializationBufferFree(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
