try {
    module.exports = require('./build/Release/windowssys_native.node');
} catch (err) {
    try {
        module.exports = require('./build/Debug/windowssys_native.node');
    } catch (err2) {
        throw new Error(
            'Could not load windowssys_native addon. ' +
            'Original error: ' + err.message + ' | Debug error: ' + err2.message
        );
    }
}
