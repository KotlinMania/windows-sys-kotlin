@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private val _windowsWin32DevicesSensorsNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CollectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListAllocateBufferAndSerialize(sourcecollection.toString(), ptargetbuffersizeinbytes.toString(), ptargetbuffer.toString()) as Int) else 0

public actual fun CollectionsListCopyAndMarshall(target: Long, source: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListCopyAndMarshall(target.toString(), source.toString()) as Int) else 0

public actual fun CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: Long, targetcollection: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes.toInt(), sourcebuffer.toString(), targetcollection.toString()) as Int) else 0

public actual fun CollectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListGetFillableCount(buffersizebytes.toInt()) as Int).toUInt() else 0u

public actual fun CollectionsListGetMarshalledSize(collection: Long): UInt =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSize(collection.toString()) as Int).toUInt() else 0u

public actual fun CollectionsListGetMarshalledSizeWithoutSerialization(collection: Long): UInt =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSizeWithoutSerialization(collection.toString()) as Int).toUInt() else 0u

public actual fun CollectionsListGetSerializedSize(collection: Long): UInt =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListGetSerializedSize(collection.toString()) as Int).toUInt() else 0u

public actual fun CollectionsListMarshall(target: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListMarshall(target.toString()) as Int) else 0

public actual fun CollectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: UInt, targetbuffer: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListSerializeToBuffer(sourcecollection.toString(), targetbuffersizeinbytes.toInt(), targetbuffer.toString()) as Int) else 0

public actual fun CollectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListSortSubscribedActivitiesByConfidence(thresholds.toString(), pcollection.toString()) as Int) else 0

public actual fun CollectionsListUpdateMarshalledPointer(collection: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_CollectionsListUpdateMarshalledPointer(collection.toString()) as Int) else 0

public actual fun EvaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_EvaluateActivityThresholds(newsample.toString(), oldsample.toString(), thresholds.toString()) as Boolean) else false

public actual fun GetPerformanceTime(timems: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_GetPerformanceTime(timems.toString()) as Int) else 0

public actual fun InitPropVariantFromCLSIDArray(members: Long, size: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_InitPropVariantFromCLSIDArray(members.toString(), size.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromFloat(fltval: Float, ppropvar: Long): HRESULT =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_InitPropVariantFromFloat(fltval.toDouble(), ppropvar.toString()) as Int) else 0

public actual fun IsCollectionListSame(lista: Long, listb: Long): Boolean =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_IsCollectionListSame(lista.toString(), listb.toString()) as Boolean) else false

public actual fun IsGUIDPresentInList(guidarray: Long, arraylength: UInt, guidelem: Long): Boolean =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_IsGUIDPresentInList(guidarray.toString(), arraylength.toInt(), guidelem.toString()) as Boolean) else false

public actual fun IsKeyPresentInCollectionList(plist: Long, pkey: Long): Boolean =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_IsKeyPresentInCollectionList(plist.toString(), pkey.toString()) as Boolean) else false

public actual fun IsKeyPresentInPropertyList(plist: Long, pkey: Long): Boolean =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_IsKeyPresentInPropertyList(plist.toString(), pkey.toString()) as Boolean) else false

public actual fun IsSensorSubscribed(subscriptionlist: Long, currenttype: GUID): Boolean =
    false

public actual fun PropKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetBool(plist.toString(), pkey.toString(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetDouble(plist.toString(), pkey.toString(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFileTime(plist.toString(), pkey.toString(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFloat(plist.toString(), pkey.toString(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetGuid(plist.toString(), pkey.toString(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt32(plist.toString(), pkey.toString(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt64(plist.toString(), pkey.toString(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthInt64(plist.toString(), pkey.toString(), occurrence.toInt(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUlong(plist.toString(), pkey.toString(), occurrence.toInt(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: UInt, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUshort(plist.toString(), pkey.toString(), occurrence.toInt(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetPropVariant(plist.toString(), pkey.toString(), typecheck, pvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUlong(plist.toString(), pkey.toString(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUshort(plist.toString(), pkey.toString(), pretvalue.toString()) as Int) else 0

public actual fun PropKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropKeyFindKeySetPropVariant(plist.toString(), pkey.toString(), typecheck, pvalue.toString()) as Int) else 0

public actual fun PropVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropVariantGetInformation(propvariantvalue.toString(), propvariantoffset.toString(), propvariantsize.toString(), propvariantpointer.toString(), remappedtype.toString()) as Int) else 0

public actual fun PropertiesListCopy(target: Long, source: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropertiesListCopy(target.toString(), source.toString()) as Int) else 0

public actual fun PropertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_PropertiesListGetFillableCount(buffersizebytes.toInt()) as Int).toUInt() else 0u

public actual fun SensorCollectionGetAt(index: UInt, psensorslist: Long, pkey: Long, pvalue: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_SensorCollectionGetAt(index.toInt(), psensorslist.toString(), pkey.toString(), pvalue.toString()) as Int) else 0

public actual fun SerializationBufferAllocate(sizeinbytes: UInt, pbuffer: Long): NTSTATUS =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_SerializationBufferAllocate(sizeinbytes.toInt(), pbuffer.toString()) as Int) else 0

public actual fun SerializationBufferFree(buffer: Long) {
    if (_windowsWin32DevicesSensorsNapiAddon != null) {
        _windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_SerializationBufferFree(buffer.toString())
    }
}
