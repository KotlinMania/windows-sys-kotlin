#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_SENSORS_WINDOWS_WIN32_DEVICES_SENSORS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_SENSORS_WINDOWS_WIN32_DEVICES_SENSORS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(void* sourcecollection, void* ptargetbuffersizeinbytes, void* ptargetbuffer);
int32_t windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(void* target, void* source);
int32_t windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(uint32_t sourcebuffersizeinbytes, void* sourcebuffer, void* targetcollection);
uint32_t windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(uint32_t buffersizebytes);
uint32_t windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(void* collection);
uint32_t windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(void* collection);
uint32_t windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(void* collection);
int32_t windowssysWindowsWin32DevicesSensorsCollectionsListMarshall(void* target);
int32_t windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(void* sourcecollection, uint32_t targetbuffersizeinbytes, void* targetbuffer);
int32_t windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(void* thresholds, void* pcollection);
int32_t windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(void* collection);
bool windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(void* newsample, void* oldsample, void* thresholds);
int32_t windowssysWindowsWin32DevicesSensorsGetPerformanceTime(void* timems);
int32_t windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(void* members, uint32_t size, void* ppropvar);
int32_t windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(float fltval, void* ppropvar);
bool windowssysWindowsWin32DevicesSensorsIsCollectionListSame(void* lista, void* listb);
bool windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(void* guidarray, uint32_t arraylength, void* guidelem);
bool windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(void* plist, void* pkey);
bool windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(void* plist, void* pkey);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(void* plist, void* pkey, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(void* plist, void* pkey, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(void* plist, void* pkey, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(void* plist, void* pkey, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(void* plist, void* pkey, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(void* plist, void* pkey, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(void* plist, void* pkey, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(void* plist, void* pkey, uint32_t occurrence, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(void* plist, void* pkey, uint32_t occurrence, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(void* plist, void* pkey, uint32_t occurrence, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(void* plist, void* pkey, bool typecheck, void* pvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(void* plist, void* pkey, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(void* plist, void* pkey, void* pretvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(void* plist, void* pkey, bool typecheck, void* pvalue);
int32_t windowssysWindowsWin32DevicesSensorsPropVariantGetInformation(void* propvariantvalue, void* propvariantoffset, void* propvariantsize, void* propvariantpointer, void* remappedtype);
int32_t windowssysWindowsWin32DevicesSensorsPropertiesListCopy(void* target, void* source);
uint32_t windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(uint32_t buffersizebytes);
int32_t windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(uint32_t arg0Index, void* psensorslist, void* pkey, void* pvalue);
int32_t windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(uint32_t sizeinbytes, void* pbuffer);
void windowssysWindowsWin32DevicesSensorsSerializationBufferFree(void* buffer);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_SENSORS_WINDOWS_WIN32_DEVICES_SENSORS_WRAPPER_H */
