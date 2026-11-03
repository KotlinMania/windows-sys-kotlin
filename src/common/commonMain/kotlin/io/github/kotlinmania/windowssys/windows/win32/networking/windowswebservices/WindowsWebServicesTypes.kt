package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.core.HRESULT

public fun interface WS_ABANDON_MESSAGE_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, message: Long, error: Long): HRESULT
}

public typealias WS_ABANDON_MESSAGE_CALLBACK = WS_ABANDON_MESSAGE_CALLBACKFn?

public fun interface WS_ABORT_CHANNEL_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, error: Long): HRESULT
}

public typealias WS_ABORT_CHANNEL_CALLBACK = WS_ABORT_CHANNEL_CALLBACKFn?

public fun interface WS_ABORT_LISTENER_CALLBACKFn {
    public operator fun invoke(listenerinstance: Long, error: Long): HRESULT
}

public typealias WS_ABORT_LISTENER_CALLBACK = WS_ABORT_LISTENER_CALLBACKFn?

public fun interface WS_ACCEPT_CHANNEL_CALLBACKFn {
    public operator fun invoke(listenerinstance: Long, channelinstance: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_ACCEPT_CHANNEL_CALLBACK = WS_ACCEPT_CHANNEL_CALLBACKFn?

public typealias WS_ADDRESSING_VERSION = Int

public fun interface WS_ASYNC_CALLBACKFn {
    public operator fun invoke(errorcode: HRESULT, callbackmodel: WS_CALLBACK_MODEL, callbackstate: Long)
}

public typealias WS_ASYNC_CALLBACK = WS_ASYNC_CALLBACKFn?

public fun interface WS_ASYNC_FUNCTIONFn {
    public operator fun invoke(hr: HRESULT, callbackmodel: WS_CALLBACK_MODEL, callbackstate: Long, next: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_ASYNC_FUNCTION = WS_ASYNC_FUNCTIONFn?

public typealias WS_BINDING_TEMPLATE_TYPE = Int

public typealias WS_CALLBACK_MODEL = Int

public typealias WS_CALL_PROPERTY_ID = Int

public fun interface WS_CERTIFICATE_VALIDATION_CALLBACKFn {
    public operator fun invoke(certcontext: Long, state: Long): HRESULT
}

public typealias WS_CERTIFICATE_VALIDATION_CALLBACK = WS_CERTIFICATE_VALIDATION_CALLBACKFn?

public typealias WS_CERT_CREDENTIAL_TYPE = Int

public fun interface WS_CERT_ISSUER_LIST_NOTIFICATION_CALLBACKFn {
    public operator fun invoke(certissuerlistnotificationcallbackstate: Long, issuerlist: Long, error: Long): HRESULT
}

public typealias WS_CERT_ISSUER_LIST_NOTIFICATION_CALLBACK = WS_CERT_ISSUER_LIST_NOTIFICATION_CALLBACKFn?

public typealias WS_CHANNEL = Long

public typealias WS_CHANNEL_BINDING = Int

public typealias WS_CHANNEL_PROPERTY_ID = Int

public typealias WS_CHANNEL_STATE = Int

public typealias WS_CHANNEL_TYPE = Int

public typealias WS_CHARSET = Int

public fun interface WS_CLOSE_CHANNEL_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_CLOSE_CHANNEL_CALLBACK = WS_CLOSE_CHANNEL_CALLBACKFn?

public fun interface WS_CLOSE_LISTENER_CALLBACKFn {
    public operator fun invoke(listenerinstance: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_CLOSE_LISTENER_CALLBACK = WS_CLOSE_LISTENER_CALLBACKFn?

public typealias WS_COOKIE_MODE = Int

public fun interface WS_CREATE_CHANNEL_CALLBACKFn {
    public operator fun invoke(channeltype: WS_CHANNEL_TYPE, channelparameters: Long, channelparameterssize: UInt, channelinstance: Long, error: Long): HRESULT
}

public typealias WS_CREATE_CHANNEL_CALLBACK = WS_CREATE_CHANNEL_CALLBACKFn?

public fun interface WS_CREATE_CHANNEL_FOR_LISTENER_CALLBACKFn {
    public operator fun invoke(listenerinstance: Long, channelparameters: Long, channelparameterssize: UInt, channelinstance: Long, error: Long): HRESULT
}

public typealias WS_CREATE_CHANNEL_FOR_LISTENER_CALLBACK = WS_CREATE_CHANNEL_FOR_LISTENER_CALLBACKFn?

public fun interface WS_CREATE_DECODER_CALLBACKFn {
    public operator fun invoke(createcontext: Long, readcallback: WS_READ_CALLBACK, readcontext: Long, decodercontext: Long, error: Long): HRESULT
}

public typealias WS_CREATE_DECODER_CALLBACK = WS_CREATE_DECODER_CALLBACKFn?

public fun interface WS_CREATE_ENCODER_CALLBACKFn {
    public operator fun invoke(createcontext: Long, writecallback: WS_WRITE_CALLBACK, writecontext: Long, encodercontext: Long, error: Long): HRESULT
}

public typealias WS_CREATE_ENCODER_CALLBACK = WS_CREATE_ENCODER_CALLBACKFn?

public fun interface WS_CREATE_LISTENER_CALLBACKFn {
    public operator fun invoke(channeltype: WS_CHANNEL_TYPE, listenerparameters: Long, listenerparameterssize: UInt, listenerinstance: Long, error: Long): HRESULT
}

public typealias WS_CREATE_LISTENER_CALLBACK = WS_CREATE_LISTENER_CALLBACKFn?

public typealias WS_DATETIME_FORMAT = Int

public fun interface WS_DECODER_DECODE_CALLBACKFn {
    public operator fun invoke(encodercontext: Long, buffer: Long, maxlength: UInt, length: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_DECODER_DECODE_CALLBACK = WS_DECODER_DECODE_CALLBACKFn?

public fun interface WS_DECODER_END_CALLBACKFn {
    public operator fun invoke(encodercontext: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_DECODER_END_CALLBACK = WS_DECODER_END_CALLBACKFn?

public fun interface WS_DECODER_GET_CONTENT_TYPE_CALLBACKFn {
    public operator fun invoke(decodercontext: Long, contenttype: Long, contentencoding: Long, newcontenttype: Long, error: Long): HRESULT
}

public typealias WS_DECODER_GET_CONTENT_TYPE_CALLBACK = WS_DECODER_GET_CONTENT_TYPE_CALLBACKFn?

public fun interface WS_DECODER_START_CALLBACKFn {
    public operator fun invoke(encodercontext: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_DECODER_START_CALLBACK = WS_DECODER_START_CALLBACKFn?

public fun interface WS_DURATION_COMPARISON_CALLBACKFn {
    public operator fun invoke(duration1: Long, duration2: Long, result: Long, error: Long): HRESULT
}

public typealias WS_DURATION_COMPARISON_CALLBACK = WS_DURATION_COMPARISON_CALLBACKFn?

public fun interface WS_DYNAMIC_STRING_CALLBACKFn {
    public operator fun invoke(callbackstate: Long, string: Long, found: Long, id: Long, error: Long): HRESULT
}

public typealias WS_DYNAMIC_STRING_CALLBACK = WS_DYNAMIC_STRING_CALLBACKFn?

public fun interface WS_ENCODER_ENCODE_CALLBACKFn {
    public operator fun invoke(encodercontext: Long, buffers: Long, count: UInt, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_ENCODER_ENCODE_CALLBACK = WS_ENCODER_ENCODE_CALLBACKFn?

public fun interface WS_ENCODER_END_CALLBACKFn {
    public operator fun invoke(encodercontext: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_ENCODER_END_CALLBACK = WS_ENCODER_END_CALLBACKFn?

public fun interface WS_ENCODER_GET_CONTENT_TYPE_CALLBACKFn {
    public operator fun invoke(encodercontext: Long, contenttype: Long, newcontenttype: Long, contentencoding: Long, error: Long): HRESULT
}

public typealias WS_ENCODER_GET_CONTENT_TYPE_CALLBACK = WS_ENCODER_GET_CONTENT_TYPE_CALLBACKFn?

public fun interface WS_ENCODER_START_CALLBACKFn {
    public operator fun invoke(encodercontext: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_ENCODER_START_CALLBACK = WS_ENCODER_START_CALLBACKFn?

public typealias WS_ENCODING = Int

public typealias WS_ENDPOINT_ADDRESS_EXTENSION_TYPE = Int

public typealias WS_ENDPOINT_IDENTITY_TYPE = Int

public typealias WS_ENVELOPE_VERSION = Int

public typealias WS_ERROR = Long

public typealias WS_ERROR_PROPERTY_ID = Int

public typealias WS_EXCEPTION_CODE = Int

public typealias WS_EXTENDED_PROTECTION_POLICY = Int

public typealias WS_EXTENDED_PROTECTION_SCENARIO = Int

public typealias WS_FAULT_DISCLOSURE = Int

public typealias WS_FAULT_ERROR_PROPERTY_ID = Int

public typealias WS_FIELD_MAPPING = Int

public fun interface WS_FREE_CHANNEL_CALLBACKFn {
    public operator fun invoke(channelinstance: Long)
}

public typealias WS_FREE_CHANNEL_CALLBACK = WS_FREE_CHANNEL_CALLBACKFn?

public fun interface WS_FREE_DECODER_CALLBACKFn {
    public operator fun invoke(decodercontext: Long)
}

public typealias WS_FREE_DECODER_CALLBACK = WS_FREE_DECODER_CALLBACKFn?

public fun interface WS_FREE_ENCODER_CALLBACKFn {
    public operator fun invoke(encodercontext: Long)
}

public typealias WS_FREE_ENCODER_CALLBACK = WS_FREE_ENCODER_CALLBACKFn?

public fun interface WS_FREE_LISTENER_CALLBACKFn {
    public operator fun invoke(listenerinstance: Long)
}

public typealias WS_FREE_LISTENER_CALLBACK = WS_FREE_LISTENER_CALLBACKFn?

public fun interface WS_GET_CERT_CALLBACKFn {
    public operator fun invoke(getcertcallbackstate: Long, targetaddress: Long, viauri: Long, cert: Long, error: Long): HRESULT
}

public typealias WS_GET_CERT_CALLBACK = WS_GET_CERT_CALLBACKFn?

public fun interface WS_GET_CHANNEL_PROPERTY_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT
}

public typealias WS_GET_CHANNEL_PROPERTY_CALLBACK = WS_GET_CHANNEL_PROPERTY_CALLBACKFn?

public fun interface WS_GET_LISTENER_PROPERTY_CALLBACKFn {
    public operator fun invoke(listenerinstance: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT
}

public typealias WS_GET_LISTENER_PROPERTY_CALLBACK = WS_GET_LISTENER_PROPERTY_CALLBACKFn?

public typealias WS_HEADER_TYPE = Int

public typealias WS_HEAP = Long

public typealias WS_HEAP_PROPERTY_ID = Int

public typealias WS_HTTP_HEADER_AUTH_TARGET = Int

public typealias WS_HTTP_PROXY_SETTING_MODE = Int

public fun interface WS_HTTP_REDIRECT_CALLBACKFn {
    public operator fun invoke(state: Long, originalurl: Long, newurl: Long): HRESULT
}

public typealias WS_HTTP_REDIRECT_CALLBACK = WS_HTTP_REDIRECT_CALLBACKFn?

public typealias WS_IP_VERSION = Int

public fun interface WS_IS_DEFAULT_VALUE_CALLBACKFn {
    public operator fun invoke(descriptiondata: Long, value: Long, defaultvalue: Long, valuesize: UInt, isdefault: Long, error: Long): HRESULT
}

public typealias WS_IS_DEFAULT_VALUE_CALLBACK = WS_IS_DEFAULT_VALUE_CALLBACKFn?

public typealias WS_LISTENER = Long

public typealias WS_LISTENER_PROPERTY_ID = Int

public typealias WS_LISTENER_STATE = Int

public typealias WS_MESSAGE = Long

public fun interface WS_MESSAGE_DONE_CALLBACKFn {
    public operator fun invoke(donecallbackstate: Long)
}

public typealias WS_MESSAGE_DONE_CALLBACK = WS_MESSAGE_DONE_CALLBACKFn?

public typealias WS_MESSAGE_INITIALIZATION = Int

public typealias WS_MESSAGE_PROPERTY_ID = Int

public typealias WS_MESSAGE_SECURITY_USAGE = Int

public typealias WS_MESSAGE_STATE = Int

public typealias WS_METADATA = Long

public typealias WS_METADATA_EXCHANGE_TYPE = Int

public typealias WS_METADATA_PROPERTY_ID = Int

public typealias WS_METADATA_STATE = Int

public typealias WS_MOVE_TO = Int

public fun interface WS_OPEN_CHANNEL_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, endpointaddress: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_OPEN_CHANNEL_CALLBACK = WS_OPEN_CHANNEL_CALLBACKFn?

public fun interface WS_OPEN_LISTENER_CALLBACKFn {
    public operator fun invoke(listenerinstance: Long, url: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_OPEN_LISTENER_CALLBACK = WS_OPEN_LISTENER_CALLBACKFn?

public fun interface WS_OPERATION_CANCEL_CALLBACKFn {
    public operator fun invoke(reason: WS_SERVICE_CANCEL_REASON, state: Long)
}

public typealias WS_OPERATION_CANCEL_CALLBACK = WS_OPERATION_CANCEL_CALLBACKFn?

public typealias WS_OPERATION_CONTEXT = Long

public typealias WS_OPERATION_CONTEXT_PROPERTY_ID = Int

public fun interface WS_OPERATION_FREE_STATE_CALLBACKFn {
    public operator fun invoke(state: Long)
}

public typealias WS_OPERATION_FREE_STATE_CALLBACK = WS_OPERATION_FREE_STATE_CALLBACKFn?

public typealias WS_OPERATION_STYLE = Int

public typealias WS_PARAMETER_TYPE = Int

public typealias WS_POLICY = Long

public typealias WS_POLICY_EXTENSION_TYPE = Int

public typealias WS_POLICY_PROPERTY_ID = Int

public typealias WS_POLICY_STATE = Int

public typealias WS_PROTECTION_LEVEL = Int

public fun interface WS_PROXY_MESSAGE_CALLBACKFn {
    public operator fun invoke(message: Long, heap: Long, state: Long, error: Long): HRESULT
}

public typealias WS_PROXY_MESSAGE_CALLBACK = WS_PROXY_MESSAGE_CALLBACKFn?

public typealias WS_PROXY_PROPERTY_ID = Int

public fun interface WS_PULL_BYTES_CALLBACKFn {
    public operator fun invoke(callbackstate: Long, bytes: Long, maxsize: UInt, actualsize: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_PULL_BYTES_CALLBACK = WS_PULL_BYTES_CALLBACKFn?

public fun interface WS_PUSH_BYTES_CALLBACKFn {
    public operator fun invoke(callbackstate: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_PUSH_BYTES_CALLBACK = WS_PUSH_BYTES_CALLBACKFn?

public fun interface WS_READ_CALLBACKFn {
    public operator fun invoke(callbackstate: Long, bytes: Long, maxsize: UInt, actualsize: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_READ_CALLBACK = WS_READ_CALLBACKFn?

public fun interface WS_READ_MESSAGE_END_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, message: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_READ_MESSAGE_END_CALLBACK = WS_READ_MESSAGE_END_CALLBACKFn?

public fun interface WS_READ_MESSAGE_START_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, message: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_READ_MESSAGE_START_CALLBACK = WS_READ_MESSAGE_START_CALLBACKFn?

public typealias WS_READ_OPTION = Int

public fun interface WS_READ_TYPE_CALLBACKFn {
    public operator fun invoke(reader: Long, typemapping: WS_TYPE_MAPPING, descriptiondata: Long, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT
}

public typealias WS_READ_TYPE_CALLBACK = WS_READ_TYPE_CALLBACKFn?

public typealias WS_RECEIVE_OPTION = Int

public typealias WS_REPEATING_HEADER_OPTION = Int

public typealias WS_REQUEST_SECURITY_TOKEN_ACTION = Int

public typealias WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID = Int

public fun interface WS_RESET_CHANNEL_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, error: Long): HRESULT
}

public typealias WS_RESET_CHANNEL_CALLBACK = WS_RESET_CHANNEL_CALLBACKFn?

public fun interface WS_RESET_LISTENER_CALLBACKFn {
    public operator fun invoke(listenerinstance: Long, error: Long): HRESULT
}

public typealias WS_RESET_LISTENER_CALLBACK = WS_RESET_LISTENER_CALLBACKFn?

public typealias WS_SAML_AUTHENTICATOR_TYPE = Int

public typealias WS_SECURE_CONVERSATION_VERSION = Int

public typealias WS_SECURE_PROTOCOL = Int

public typealias WS_SECURITY_ALGORITHM_ID = Int

public typealias WS_SECURITY_ALGORITHM_PROPERTY_ID = Int

public typealias WS_SECURITY_ALGORITHM_SUITE_NAME = Int

public typealias WS_SECURITY_BEARER_KEY_TYPE_VERSION = Int

public typealias WS_SECURITY_BINDING_CONSTRAINT_TYPE = Int

public typealias WS_SECURITY_BINDING_PROPERTY_ID = Int

public typealias WS_SECURITY_BINDING_TYPE = Int

public typealias WS_SECURITY_CONTEXT = Long

public typealias WS_SECURITY_CONTEXT_PROPERTY_ID = Int

public typealias WS_SECURITY_HEADER_LAYOUT = Int

public typealias WS_SECURITY_HEADER_VERSION = Int

public typealias WS_SECURITY_KEY_ENTROPY_MODE = Int

public typealias WS_SECURITY_KEY_HANDLE_TYPE = Int

public typealias WS_SECURITY_KEY_TYPE = Int

public typealias WS_SECURITY_PROPERTY_ID = Int

public typealias WS_SECURITY_TIMESTAMP_USAGE = Int

public typealias WS_SECURITY_TOKEN = Long

public typealias WS_SECURITY_TOKEN_PROPERTY_ID = Int

public typealias WS_SECURITY_TOKEN_REFERENCE_MODE = Int

public fun interface WS_SERVICE_ACCEPT_CHANNEL_CALLBACKFn {
    public operator fun invoke(context: Long, channelstate: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_SERVICE_ACCEPT_CHANNEL_CALLBACK = WS_SERVICE_ACCEPT_CHANNEL_CALLBACKFn?

public typealias WS_SERVICE_CANCEL_REASON = Int

public fun interface WS_SERVICE_CLOSE_CHANNEL_CALLBACKFn {
    public operator fun invoke(context: Long, asynccontext: Long): HRESULT
}

public typealias WS_SERVICE_CLOSE_CHANNEL_CALLBACK = WS_SERVICE_CLOSE_CHANNEL_CALLBACKFn?

public typealias WS_SERVICE_ENDPOINT_PROPERTY_ID = Int

public typealias WS_SERVICE_HOST = Long

public typealias WS_SERVICE_HOST_STATE = Int

public fun interface WS_SERVICE_MESSAGE_RECEIVE_CALLBACKFn {
    public operator fun invoke(context: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_SERVICE_MESSAGE_RECEIVE_CALLBACK = WS_SERVICE_MESSAGE_RECEIVE_CALLBACKFn?

public typealias WS_SERVICE_PROPERTY_ID = Int

public typealias WS_SERVICE_PROXY = Long

public typealias WS_SERVICE_PROXY_STATE = Int

public fun interface WS_SERVICE_SECURITY_CALLBACKFn {
    public operator fun invoke(context: Long, authorized: Long, error: Long): HRESULT
}

public typealias WS_SERVICE_SECURITY_CALLBACK = WS_SERVICE_SECURITY_CALLBACKFn?

public fun interface WS_SERVICE_STUB_CALLBACKFn {
    public operator fun invoke(context: Long, frame: Long, callback: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_SERVICE_STUB_CALLBACK = WS_SERVICE_STUB_CALLBACKFn?

public fun interface WS_SET_CHANNEL_PROPERTY_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT
}

public typealias WS_SET_CHANNEL_PROPERTY_CALLBACK = WS_SET_CHANNEL_PROPERTY_CALLBACKFn?

public fun interface WS_SET_LISTENER_PROPERTY_CALLBACKFn {
    public operator fun invoke(listenerinstance: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT
}

public typealias WS_SET_LISTENER_PROPERTY_CALLBACK = WS_SET_LISTENER_PROPERTY_CALLBACKFn?

public fun interface WS_SHUTDOWN_SESSION_CHANNEL_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_SHUTDOWN_SESSION_CHANNEL_CALLBACK = WS_SHUTDOWN_SESSION_CHANNEL_CALLBACKFn?

public typealias WS_TRACE_API = Int

public typealias WS_TRANSFER_MODE = Int

public typealias WS_TRUST_VERSION = Int

public typealias WS_TYPE = Int

public typealias WS_TYPE_MAPPING = Int

public typealias WS_URL_SCHEME_TYPE = Int

public typealias WS_USERNAME_CREDENTIAL_TYPE = Int

public fun interface WS_VALIDATE_PASSWORD_CALLBACKFn {
    public operator fun invoke(passwordvalidatorcallbackstate: Long, username: Long, password: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_VALIDATE_PASSWORD_CALLBACK = WS_VALIDATE_PASSWORD_CALLBACKFn?

public fun interface WS_VALIDATE_SAML_CALLBACKFn {
    public operator fun invoke(samlvalidatorcallbackstate: Long, samlassertion: Long, error: Long): HRESULT
}

public typealias WS_VALIDATE_SAML_CALLBACK = WS_VALIDATE_SAML_CALLBACKFn?

public typealias WS_VALUE_TYPE = Int

public typealias WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE = Int

public typealias WS_WINDOWS_INTEGRATED_AUTH_PACKAGE = Int

public fun interface WS_WRITE_CALLBACKFn {
    public operator fun invoke(callbackstate: Long, buffers: Long, count: UInt, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_WRITE_CALLBACK = WS_WRITE_CALLBACKFn?

public fun interface WS_WRITE_MESSAGE_END_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, message: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_WRITE_MESSAGE_END_CALLBACK = WS_WRITE_MESSAGE_END_CALLBACKFn?

public fun interface WS_WRITE_MESSAGE_START_CALLBACKFn {
    public operator fun invoke(channelinstance: Long, message: Long, asynccontext: Long, error: Long): HRESULT
}

public typealias WS_WRITE_MESSAGE_START_CALLBACK = WS_WRITE_MESSAGE_START_CALLBACKFn?

public typealias WS_WRITE_OPTION = Int

public fun interface WS_WRITE_TYPE_CALLBACKFn {
    public operator fun invoke(writer: Long, typemapping: WS_TYPE_MAPPING, descriptiondata: Long, value: Long, valuesize: UInt, error: Long): HRESULT
}

public typealias WS_WRITE_TYPE_CALLBACK = WS_WRITE_TYPE_CALLBACKFn?

public typealias WS_XML_BUFFER = Long

public typealias WS_XML_BUFFER_PROPERTY_ID = Int

public typealias WS_XML_CANONICALIZATION_ALGORITHM = Int

public typealias WS_XML_CANONICALIZATION_PROPERTY_ID = Int

public typealias WS_XML_NODE_TYPE = Int

public typealias WS_XML_READER = Long

public typealias WS_XML_READER_ENCODING_TYPE = Int

public typealias WS_XML_READER_INPUT_TYPE = Int

public typealias WS_XML_READER_PROPERTY_ID = Int

public typealias WS_XML_SECURITY_TOKEN_PROPERTY_ID = Int

public typealias WS_XML_TEXT_TYPE = Int

public typealias WS_XML_WRITER = Long

public typealias WS_XML_WRITER_ENCODING_TYPE = Int

public typealias WS_XML_WRITER_OUTPUT_TYPE = Int

public typealias WS_XML_WRITER_PROPERTY_ID = Int
