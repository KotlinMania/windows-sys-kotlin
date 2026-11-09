#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_SENSORS_WINDOWS_WIN32_DEVICES_SENSORS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_SENSORS_WINDOWS_WIN32_DEVICES_SENSORS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_sensors_CollectionsListAllocateBufferAndSerialize(void* sourcecollection, void* ptargetbuffersizeinbytes, void* ptargetbuffer);
int32_t windowssys_windows_win32_devices_sensors_CollectionsListCopyAndMarshall(void* target, void* source);
int32_t windowssys_windows_win32_devices_sensors_CollectionsListDeserializeFromBuffer(uint32_t sourcebuffersizeinbytes, void* sourcebuffer, void* targetcollection);
uint32_t windowssys_windows_win32_devices_sensors_CollectionsListGetFillableCount(uint32_t buffersizebytes);
uint32_t windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSize(void* collection);
uint32_t windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSizeWithoutSerialization(void* collection);
uint32_t windowssys_windows_win32_devices_sensors_CollectionsListGetSerializedSize(void* collection);
int32_t windowssys_windows_win32_devices_sensors_CollectionsListMarshall(void* target);
int32_t windowssys_windows_win32_devices_sensors_CollectionsListSerializeToBuffer(void* sourcecollection, uint32_t targetbuffersizeinbytes, void* targetbuffer);
int32_t windowssys_windows_win32_devices_sensors_CollectionsListSortSubscribedActivitiesByConfidence(void* thresholds, void* pcollection);
int32_t windowssys_windows_win32_devices_sensors_CollectionsListUpdateMarshalledPointer(void* collection);
bool windowssys_windows_win32_devices_sensors_EvaluateActivityThresholds(void* newsample, void* oldsample, void* thresholds);
int32_t windowssys_windows_win32_devices_sensors_GetPerformanceTime(void* timems);
int32_t windowssys_windows_win32_devices_sensors_InitPropVariantFromCLSIDArray(void* members, uint32_t size, void* ppropvar);
int32_t windowssys_windows_win32_devices_sensors_InitPropVariantFromFloat(float fltval, void* ppropvar);
bool windowssys_windows_win32_devices_sensors_IsCollectionListSame(void* lista, void* listb);
bool windowssys_windows_win32_devices_sensors_IsGUIDPresentInList(void* guidarray, uint32_t arraylength, void* guidelem);
bool windowssys_windows_win32_devices_sensors_IsKeyPresentInCollectionList(void* plist, void* pkey);
bool windowssys_windows_win32_devices_sensors_IsKeyPresentInPropertyList(void* plist, void* pkey);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetBool(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetDouble(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFileTime(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFloat(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetGuid(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt32(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt64(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthInt64(void* plist, void* pkey, uint32_t occurrence, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUlong(void* plist, void* pkey, uint32_t occurrence, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUshort(void* plist, void* pkey, uint32_t occurrence, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetPropVariant(void* plist, void* pkey, bool typecheck, void* pvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUlong(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUshort(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeySetPropVariant(void* plist, void* pkey, bool typecheck, void* pvalue);
int32_t windowssys_windows_win32_devices_sensors_PropVariantGetInformation(void* propvariantvalue, void* propvariantoffset, void* propvariantsize, void* propvariantpointer, void* remappedtype);
int32_t windowssys_windows_win32_devices_sensors_PropertiesListCopy(void* target, void* source);
uint32_t windowssys_windows_win32_devices_sensors_PropertiesListGetFillableCount(uint32_t buffersizebytes);
int32_t windowssys_windows_win32_devices_sensors_SensorCollectionGetAt(uint32_t arg_0_index, void* psensorslist, void* pkey, void* pvalue);
int32_t windowssys_windows_win32_devices_sensors_SerializationBufferAllocate(uint32_t sizeinbytes, void* pbuffer);
void windowssys_windows_win32_devices_sensors_SerializationBufferFree(void* buffer);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_SENSORS_WINDOWS_WIN32_DEVICES_SENSORS_WRAPPER_H */
