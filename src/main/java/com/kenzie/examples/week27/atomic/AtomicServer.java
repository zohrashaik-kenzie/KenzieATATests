package com.kenzie.examples.week27.atomic;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicServer {
    // Shared configuration data stored in an AtomicReference
    private static final AtomicReference<ServerConfig> config = new AtomicReference<>(new ServerConfig());

    public static void main(String[] args) {
        // Simulate multiple threads accessing and updating the configuration
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                // Read the current configuration
                ServerConfig currentConfig = config.get();
                System.out.println(Thread.currentThread().getName() + " - Current Config: " + currentConfig);

                // Modify the configuration (for example, changing the port)
                ServerConfig newConfig = new ServerConfig(currentConfig.getPort() + 1);
                config.set(newConfig);

                System.out.println(Thread.currentThread().getName() + " - Updated Config: " + newConfig);
            });
            thread.start();
        }
    }

    static class ServerConfig {
        private int port;

        public ServerConfig() {
            this.port = 8080; // Default port
        }

        public ServerConfig(int port) {
            this.port = port;
        }

        public int getPort() {
            return port;
        }

        @Override
        public String toString() {
            return "ServerConfig{" +
                    "port=" + port +
                    '}';
        }
    }
}