FROM docker.elastic.co/logstash/logstash:8.12.1

# Download and install MySQL JDBC driver
RUN curl -o /usr/share/logstash/logstash-core/lib/jars/mysql-connector-java-8.0.33.jar https://repo1.maven.org/maven2/mysql/mysql-connector-java-8.0.33/mysql-connector-java-8.0.33.jar

# Create directories for configuration
RUN mkdir -p /usr/share/logstash/pipeline
RUN mkdir -p /usr/share/logstash/templates

# Copy configurations
COPY pipeline/mysql-to-elasticsearch.conf /usr/share/logstash/pipeline/
COPY templates/accommodations.json /usr/share/logstash/templates/ 